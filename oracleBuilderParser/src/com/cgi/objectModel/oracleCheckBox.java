
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package com.cgi.objectModel;

import java.util.ArrayList;

/**
 *
 * @author gerardj
 */
public class oracleCheckBox {
    String m_oracleCheckBoxName;
    String m_oracleCheckBoxItemType;
    String m_oracleCheckBoxEnabled;
    String m_oracleCheckBoxLabel;
    String m_oracleCheckBoxAccessKey;
    String m_oracleCheckBoxValueWhenChecked;
    String m_oracleCheckBoxValueWhenUnchecked;
    String m_oracleCheckBoxCheckBoxMappingofOtherValues;
    String m_oracleCheckBoxPopupMenu;
    String m_oracleCheckBoxKeyboardNavigable;
    String m_oracleCheckBoxMouseNavigate;
    String m_oracleCheckBoxPreviousNavigationItem;
    String m_oracleCheckBoxNextNavigationItem;
    String m_oracleCheckBoxDataType;
    String m_oracleCheckBoxDataLengthSemantics;
    String m_oracleCheckBoxMaximumLength;
    String m_oracleCheckBoxInitialValue;
    String m_oracleCheckBoxCopyValueFromItem;
    String m_oracleCheckBoxSynchronizeWithItem;
    String m_oracleCheckBoxCalculationMode;
    String m_oracleCheckBoxFormula;
    String m_oracleCheckBoxSummaryFunction;
    String m_oracleCheckBoxSummarizedBlock;
    String m_oracleCheckBoxSummarizedItem;
    String m_oracleCheckBoxNumberofItemDisplayed;
    String m_oracleCheckBoxDatabaseItem;
    String m_oracleCheckBoxColumnName;
    String m_oracleCheckBoxPrimaryKey;
    String m_oracleCheckBoxQueyrOnly;
    String m_oracleCheckBoxQueryAllowed;
    String m_oracleCheckBoxInsertAllowed;
    String m_oracleCheckBoxUpdateAllowed;
    String m_oracleCheckBoxVisible;
    String m_oracleCheckBoxTabPage;
    String m_oracleCheckBoxXPosition;
    String m_oracleCheckBoxYPosition;
    String m_oracleCheckBoxWidth;
    String m_oracleCheckBoxHeight;
    String m_oracleCheckBoxForegroundColor;
    String m_oracleCheckBoxBackGroundColor;
    String m_oracleCheckBoxFont;
    String m_oracleCheckBoxFontName;
    String m_oracleCheckBoxFontSize;
    String m_oracleCheckBoxFontWeight;
    String m_oracleCheckBoxFontStyle;
    String m_oracleCheckBoxFontSpacing;
    String m_oracleCheckBoxHint;
    String m_oracleCheckBoxDisplayHintAutomatically;
    String m_oracleCheckBoxTooltip;
    ArrayList<PlSqlMethod> m_listMethod;
    public oracleCheckBox(String p_oracleCheckBoxName, String p_oracleCheckBoxItemType, String p_oracleCheckBoxEnabled,
                          String p_oracleCheckBoxLabel, String p_oracleCheckBoxAccessKey,
                          String p_oracleCheckBoxValueWhenChecked, String p_oracleCheckBoxValueWhenUnchecked,
                          String p_oracleCheckBoxCheckBoxMappingofOtherValues, String p_oracleCheckBoxPopupMenu,
                          String p_oracleCheckBoxKeyboardNavigable, String p_oracleCheckBoxMouseNavigate,
                          String p_oracleCheckBoxPreviousNavigationItem, String p_oracleCheckBoxNextNavigationItem,
                          String p_oracleCheckBoxDataType, String p_oracleCheckBoxDataLengthSemantics,
                          String p_oracleCheckBoxMaximumLength, String p_oracleCheckBoxInitialValue,
                          String p_oracleCheckBoxCopyValueFromItem, String p_oracleCheckBoxSynchronizeWithItem,
                          String p_oracleCheckBoxCalculationMode, String p_oracleCheckBoxFormula,
                          String p_oracleCheckBoxSummaryFunction, String p_oracleCheckBoxSummarizedBlock,
                          String p_oracleCheckBoxSummarizedItem, String p_oracleCheckBoxNumberofItemDisplayed,
                          String p_oracleCheckBoxDatabaseItem, String p_oracleCheckBoxColumnName,
                          String p_oracleCheckBoxPrimaryKey, String p_oracleCheckBoxQueyrOnly,
                          String p_oracleCheckBoxQueryAllowed, String p_oracleCheckBoxInsertAllowed,
                          String p_oracleCheckBoxUpdateAllowed, String p_oracleCheckBoxVisible,
                          String p_oracleCheckBoxTabPage, String p_oracleCheckBoxXPosition,
                          String p_oracleCheckBoxYPosition, String p_oracleCheckBoxWidth,
                          String p_oracleCheckBoxHeight, String p_oracleCheckBoxForegroundColor,
                          String p_oracleCheckBoxBackGroundColor, String p_oracleCheckBoxFont,
                          String p_oracleCheckBoxFontName, String p_oracleCheckBoxFontSize,
                          String p_oracleCheckBoxFontWeight, String p_oracleCheckBoxFontStyle,
                          String p_oracleCheckBoxFontSpacing, String p_oracleCheckBoxHint,
                          String p_oracleCheckBoxDisplayHintAutomatically, String p_oracleCheckBoxTooltip, ArrayList<PlSqlMethod> p_listMethod) {
        this.m_oracleCheckBoxName                         = p_oracleCheckBoxName;
        this.m_oracleCheckBoxItemType                     = p_oracleCheckBoxItemType;
        this.m_oracleCheckBoxEnabled                      = p_oracleCheckBoxEnabled;
        this.m_oracleCheckBoxLabel                        = p_oracleCheckBoxLabel;
        this.m_oracleCheckBoxAccessKey                    = p_oracleCheckBoxAccessKey;
        this.m_oracleCheckBoxValueWhenChecked             = p_oracleCheckBoxValueWhenChecked;
        this.m_oracleCheckBoxValueWhenUnchecked           = p_oracleCheckBoxValueWhenUnchecked;
        this.m_oracleCheckBoxCheckBoxMappingofOtherValues = p_oracleCheckBoxCheckBoxMappingofOtherValues;
        this.m_oracleCheckBoxPopupMenu                    = p_oracleCheckBoxPopupMenu;
        this.m_oracleCheckBoxKeyboardNavigable            = p_oracleCheckBoxKeyboardNavigable;
        this.m_oracleCheckBoxMouseNavigate                = p_oracleCheckBoxMouseNavigate;
        this.m_oracleCheckBoxPreviousNavigationItem       = p_oracleCheckBoxPreviousNavigationItem;
        this.m_oracleCheckBoxNextNavigationItem           = p_oracleCheckBoxNextNavigationItem;
        this.m_oracleCheckBoxDataType                     = p_oracleCheckBoxDataType;
        this.m_oracleCheckBoxDataLengthSemantics          = p_oracleCheckBoxDataLengthSemantics;
        this.m_oracleCheckBoxMaximumLength                = p_oracleCheckBoxMaximumLength;
        this.m_oracleCheckBoxInitialValue                 = p_oracleCheckBoxInitialValue;
        this.m_oracleCheckBoxCopyValueFromItem            = p_oracleCheckBoxCopyValueFromItem;
        this.m_oracleCheckBoxSynchronizeWithItem          = p_oracleCheckBoxSynchronizeWithItem;
        this.m_oracleCheckBoxCalculationMode              = p_oracleCheckBoxCalculationMode;
        this.m_oracleCheckBoxFormula                      = p_oracleCheckBoxFormula;
        this.m_oracleCheckBoxSummaryFunction              = p_oracleCheckBoxSummaryFunction;
        this.m_oracleCheckBoxSummarizedBlock              = p_oracleCheckBoxSummarizedBlock;
        this.m_oracleCheckBoxSummarizedItem               = p_oracleCheckBoxSummarizedItem;
        this.m_oracleCheckBoxNumberofItemDisplayed        = p_oracleCheckBoxNumberofItemDisplayed;
        this.m_oracleCheckBoxDatabaseItem                 = p_oracleCheckBoxDatabaseItem;
        this.m_oracleCheckBoxColumnName                   = p_oracleCheckBoxColumnName;
        this.m_oracleCheckBoxPrimaryKey                   = p_oracleCheckBoxPrimaryKey;
        this.m_oracleCheckBoxQueyrOnly                    = p_oracleCheckBoxQueyrOnly;
        this.m_oracleCheckBoxQueryAllowed                 = p_oracleCheckBoxQueryAllowed;
        this.m_oracleCheckBoxInsertAllowed                = p_oracleCheckBoxInsertAllowed;
        this.m_oracleCheckBoxUpdateAllowed                = p_oracleCheckBoxUpdateAllowed;
        this.m_oracleCheckBoxVisible                      = p_oracleCheckBoxVisible;
        this.m_oracleCheckBoxTabPage                      = p_oracleCheckBoxTabPage;
        this.m_oracleCheckBoxXPosition                    = p_oracleCheckBoxXPosition;
        this.m_oracleCheckBoxYPosition                    = p_oracleCheckBoxYPosition;
        this.m_oracleCheckBoxWidth                        = p_oracleCheckBoxWidth;
        this.m_oracleCheckBoxHeight                       = p_oracleCheckBoxHeight;
        this.m_oracleCheckBoxForegroundColor              = p_oracleCheckBoxForegroundColor;
        this.m_oracleCheckBoxBackGroundColor              = p_oracleCheckBoxBackGroundColor;
        this.m_oracleCheckBoxFont                         = p_oracleCheckBoxFont;
        this.m_oracleCheckBoxFontName                     = p_oracleCheckBoxFontName;
        this.m_oracleCheckBoxFontSize                     = p_oracleCheckBoxFontSize;
        this.m_oracleCheckBoxFontWeight                   = p_oracleCheckBoxFontWeight;
        this.m_oracleCheckBoxFontStyle                    = p_oracleCheckBoxFontStyle;
        this.m_oracleCheckBoxFontSpacing                  = p_oracleCheckBoxFontSpacing;
        this.m_oracleCheckBoxHint                         = p_oracleCheckBoxHint;
        this.m_oracleCheckBoxDisplayHintAutomatically     = p_oracleCheckBoxDisplayHintAutomatically;
        this.m_oracleCheckBoxTooltip                      = p_oracleCheckBoxTooltip;
        this.m_listMethod                                 = p_listMethod;
    }

