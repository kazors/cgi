
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
public class oracleBlock {

    String m_blockName;
    String m_blockSubclassInformation;
    //jusqua navigation style
    String m_blockNavigationStyle;
    String m_blockPreviousNavigationDataBlock;
    String m_blockNextNavigationDataBlock;

    // 1
    int m_blockQueryArraySize;
    int m_blockNumberOfRecordsBuffered;
    int m_blockNumberOfRecordDsiplayed;
    String m_blockQueryAllRecord;
    String m_blockRecordOrientation;
    String m_blockSingleRecord;
    String m_blockDatabaseDataBlock;
    String m_blockEnforcePrimaryKey;
    String m_blockQueryAllowed;
    String m_blockQueryDataSourceType;
    String m_blockQueryDataSourceName;
    String m_blockQueryDataSourceColumns;
    String m_blockQueryDataSourceArguments;
    String m_blockAlias;
    String m_blockIncludeRefItem;
    String m_blockWhereClause;

    // jusqua ligne vide
    String m_blockOrderByClause;
    String m_blockOptimizerHint;
    String m_blockInsertAllowed;
    String m_blockUpdateAllowed;
    String m_blockLockingMode;
    String m_blockDeleteAllowed;
    String m_blockKeyMode;
    String m_blockUpdateChangedColumnsOnly;
    String m_blockEnforceColumnSecurity;
    String m_blockMaximumQueryTime;
    String m_blockMaximumRecordsFetched;
    String m_blockDMLDataTargetType;
    String m_blockDMLDataTargetname;
    String m_blockInsertProcedureName;
    String m_blockInsertProcedureResultSetColumns;
    String m_blockInsertProcedureArguments;
    String m_blockUpdateProcedureName;
    String m_blockUpdateProcedureResultSetColumns;
    String m_blockUpdateProcedureArguments;
    String m_blockDeleteProcedureName;
    String m_blockDeleteProcedureResultSetColumns;
    String m_blockDeleteProcedureArguments;
    String m_blockLockProcedureName;
    String m_blockLockProcedureResultSetColumns;
    String m_blockLockProcedureArguments;
    int m_blockDMLArraySize;
    String m_blockPrecomputeSummaries;
    String m_blockDMLReturningValue;
    ArrayList<oracleItem> m_ListItem;
    ArrayList<PlSqlMethod> m_ListMethod;
    ArrayList<oracleRadioGroup> m_listRadioGroup;
    ArrayList<oraclePushButton> m_listPushButton;
    ArrayList<oracleCheckBox> m_listCheckBox;
    ArrayList<GraphicTextObject> m_listGraphicObject;

