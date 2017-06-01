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
public enum OnMouseDownTrigger {
    MouseDown("WHEN-MOUSE-DOWN");
        private String m_name;

    private OnMouseDownTrigger(String p_name) {
        m_name=p_name;
    }
    public String getname() {
        return m_name;
    }
        
}
