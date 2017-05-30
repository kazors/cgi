/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cgi.objectWriter;

import com.cgi.Tools.MappingTrigger;
import com.cgi.objectModel.GraphicTextObject;
import com.cgi.objectModel.oracleCheckBox;
import com.cgi.objectModel.oracleItem;
import com.cgi.objectModel.oraclePushButton;
import com.cgi.objectModel.oracleRadioButton;
import com.cgi.objectModel.oracleRadioGroup;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gerardj
 */
public class Writer {
    
    public static void WriteCheckBox(oracleCheckBox v_checkBox, FileWriter p_writer) {
        try {
            
            p_writer.write("<div class=\"col-sm-" + "1" + "\">\n");
            p_writer.write("<form>\n");
            p_writer.write(" <input type=\"checkbox\" dataBlur=\"" + MappingTrigger.getTrigger(v_checkBox, "oracleCheckBox", "onBlur") + "\" dataOnclick=\"" + MappingTrigger.getTrigger(v_checkBox, "oracleCheckBox", "OnClick") + "\" dataOnfocus=\"" + MappingTrigger.getTrigger(v_checkBox, "oracleCheckBox", "onFocus") + "\" name=\"" + v_checkBox.getoracleCheckBoxName() + "\" value=\"" + v_checkBox.getoracleCheckBoxName() + "\" onclick=\"onClick(this)\" onblur=\"onBlur(this)\" onfocus=\"onFocus(this)\"> " + v_checkBox.getoracleCheckBoxLabel() + "<br>\n");
            p_writer.write("</form>\n");
            p_writer.write("</div>\n");
            
        } catch (IOException ex) {
            Logger.getLogger(Writer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void writeRadioGroup(oracleRadioGroup v_RadioGroup, FileWriter p_writer) {
        try {
            p_writer.write(v_RadioGroup.getoracleRadioGroupName()+" : ");
            
            p_writer.write("<form>\n");
            
            for (oracleRadioButton v_radioButton : v_RadioGroup.getListButton()) {
                p_writer.write("<div class=\" col-sm-2 \">\n");
                p_writer.write("<input type=\"radio\" dataBlur=\"" + MappingTrigger.getTrigger(v_RadioGroup, "oracleRadioGroup", "onBlur") + "\" dataOnclick=\"" + MappingTrigger.getTrigger(v_RadioGroup, "oracleRadioGroup", "OnClick") + "\" dataOnfocus=\"" + MappingTrigger.getTrigger(v_RadioGroup, "oracleRadioGroup", "onFocus") + "\" name=\"" + v_RadioGroup.getoracleRadioGroupName() + "\" value=\"" + v_radioButton.getradioButtonName() + "\" \" onclick=\"onClick(this)\" onblur=\"onBlur(this)\" onfocus=\"onFocus(this)\">" + v_radioButton.getradioButtonLabel() + "<br>\n");
                p_writer.write("</div>\n");
            }
            p_writer.write("</form>\n");
            
        } catch (IOException ex) {
            Logger.getLogger(Writer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void writeItem(oracleItem v_item, FileWriter p_writer) {
        try {
            p_writer.write("<div class=\"  col-sm-1\">\n");
            p_writer.write(v_item.getobjectName() + "   :   \n");
            p_writer.write("</div> \n");
            p_writer.write("<div class=\"  col-sm-2\">\n");
            
            p_writer.write("<form>\n");
            System.out.println(v_item.getobjectHint());
            p_writer.write("<input type=\"text\" dataBlur=\"" + MappingTrigger.getTrigger(v_item, "oracleItem", "onBlur") + "\" dataOnclick=\"" + MappingTrigger.getTrigger(v_item, "oracleItem", "OnClick") + "\" dataOnfocus=\"" + MappingTrigger.getTrigger(v_item, "oracleItem", "onFocus") + "\" name=\"" + v_item.getobjectName() + "\" MinValue=\"" + v_item.getobjectMinimalValue() + "\" maxValue=\"" + v_item.getobjectMaximalValue() + "\" Required=\"" + v_item.getobjectRequired() + "\" TypeData=\"" + v_item.getobjectDataType() + "\" Case=\"" + v_item.getobjectCaseRestriction() + "\" \" onclick=\"onClick(this)\" onblur=\"onBlur(this)\" onfocus=\"onFocus(this)\" onkeyup=\" ApplyGoodDataCase(this)\" ><br>");
            p_writer.write("</form>\n");
            p_writer.write("</div> \n");
            
        } catch (IOException ex) {
            Logger.getLogger(Writer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void writeButton(oraclePushButton v_pushButton, FileWriter p_writer) {
        try {
            
            p_writer.write("<div class=\"col-sm-" + "1" + "\">\n");
            p_writer.write("<button type=\"button\" dataBlur=\"" + MappingTrigger.getTrigger(v_pushButton, "oraclePushButton", "onBlur") + "\" dataOnclick=\"" + MappingTrigger.getTrigger(v_pushButton, "oraclePushButton", "OnClick") + "\" dataOnfocus=\"" + MappingTrigger.getTrigger(v_pushButton, "oraclePushButton", "onFocus") + "\" onclick=\"alert('" + v_pushButton.getoraclePushButtonName() + "')\" \" onclick=\"onClick(this)\" onblur=\"onBlur(this)\" onfocus=\"onFocus(this)\" > " + "<img src=\"icone.jpg\">" + "\n");
            p_writer.write("</div> \n");
            
        } catch (IOException ex) {
            Logger.getLogger(Writer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void WriteLabel(GraphicTextObject v_GraphicTextObject, FileWriter p_writer) {
        try {
            if (v_GraphicTextObject.gettextObject().getSimpleTextObjects().getSimpleTextObjectsListItemValue().equals("Nom :")) {
                
            }
            
            p_writer.write("<div class=\"col-sm-2\">\n");
            p_writer.write(v_GraphicTextObject.gettextObject().getSimpleTextObjects().getSimpleTextObjectsListItemValue());
            p_writer.write("</div> \n");
            
        } catch (IOException ex) {
            Logger.getLogger(Writer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
