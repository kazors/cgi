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
        while(!(p_listCheckBoxInRow.isEmpty() && p_listItemInRow.isEmpty() && p_listPushButtonInRow.isEmpty() && p_listRadioGroupInRow.isEmpty() && p_listGraphicTextObjectInRow.isEmpty())){
            
           
            for(oracleCheckBox v_currentCheckBox : p_listCheckBoxInRow){
                String v_posString=v_currentCheckBox.getoracleCheckBoxXPosition().split("\\.")[0];
                if(v_posString.equals("")){
                    v_posString="0";
                }
                int v_CurrentPosX=Integer.parseInt(v_posString);
                
                if(v_CurrentPosX<v_posX){
                    v_checkBox=v_currentCheckBox;
                    v_posX=v_CurrentPosX;
                }
                
            }
            
           for(oracleItem v_currentItem : p_listItemInRow){
               
                String v_posString=v_currentItem.getobjectPositionX().split("\\.")[0];
                if(v_posString.equals("")){
                    v_posString="0";
                }
                int v_CurrentPosX=Integer.parseInt(v_posString);
                if(v_CurrentPosX<v_posX){
                    v_item=v_currentItem;
                    v_checkBox=null;
                    v_posX=v_CurrentPosX;
                }
                
            } 
           
           for(oraclePushButton v_currentPushButton : p_listPushButtonInRow){
               
               String v_posString=v_currentPushButton.getoraclePushButtonXPosition().split("\\.")[0];
               
               if(v_posString.equals("")){
                   v_posString="0";
               }
               int v_currentPosX=Integer.parseInt(v_posString);
               if(v_currentPosX<v_posX){
                   v_pushButton=v_currentPushButton;
                   v_item=null;
                   v_posX=v_currentPosX;
               }
           }
           
           for(oracleRadioGroup v_currentRadioGroup : p_listRadioGroupInRow){
               String v_posString=v_currentRadioGroup.getListButton().get(0).getradioButtonXPosition().split("\\.")[0];
               if(v_posString.equals("")){
                   v_posString="0";
                   
               }
               int v_currentPosX=Integer.parseInt(v_posString);
               if(v_currentPosX<v_posX){
                   v_RadioGroup=v_currentRadioGroup;
                   v_pushButton=null;
                   v_posX=v_currentPosX;
               }
           }
           
           for(GraphicTextObject v_CurrentGraphicTextObject : p_listGraphicTextObjectInRow){
                String v_posString=v_CurrentGraphicTextObject.getgraphicTextObjectXPosition().split("\\.")[0];
                if(v_posString.equals("")){
                    v_posString="0";
                }
                int v_CurrentPosX=Integer.parseInt(v_posString);
                
                if(v_CurrentPosX<=v_posX){
                    v_GraphicTextObject=v_CurrentGraphicTextObject;
                    v_RadioGroup=null;
                    v_posX=v_CurrentPosX;
                }
                
            }
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
            String v_posString=v_item.getobjectPositionX().split("\\.")[0];
            if(v_posString.equals("")){
                v_posString="0";
            }
            int v_posX=Integer.parseInt(v_posString);
            if(v_posX>v_tailleXMax){
                v_tailleXMax=v_posX;
            }
        }
        for(oraclePushButton v_PushButton : p_listPushButton ){
            String v_posString=v_PushButton.getoraclePushButtonXPosition().split("\\.")[0];
            if(v_posString.equals("")){
                v_posString="0";
            }
            int v_posX=Integer.parseInt(v_posString);
            if(v_posX>v_tailleXMax){
                v_tailleXMax=v_posX;
            }
        }
        
        for(oracleCheckBox v_CheckBox : p_listCheckBox ){
            String v_posString=v_CheckBox.getoracleCheckBoxXPosition().split("\\.")[0];
            if(v_posString.equals("")){
                v_posString="0";
            }
            int v_posX=Integer.parseInt(v_posString);
            if(v_posX>v_tailleXMax){
                v_tailleXMax=v_posX;
            }
        }
        for(oracleRadioGroup v_radioGroup : p_listRadioGroup){
            for(oracleRadioButton v_radioButton : v_radioGroup.getListButton()){
                String v_posString=v_radioButton.getradioButtonXPosition().split("\\.")[0];
                if(v_posString.equals("")){
                    v_posString="0";
                }
                int v_posX=Integer.parseInt(v_posString);
                if(v_posX>v_tailleXMax){
                    v_tailleXMax=v_posX;
                }
            }
        }
        return v_tailleXMax;
    }

    public static int getTailleY(ArrayList<oracleItem> p_listItem, ArrayList<oraclePushButton> p_listPushButton, ArrayList<oracleCheckBox> p_listCheckBox, ArrayList<oracleRadioGroup> p_listRadioGroup) {
        int v_tailleYMax=0;
        for(oracleItem v_item : p_listItem ){
            String v_posString=v_item.getobjectPositionY().split("\\.")[0];
            if(v_posString.equals("")){
                v_posString="0";
            }
            int v_posY=Integer.parseInt(v_posString);
            if(v_posY>v_tailleYMax){
                v_tailleYMax=v_posY;
            }
        }
        
        for(oraclePushButton v_PushButton : p_listPushButton ){
            String v_posString=v_PushButton.getoraclePushButtonYPosition().split("\\.")[0];
            if(v_posString.equals("")){
                v_posString="0";
            }
            int v_posY=Integer.parseInt(v_posString);
            if(v_posY>v_tailleYMax){
                v_tailleYMax=v_posY;
            }
        }
        
        for(oracleCheckBox v_CheckBox : p_listCheckBox ){
            String v_posString=v_CheckBox.getoracleCheckBoxYPosition().split("\\.")[0];
            if(v_posString.equals("")){
                v_posString="0";
            }
            int v_posY=Integer.parseInt(v_posString);
            if(v_posY>v_tailleYMax){
                v_tailleYMax=v_posY;
            }
        }
        
        for(oracleRadioGroup v_radioGroup : p_listRadioGroup){
            for(oracleRadioButton v_radioButton : v_radioGroup.getListButton()){
                String v_posString=v_radioButton.getradioButtonYPosition().split("\\.")[0];
                if(v_posString.equals("")){
                    v_posString="0";
                }
                int v_posY=Integer.parseInt(v_posString);
                if(v_posY>v_tailleYMax){
                    v_tailleYMax=v_posY;
                }
            }
        }
        return v_tailleYMax;
    }
    
}
