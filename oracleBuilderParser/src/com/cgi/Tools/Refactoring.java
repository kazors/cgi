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
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gerardj
 */
public class Refactoring {
    public static String formatMethodName(String p_methodName) {
        p_methodName = p_methodName.replace("/* ", "");
        p_methodName = p_methodName.replace(" */", "");

        return p_methodName;
    }
    
    public static String delSpace(String p_value) {
        while (p_value.startsWith(" ")) {
            p_value = p_value.replaceFirst(" ", "");
        }

        return p_value;
    }
    
    public static String getValueFromLine(String p_line) {
        String[] v_lineSplit = p_line.split("  ");
        String   v_value     = v_lineSplit[v_lineSplit.length - 1];

        if (p_line.trim().startsWith(v_value.trim())) {
            v_value = "";
        }

        return v_value;
    }
    
    public static void RefactoPos(ArrayList<oracleItem> p_listItem,ArrayList<oracleCheckBox> p_listCheckBox,ArrayList<oraclePushButton> p_listPushButton, ArrayList<oracleRadioGroup> p_listRadioGroup,ArrayList<GraphicTextObject> p_listGraphicObject){
        for(oracleItem v_item : p_listItem){
            v_item.setobjectPositionX(v_item.getobjectPositionX().replace(".", ","));
            
            if(v_item.getobjectPositionX().startsWith(",")){
                v_item.setobjectPositionX("0"+v_item.getobjectPositionX());
            }
            v_item.setobjectPositionY(v_item.getobjectPositionY().replace(".", ","));
            
            if(v_item.getobjectPositionY().startsWith(",")){
                v_item.setobjectPositionY("0"+v_item.getobjectPositionY());
                
            }
            
        }
        
        for(oracleCheckBox v_checkBox : p_listCheckBox){
            v_checkBox.setoracleCheckBoxXPosition(v_checkBox.getoracleCheckBoxXPosition().replace(".", ","));
            
            if(v_checkBox.getoracleCheckBoxXPosition().startsWith(",")){
                v_checkBox.setoracleCheckBoxXPosition("0"+v_checkBox.getoracleCheckBoxXPosition());
            }
            v_checkBox.setoracleCheckBoxYPosition(v_checkBox.getoracleCheckBoxYPosition().replace(".", ","));
            if(v_checkBox.getoracleCheckBoxYPosition().startsWith(",")){
                v_checkBox.setoracleCheckBoxYPosition("0"+v_checkBox.getoracleCheckBoxYPosition());
            }
        }
        
        for(oraclePushButton v_pushButton : p_listPushButton){
            v_pushButton.setoraclePushButtonXPosition(v_pushButton.getoraclePushButtonXPosition().replace(".", ","));
            if(v_pushButton.getoraclePushButtonXPosition().startsWith(",")){
                v_pushButton.setoraclePushButtonXPosition("0"+v_pushButton.getoraclePushButtonXPosition());
            }
            v_pushButton.setoraclePushButtonYPosition(v_pushButton.getoraclePushButtonYPosition().replace(".", ","));
            if(v_pushButton.getoraclePushButtonYPosition().startsWith(",")){
                v_pushButton.setoraclePushButtonYPosition("0"+v_pushButton.getoraclePushButtonYPosition());
            }
        }
        
        for(oracleRadioGroup v_radioGroup : p_listRadioGroup){
            for(oracleRadioButton v_radioButton : v_radioGroup.getListButton()){
                v_radioButton.setradioButtonXPosition(v_radioButton.getradioButtonXPosition().replace(".",","));
                if(v_radioButton.getradioButtonXPosition().startsWith(",")){
                v_radioButton.setradioButtonXPosition("0"+v_radioButton.getradioButtonXPosition());
            }
                v_radioButton.setradioButtonYPosition(v_radioButton.getradioButtonYPosition().replace(".",","));
                if(v_radioButton.getradioButtonYPosition().startsWith(",")){
                v_radioButton.setradioButtonYPosition("0"+v_radioButton.getradioButtonYPosition());
            }
            }
        }
        
        for(GraphicTextObject v_graphicObject : p_listGraphicObject){
            v_graphicObject.setgraphicTextObjectXPosition(v_graphicObject.getgraphicTextObjectXPosition().replace(".",","));
            if(v_graphicObject.getgraphicTextObjectXPosition().startsWith(",")){
                v_graphicObject.setgraphicTextObjectXPosition("0"+v_graphicObject.getgraphicTextObjectXPosition());
            }
            v_graphicObject.setgraphicTextObjectYPosition(v_graphicObject.getgraphicTextObjectYPosition().replace(".",","));
            if(v_graphicObject.getgraphicTextObjectYPosition().startsWith(",")){
                v_graphicObject.setgraphicTextObjectYPosition("0"+v_graphicObject.getgraphicTextObjectYPosition());
            }
        }
    }
}
