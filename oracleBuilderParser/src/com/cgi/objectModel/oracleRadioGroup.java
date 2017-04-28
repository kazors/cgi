
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package com.cgi.objectModel;

//~--- JDK imports ------------------------------------------------------------

import java.util.ArrayList;

/**
 *
 * @author gerardj
 */
public class oracleRadioGroup  {
    String                       m_oracleRadioGroupName;
    
    String                       m_oracleRadioGroupItemType;
    String                       m_oracleRadioGroupAccessKey;
    String                       m_oracleRadioGroupMappingofOtherValues;
    String                       m_oracleRadioGroupPopupMenu;
    String                       m_oracleRadioGroupKeyboardNavigable;
    String                       m_oracleRadioGroupMouseNavigate;
    String                       m_oracleRadioGroupPreviousNavigationItem;
    String                       m_oracleRadioGroupNextNavigationItem;
    String                       m_oracleRadioGroupDataType;
    String                       m_oracleRadioGroupDataLengthSemantics;
    String                       m_oracleRadioGroupMaximumLength;
    String                       m_oracleRadioGroupInitialValue;
    String                       m_oracleRadioGroupCopyValueFromItem;
    String                       m_oracleRadioGroupSynchronizeWithItem;
    String                       m_oracleRadioGroupCalculationMode;
    String                       m_oracleRadioGroupFormula;
    String                       m_oracleRadioGroupSummaryFunction;
    String                       m_oracleRadioGroupSummarizedBlock;
    String                       m_oracleRadioGroupSummarizedItem;
    String                       m_oracleRadioGroupNumberOfItemDisplayed;
    String                       m_oracleRadioGroupDatabaseItem;
    String                       m_oracleRadioGroupColumnName;
    String                       m_oracleRadioGroupPrimaryKey;
    String                       m_oracleRadioGroupQueryOnly;
    String                       m_oracleRadioGroupQueryAllowed;
    String                       m_oracleRadioGroupInsertAllowed;
    String                       m_oracleRadioGroupUpdateAllowed;
    String                       m_oracleRadioGroupForegroundColor;
    String                       m_oracleRadioGroupBackgroundColor;
    String                       m_oracleRadioGroupFillPattern;
    String                       m_oracleRadioGroupFont;
    String                       m_oracleRadioGroupFontName;
    String                       m_oracleRadioGroupFontSize;
    String                       m_oracleRadioGroupFontWeight;
    String                       m_oracleRadioGroupFontStyle;
    String                       m_oracleRadioGroupFontSpacing;
    String                       m_oracleRadioGroupHint;
    String                       m_oracleRadioGroupDisplayHintAutomatically;
    String                       m_oracleRadioGroupTooltip;
    String                       m_oracleRadioGroupDirection;
    String                       m_oracleRadioGroupTrigger;
    ArrayList<oracleRadioButton> m_ListButton;

