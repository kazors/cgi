
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
public class oracleItem  {

    ////////////////////////////////////////////////////////////////////////////
    // Generale
    String m_objectName;
    String m_objectItemType;
    String m_objectComments;

    ////////////////////////////////////////////////////////////////////////////
    // Functionnal
    String m_objectEnabled;
    String m_objectJustification;      // Right, Left or Center
    String m_objectMultiLine;
    String m_objectCaseRestriction;    // Lower, Upper or Mixed
    String m_objectDataConceal;

    ////////////////////////////////////////////////////////////////////////////
    // Navigation
    String m_objectKeyboardNavigable;
    String m_objectPreviousNavigationItem;
    String m_objectNextNavigationItem;

    ////////////////////////////////////////////////////////////////////////////
    // Data
    String m_objectDataType;
    String m_objectDataMaxLength;
    String m_objectInitialValue;
    String m_objectRequired;
    String m_objectDataMask;
    String m_objectMinimalValue;
    String m_objectMaximalValue;
    String m_objectDataCopyFromItem;
    String m_objectDataSynchronizeWithItem;

    ////////////////////////////////////////////////////////////////////////////
    // Calculation
    String m_objectCalculationMode;    // Summary or Formula
    String m_objectFormula;
    String m_objectSummaryFunction;
    String m_objectSummarizedBlock;
    String m_objectSummarizedItem;

    ////////////////////////////////////////////////////////////////////////////
    // Database
    String m_objectIsDatabaseItem;
    String m_objectColumnName;
    String m_objectQueryOnly;
    String m_objectQueryAllowed;
    String m_objectQueryLength;
    String m_objectCaseSensitiveQuery;
    String m_objectInsertAllowed;
    String m_objectUpdateAllowed;
    String m_objectUpdateOnlyIfNull;

    ////////////////////////////////////////////////////////////////////////////
    // ListOfValues
    String m_objectListOfValuesName;
    String m_objectValidateFromList;

    ////////////////////////////////////////////////////////////////////////////
    // Physical
    String m_objectVisible;
    String m_objectPositionX;
    String m_objectPositionY;
    String m_objectWidth;
    String m_objectHeight;
    String m_objectBevel;    // Lowered, Raised or Inset

    ////////////////////////////////////////////////////////////////////////////
    // Color
    String m_objectForeGroundColor;
    String m_objectBackGroundColor;
    String m_objectFillPattern;

    ////////////////////////////////////////////////////////////////////////////
    // Font
    String m_objectFontName;
    String m_objectFontSize;
    String m_objectFontWeight;     // like BOLD,LIGHT
    String m_objectFontStyle;      // like ITALIC or PLAIN
    String m_objectFontSpacing;    // like DENSE, NORMAL, EXPAND

    ////////////////////////////////////////////////////////////////////////////
    // Help
    String m_objectHint;
    String m_objectDisplayHintAutomatically;
    String m_objectTooltip;

    ////////////////////////////////////////////////////////////////////////////
    // PL/SQL
    ArrayList<PlSqlMethod> m_listMethod;

