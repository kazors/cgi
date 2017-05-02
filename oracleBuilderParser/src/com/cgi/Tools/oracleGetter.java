
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package com.cgi.Tools;

//~--- non-JDK imports --------------------------------------------------------

import com.cgi.OracleBuilderParser.OracleBuilderParser;
import com.cgi.objectModel.PlSqlLibraries;
import com.cgi.objectModel.PlSqlMethod;
import com.cgi.objectModel.oracleAlert;
import com.cgi.objectModel.oracleBlock;
import com.cgi.objectModel.oracleItem;
import com.cgi.objectModel.oraclePushButton;
import com.cgi.objectModel.oracleRadioButton;
import com.cgi.objectModel.oracleRadioGroup;

//~--- JDK imports ------------------------------------------------------------

import java.io.IOException;
import java.io.RandomAccessFile;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gerardj
 */
public class oracleGetter {
    public static PlSqlMethod getMethod(RandomAccessFile p_fileAccess) {
        PlSqlMethod v_plSqlMethod = null;

        try {
            String v_eventName           = Refactoring.delSpace(p_fileAccess.readLine());
            String v_subclassInformation = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_comments            = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_triggerStyle        = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_triggerText         = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_name                = Refactoring.formatMethodName(p_fileAccess.readLine());
            String v_methodDescription   = Refactoring.formatMethodName(p_fileAccess.readLine());
            String v_method              = "";
            String v_tmp                 = "";

            while (!((v_tmp = p_fileAccess.readLine()).startsWith("END;"))) {
                v_method = v_method + "\n" + v_tmp;
            }

            v_method      = v_method + "\n" + "END;";
            v_plSqlMethod = new PlSqlMethod(v_eventName, v_subclassInformation, v_comments, v_triggerStyle,
                                            v_triggerText, v_name, v_methodDescription, v_method);
        } catch (IOException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        }

        return v_plSqlMethod;
    }

    public static ArrayList<oracleRadioButton> getRadioButton(RandomAccessFile p_fileAccess) {
        ArrayList<oracleRadioButton> v_listButton = new ArrayList<>();

        try {
            do {
                Navigate.nextLine(4, p_fileAccess);

                String v_radioButtonName                =
                    Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
                String v_radioButtonSubClassInformation =
                    Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
                String v_radioButtonComments =
                    Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
                String v_radioButtonEnabled =
                    Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
                String v_radioButtonLabel     =
                    Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
                String v_radioButtonAccessKey =
                    Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
                String v_radioButtonRadioButtonValue =
                    Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

                Navigate.nextLine(1, p_fileAccess);

                String v_radioButtonVisible =
                    Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
                String v_radioButtonXPosition =
                    Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
                String v_radioButtonYPosition =
                    Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
                String v_radioButtonWidth  =
                    Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
                String v_radioButtonHeight =
                    Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

                Navigate.nextLine(2, p_fileAccess);

                String v_radioButtonForegroundColor =
                    Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
                String v_radioButtonBackgroundColor =
                    Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
                String v_radioButtonFillPattern =
                    Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
                String v_radioButtonFont     =
                    Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
                String v_radioButtonFontName =
                    Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
                String v_radioButtonFontSize =
                    Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
                String v_radioButtonFontWeight =
                    Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
                String v_radioButtonFontStyle =
                    Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
                String v_radioButtonFontSpacing =
                    Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

                v_listButton.add(new oracleRadioButton(v_radioButtonName, v_radioButtonSubClassInformation,
                        v_radioButtonComments, v_radioButtonEnabled, v_radioButtonLabel, v_radioButtonAccessKey,
                        v_radioButtonRadioButtonValue, v_radioButtonVisible, v_radioButtonXPosition,
                        v_radioButtonYPosition, v_radioButtonWidth, v_radioButtonHeight, v_radioButtonForegroundColor,
                        v_radioButtonBackgroundColor, v_radioButtonFillPattern, v_radioButtonFont,
                        v_radioButtonFontName, v_radioButtonFontSize, v_radioButtonFontWeight, v_radioButtonFontStyle,
                        v_radioButtonFontSpacing));
            } while (oracleChecker.NextIsARadioButton(p_fileAccess, p_fileAccess.getFilePointer()));
        } catch (IOException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        }

        return v_listButton;
    }