    public oracleRadioGroup(String p_oracleRadioGroupName, String p_oracleRadioGroupItemType,
                            String p_oracleRadioGroupAccessKey, String p_oracleRadioGroupMappingofOtherValues,
                            String p_oracleRadioGroupPopupMenu, String p_oracleRadioGroupKeyboardNavigable,
                            String p_oracleRadioGroupMouseNavigate, String p_oracleRadioGroupPreviousNavigationItem,
                            String p_oracleRadioGroupNextNavigationItem, String p_oracleRadioGroupDataType,
                            String p_oracleRadioGroupDataLengthSemantics, String p_oracleRadioGroupMaximumLength,
                            String p_oracleRadioGroupInitialValue, String p_oracleRadioGroupCopyValueFromItem,
                            String p_oracleRadioGroupSynchronizeWithItem, String p_oracleRadioGroupCalculationMode,
                            String p_oracleRadioGroupFormula, String p_oracleRadioGroupSummaryFunction,
                            String p_oracleRadioGroupSummarizedBlock, String p_oracleRadioGroupSummarizedItem,
                            String p_oracleRadioGroupNumberOfItemDisplayed, String p_oracleRadioGroupDatabaseItem,
                            String p_oracleRadioGroupColumnName, String p_oracleRadioGroupPrimaryKey,
                            String p_oracleRadioGroupQueryOnly, String p_oracleRadioGroupQueryAllowed,
                            String p_oracleRadioGroupInsertAllowed, String p_oracleRadioGroupUpdateAllowed,
                            String p_oracleRadioGroupForegroundColor, String p_oracleRadioGroupBackgroundColor,
                            String p_oracleRadioGroupFillPattern, String p_oracleRadioGroupFont,
                            String p_oracleRadioGroupFontName, String p_oracleRadioGroupFontSize,
                            String p_oracleRadioGroupFontWeight, String p_oracleRadioGroupFontStyle,
                            String p_oracleRadioGroupFontSpacing, String p_oracleRadioGroupHint,
                            String p_oracleRadioGroupDisplayHintAutomatically, String p_oracleRadioGroupTooltip,
                            String p_oracleRadioGroupDirection, String p_oracleRadioGroupTrigger,
                            ArrayList<oracleRadioButton> p_ListButton) {
        this.m_oracleRadioGroupName                     = p_oracleRadioGroupName;
        this.m_oracleRadioGroupItemType                 = p_oracleRadioGroupItemType;
        this.m_oracleRadioGroupAccessKey                = p_oracleRadioGroupAccessKey;
        this.m_oracleRadioGroupMappingofOtherValues     = p_oracleRadioGroupMappingofOtherValues;
        this.m_oracleRadioGroupPopupMenu                = p_oracleRadioGroupPopupMenu;
        this.m_oracleRadioGroupKeyboardNavigable        = p_oracleRadioGroupKeyboardNavigable;
        this.m_oracleRadioGroupMouseNavigate            = p_oracleRadioGroupMouseNavigate;
        this.m_oracleRadioGroupPreviousNavigationItem   = p_oracleRadioGroupPreviousNavigationItem;
        this.m_oracleRadioGroupNextNavigationItem       = p_oracleRadioGroupNextNavigationItem;
        this.m_oracleRadioGroupDataType                 = p_oracleRadioGroupDataType;
        this.m_oracleRadioGroupDataLengthSemantics      = p_oracleRadioGroupDataLengthSemantics;
        this.m_oracleRadioGroupMaximumLength            = p_oracleRadioGroupMaximumLength;
        this.m_oracleRadioGroupInitialValue             = p_oracleRadioGroupInitialValue;
        this.m_oracleRadioGroupCopyValueFromItem        = p_oracleRadioGroupCopyValueFromItem;
        this.m_oracleRadioGroupSynchronizeWithItem      = p_oracleRadioGroupSynchronizeWithItem;
        this.m_oracleRadioGroupCalculationMode          = p_oracleRadioGroupCalculationMode;
        this.m_oracleRadioGroupFormula                  = p_oracleRadioGroupFormula;
        this.m_oracleRadioGroupSummaryFunction          = p_oracleRadioGroupSummaryFunction;
        this.m_oracleRadioGroupSummarizedBlock          = p_oracleRadioGroupSummarizedBlock;
        this.m_oracleRadioGroupSummarizedItem           = p_oracleRadioGroupSummarizedItem;
        this.m_oracleRadioGroupNumberOfItemDisplayed    = p_oracleRadioGroupNumberOfItemDisplayed;
        this.m_oracleRadioGroupDatabaseItem             = p_oracleRadioGroupDatabaseItem;
        this.m_oracleRadioGroupColumnName               = p_oracleRadioGroupColumnName;
        this.m_oracleRadioGroupPrimaryKey               = p_oracleRadioGroupPrimaryKey;
        this.m_oracleRadioGroupQueryOnly                = p_oracleRadioGroupQueryOnly;
        this.m_oracleRadioGroupQueryAllowed             = p_oracleRadioGroupQueryAllowed;
        this.m_oracleRadioGroupInsertAllowed            = p_oracleRadioGroupInsertAllowed;
        this.m_oracleRadioGroupUpdateAllowed            = p_oracleRadioGroupUpdateAllowed;
        this.m_oracleRadioGroupForegroundColor          = p_oracleRadioGroupForegroundColor;
        this.m_oracleRadioGroupBackgroundColor          = p_oracleRadioGroupBackgroundColor;
        this.m_oracleRadioGroupFillPattern              = p_oracleRadioGroupFillPattern;
        this.m_oracleRadioGroupFont                     = p_oracleRadioGroupFont;
        this.m_oracleRadioGroupFontName                 = p_oracleRadioGroupFontName;
        this.m_oracleRadioGroupFontSize                 = p_oracleRadioGroupFontSize;
        this.m_oracleRadioGroupFontWeight               = p_oracleRadioGroupFontWeight;
        this.m_oracleRadioGroupFontStyle                = p_oracleRadioGroupFontStyle;
        this.m_oracleRadioGroupFontSpacing              = p_oracleRadioGroupFontSpacing;
        this.m_oracleRadioGroupHint                     = p_oracleRadioGroupHint;
        this.m_oracleRadioGroupDisplayHintAutomatically = p_oracleRadioGroupDisplayHintAutomatically;
        this.m_oracleRadioGroupTooltip                  = p_oracleRadioGroupTooltip;
        this.m_oracleRadioGroupDirection                = p_oracleRadioGroupDirection;
        this.m_oracleRadioGroupTrigger                  = p_oracleRadioGroupTrigger;
        this.m_ListButton                               = p_ListButton;
    }

    public String getoracleRadioGroupName() {
        return m_oracleRadioGroupName;
    }

    public String getoracleRadioGroupItemType() {
        return m_oracleRadioGroupItemType;
    }

