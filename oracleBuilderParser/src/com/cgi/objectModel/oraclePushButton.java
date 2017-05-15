
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package com.cgi.objectModel;

import java.util.ArrayList;

/**
 *
 * @author moi
 */
public class oraclePushButton {
    String m_oraclePushButtonName;
    String m_oraclePushButtonItemType;
    
    String m_oraclePushButtonEnabled;
    String m_oraclePushButtonLabel;
    String m_oraclePushButtonAccessKey;
    String m_oraclePushButtonIconic;
    String m_oraclePushButtonIconFilename;
    String m_oraclePushButtonDefaultButton;
    String m_oraclePushButtonPopupMenu;
    String m_oraclePushButtonKeyboardNavigable;
    String m_oraclePushButtonMouseNavigate;
    String m_oraclePushButtonPreviousNavigationItem;
    String m_oraclePushButtonNextNavigationItem;
    String m_oraclePushButtonNumberOfItemDisplayed;
    String m_oraclePushButtonVisible;
    String m_oraclePushButtonXPosition;
    String m_oraclePushButtonYPosition;
    String m_oraclePushButtonWidth;
    String m_oraclePushButtonHeight;
    String m_oraclePushButtonForegroundColor;
    String m_oraclePushButtonBackGroundColor;
    String m_oraclePushButtonFont;
    String m_oraclePushButtonFontName;
    String m_oraclePushButtonFontSize;
    String m_oraclePushButtonFontWeight;
    String m_oraclePushButtonFontStyle;
    String m_oraclePushButtonFontSpacing;
    String m_oraclePushButtonHint;
    String m_oraclePushButtonDisplayHintAutomatically;
    String m_oraclePushButtonTooltip;
    String m_oraclePushButtonDirection;
    ArrayList<PlSqlMethod> m_listMethod;

    public oraclePushButton(String p_oraclePushButtonName, String p_oraclePushButtonItemType,
                             String p_oraclePushButtonEnabled,
                            String p_oraclePushButtonLabel, String p_oraclePushButtonAccessKey,
                            String p_oraclePushButtonIconic, String p_oraclePushButtonIconFilename,
                            String p_oraclePushButtonDefaultButton, String p_oraclePushButtonPopupMenu,
                            String p_oraclePushButtonKeyboardNavigable, String p_oraclePushButtonMouseNavigate,
                            String p_oraclePushButtonPreviousNavigationItem,
                            String p_oraclePushButtonNextNavigationItem,
                            String p_oraclePushButtonNumberOfItemDisplayed, String p_oraclePushButtonVisible,
                            String p_oraclePushButtonXPosition, String p_oraclePushButtonYPosition,
                            String p_oraclePushButtonWidth, String p_oraclePushButtonHeight,
                            String p_oraclePushButtonForegroundColor, String p_oraclePushButtonBackGroundColor,
                            String p_oraclePushButtonFont, String p_oraclePushButtonFontName,
                            String p_oraclePushButtonFontSize, String p_oraclePushButtonFontWeight,
                            String p_oraclePushButtonFontStyle, String p_oraclePushButtonFontSpacing,
                            String p_oraclePushButtonHint, String p_oraclePushButtonDisplayHintAutomatically,
                            String p_oraclePushButtonTooltip, String p_oraclePushButtonDirection, ArrayList<PlSqlMethod> p_listMethod) {
        this.m_oraclePushButtonName                     = p_oraclePushButtonName;
        this.m_oraclePushButtonItemType                 = p_oraclePushButtonItemType;
        
        this.m_oraclePushButtonEnabled                  = p_oraclePushButtonEnabled;
        this.m_oraclePushButtonLabel                    = p_oraclePushButtonLabel;
        this.m_oraclePushButtonAccessKey                = p_oraclePushButtonAccessKey;
        this.m_oraclePushButtonIconic                   = p_oraclePushButtonIconic;
        this.m_oraclePushButtonIconFilename             = p_oraclePushButtonIconFilename;
        this.m_oraclePushButtonDefaultButton            = p_oraclePushButtonDefaultButton;
        this.m_oraclePushButtonPopupMenu                = p_oraclePushButtonPopupMenu;
        this.m_oraclePushButtonKeyboardNavigable        = p_oraclePushButtonKeyboardNavigable;
        this.m_oraclePushButtonMouseNavigate            = p_oraclePushButtonMouseNavigate;
        this.m_oraclePushButtonPreviousNavigationItem   = p_oraclePushButtonPreviousNavigationItem;
        this.m_oraclePushButtonNextNavigationItem       = p_oraclePushButtonNextNavigationItem;
        this.m_oraclePushButtonNumberOfItemDisplayed    = p_oraclePushButtonNumberOfItemDisplayed;
        this.m_oraclePushButtonVisible                  = p_oraclePushButtonVisible;
        this.m_oraclePushButtonXPosition                = p_oraclePushButtonXPosition;
        this.m_oraclePushButtonYPosition                = p_oraclePushButtonYPosition;
        this.m_oraclePushButtonWidth                    = p_oraclePushButtonWidth;
        this.m_oraclePushButtonHeight                   = p_oraclePushButtonHeight;
        this.m_oraclePushButtonForegroundColor          = p_oraclePushButtonForegroundColor;
        this.m_oraclePushButtonBackGroundColor          = p_oraclePushButtonBackGroundColor;
        this.m_oraclePushButtonFont                     = p_oraclePushButtonFont;
        this.m_oraclePushButtonFontName                 = p_oraclePushButtonFontName;
        this.m_oraclePushButtonFontSize                 = p_oraclePushButtonFontSize;
        this.m_oraclePushButtonFontWeight               = p_oraclePushButtonFontWeight;
        this.m_oraclePushButtonFontStyle                = p_oraclePushButtonFontStyle;
        this.m_oraclePushButtonFontSpacing              = p_oraclePushButtonFontSpacing;
        this.m_oraclePushButtonHint                     = p_oraclePushButtonHint;
        this.m_oraclePushButtonDisplayHintAutomatically = p_oraclePushButtonDisplayHintAutomatically;
        this.m_oraclePushButtonTooltip                  = p_oraclePushButtonTooltip;
        this.m_oraclePushButtonDirection                = p_oraclePushButtonDirection;
        this.m_listMethod                               = p_listMethod;
    }