    public String getoracleCheckBoxName() {
        return m_oracleCheckBoxName;
    }

    public ArrayList<PlSqlMethod> getlistMethod() {
        return m_listMethod;
    }
    

    public String getoracleCheckBoxItemType() {
        return m_oracleCheckBoxItemType;
    }

    public String getoracleCheckBoxEnabled() {
        return m_oracleCheckBoxEnabled;
    }

    public String getoracleCheckBoxLabel() {
        return m_oracleCheckBoxLabel;
    }

    public String getoracleCheckBoxAccessKey() {
        return m_oracleCheckBoxAccessKey;
    }

    public String getoracleCheckBoxValueWhenChecked() {
        return m_oracleCheckBoxValueWhenChecked;
    }

    public String getoracleCheckBoxValueWhenUnchecked() {
        return m_oracleCheckBoxValueWhenUnchecked;
    }

    public String getoracleCheckBoxCheckBoxMappingofOtherValues() {
        return m_oracleCheckBoxCheckBoxMappingofOtherValues;
    }

    public String getoracleCheckBoxPopupMenu() {
        return m_oracleCheckBoxPopupMenu;
    }

    public String getoracleCheckBoxKeyboardNavigable() {
        return m_oracleCheckBoxKeyboardNavigable;
    }

    public String getoracleCheckBoxMouseNavigate() {
        return m_oracleCheckBoxMouseNavigate;
    }