    public oracleBlock(String p_blockName, String p_blockSubclassInformation, String p_blockNavigationStyle,
            String p_blockPreviousNavigationDataBlock, String p_blockNextNavigationDataBlock,
            int p_blockQueryArraySize, int p_blockNumberOfRecordsBuffered,
            int p_blockNumberOfRecordDsiplayed, String p_blockQueryAllRecord,
            String p_blockRecordOrientation, String p_blockSingleRecord, String p_blockDatabaseDataBlock,
            String p_blockEnforcePrimaryKey, String p_blockQueryAllowed, String p_blockQueryDataSourceType,
            String p_blockQueryDataSourceName, String p_blockQueryDataSourceColumns,
            String p_blockQueryDataSourceArguments, String p_blockAlias, String p_blockIncludeRefItem,
            String p_blockWhereClause, String p_blockOrderByClause, String p_blockOptimizerHint,
            String p_blockInsertAllowed, String p_blockUpdtadeAllowed, String p_blockLockingMode,
            String p_blockDeleteAllowed, String p_blockKeyMode, String p_blockUpdateChangedColumnsOnly,
            String p_blockEnforceColumnSecurity, String p_blockMaximumQueryTime,
            String p_blockMaximumRecordsFetched, String p_blockDMLDataTargetType,
            String p_blockDMLDataTargetname, String p_blockInsertProcedureName,
            String p_blockInsertProcedureResultSetColumns, String p_blockInsertProcedureArguments,
            String p_blockUpdateProcedureName, String p_blockUpdateProcedureResultSetColumns,
            String p_blockUpdateProcedureArguments, String p_blockDeleteProcedureName,
            String p_blockDeleteProcedureResultSetColumns, String p_blockDeleteProcedureArguments,
            String p_blockLockProcedureName, String p_blockLockProcedureResultSetColumns,
            String p_blockLockProcedureArguments, int p_blockDMLArraySize,
            String p_blockPrecomputeSummaries, String p_blockDMLReturningValue,
            ArrayList<oracleItem> p_ListItem, ArrayList<PlSqlMethod> p_ListMethod, 
            ArrayList<oracleRadioGroup> p_listRadioGroup, ArrayList<oraclePushButton> p_listPushButton, 
            ArrayList<oracleCheckBox> p_listCheckBox, ArrayList<GraphicTextObject> p_listGraphicObject ) {
        this.m_blockName = p_blockName;
        this.m_blockSubclassInformation = p_blockSubclassInformation;
        this.m_blockNavigationStyle = p_blockNavigationStyle;
        this.m_blockPreviousNavigationDataBlock = p_blockPreviousNavigationDataBlock;
        this.m_blockNextNavigationDataBlock = p_blockNextNavigationDataBlock;
        this.m_blockQueryArraySize = p_blockQueryArraySize;
        this.m_blockNumberOfRecordsBuffered = p_blockNumberOfRecordsBuffered;
        this.m_blockNumberOfRecordDsiplayed = p_blockNumberOfRecordDsiplayed;
        this.m_blockQueryAllRecord = p_blockQueryAllRecord;
        this.m_blockRecordOrientation = p_blockRecordOrientation;
        this.m_blockSingleRecord = p_blockSingleRecord;
        this.m_blockDatabaseDataBlock = p_blockDatabaseDataBlock;
        this.m_blockEnforcePrimaryKey = p_blockEnforcePrimaryKey;
        this.m_blockQueryAllowed = p_blockQueryAllowed;
        this.m_blockQueryDataSourceType = p_blockQueryDataSourceType;
        this.m_blockQueryDataSourceName = p_blockQueryDataSourceName;
        this.m_blockQueryDataSourceColumns = p_blockQueryDataSourceColumns;
        this.m_blockQueryDataSourceArguments = p_blockQueryDataSourceArguments;
        this.m_blockAlias = p_blockAlias;
        this.m_blockIncludeRefItem = p_blockIncludeRefItem;
        this.m_blockWhereClause = p_blockWhereClause;
        this.m_blockOrderByClause = p_blockOrderByClause;
        this.m_blockOptimizerHint = p_blockOptimizerHint;
        this.m_blockInsertAllowed = p_blockInsertAllowed;
        this.m_blockUpdateAllowed = p_blockUpdtadeAllowed;
        this.m_blockLockingMode = p_blockLockingMode;
        this.m_blockDeleteAllowed = p_blockDeleteAllowed;
        this.m_blockKeyMode = p_blockKeyMode;
        this.m_blockUpdateChangedColumnsOnly = p_blockUpdateChangedColumnsOnly;
        this.m_blockEnforceColumnSecurity = p_blockEnforceColumnSecurity;
        this.m_blockMaximumQueryTime = p_blockMaximumQueryTime;
        this.m_blockMaximumRecordsFetched = p_blockMaximumRecordsFetched;
        this.m_blockDMLDataTargetType = p_blockDMLDataTargetType;
        this.m_blockDMLDataTargetname = p_blockDMLDataTargetname;
        this.m_blockInsertProcedureName = p_blockInsertProcedureName;
        this.m_blockInsertProcedureResultSetColumns = p_blockInsertProcedureResultSetColumns;
        this.m_blockInsertProcedureArguments = p_blockInsertProcedureArguments;
        this.m_blockUpdateProcedureName = p_blockUpdateProcedureName;
        this.m_blockUpdateProcedureResultSetColumns = p_blockUpdateProcedureResultSetColumns;
        this.m_blockUpdateProcedureArguments = p_blockUpdateProcedureArguments;
        this.m_blockDeleteProcedureName = p_blockDeleteProcedureName;
        this.m_blockDeleteProcedureResultSetColumns = p_blockDeleteProcedureResultSetColumns;
        this.m_blockDeleteProcedureArguments = p_blockDeleteProcedureArguments;
        this.m_blockLockProcedureName = p_blockLockProcedureName;
        this.m_blockLockProcedureResultSetColumns = p_blockLockProcedureResultSetColumns;
        this.m_blockLockProcedureArguments = p_blockLockProcedureArguments;
        this.m_blockDMLArraySize = p_blockDMLArraySize;
        this.m_blockPrecomputeSummaries = p_blockPrecomputeSummaries;
        this.m_blockDMLReturningValue = p_blockDMLReturningValue;
        this.m_ListItem = p_ListItem;
        this.m_ListMethod = p_ListMethod;
        this.m_listRadioGroup = p_listRadioGroup;
        this.m_listPushButton = p_listPushButton;
        this.m_listCheckBox=p_listCheckBox;
        this.m_listGraphicObject=p_listGraphicObject;
    }