    public oracleItem(String p_objectName, String p_objectItemType, String p_objectComments, String p_objectEnabled,
                        String p_objectJustification, String p_objectMultiLine, String p_objectCaseRestriction,
                        String p_objectDataConceal, String p_objectKeyboardNavigable,
                        String p_objectPreviousNavigationItem, String p_objectNextNavigationItem,
                        String p_objectDataType, String p_objectDataMaxLength, String p_objectInitialValue,
                        String p_objectRequired, String p_objectDataMask, String p_objectMinimalValue,
                        String p_objectMaximalValue, String p_objectDataCopyFromItem,
                        String p_objectDataSynchronizeWithItem, String p_objectCalculationMode, String p_objectFormula,
                        String p_objectSummaryFunction, String p_objectSummarizedBlock, String p_objectSummarizedItem,
                        String p_objectIsDatabaseItem, String p_objectColumnName, String p_objectQueryOnly,
                        String p_objectQueryAllowed, String p_objectQueryLength, String p_objectCaseSensitiveQuery,
                        String p_objectInsertAllowed, String p_objectUpdateAllowed, String p_objectUpdateOnlyIfNull,
                        String p_objectListOfValuesName, String p_objectValidateFromList, String p_objectVisible,
                        String p_objectPositionX, String p_objectPositionY, String p_objectWidth,
                        String p_objectHeight, String p_objectBevel, String p_objectForeGroundColor,
                        String p_objectBackGroundColor, String p_objectFillPattern, String p_objectFontName,
                        String p_objectFontSize, String p_objectFontWeight, String p_objectFontStyle,
                        String p_objectFontSpacing, String p_objectHint, String p_objectDisplayHintAutomatically,
                        String p_objectTooltip, ArrayList<PlSqlMethod> p_listMethod) {
        this.m_objectName                     = p_objectName;
        this.m_objectItemType                 = p_objectItemType;
        this.m_objectComments                 = p_objectComments;
        this.m_objectEnabled                  = p_objectEnabled;
        this.m_objectJustification            = p_objectJustification;
        this.m_objectMultiLine                = p_objectMultiLine;
        this.m_objectCaseRestriction          = p_objectCaseRestriction;
        this.m_objectDataConceal              = p_objectDataConceal;
        this.m_objectKeyboardNavigable        = p_objectKeyboardNavigable;
        this.m_objectPreviousNavigationItem   = p_objectPreviousNavigationItem;
        this.m_objectNextNavigationItem       = p_objectNextNavigationItem;
        this.m_objectDataType                 = p_objectDataType;
        this.m_objectDataMaxLength            = p_objectDataMaxLength;
        this.m_objectInitialValue             = p_objectInitialValue;
        this.m_objectRequired                 = p_objectRequired;
        this.m_objectDataMask                 = p_objectDataMask;
        this.m_objectMinimalValue             = p_objectMinimalValue;
        this.m_objectMaximalValue             = p_objectMaximalValue;
        this.m_objectDataCopyFromItem         = p_objectDataCopyFromItem;
        this.m_objectDataSynchronizeWithItem  = p_objectDataSynchronizeWithItem;
        this.m_objectCalculationMode          = p_objectCalculationMode;
        this.m_objectFormula                  = p_objectFormula;
        this.m_objectSummaryFunction          = p_objectSummaryFunction;
        this.m_objectSummarizedBlock          = p_objectSummarizedBlock;
        this.m_objectSummarizedItem           = p_objectSummarizedItem;
        this.m_objectIsDatabaseItem           = p_objectIsDatabaseItem;
        this.m_objectColumnName               = p_objectColumnName;
        this.m_objectQueryOnly                = p_objectQueryOnly;
        this.m_objectQueryAllowed             = p_objectQueryAllowed;
        this.m_objectQueryLength              = p_objectQueryLength;
        this.m_objectCaseSensitiveQuery       = p_objectCaseSensitiveQuery;
        this.m_objectInsertAllowed            = p_objectInsertAllowed;
        this.m_objectUpdateAllowed            = p_objectUpdateAllowed;
        this.m_objectUpdateOnlyIfNull         = p_objectUpdateOnlyIfNull;
        this.m_objectListOfValuesName         = p_objectListOfValuesName;
        this.m_objectValidateFromList         = p_objectValidateFromList;
        this.m_objectVisible                  = p_objectVisible;
        this.m_objectPositionX                = p_objectPositionX;
        this.m_objectPositionY                = p_objectPositionY;
        this.m_objectWidth                    = p_objectWidth;
        this.m_objectHeight                   = p_objectHeight;
        this.m_objectBevel                    = p_objectBevel;
        this.m_objectForeGroundColor          = p_objectForeGroundColor;
        this.m_objectBackGroundColor          = p_objectBackGroundColor;
        this.m_objectFillPattern              = p_objectFillPattern;
        this.m_objectFontName                 = p_objectFontName;
        this.m_objectFontSize                 = p_objectFontSize;
        this.m_objectFontWeight               = p_objectFontWeight;
        this.m_objectFontStyle                = p_objectFontStyle;
        this.m_objectFontSpacing              = p_objectFontSpacing;
        this.m_objectHint                     = p_objectHint;
        this.m_objectDisplayHintAutomatically = p_objectDisplayHintAutomatically;
        this.m_objectTooltip                  = p_objectTooltip;
        this.m_listMethod                     = p_listMethod;
    }
    
    public void addMethod(PlSqlMethod p_method){
        m_listMethod.add(p_method);
    }

    public String getobjectName() {
        return m_objectName;
    }

    public String getobjectItemType() {
        return m_objectItemType;
    }

