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
class SimpleTextObjects {
    String m_SimpleTextObjectsName;
    String m_SimpleTextObjectsListItemValue;

    public SimpleTextObjects(String p_SimpleTextObjectsName, String p_SimpleTextObjectsListItemValue) {
        this.m_SimpleTextObjectsName = p_SimpleTextObjectsName;
        this.m_SimpleTextObjectsListItemValue = p_SimpleTextObjectsListItemValue;
    }

    public String getSimpleTextObjectsName() {
        return m_SimpleTextObjectsName;
    }

    public String getSimpleTextObjectsListItemValue() {
        return m_SimpleTextObjectsListItemValue;
    }
    
    
}