    public ArrayList<GraphicTextObject> getlistGraphicObject() {
        return m_listGraphicObject;
    }

    public void setlistGraphicObject(ArrayList<GraphicTextObject> m_listGraphicObject) {
        this.m_listGraphicObject = m_listGraphicObject;
    }
    
    
    private void AddMethod(PlSqlMethod p_method) {
        m_ListMethod.add(p_method);
    }

    public ArrayList<oracleCheckBox> getlistCheckBox() {
        return m_listCheckBox;
    }
    
    public String getblockName() {
        return m_blockName;
    }

    public void addItemList(ArrayList<oracleItem> p_ListItem) {
        m_ListItem = p_ListItem;
    }

    public void addRadioGroupList(ArrayList<oracleRadioGroup> p_ListRadioGroup) {
        m_listRadioGroup = p_ListRadioGroup;
    }

    public String getblockSubclassInformation() {
        return m_blockSubclassInformation;
    }

    public String getblockNavigationStyle() {
        return m_blockNavigationStyle;
    }

    public String getblockPreviousNavigationDataBlock() {
        return m_blockPreviousNavigationDataBlock;
    }

    public String getblockNextNavigationDataBlock() {
        return m_blockNextNavigationDataBlock;
    }

    public int getblockQueryArraySize() {
        return m_blockQueryArraySize;
    }

    public int getblockNumberOfRecordsBuffered() {
        return m_blockNumberOfRecordsBuffered;
    }

    public int getblockNumberOfRecordDsiplayed() {
        return m_blockNumberOfRecordDsiplayed;
    }

    public String getblockQueryAllRecord() {
        return m_blockQueryAllRecord;
    }

    public String getblockRecordOrientation() {
        return m_blockRecordOrientation;
    }

    public String getblockSingleRecord() {
        return m_blockSingleRecord;
    }

    public String getblockDatabaseDataBlock() {
        return m_blockDatabaseDataBlock;
    }

    public String getblockEnforcePrimaryKey() {
        return m_blockEnforcePrimaryKey;
    }

    public String getblockQueryAllowed() {
        return m_blockQueryAllowed;
    }

    public String getblockQueryDataSourceType() {
        return m_blockQueryDataSourceType;
    }

    public String getblockQueryDataSourceName() {
        return m_blockQueryDataSourceName;
    }

    public String getblockQueryDataSourceColumns() {
        return m_blockQueryDataSourceColumns;
    }

    public String getblockQueryDataSourceArguments() {
        return m_blockQueryDataSourceArguments;
    }

    public String getblockAlias() {
        return m_blockAlias;
    }

    public String getblockIncludeRefItem() {
        return m_blockIncludeRefItem;
    }

    public String getblockWhereClause() {
        return m_blockWhereClause;
    }

