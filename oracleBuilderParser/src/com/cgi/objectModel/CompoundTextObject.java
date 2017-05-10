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
class CompoundTextObject {
    String m_CompoundTextObjectName;
    SimpleTextObjects m_textObjects;

    public CompoundTextObject(String p_CompoundTextObjectName, SimpleTextObjects p_textObjects) {
        this.m_CompoundTextObjectName = p_CompoundTextObjectName;
        this.m_textObjects = p_textObjects;
    }

    public String getCompoundTextObjectName() {
        return m_CompoundTextObjectName;
    }

    public SimpleTextObjects getSimpleTextObjects() {
        return m_textObjects;
    }
    
    
}
