/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cgi.Tools;

import com.cgi.objectModel.GraphicTextObject;
import com.cgi.objectModel.oracleCheckBox;
import com.cgi.objectModel.oracleItem;
import com.cgi.objectModel.oraclePushButton;
import com.cgi.objectModel.oracleRadioButton;
import com.cgi.objectModel.oracleRadioGroup;
import java.io.FileWriter;
import java.util.ArrayList;
import com.cgi.objectWriter.Writer;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gerardj
 */
public class Localise {

    public static void PlaceOrder(ArrayList<oracleCheckBox> p_listCheckBoxInRow, ArrayList<oracleItem> p_listItemInRow, ArrayList<oraclePushButton> p_listPushButtonInRow, ArrayList<oracleRadioGroup> p_listRadioGroupInRow,ArrayList<GraphicTextObject> p_listGraphicTextObjectInRow, FileWriter p_writer,int p_tailleX) {
        oracleCheckBox v_checkBox=null;
        oracleItem v_item=null;
        oraclePushButton v_pushButton=null;
        oracleRadioGroup v_RadioGroup=null;
        GraphicTextObject v_GraphicTextObject=null;
        int v_posX=p_tailleX;
        
        while(!(p_listCheckBoxInRow.isEmpty() && p_listItemInRow.isEmpty() && p_listPushButtonInRow.isEmpty() && p_listRadioGroupInRow.isEmpty() /*&& p_listGraphicTextObjectInRow.isEmpty()*/)){
            
           
            for(oracleCheckBox v_currentCheckBox : p_listCheckBoxInRow){
                try {
                    
                    
                    int v_CurrentPosX=Math.round((float)NumberFormat.getNumberInstance(Locale.FRANCE).parse(v_currentCheckBox.getoracleCheckBoxXPosition()).floatValue());
                    
                    if(v_CurrentPosX<=v_posX){
                        
                        v_checkBox=v_currentCheckBox;
                        v_posX=v_CurrentPosX;
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(Localise.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
           for(oracleItem v_currentItem : p_listItemInRow){
               
                try {
                    
                    int v_CurrentPosX=Math.round((float)NumberFormat.getNumberInstance(Locale.FRANCE).parse(v_currentItem.getobjectPositionX()).floatValue());
                    
                    if(v_CurrentPosX<=v_posX){
                        
                        v_item=v_currentItem;
                        v_checkBox=null;
                        v_posX=v_CurrentPosX;
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(Localise.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } 
           
           for(oraclePushButton v_currentPushButton : p_listPushButtonInRow){
               
                try {
                    
                    int v_currentPosX=Math.round((float)NumberFormat.getNumberInstance(Locale.FRANCE).parse(v_currentPushButton.getoraclePushButtonXPosition()).floatValue());
                    if(v_currentPosX<=v_posX){
                        v_pushButton=v_currentPushButton;
                        v_item=null;
                        v_checkBox=null;
                        v_posX=v_currentPosX;
                    }} catch (ParseException ex) {
                    Logger.getLogger(Localise.class.getName()).log(Level.SEVERE, null, ex);
                }
           }
           
           for(oracleRadioGroup v_currentRadioGroup : p_listRadioGroupInRow){
               
                try {
                    int v_currentPosX=Math.round((float)NumberFormat.getNumberInstance(Locale.FRANCE).parse(v_currentRadioGroup.getListButton().get(0).getradioButtonXPosition()).floatValue());
                    if(v_currentPosX<=v_posX){
                        v_RadioGroup=v_currentRadioGroup;
                        v_pushButton=null;
                        v_item=null;
                        v_checkBox=null;
                        v_posX=v_currentPosX;
                    }} catch (ParseException ex) {
                    Logger.getLogger(Localise.class.getName()).log(Level.SEVERE, null, ex);
                }
           }
           
          /* for(GraphicTextObject v_CurrentGraphicTextObject : p_listGraphicTextObjectInRow){
                try {
                    
                    int v_CurrentPosX=Math.round(NumberFormat.getNumberInstance(Locale.FRANCE).parse(v_CurrentGraphicTextObject.getgraphicTextObjectXPosition()).floatValue());
                    
                    if(v_CurrentPosX<=v_posX){
                        
                        v_GraphicTextObject=v_CurrentGraphicTextObject;
                        v_RadioGroup=null;
                        v_pushButton=null;
                        v_item=null;
                        v_checkBox=null;
                        v_posX=v_CurrentPosX;
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(Localise.class.getName()).log(Level.SEVERE, null, ex);
                }*/
                
            //}
           if(v_checkBox!=null){
               Writer.WriteCheckBox(v_checkBox, p_writer);
               
               p_listCheckBoxInRow.remove(v_checkBox);
               v_checkBox=null;
               v_posX=p_tailleX;
               
           }else if(v_RadioGroup!=null){
               
               Writer.writeRadioGroup(v_RadioGroup, p_writer);
              
               p_listRadioGroupInRow.remove(v_RadioGroup);
               v_RadioGroup=null;
               
               v_posX=p_tailleX;
           }else if(v_item!=null){
               System.out.println(v_GraphicTextObject);
               Writer.writeItem(v_item,p_writer);
               
               p_listItemInRow.remove(v_item);
               v_item=null;
               
               v_posX=p_tailleX;
           }else if (v_pushButton!=null){
               
               Writer.writeButton(v_pushButton,p_writer);
               
               p_listPushButtonInRow.remove(v_pushButton);
               v_pushButton=null;
               
               v_posX=p_tailleX;
           }else if(v_GraphicTextObject!= null){
               
               Writer.WriteLabel(v_GraphicTextObject,p_writer);
               p_listGraphicTextObjectInRow.remove(v_GraphicTextObject);
               v_GraphicTextObject=null;
               v_posX=p_tailleX;
           }
        }
    }

    public static int getTailleX(ArrayList<oracleItem> p_listItem, ArrayList<oraclePushButton> p_listPushButton, ArrayList<oracleCheckBox> p_listCheckBox, ArrayList<oracleRadioGroup> p_listRadioGroup) {
        int v_tailleXMax=0;
        for(oracleItem v_item : p_listItem ){
            
            try {
                int v_posX=Math.round((NumberFormat.getNumberInstance(Locale.FRANCE).parse(v_item.getobjectPositionX()).floatValue()));
                if(v_posX>v_tailleXMax){
                    v_tailleXMax=v_posX;
                }
            } catch (ParseException ex) {
                Logger.getLogger(Localise.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for(oraclePushButton v_PushButton : p_listPushButton ){
            try {
                
                int v_posX=Math.round((float)NumberFormat.getNumberInstance(Locale.FRANCE).parse(v_PushButton.getoraclePushButtonXPosition()).floatValue());
                if(v_posX>v_tailleXMax){
                    v_tailleXMax=v_posX;
                }
            } catch (ParseException ex) {
                Logger.getLogger(Localise.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        for(oracleCheckBox v_CheckBox : p_listCheckBox ){
            try{
            
            int v_posX=Math.round((float)NumberFormat.getNumberInstance(Locale.FRANCE).parse(v_CheckBox.getoracleCheckBoxXPosition()).floatValue());
            if(v_posX>v_tailleXMax){
                v_tailleXMax=v_posX;
            }
            }
            catch(ParseException e){
                Logger.getLogger(Localise.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        for(oracleRadioGroup v_radioGroup : p_listRadioGroup){
            for(oracleRadioButton v_radioButton : v_radioGroup.getListButton()){
                try {
                    
                    int v_posX=Math.round((float)NumberFormat.getNumberInstance(Locale.FRANCE).parse(v_radioButton.getradioButtonXPosition()).floatValue());
                    if(v_posX>v_tailleXMax){
                        v_tailleXMax=v_posX;
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(Localise.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return v_tailleXMax;
    }

    public static int getTailleY(ArrayList<oracleItem> p_listItem, ArrayList<oraclePushButton> p_listPushButton, ArrayList<oracleCheckBox> p_listCheckBox, ArrayList<oracleRadioGroup> p_listRadioGroup) {
        
        int v_tailleYMax=0;
        for(oracleItem v_item : p_listItem ){
            try {
               
                int v_posY=Math.round((float)NumberFormat.getNumberInstance(Locale.FRANCE).parse(v_item.getobjectPositionY()).floatValue());
                if(v_posY>v_tailleYMax){
                    v_tailleYMax=v_posY;
                }
            } catch (ParseException ex) {
                Logger.getLogger(Localise.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        for(oraclePushButton v_PushButton : p_listPushButton ){
            try {
                
                int v_posY=Math.round((float)NumberFormat.getNumberInstance(Locale.FRANCE).parse(v_PushButton.getoraclePushButtonYPosition()).floatValue());
                if(v_posY>v_tailleYMax){
                    v_tailleYMax=v_posY;
                }
            } catch (ParseException ex) {
                Logger.getLogger(Localise.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        for(oracleCheckBox v_CheckBox : p_listCheckBox ){
            try {
                
                int v_posY=Math.round((float)NumberFormat.getNumberInstance(Locale.FRANCE).parse(v_CheckBox.getoracleCheckBoxYPosition()).floatValue());
                if(v_posY>v_tailleYMax){
                    v_tailleYMax=v_posY;
                }
            } catch (ParseException ex) {
                Logger.getLogger(Localise.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        for(oracleRadioGroup v_radioGroup : p_listRadioGroup){
            for(oracleRadioButton v_radioButton : v_radioGroup.getListButton()){
                try {
                    
                    int v_posY=Math.round((float)NumberFormat.getNumberInstance(Locale.FRANCE).parse(v_radioButton.getradioButtonYPosition()).floatValue());
                    if(v_posY>v_tailleYMax){
                        v_tailleYMax=v_posY;
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(Localise.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return v_tailleYMax;
    }
    
}