    public static oracleRadioGroup getRadioGroup(RandomAccessFile p_fileAccess) {
        oracleRadioGroup v_radioGroup = null;

        try {
            String v_oracleRadioGroupName     =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupItemType =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupAccessKey =
                Refactoring.delSpace(Refactoring.getValueFromLine(Navigate.avancerJusqua(p_fileAccess,
                    p_fileAccess.getFilePointer(), "- Access Key")));
            String v_oracleRadioGroupMappingofOtherValue =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupPopupMenu =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupKeyboardNavigable =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupMouseNavigate =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupPreviousNavigationItem =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupNextNavigationItem =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupDataType =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupDataLengthSemantics =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupMaximumLength =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupInitialValue =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupCopyValueFromItem =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupSynchronizeWithItem =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupCalculationMode =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupFormula =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupSummaryFunction =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupSummarizedBlock =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupSummarizedItem =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            Navigate.nextLine(1, p_fileAccess);

            String v_oracleRadioGroupNumberOfItemDisplayed =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupDatabaseItem =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupColumnName =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupPrimaryKey =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupQueryOnly =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupQueryAllowed =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupInsertAllowed =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupUpdateAllowed =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            Navigate.nextLine(3, p_fileAccess);

            String v_oracleRadioGroupForegroundColor =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupBackGroundColor =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupFillPattern =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupFont     =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupFontName =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupFontSize =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupFontWeight =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupFontStyle =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupFontSpacing =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupHint                     =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupDisplayHintAutomatically =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupTooltip =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupDirection =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupTrigger =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            ArrayList<oracleRadioButton> v_listButton = (getRadioButton(p_fileAccess));

            v_radioGroup = new oracleRadioGroup(v_oracleRadioGroupName, v_oracleRadioGroupItemType,
                    v_oracleRadioGroupAccessKey, v_oracleRadioGroupMappingofOtherValue, v_oracleRadioGroupPopupMenu,
                    v_oracleRadioGroupKeyboardNavigable, v_oracleRadioGroupMouseNavigate,
                    v_oracleRadioGroupPreviousNavigationItem, v_oracleRadioGroupNextNavigationItem,
                    v_oracleRadioGroupDataType, v_oracleRadioGroupDataLengthSemantics, v_oracleRadioGroupMaximumLength,
                    v_oracleRadioGroupInitialValue, v_oracleRadioGroupCopyValueFromItem,
                    v_oracleRadioGroupSynchronizeWithItem, v_oracleRadioGroupCalculationMode,
                    v_oracleRadioGroupFormula, v_oracleRadioGroupSummaryFunction, v_oracleRadioGroupSummarizedBlock,
                    v_oracleRadioGroupSummarizedItem, v_oracleRadioGroupNumberOfItemDisplayed,
                    v_oracleRadioGroupDatabaseItem, v_oracleRadioGroupColumnName, v_oracleRadioGroupPrimaryKey,
                    v_oracleRadioGroupQueryOnly, v_oracleRadioGroupQueryAllowed, v_oracleRadioGroupInsertAllowed,
                    v_oracleRadioGroupUpdateAllowed, v_oracleRadioGroupForegroundColor,
                    v_oracleRadioGroupBackGroundColor, v_oracleRadioGroupFillPattern, v_oracleRadioGroupFont,
                    v_oracleRadioGroupFontName, v_oracleRadioGroupFontSize, v_oracleRadioGroupFontWeight,
                    v_oracleRadioGroupFontStyle, v_oracleRadioGroupFontSpacing, v_oracleRadioGroupHint,
                    v_oracleRadioGroupDisplayHintAutomatically, v_oracleRadioGroupTooltip, v_oracleRadioGroupDirection,
                    v_oracleRadioGroupTrigger, v_listButton);
        } catch (IOException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        }

        return v_radioGroup;
    }

