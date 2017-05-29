/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cgi.Enum;

/**
 *
 * @author gerardj
 */
public enum OnClickTrigger {
    ButtonPressed("WHEN-BUTTON-PRESSED"),CheckboxChanged("WHEN-CHECKBOXCHANGED"),ImageActivated("WHEN-IMAGE-ACTIVATED"),ListActivated("WHEN-LIST_ACTIVATED"),ListChanged("WHEN-LIST-CHANGED")
    ,RadioChanged("WHEN-RADIO-CHANGED"),ImagePressed("WHEN-IMAGE-PRESSED");
        private String name;

    private OnClickTrigger(String p_name) {
        this.name = p_name;
    }
        
    public String getName(){
        return name;
    }
}
