/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cgi.Tools;

import com.cgi.Enum.BlurTrigger;
import com.cgi.Enum.OnClickTrigger;
import com.cgi.Enum.OnFocusTrigger;
import com.cgi.objectModel.PlSqlMethod;
import com.cgi.objectModel.oracleBlock;
import com.cgi.objectModel.oracleCheckBox;
import com.cgi.objectModel.oracleItem;
import com.cgi.objectModel.oraclePushButton;
import com.cgi.objectModel.oracleRadioButton;
import com.cgi.objectModel.oracleRadioGroup;
import java.lang.reflect.ParameterizedType;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gerardj
 */
public class MappingTrigger {

    public static <T> String getTrigger(T p_item, String p_className, String p_eventName) {
        switch (p_eventName) {
            case "onBlur":
                String v_dataBlur = "";
                switch (p_className) {
                    case "oracleRadioGroup":
                        oracleRadioGroup v_radioGroup = (oracleRadioGroup) p_item;
                        for (BlurTrigger v_trigger : BlurTrigger.values()) {
                            for (PlSqlMethod v_method : v_radioGroup.getlistMethod()) {
                                if (v_method.getName().equals(v_trigger.getName())) {
                                    v_dataBlur = v_dataBlur + v_method.getMethodName() + ",";
                                }
                            }
                        }
                        return v_dataBlur;

                    case "oraclePushButton":
                        oraclePushButton v_pushButton = (oraclePushButton) p_item;
                        for (BlurTrigger v_trigger : BlurTrigger.values()) {
                            for (PlSqlMethod v_method : v_pushButton.getlistMethod()) {
                                if (v_method.getName().equals(v_trigger.getName())) {
                                    
                                    v_dataBlur = v_dataBlur + v_method.getMethodName() + ",";
                                }
                            }
                        }

                        return v_dataBlur;
                    case "oracleItem":
                        oracleItem v_item = (oracleItem) p_item;
                        for (BlurTrigger v_trigger : BlurTrigger.values()) {
                            for (PlSqlMethod v_method : v_item.getlistMethod()) {
                                
                                if (v_method.getName().equals(v_trigger.getName())) {
                                    System.out.println("v_m : "+v_method.get_method());
                                    v_dataBlur = v_dataBlur + v_method.getMethodName() + ",";
                                    
                                }
                            }
                        }
                        
                        return v_dataBlur;
                    case "oracleCheckBox":
                        oracleCheckBox v_checkBox = (oracleCheckBox) p_item;
                        for (BlurTrigger v_trigger : BlurTrigger.values()) {
                            for (PlSqlMethod v_method : v_checkBox.getlistMethod()) {
                                if (v_method.getName().equals(v_trigger.getName())) {
                                    v_dataBlur = v_dataBlur + v_method.getMethodName() + ",";
                                }
                            }
                        }

                        return v_dataBlur;
                    case "oracleBlock":
                        oracleBlock v_block = (oracleBlock) p_item;
                        for (BlurTrigger v_trigger : BlurTrigger.values()) {
                            for (PlSqlMethod v_method : v_block.getListMethod()) {
                                if (v_method.getName().equals(v_trigger.getName())) {
                                    v_dataBlur = v_dataBlur + v_method.getMethodName() + ",";
                                }
                            }
                        }

                        return v_dataBlur;

                        

                }
                return null;
                case"OnClick":
                    String v_dataClick = "";
                switch (p_className) {
                    case "oracleRadioGroup":
                        oracleRadioGroup v_radioGroup = (oracleRadioGroup) p_item;
                        for (OnClickTrigger v_trigger :OnClickTrigger.values()) {
                            for (PlSqlMethod v_method : v_radioGroup.getlistMethod()) {
                                if (v_method.getName().equals(v_trigger.getName())) {
                                    v_dataClick = v_dataClick + v_method.getMethodName() + ",";
                                }
                            }
                        }
                        return v_dataClick;

                    case "oraclePushButton":
                        oraclePushButton v_pushButton = (oraclePushButton) p_item;
                        for (OnClickTrigger v_trigger :OnClickTrigger.values()) {
                            for (PlSqlMethod v_method : v_pushButton.getlistMethod()) {
                                if (v_method.getName().equals(v_trigger.getName())) {
                                    v_dataClick = v_dataClick + v_method.getMethodName() + ",";
                                }
                            }
                        }

                        return v_dataClick;
                    case "oracleItem":
                        oracleItem v_item = (oracleItem) p_item;
                        for (OnClickTrigger v_trigger :OnClickTrigger.values()) {
                            for (PlSqlMethod v_method : v_item.getlistMethod()) {
                                if (v_method.getName().equals(v_trigger.getName())) {
                                    v_dataClick = v_dataClick + v_method.getMethodName() + ",";
                                }
                            }
                        }

                        return v_dataClick;
                    case "oracleCheckBox":
                        oracleCheckBox v_checkBox = (oracleCheckBox) p_item;
                       for (OnClickTrigger v_trigger :OnClickTrigger.values()) {
                            for (PlSqlMethod v_method : v_checkBox.getlistMethod()) {
                                if (v_method.getName().equals(v_trigger.getName())) {
                                    v_dataClick = v_dataClick + v_method.getMethodName() + ",";
                                }
                            }
                        }

                        return v_dataClick;
                    case "oracleBlock":
                        oracleBlock v_block = (oracleBlock) p_item;
                        for (OnClickTrigger v_trigger :OnClickTrigger.values()) {
                            for (PlSqlMethod v_method : v_block.getListMethod()) {
                                if (v_method.getName().equals(v_trigger.getName())) {
                                    v_dataClick = v_dataClick + v_method.getMethodName() + ",";
                                }
                            }
                        }

                        return v_dataClick;

                        

                }
                return null;
                case"onFocus":
                    String v_dataFocus = "";
                switch (p_className) {
                    case "oracleRadioGroup":
                        oracleRadioGroup v_radioGroup = (oracleRadioGroup) p_item;
                        for (OnFocusTrigger v_trigger :OnFocusTrigger.values()) {
                            for (PlSqlMethod v_method : v_radioGroup.getlistMethod()) {
                                if (v_method.getName().equals(v_trigger.getName())) {
                                    v_dataFocus = v_dataFocus + v_method.getMethodName() + ",";
                                }
                            }
                        }
                        return v_dataFocus;

                    case "oraclePushButton":
                        oraclePushButton v_pushButton = (oraclePushButton) p_item;
                        for (OnFocusTrigger v_trigger :OnFocusTrigger.values()) {
                            for (PlSqlMethod v_method : v_pushButton.getlistMethod()) {
                                if (v_method.getName().equals(v_trigger.getName())) {
                                    v_dataFocus = v_dataFocus + v_method.getMethodName() + ",";
                                }
                            }
                        }

                        return v_dataFocus;
                    case "oracleItem":
                        oracleItem v_item = (oracleItem) p_item;
                        for (OnFocusTrigger v_trigger :OnFocusTrigger.values()) {
                            for (PlSqlMethod v_method : v_item.getlistMethod()) {
                                if (v_method.getName().equals(v_trigger.getName())) {
                                    v_dataFocus = v_dataFocus + v_method.getMethodName() + ",";
                                }
                            }
                        }

                        return v_dataFocus;
                    case "oracleCheckBox":
                        oracleCheckBox v_checkBox = (oracleCheckBox) p_item;
                        for (OnFocusTrigger v_trigger :OnFocusTrigger.values()) {
                            for (PlSqlMethod v_method : v_checkBox.getlistMethod()) {
                                if (v_method.getName().equals(v_trigger.getName())) {
                                    v_dataFocus = v_dataFocus + v_method.getMethodName() + ",";
                                }
                            }
                        }

                        return v_dataFocus;
                    case "oracleBlock":
                        oracleBlock v_block = (oracleBlock) p_item;
                        for (OnFocusTrigger v_trigger :OnFocusTrigger.values()) {
                            for (PlSqlMethod v_method : v_block.getListMethod()) {
                                if (v_method.getName().equals(v_trigger.getName())) {
                                    v_dataFocus = v_dataFocus + v_method.getMethodName() + ",";
                                }
                            }
                        }

                        return v_dataFocus;

                        

                }
                return null;
                    
        }
        return null;
    }
}