    public static PlSqlLibraries getLib(RandomAccessFile p_fileAccess) {
        PlSqlLibraries v_library = null;

        try {
            String v_libraryName     = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_libraryComments = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_libraryLocation = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            v_library = new PlSqlLibraries(v_libraryName, v_libraryComments, v_libraryLocation);
        } catch (IOException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        }

        return v_library;
    }

    private static oracleAlert getAlert(RandomAccessFile p_fileAccess) {
        oracleAlert v_alert = null;

        try {
            String v_alertName                =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_alertSubclassInformation =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_alertComments =
                Refactoring.delSpace(Refactoring.getValueFromLine(Navigate.avancerJusqua(p_fileAccess,
                    p_fileAccess.getFilePointer(), "- Comments")));
            String v_alertTitle         = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_alertMessage       = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_alertStyle         = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_alertButton1Label  = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_alertButton2Label  = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_alertButton3Label  = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_alertDefaultButton = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            Navigate.nextLine(1, p_fileAccess);

            String v_alertForegroundColor = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_alertBackGroundColor = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_alertFillPattern     = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_alertFont            = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_alertFontName        = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_alertFontSize        = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_alertFontWeight      = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_alertFontStyle       = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_alertFontSpacing     = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_alertDirection       = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            v_alert = new oracleAlert(v_alertName, v_alertSubclassInformation, v_alertComments, v_alertTitle,
                                      v_alertMessage, v_alertStyle, v_alertButton1Label, v_alertButton2Label,
                                      v_alertButton3Label, v_alertDefaultButton, v_alertForegroundColor,
                                      v_alertBackGroundColor, v_alertFillPattern, v_alertFont, v_alertFontName,
                                      v_alertFontSize, v_alertFontWeight, v_alertFontStyle, v_alertFontSpacing,
                                      v_alertDirection);
        } catch (IOException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        }

        return v_alert;
    }