    public String getoracleCheckBoxPreviousNavigationItem() {
        return m_oracleCheckBoxPreviousNavigationItem;
    }

    public String getoracleCheckBoxNextNavigationItem() {
        return m_oracleCheckBoxNextNavigationItem;
    }

    public String getoracleCheckBoxDataType() {
        return m_oracleCheckBoxDataType;
    }

    public String getoracleCheckBoxDataLengthSemantics() {
        return m_oracleCheckBoxDataLengthSemantics;
    }

    public String getoracleCheckBoxMaximumLength() {
        return m_oracleCheckBoxMaximumLength;
    }

    public String getoracleCheckBoxInitialValue() {
        return m_oracleCheckBoxInitialValue;
    }

    public String getoracleCheckBoxCopyValueFromItem() {
        return m_oracleCheckBoxCopyValueFromItem;
    }

    public String getoracleCheckBoxSynchronizeWithItem() {
        return m_oracleCheckBoxSynchronizeWithItem;
    }

    public String getoracleCheckBoxCalculationMode() {
        return m_oracleCheckBoxCalculationMode;
    }

    public String getoracleCheckBoxFormula() {
        return m_oracleCheckBoxFormula;
    }

    public String getoracleCheckBoxSummaryFunction() {
        return m_oracleCheckBoxSummaryFunction;
    }

