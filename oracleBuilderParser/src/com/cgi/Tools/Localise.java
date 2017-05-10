/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cgi.Tools;

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

    public static void PlaceOrder(ArrayList<oracleCheckBox> p_listCheckBoxInRow, ArrayList<oracleItem> p_listItemInRow, ArrayList<oraclePushButton> p_listPushButtonInRow, ArrayList<oracleRadioGroup> p_listRadioGroupInRow,FileWriter p_writer,int p_tailleX) {
        oracleCheckBox v_checkBox=null;
        oracleItem v_item=null;
        oraclePushButton v_pushButton=null;
        oracleRadioGroup v_RadioGroup=null;
        int v_posX=p_tailleX;
        while(!(p_listCheckBoxInRow.isEmpty() && p_listItemInRow.isEmpty() && p_listPushButtonInRow.isEmpty() && p_listRadioGroupInRow.isEmpty())){
            
           
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
               System.out.println("la : "+v_currentPushButton.getoraclePushButtonName()+" et la "+v_posString);
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
           if(v_checkBox!=null){
               Writer.WriteCheckBox(v_checkBox, p_writer);
               System.out.println("taille avant : "+p_listCheckBoxInRow.size());
               System.out.println("j'ecris une checkbox ");
               p_listCheckBoxInRow.remove(v_checkBox);
               v_checkBox=null;
               v_posX=p_tailleX;
               System.out.println("taille apres : "+p_listCheckBoxInRow.size());
           }else if(v_RadioGroup!=null){
               System.out.println("taille radio group avant : "+p_listRadioGroupInRow.size());
               Writer.writeRadioGroup(v_RadioGroup, p_writer);
               System.out.println("j'ecris une radio group");
               p_listRadioGroupInRow.remove(v_RadioGroup);
               v_RadioGroup=null;
               System.out.println("taille radio group apres : "+p_listRadioGroupInRow.size());
               v_posX=p_tailleX;
           }else if(v_item!=null){
               System.out.println("taille item : "+p_listItemInRow.size());
               Writer.writeItem(v_item,p_writer);
               System.out.println("j'ecris des items");
               p_listItemInRow.remove(v_item);
               v_item=null;
               System.out.println("taille item apres : "+p_listItemInRow.size());
               v_posX=p_tailleX;
           }else if (v_pushButton!=null){
               System.out.println("taille push button avant : "+p_listPushButtonInRow.size());
               Writer.writeButton(v_pushButton,p_writer);
               System.out.println("j'ecris un push button");
               p_listPushButtonInRow.remove(v_pushButton);
               v_pushButton=null;
               System.out.println("taille bouton apres : "+p_listPushButtonInRow.size());
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
