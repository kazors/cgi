
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
public class oracleAlert {
    String m_alertName;
    String m_alertSubclassInformation;
    String m_alertComments;
    String m_alertTitle;
    String m_alertMessage;
    String m_alertStyle;
    String m_alertButton1Label;
    String m_alertButton2Label;
    String m_alertButton3Label;
    String m_alertDefaultButton;
    String m_alertForegroundColor;
    String m_alertBackgroundColor;
    String m_alertFillPattern;
    String m_alertFont;
    String m_alertFontName;
    String m_alertFontSize;
    String m_alertFontWeight;
    String m_alertFontStyle;
    String m_alertFontSpacing;
    String m_alertDirection;

    public oracleAlert(String p_alertName, String p_alertSubclassInformation, String p_alertComments,
                       String p_alertTitle, String p_alertMessage, String p_alertStyle, String p_alertButton1Label,
                       String p_alertButton2Label, String p_alertButton3Label, String p_alertDefaultButton,
                       String p_alertForegroundColor, String p_alertBackgroundColor, String p_alertFillPattern,
                       String p_alertFont, String p_alertFontName, String p_alertFontSize, String p_alertFontWeight,
                       String p_alertFontStyle, String p_alertFontSpacing, String p_alertDirection) {
        this.m_alertName                = p_alertName;
        this.m_alertSubclassInformation = p_alertSubclassInformation;
        this.m_alertComments            = p_alertComments;
        this.m_alertTitle               = p_alertTitle;
        this.m_alertMessage             = p_alertMessage;
        this.m_alertStyle               = p_alertStyle;
        this.m_alertButton1Label        = p_alertButton1Label;
        this.m_alertButton2Label        = p_alertButton2Label;
        this.m_alertButton3Label        = p_alertButton3Label;
        this.m_alertDefaultButton       = p_alertDefaultButton;
        this.m_alertForegroundColor     = p_alertForegroundColor;
        this.m_alertBackgroundColor     = p_alertBackgroundColor;
        this.m_alertFillPattern         = p_alertFillPattern;
        this.m_alertFont                = p_alertFont;
        this.m_alertFontName            = p_alertFontName;
        this.m_alertFontSize            = p_alertFontSize;
        this.m_alertFontWeight          = p_alertFontWeight;
        this.m_alertFontStyle           = p_alertFontStyle;
        this.m_alertFontSpacing         = p_alertFontSpacing;
        this.m_alertDirection           = p_alertDirection;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
