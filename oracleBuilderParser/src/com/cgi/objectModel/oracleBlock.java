
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
    int    m_blockQueryArraySize;
    int    m_blockNumberOfRecordsBuffered;
    int    m_blockNumberOfRecordDsiplayed;
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
    String                 m_blockOrderByClause;
    String                 m_blockOptimizerHint;
    String                 m_blockInsertAllowed;
    String                 m_blockUpdateAllowed;
    String                 m_blockLockingMode;
    String                 m_blockDeleteAllowed;
    String                 m_blockKeyMode;
    String                 m_blockUpdateChangedColumnsOnly;
    String                 m_blockEnforceColumnSecurity;
    String                 m_blockMaximumQueryTime;
    String                 m_blockMaximumRecordsFetched;
    String                 m_blockDMLDataTargetType;
    String                 m_blockDMLDataTargetname;
    String                 m_blockInsertProcedureName;
    String                 m_blockInsertProcedureResultSetColumns;
    String                 m_blockInsertProcedureArguments;
    String                 m_blockUpdateProcedureName;
    String                 m_blockUpdateProcedureResultSetColumns;
    String                 m_blockUpdateProcedureArguments;
    String                 m_blockDeleteProcedureName;
    String                 m_blockDeleteProcedureResultSetColumns;
    String                 m_blockDeleteProcedureArguments;
    String                 m_blockLockProcedureName;
    String                 m_blockLockProcedureResultSetColumns;
    String                 m_blockLockProcedureArguments;
    int                    m_blockDMLArraySize;
    String                 m_blockPrecomputeSummaries;
    String                 m_blockDMLReturningValue;
    ArrayList<oracleItem>  m_ListItem;
    ArrayList<PlSqlMethod> m_ListMethod;

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
                       ArrayList<oracleItem> p_ListItem, ArrayList<PlSqlMethod> p_ListMethod) {
        this.m_blockName                            = p_blockName;
        this.m_blockSubclassInformation             = p_blockSubclassInformation;
        this.m_blockNavigationStyle                 = p_blockNavigationStyle;
        this.m_blockPreviousNavigationDataBlock     = p_blockPreviousNavigationDataBlock;
        this.m_blockNextNavigationDataBlock         = p_blockNextNavigationDataBlock;
        this.m_blockQueryArraySize                  = p_blockQueryArraySize;
        this.m_blockNumberOfRecordsBuffered         = p_blockNumberOfRecordsBuffered;
        this.m_blockNumberOfRecordDsiplayed         = p_blockNumberOfRecordDsiplayed;
        this.m_blockQueryAllRecord                  = p_blockQueryAllRecord;
        this.m_blockRecordOrientation               = p_blockRecordOrientation;
        this.m_blockSingleRecord                    = p_blockSingleRecord;
        this.m_blockDatabaseDataBlock               = p_blockDatabaseDataBlock;
        this.m_blockEnforcePrimaryKey               = p_blockEnforcePrimaryKey;
        this.m_blockQueryAllowed                    = p_blockQueryAllowed;
        this.m_blockQueryDataSourceType             = p_blockQueryDataSourceType;
        this.m_blockQueryDataSourceName             = p_blockQueryDataSourceName;
        this.m_blockQueryDataSourceColumns          = p_blockQueryDataSourceColumns;
        this.m_blockQueryDataSourceArguments        = p_blockQueryDataSourceArguments;
        this.m_blockAlias                           = p_blockAlias;
        this.m_blockIncludeRefItem                  = p_blockIncludeRefItem;
        this.m_blockWhereClause                     = p_blockWhereClause;
        this.m_blockOrderByClause                   = p_blockOrderByClause;
        this.m_blockOptimizerHint                   = p_blockOptimizerHint;
        this.m_blockInsertAllowed                   = p_blockInsertAllowed;
        this.m_blockUpdateAllowed                  = p_blockUpdtadeAllowed;
        this.m_blockLockingMode                     = p_blockLockingMode;
        this.m_blockDeleteAllowed                   = p_blockDeleteAllowed;
        this.m_blockKeyMode                         = p_blockKeyMode;
        this.m_blockUpdateChangedColumnsOnly        = p_blockUpdateChangedColumnsOnly;
        this.m_blockEnforceColumnSecurity           = p_blockEnforceColumnSecurity;
        this.m_blockMaximumQueryTime                = p_blockMaximumQueryTime;
        this.m_blockMaximumRecordsFetched           = p_blockMaximumRecordsFetched;
        this.m_blockDMLDataTargetType               = p_blockDMLDataTargetType;
        this.m_blockDMLDataTargetname               = p_blockDMLDataTargetname;
        this.m_blockInsertProcedureName             = p_blockInsertProcedureName;
        this.m_blockInsertProcedureResultSetColumns = p_blockInsertProcedureResultSetColumns;
        this.m_blockInsertProcedureArguments        = p_blockInsertProcedureArguments;
        this.m_blockUpdateProcedureName             = p_blockUpdateProcedureName;
        this.m_blockUpdateProcedureResultSetColumns = p_blockUpdateProcedureResultSetColumns;
        this.m_blockUpdateProcedureArguments        = p_blockUpdateProcedureArguments;
        this.m_blockDeleteProcedureName             = p_blockDeleteProcedureName;
        this.m_blockDeleteProcedureResultSetColumns = p_blockDeleteProcedureResultSetColumns;
        this.m_blockDeleteProcedureArguments        = p_blockDeleteProcedureArguments;
        this.m_blockLockProcedureName               = p_blockLockProcedureName;
        this.m_blockLockProcedureResultSetColumns   = p_blockLockProcedureResultSetColumns;
        this.m_blockLockProcedureArguments          = p_blockLockProcedureArguments;
        this.m_blockDMLArraySize                    = p_blockDMLArraySize;
        this.m_blockPrecomputeSummaries             = p_blockPrecomputeSummaries;
        this.m_blockDMLReturningValue               = p_blockDMLReturningValue;
        this.m_ListItem                             = p_ListItem;
        this.m_ListMethod                           = p_ListMethod;
    }
    private void AddMethod(PlSqlMethod p_method){
        m_ListMethod.add(p_method);
    }

    public String getblockName() {
        return m_blockName;
    }
    
}


//~ Formatted by Jindent --- http://www.jindent.com