    public String getoracleCheckBoxSummarizedBlock() {
        return m_oracleCheckBoxSummarizedBlock;
    }

    public String getoracleCheckBoxSummarizedItem() {
        return m_oracleCheckBoxSummarizedItem;
    }

    public String getoracleCheckBoxNumberofItemDisplayed() {
        return m_oracleCheckBoxNumberofItemDisplayed;
    }

    public String getoracleCheckBoxDatabaseItem() {
        return m_oracleCheckBoxDatabaseItem;
    }

    public String getoracleCheckBoxColumnName() {
        return m_oracleCheckBoxColumnName;
    }

    public String getoracleCheckBoxPrimaryKey() {
        return m_oracleCheckBoxPrimaryKey;
    }

    public String getoracleCheckBoxQueyrOnly() {
        return m_oracleCheckBoxQueyrOnly;
    }

    public String getoracleCheckBoxQueryAllowed() {
        return m_oracleCheckBoxQueryAllowed;
    }

    public String getoracleCheckBoxInsertAllowed() {
        return m_oracleCheckBoxInsertAllowed;
    }

    public String getoracleCheckBoxUpdateAllowed() {
        return m_oracleCheckBoxUpdateAllowed;
    }

    public String getoracleCheckBoxVisible() {
        return m_oracleCheckBoxVisible;
    }

    public String getoracleCheckBoxTabPage() {
        return m_oracleCheckBoxTabPage;
    }

    public String getoracleCheckBoxXPosition() {
        return m_oracleCheckBoxXPosition;
    }

    public String getoracleCheckBoxYPosition() {
        return m_oracleCheckBoxYPosition;
    }

    public String getoracleCheckBoxWidth() {
        return m_oracleCheckBoxWidth;
    }

    public String getoracleCheckBoxHeight() {
        return m_oracleCheckBoxHeight;
    }

    public String getoracleCheckBoxForegroundColor() {
        return m_oracleCheckBoxForegroundColor;
    }

    public String getoracleCheckBoxBackGroundColor() {
        return m_oracleCheckBoxBackGroundColor;
    }

    public String getoracleCheckBoxFont() {
        return m_oracleCheckBoxFont;
    }

    public String getoracleCheckBoxFontName() {
        return m_oracleCheckBoxFontName;
    }

    public String getoracleCheckBoxFontSize() {
        return m_oracleCheckBoxFontSize;
    }

    public String getoracleCheckBoxFontWeight() {
        return m_oracleCheckBoxFontWeight;
    }

    public String getoracleCheckBoxFontStyle() {
        return m_oracleCheckBoxFontStyle;
    }

    public String getoracleCheckBoxFontSpacing() {
        return m_oracleCheckBoxFontSpacing;
    }

    public String getoracleCheckBoxHint() {
        return m_oracleCheckBoxHint;
    }

    public String getoracleCheckBoxDisplayHintAutomatically() {
        return m_oracleCheckBoxDisplayHintAutomatically;
    }

    public String getoracleCheckBoxTooltip() {
        return m_oracleCheckBoxTooltip;
    }
    
}


//~ Formatted by Jindent --- http://www.jindent.com