    public static oracleBlock getBlock(RandomAccessFile p_fileAccess) {
        oracleBlock v_block = null;

        try {
            String v_blockName = Refactoring.delSpace(Refactoring.getValueFromLine(Navigate.avancerJusqua(p_fileAccess,
                                     p_fileAccess.getFilePointer(), "* Name")));
            String v_blockSubclassInformation =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockNavigationStyle =
                Refactoring.delSpace(Refactoring.getValueFromLine(Navigate.avancerJusqua(p_fileAccess,
                    p_fileAccess.getFilePointer(), "- Navigation Style")));
            String v_PreviousNavigationDataBlock =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockNextNavigationDataBlock =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            Navigate.nextLine(1, p_fileAccess);

            String v_tmp                 = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            int    v_blockQueryArraySize = 0;

            if (!(v_tmp.equals(""))) {
                v_blockQueryArraySize = Integer.parseInt(v_tmp);
            }

            int v_blockNumberOfRecordsBuffered = 0;

            v_tmp = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            if (!(v_tmp.equals(""))) {
                v_blockNumberOfRecordsBuffered = Integer.parseInt(v_tmp);
            }

            v_tmp = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            int v_blockNumberofRecordDisplayed = 0;

            if (!(v_tmp.equals(""))) {
                v_blockNumberofRecordDisplayed = Integer.parseInt(Refactoring.delSpace(v_tmp));
            }

            String v_blockQueryAllRecord    =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockRecordOrientation =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockSingleRecord      =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String m_blockDataBaseDataBlock =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockEnforcePrimarykey =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockQueryAllowed        =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockQueryDataSourceType =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockQueryDataSourceName =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockQueryDataSourceColumns =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockQueryDataSourceArguments =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockAlias          = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockIncludeRefItem = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockWhereClause    = "";
            String v_where               = "";

            do {
                v_blockWhereClause += v_where;
            } while ((v_where = p_fileAccess.readLine()).startsWith("         "));

            String v_blockOrderByClause            =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockOptimizerHint            =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockInsertAllowed            =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockUpdateAllowed            =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockLockingMode              =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockDeleteAllowed            =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockKeyMode                  =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockUpdateChangedColumnsOnly =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockEnforceColumnSecurity =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockMaximumQueryTime =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockMaximumRecordsFetched =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockDMLDataTargerType =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockDMLDataTargetName =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockInsertProcedureName =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockInsertProcedureResultSetColumns =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockInsertProcedureArguments =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockUpdateProcedureName =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockUpdateProcedureResultSetColumns =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockUpdateProcedureArguments =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockDeleteProcedureName =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockDeleteProcedureResultSetColumns =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockDeleteProcedureArguments =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockLockProcedureName =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockLockProcedureResultSetColumns =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockLockProcedureArguments =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            v_tmp = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            int v_blockDMLArraySize = 0;

            if (!(v_tmp.equals(""))) {
                v_blockDMLArraySize = Integer.parseInt(v_tmp);
            }

            String v_blockPrecomputeSumarries =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_blockDMLReturningValues =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            System.out.println("385 : " + v_blockDMLReturningValues);
            Navigate.avancerJusqua(p_fileAccess, p_fileAccess.getFilePointer(), "* Triggers");
            v_block = new oracleBlock(v_blockName, v_blockSubclassInformation, v_blockNavigationStyle,
                                      v_PreviousNavigationDataBlock, v_blockNextNavigationDataBlock,
                                      v_blockQueryArraySize, v_blockNumberOfRecordsBuffered,
                                      v_blockNumberofRecordDisplayed, v_blockQueryAllRecord, v_blockRecordOrientation,
                                      v_blockSingleRecord, m_blockDataBaseDataBlock, v_blockEnforcePrimarykey,
                                      v_blockQueryAllowed, v_blockQueryDataSourceType, v_blockQueryDataSourceName,
                                      v_blockQueryDataSourceColumns, v_blockQueryDataSourceArguments, v_blockAlias,
                                      v_blockIncludeRefItem, v_blockWhereClause, v_blockOrderByClause,
                                      v_blockOptimizerHint, v_blockInsertAllowed, v_blockUpdateAllowed,
                                      v_blockLockingMode, v_blockDeleteAllowed, v_blockKeyMode,
                                      v_blockUpdateChangedColumnsOnly, v_blockEnforceColumnSecurity,
                                      v_blockMaximumQueryTime, v_blockMaximumRecordsFetched, v_blockDMLDataTargerType,
                                      v_blockDMLDataTargetName, v_blockInsertProcedureName,
                                      v_blockInsertProcedureResultSetColumns, v_blockInsertProcedureArguments,
                                      v_blockUpdateProcedureName, v_blockUpdateProcedureResultSetColumns,
                                      v_blockUpdateProcedureArguments, v_blockDeleteProcedureName,
                                      v_blockDeleteProcedureResultSetColumns, v_blockDeleteProcedureArguments,
                                      v_blockLockProcedureName, v_blockLockProcedureResultSetColumns,
                                      v_blockLockProcedureArguments, v_blockDMLArraySize, v_blockPrecomputeSumarries,
                                      v_blockDMLReturningValues, new ArrayList<>(), new ArrayList<>(),
                                      new ArrayList<>(),new ArrayList<>());
        } catch (IOException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        }

        return (v_block);
    }