    public String getobjectComments() {
        return m_objectComments;
    }

    public String getobjectEnabled() {
        return m_objectEnabled;
    }

    public String getobjectJustification() {
        return m_objectJustification;
    }

    public String getobjectMultiLine() {
        return m_objectMultiLine;
    }

    public String getobjectCaseRestriction() {
        return m_objectCaseRestriction;
    }

    public String getobjectDataConceal() {
        return m_objectDataConceal;
    }

    public String getobjectKeyboardNavigable() {
        return m_objectKeyboardNavigable;
    }

    public String getobjectPreviousNavigationItem() {
        return m_objectPreviousNavigationItem;
    }

    public String getobjectNextNavigationItem() {
        return m_objectNextNavigationItem;
    }

    public String getobjectDataType() {
        return m_objectDataType;
    }

    public String getobjectDataMaxLength() {
        return m_objectDataMaxLength;
    }

    public String getobjectInitialValue() {
        return m_objectInitialValue;
    }

    public String getobjectRequired() {
        return m_objectRequired;
    }

    public String getobjectDataMask() {
        return m_objectDataMask;
    }

    public String getobjectMinimalValue() {
        return m_objectMinimalValue;
    }

    public String getobjectMaximalValue() {
        return m_objectMaximalValue;
    }

    public String getobjectDataCopyFromItem() {
        return m_objectDataCopyFromItem;
    }

    public String getobjectDataSynchronizeWithItem() {
        return m_objectDataSynchronizeWithItem;
    }

    public String getobjectCalculationMode() {
        return m_objectCalculationMode;
    }

    public String getobjectFormula() {
        return m_objectFormula;
    }

    public String getobjectSummaryFunction() {
        return m_objectSummaryFunction;
    }

    public String getobjectSummarizedBlock() {
        return m_objectSummarizedBlock;
    }

    public String getobjectSummarizedItem() {
        return m_objectSummarizedItem;
    }

    public String getobjectIsDatabaseItem() {
        return m_objectIsDatabaseItem;
    }

    public String getobjectColumnName() {
        return m_objectColumnName;
    }

    public String getobjectQueryOnly() {
        return m_objectQueryOnly;
    }

    public String getobjectQueryAllowed() {
        return m_objectQueryAllowed;
    }

    public String getobjectQueryLength() {
        return m_objectQueryLength;
    }

    public String getobjectCaseSensitiveQuery() {
        return m_objectCaseSensitiveQuery;
    }

    public String getobjectInsertAllowed() {
        return m_objectInsertAllowed;
    }

    public String getobjectUpdateAllowed() {
        return m_objectUpdateAllowed;
    }

    public String getobjectUpdateOnlyIfNull() {
        return m_objectUpdateOnlyIfNull;
    }

    public String getobjectListOfValuesName() {
        return m_objectListOfValuesName;
    }

    public String getobjectValidateFromList() {
        return m_objectValidateFromList;
    }

    public String getobjectVisible() {
        return m_objectVisible;
    }

    public String getobjectPositionX() {
        return m_objectPositionX;
    }

    public String getobjectPositionY() {
        return m_objectPositionY;
    }

    public String getobjectWidth() {
        return m_objectWidth;
    }

    public String getobjectHeight() {
        return m_objectHeight;
    }

    public String getobjectBevel() {
        return m_objectBevel;
    }

    public String getobjectForeGroundColor() {
        return m_objectForeGroundColor;
    }

    public String getobjectBackGroundColor() {
        return m_objectBackGroundColor;
    }

    public String getobjectFillPattern() {
        return m_objectFillPattern;
    }

    public String getobjectFontName() {
        return m_objectFontName;
    }

    public String getobjectFontSize() {
        return m_objectFontSize;
    }

    public String getobjectFontWeight() {
        return m_objectFontWeight;
    }

    public String getobjectFontStyle() {
        return m_objectFontStyle;
    }

    public String getobjectFontSpacing() {
        return m_objectFontSpacing;
    }

    public String getobjectHint() {
        return m_objectHint;
    }

    public String getobjectDisplayHintAutomatically() {
        return m_objectDisplayHintAutomatically;
    }

    public String getobjectTooltip() {
        return m_objectTooltip;
    }

    public ArrayList<PlSqlMethod> getlistMethod() {
        return m_listMethod;
    }
    
}


//~ Formatted by Jindent --- http://www.jindent.com
