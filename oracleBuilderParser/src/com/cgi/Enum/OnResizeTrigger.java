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
public enum OnResizeTrigger {
    WindowResized("WHEN-WINDOW-RESIZED");
        private String m_name;

    private OnResizeTrigger(String p_name) {
        m_name=p_name;
    }
    public String getname() {
        return m_name;
    }
}
