/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cgi.Tools;

/**
 *
 * @author gerardj
 */
public enum BlurTrigger {
    validateItem("When-Validate-Item"),WindowDeactivated("When-Window-Deactivated"),OnMessage("On-Message"),PostBlock("PostBlock"),PostForm("PostForm"),PostText("PostText-Item"),
    PostChange("PostChange"),PostDatabase("PostDatabase-Commit"),PostDelete("PostDelete"),PostForms("PostForms-Commit"),PostInsert("PostInsert"),PostLogon("PostLogon"),PostLogout("PostLogout")
    ,PostQuery("PostQuery"),PostRecord("PostRecord"),PostSelect("PostSelect"),WhenValidate("When-Validate-Item"),PostUpdate("PostUpdtate");
    private String name;
    
    BlurTrigger(String p_name){
        name=p_name;
    }
    
    

}
