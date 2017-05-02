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
public class Refactoring {
    public static String formatMethodName(String p_methodName) {
        p_methodName = p_methodName.replace("/* ", "");
        p_methodName = p_methodName.replace(" */", "");

        return p_methodName;
    }
    
    public static String delSpace(String p_value) {
        while (p_value.startsWith(" ")) {
            p_value = p_value.replaceFirst(" ", "");
        }

        return p_value;
    }
    
    public static String getValueFromLine(String p_line) {
        String[] v_lineSplit = p_line.split("  ");
        String   v_value     = v_lineSplit[v_lineSplit.length - 1];

        if (p_line.trim().startsWith(v_value.trim())) {
            v_value = "";
        }

        return v_value;
    }
}