    public String getblockOrderByClause() {
        return m_blockOrderByClause;
    }

    public String getblockOptimizerHint() {
        return m_blockOptimizerHint;
    }

    public String getblockInsertAllowed() {
        return m_blockInsertAllowed;
    }

    public String getblockUpdateAllowed() {
        return m_blockUpdateAllowed;
    }

    public String getblockLockingMode() {
        return m_blockLockingMode;
    }

    public String getblockDeleteAllowed() {
        return m_blockDeleteAllowed;
    }

    public String getblockKeyMode() {
        return m_blockKeyMode;
    }

    public String getblockUpdateChangedColumnsOnly() {
        return m_blockUpdateChangedColumnsOnly;
    }

    public String getblockEnforceColumnSecurity() {
        return m_blockEnforceColumnSecurity;
    }

    public String getblockMaximumQueryTime() {
        return m_blockMaximumQueryTime;
    }

    public String getblockMaximumRecordsFetched() {
        return m_blockMaximumRecordsFetched;
    }

    public String getblockDMLDataTargetType() {
        return m_blockDMLDataTargetType;
    }

    public String getblockDMLDataTargetname() {
        return m_blockDMLDataTargetname;
    }

    public String getblockInsertProcedureName() {
        return m_blockInsertProcedureName;
    }

    public String getblockInsertProcedureResultSetColumns() {
        return m_blockInsertProcedureResultSetColumns;
    }

    public String getblockInsertProcedureArguments() {
        return m_blockInsertProcedureArguments;
    }

    public String getblockUpdateProcedureName() {
        return m_blockUpdateProcedureName;
    }

    public String getblockUpdateProcedureResultSetColumns() {
        return m_blockUpdateProcedureResultSetColumns;
    }

    public String getblockUpdateProcedureArguments() {
        return m_blockUpdateProcedureArguments;
    }

    public String getblockDeleteProcedureName() {
        return m_blockDeleteProcedureName;
    }

    public String getblockDeleteProcedureResultSetColumns() {
        return m_blockDeleteProcedureResultSetColumns;
    }

    public String getblockDeleteProcedureArguments() {
        return m_blockDeleteProcedureArguments;
    }

    public String getblockLockProcedureName() {
        return m_blockLockProcedureName;
    }

    public String getblockLockProcedureResultSetColumns() {
        return m_blockLockProcedureResultSetColumns;
    }

    public String getblockLockProcedureArguments() {
        return m_blockLockProcedureArguments;
    }

    public int getblockDMLArraySize() {
        return m_blockDMLArraySize;
    }

    public String getblockPrecomputeSummaries() {
        return m_blockPrecomputeSummaries;
    }

    public String getblockDMLReturningValue() {
        return m_blockDMLReturningValue;
    }

    public ArrayList<oracleItem> getListItem() {
        return m_ListItem;
    }

    public ArrayList<PlSqlMethod> getListMethod() {
        return m_ListMethod;
    }

    public ArrayList<oracleRadioGroup> getlistRadioGroup() {
        return m_listRadioGroup;
    }
    
    public ArrayList<oraclePushButton> getListPushButton(){
        return m_listPushButton;
    }

    public void setListItem(ArrayList<oracleItem> m_ListItem) {
        this.m_ListItem = m_ListItem;
    }

    public void setListMethod(ArrayList<PlSqlMethod> m_ListMethod) {
        this.m_ListMethod = m_ListMethod;
    }

    public void setlistRadioGroup(ArrayList<oracleRadioGroup> m_listRadioGroup) {
        this.m_listRadioGroup = m_listRadioGroup;
    }

    public void setlistPushButton(ArrayList<oraclePushButton> m_listPushButton) {
        this.m_listPushButton = m_listPushButton;
    }

    public void setlistCheckBox(ArrayList<oracleCheckBox> m_listCheckBox) {
        this.m_listCheckBox = m_listCheckBox;
    }

    
}


//~ Formatted by Jindent --- http://www.jindent.com
