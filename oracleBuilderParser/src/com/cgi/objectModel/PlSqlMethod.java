
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package com.cgi.objectModel;

/**
 *
 * @author gerardj
 */
public class PlSqlMethod {
    String m_eventName;
    String m_subclassInformation;
    String m_comments;
    String m_triggerStyle;
    String m_triggerText;
    String m_name;
    String m_methodDescription;
    String m_method;

    public PlSqlMethod(String p_eventName, String p_subclassInformation, String p_comments, String p_triggerStyle,
                       String p_triggerText, String p_name,String p_methodDescritpion,String p_method) {
        this.m_name   = p_name;
        this.m_eventName=p_eventName;
        this.m_subclassInformation=p_subclassInformation;
        this.m_comments=p_comments;
        this.m_triggerStyle=p_triggerStyle;
        this.m_triggerText=p_triggerText;
        this.m_name=p_name;
        this.m_methodDescription=p_methodDescritpion;
        
        this.m_method = p_method;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