    public String getoracleRadioGroupAccessKey() {
        return m_oracleRadioGroupAccessKey;
    }

    public String getoracleRadioGroupMappingofOtherValues() {
        return m_oracleRadioGroupMappingofOtherValues;
    }

    public String getoracleRadioGroupPopupMenu() {
        return m_oracleRadioGroupPopupMenu;
    }

    public String getoracleRadioGroupKeyboardNavigable() {
        return m_oracleRadioGroupKeyboardNavigable;
    }

    public String getoracleRadioGroupMouseNavigate() {
        return m_oracleRadioGroupMouseNavigate;
    }

    public String getoracleRadioGroupPreviousNavigationItem() {
        return m_oracleRadioGroupPreviousNavigationItem;
    }

    public String getoracleRadioGroupNextNavigationItem() {
        return m_oracleRadioGroupNextNavigationItem;
    }

    public String getoracleRadioGroupDataType() {
        return m_oracleRadioGroupDataType;
    }

    public String getoracleRadioGroupDataLengthSemantics() {
        return m_oracleRadioGroupDataLengthSemantics;
    }

    public String getoracleRadioGroupMaximumLength() {
        return m_oracleRadioGroupMaximumLength;
    }

    public String getoracleRadioGroupInitialValue() {
        return m_oracleRadioGroupInitialValue;
    }

    public String getoracleRadioGroupCopyValueFromItem() {
        return m_oracleRadioGroupCopyValueFromItem;
    }

    public String getoracleRadioGroupSynchronizeWithItem() {
        return m_oracleRadioGroupSynchronizeWithItem;
    }

    public String getoracleRadioGroupCalculationMode() {
        return m_oracleRadioGroupCalculationMode;
    }

    public String getoracleRadioGroupFormula() {
        return m_oracleRadioGroupFormula;
    }

    public String getoracleRadioGroupSummaryFunction() {
        return m_oracleRadioGroupSummaryFunction;
    }

    public String getoracleRadioGroupSummarizedBlock() {
        return m_oracleRadioGroupSummarizedBlock;
    }

    public String getoracleRadioGroupSummarizedItem() {
        return m_oracleRadioGroupSummarizedItem;
    }

    public String getoracleRadioGroupNumberOfItemDisplayed() {
        return m_oracleRadioGroupNumberOfItemDisplayed;
    }

    public String getoracleRadioGroupDatabaseItem() {
        return m_oracleRadioGroupDatabaseItem;
    }

    public String getoracleRadioGroupColumnName() {
        return m_oracleRadioGroupColumnName;
    }

    public String getoracleRadioGroupPrimaryKey() {
        return m_oracleRadioGroupPrimaryKey;
    }

    public String getoracleRadioGroupQueryOnly() {
        return m_oracleRadioGroupQueryOnly;
    }

    public String getoracleRadioGroupQueryAllowed() {
        return m_oracleRadioGroupQueryAllowed;
    }

    public String getoracleRadioGroupInsertAllowed() {
        return m_oracleRadioGroupInsertAllowed;
    }

    public String getoracleRadioGroupUpdateAllowed() {
        return m_oracleRadioGroupUpdateAllowed;
    }

    public String getoracleRadioGroupForegroundColor() {
        return m_oracleRadioGroupForegroundColor;
    }

    public String getoracleRadioGroupBackgroundColor() {
        return m_oracleRadioGroupBackgroundColor;
    }

    public String getoracleRadioGroupFillPattern() {
        return m_oracleRadioGroupFillPattern;
    }

    public String getoracleRadioGroupFont() {
        return m_oracleRadioGroupFont;
    }

    public String getoracleRadioGroupFontName() {
        return m_oracleRadioGroupFontName;
    }

    public String getoracleRadioGroupFontSize() {
        return m_oracleRadioGroupFontSize;
    }

    public String getoracleRadioGroupFontWeight() {
        return m_oracleRadioGroupFontWeight;
    }

    public String getoracleRadioGroupFontStyle() {
        return m_oracleRadioGroupFontStyle;
    }

    public String getoracleRadioGroupFontSpacing() {
        return m_oracleRadioGroupFontSpacing;
    }

    public String getoracleRadioGroupHint() {
        return m_oracleRadioGroupHint;
    }

    public String getoracleRadioGroupDisplayHintAutomatically() {
        return m_oracleRadioGroupDisplayHintAutomatically;
    }

    public String getoracleRadioGroupTooltip() {
        return m_oracleRadioGroupTooltip;
    }

    public String getoracleRadioGroupDirection() {
        return m_oracleRadioGroupDirection;
    }

    public String getoracleRadioGroupTrigger() {
        return m_oracleRadioGroupTrigger;
    }

    public ArrayList<oracleRadioButton> getListButton() {
        return m_ListButton;
    }
    
}


//~ Formatted by Jindent --- http://www.jindent.com
