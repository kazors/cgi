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
public enum OnFocusTrigger {
    PreBlock("PRE-BLOCK"),PreForm("PRE-FORM"),PreTextItem("PRE-TEXT-ITEM"),PreCommit("PRE-COMMIT"),PreDelete("PRE-DELETE"),PreInsert("PRE_INSERT"),PreLogon("PRE-LOGON"),PreLogout("PRE-LOGOUT"),
    PrePopupMenu("PRE-POPUP-MENU"),PreQuery("PRE-QUERY"),PreRecord("PRE-RECORD"),PreSelect("PRE-SELECT"),PreUpdate("PRE-UPDATE");
        private String name;

    private OnFocusTrigger(String p_name) {
        name=p_name;
    }
    
public String getName(){
        return name;
    }    
}