    public static oracleItem getItem(RandomAccessFile p_fileAccess) {
        oracleItem v_item = null;

        try {
            String v_objectName     = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectItemType = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            Navigate.nextLine(19, p_fileAccess);

            String v_objectComments = p_fileAccess.readLine();
            String v_objectEnabled  =
                Refactoring.delSpace(Refactoring.getValueFromLine(Navigate.avancerJusqua(p_fileAccess,
                    p_fileAccess.getFilePointer(), "* Enabled")));
            String v_objectJustification = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            Navigate.nextLine(1, p_fileAccess);

            String v_objectMultiline = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            Navigate.nextLine(1, p_fileAccess);

            String v_objectCaseRestriction =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectDataConceal = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            Navigate.nextLine(3, p_fileAccess);

            String v_objectKeyboardNavigable =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectPreviousNavigationItem =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectNextNavigationItem =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectDataType = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            Navigate.nextLine(1, p_fileAccess);

            String v_objectDataMaxLength    =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectInitialValue     =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectRequired         =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectDataMask         =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectMinimalValue     =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectMaximalValue     =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectDataCopyFromItem =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectDataSynchronizeWithItem =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectCalculationMode =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectFormula         =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectSummaryFunction =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectSummarizedBlock =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectSummarizedItem = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            Navigate.nextLine(3, p_fileAccess);

            String v_objectIsDatabaseItem = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectColumnName     = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            Navigate.nextLine(1, p_fileAccess);

            String v_objectQueryOnly          =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectQueryAllowed       =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectQueryLength        =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectCaseSensitiveQuery =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectInsertAllowed    =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectUpdateAllowed    =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectUpdateOnlyIfNull =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            Navigate.nextLine(1, p_fileAccess);

            String v_objectListOfValuesName =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            Navigate.nextLine(2, p_fileAccess);

            String v_objectValidateFromList =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            Navigate.nextLine(3, p_fileAccess);

            String v_objectVisible = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            Navigate.nextLine(2, p_fileAccess);

            String v_objectPositionX = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectPositionY = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectWidth     = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectHeight    = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectBevel     = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            Navigate.nextLine(3, p_fileAccess);

            String v_objectForeGroundColor =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectBackGroundColor =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectFillPattern = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            Navigate.nextLine(1, p_fileAccess);

            String v_objectFontName    = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectFontSize    = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectFontWeight  = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectFontStyle   = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectFontSpacing = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectHint        =
                Refactoring.delSpace(Refactoring.getValueFromLine(Navigate.avancerJusqua(p_fileAccess,
                    p_fileAccess.getFilePointer(), "* Hint")));
            String v_objectDisplayHintAutomatically =
                Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_objectTooltip = Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));

