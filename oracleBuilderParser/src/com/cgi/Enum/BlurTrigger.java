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
public enum BlurTrigger {
    validateItem("WHEN-VALIDATE-ITEM"),WindowDeactivated("WHEN-WINDOW-DEACTIVATED"),OnMessage("ON-MESSAGE"),PostBlock("POSTBLOCK"),PostForm("POSTFORM"),PostText("POSTTEXT-ITEM"),
    PostChange("POSTCHANGE"),PostDatabase("POSTDATABASE-COMMIT"),PostDelete("POSTDELETE"),PostForms("POSTFORMS-COMMIT"),PostInsert("POSTINSERT"),PostLogon("POSTLOGON"),PostLogout("POSTLOGOUT")
    ,PostQuery("POSTQUERY"),PostRecord("POSTRECORD"),PostSelect("POSTSELECT"),PostUpdate("POSTUPDATE");
    private String name;
    
    BlurTrigger(String p_name){
        name=p_name;
    }
    
    public String getName(){
        return name;
    }
    

}