    public void setoraclePushButtonXPosition(String m_oraclePushButtonXPosition) {
        this.m_oraclePushButtonXPosition = m_oraclePushButtonXPosition;
    }

    public void setoraclePushButtonYPosition(String m_oraclePushButtonYPosition) {
        this.m_oraclePushButtonYPosition = m_oraclePushButtonYPosition;
    }
    
    

    public ArrayList<PlSqlMethod> getlistMethod() {
        return m_listMethod;
    }

    
    public String getoraclePushButtonName() {
        return m_oraclePushButtonName;
    }

    public String getoraclePushButtonItemType() {
        return m_oraclePushButtonItemType;
    }

    

    public String getoraclePushButtonEnabled() {
        return m_oraclePushButtonEnabled;
    }

    public String getoraclePushButtonLabel() {
        return m_oraclePushButtonLabel;
    }

    public String getoraclePushButtonAccessKey() {
        return m_oraclePushButtonAccessKey;
    }

    public String getoraclePushButtonIconic() {
        return m_oraclePushButtonIconic;
    }

    public String getoraclePushButtonIconFilename() {
        return m_oraclePushButtonIconFilename;
    }

    public String getoraclePushButtonDefaultButton() {
        return m_oraclePushButtonDefaultButton;
    }

    public String getoraclePushButtonPopupMenu() {
        return m_oraclePushButtonPopupMenu;
    }

    public String getoraclePushButtonKeyboardNavigable() {
        return m_oraclePushButtonKeyboardNavigable;
    }

    public String getoraclePushButtonMouseNavigate() {
        return m_oraclePushButtonMouseNavigate;
    }

    public String getoraclePushButtonPreviousNavigationItem() {
        return m_oraclePushButtonPreviousNavigationItem;
    }

    public String getoraclePushButtonNextNavigationItem() {
        return m_oraclePushButtonNextNavigationItem;
    }

    public String getoraclePushButtonNumberOfItemDisplayed() {
        return m_oraclePushButtonNumberOfItemDisplayed;
    }

    public String getoraclePushButtonVisible() {
        return m_oraclePushButtonVisible;
    }

    public String getoraclePushButtonXPosition() {
        return m_oraclePushButtonXPosition;
    }

    public String getoraclePushButtonYPosition() {
        return m_oraclePushButtonYPosition;
    }

    public String getoraclePushButtonWidth() {
        return m_oraclePushButtonWidth;
    }

    public String getoraclePushButtonHeight() {
        return m_oraclePushButtonHeight;
    }

    public String getoraclePushButtonForegroundColor() {
        return m_oraclePushButtonForegroundColor;
    }

    public String getoraclePushButtonBackGroundColor() {
        return m_oraclePushButtonBackGroundColor;
    }

    public String getoraclePushButtonFont() {
        return m_oraclePushButtonFont;
    }

    public String getoraclePushButtonFontName() {
        return m_oraclePushButtonFontName;
    }

    public String getoraclePushButtonFontSize() {
        return m_oraclePushButtonFontSize;
    }

    public String getoraclePushButtonFontWeight() {
        return m_oraclePushButtonFontWeight;
    }

    public String getoraclePushButtonFontStyle() {
        return m_oraclePushButtonFontStyle;
    }

    public String getoraclePushButtonFontSpacing() {
        return m_oraclePushButtonFontSpacing;
    }

    public String getoraclePushButtonHint() {
        return m_oraclePushButtonHint;
    }

    public String getoraclePushButtonDisplayHintAutomatically() {
        return m_oraclePushButtonDisplayHintAutomatically;
    }

    public String getoraclePushButtonTooltip() {
        return m_oraclePushButtonTooltip;
    }

    public String getoraclePushButtonDirection() {
        return m_oraclePushButtonDirection;
    }
    
}


//~ Formatted by Jindent --- http://www.jindent.com