            v_item = new oracleItem(v_objectName, v_objectItemType, v_objectComments, v_objectEnabled,
                                    v_objectJustification, v_objectMultiline, v_objectCaseRestriction,
                                    v_objectDataConceal, v_objectKeyboardNavigable, v_objectPreviousNavigationItem,
                                    v_objectNextNavigationItem, v_objectDataType, v_objectDataMaxLength,
                                    v_objectInitialValue, v_objectRequired, v_objectDataMask, v_objectMinimalValue,
                                    v_objectMaximalValue, v_objectDataCopyFromItem, v_objectDataSynchronizeWithItem,
                                    v_objectCalculationMode, v_objectFormula, v_objectSummaryFunction,
                                    v_objectSummarizedBlock, v_objectSummarizedItem, v_objectIsDatabaseItem,
                                    v_objectColumnName, v_objectQueryOnly, v_objectQueryAllowed, v_objectQueryLength,
                                    v_objectCaseSensitiveQuery, v_objectInsertAllowed, v_objectUpdateAllowed,
                                    v_objectUpdateOnlyIfNull, v_objectListOfValuesName, v_objectValidateFromList,
                                    v_objectVisible, v_objectPositionX, v_objectPositionY, v_objectWidth,
                                    v_objectHeight, v_objectBevel, v_objectForeGroundColor, v_objectBackGroundColor,
                                    v_objectFillPattern, v_objectFontName, v_objectFontSize, v_objectFontWeight,
                                    v_objectFontStyle, v_objectFontSpacing, v_objectHint,
                                    v_objectDisplayHintAutomatically, v_objectTooltip, new ArrayList<>());
        } catch (IOException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        }

        return (v_item);
    }
    
    public static oraclePushButton getPushButton(RandomAccessFile p_fileAccess){
        oraclePushButton v_pushButton=null;
        try {
            String v_oraclePushButtonName=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oraclePushButtonItemType=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oraclePushButtonComments=Refactoring.delSpace(Refactoring.getValueFromLine(Navigate.avancerJusqua(p_fileAccess, p_fileAccess.getFilePointer(), "- Comments")));
            Navigate.nextLine(1, p_fileAccess);
            String v_oraclePushButtonEnabled=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String v_oraclePushButtonLabel=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            String m_oraclePushButtonAccessKey=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            Navigate.nextLine(1, p_fileAccess);
            String v_oraclePushButtonIconic=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    String v_oraclePushButtonIconFilename=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    String v_oraclePushButtonDefaultButton=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    String v_oraclePushButtonPopupMenu=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    String v_oraclePushButtonKeyboardNavigable=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    String v_oraclePushButtonMouseNavigate=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    String v_oraclePushButtonPreviousNavigationItem=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    String v_oraclePushButtonNextNavigationItem=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            Navigate.nextLine(2, p_fileAccess);
    String v_oraclePushButtonNumberOfItemDisplayed=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    String v_oraclePushButtonVisible=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    Navigate.nextLine(2, p_fileAccess);
    String v_oraclePushButtonXPosition=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    String v_oraclePushButtonYPosition=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    String v_oraclePushButtonWidth=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    String v_oraclePushButtonHeight=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    Navigate.nextLine(2, p_fileAccess);
    String v_oraclePushButtonForegroundColor=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    String v_oraclePushButtonBackGroundColor=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
            Navigate.nextLine(1, p_fileAccess);
    String v_oraclePushButtonFont=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    String v_oraclePushButtonFontName=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    String v_oraclePushButtonFontSize=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    String v_oraclePushButtonFontWeight=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    String v_oraclePushButtonFontStyle=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    String v_oraclePushButtonFontSpacing=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    Navigate.nextLine(15, p_fileAccess);
    String v_oraclePushButtonHint=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    String v_oraclePushButtonDisplayHintAutomatically=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    String v_oraclePushButtonTooltip=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    Navigate.nextLine(1, p_fileAccess);
    String v_oraclePushButtonDirection=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
    
    v_pushButton=new oraclePushButton(v_oraclePushButtonName, v_oraclePushButtonItemType, v_oraclePushButtonComments, v_oraclePushButtonEnabled, v_oraclePushButtonLabel, m_oraclePushButtonAccessKey, v_oraclePushButtonIconic, v_oraclePushButtonIconFilename, v_oraclePushButtonDefaultButton, v_oraclePushButtonPopupMenu, v_oraclePushButtonKeyboardNavigable, v_oraclePushButtonMouseNavigate, v_oraclePushButtonPreviousNavigationItem, v_oraclePushButtonNextNavigationItem, v_oraclePushButtonNumberOfItemDisplayed, v_oraclePushButtonVisible, v_oraclePushButtonXPosition, v_oraclePushButtonYPosition, v_oraclePushButtonWidth, v_oraclePushButtonHeight, v_oraclePushButtonForegroundColor, v_oraclePushButtonBackGroundColor, v_oraclePushButtonFont, v_oraclePushButtonFontName, v_oraclePushButtonFontSize, v_oraclePushButtonFontWeight, v_oraclePushButtonFontStyle, v_oraclePushButtonFontSpacing, v_oraclePushButtonHint, v_oraclePushButtonDisplayHintAutomatically, v_oraclePushButtonTooltip, v_oraclePushButtonDirection);
        } catch (IOException ex) {
            Logger.getLogger(oracleGetter.class.getName()).log(Level.SEVERE, null, ex);
        }
    return v_pushButton;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com