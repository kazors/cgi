
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package com.cgi.OracleBuilderParser;

//~--- non-JDK imports --------------------------------------------------------

import com.cgi.objectModel.PlSqlLibraries;
import com.cgi.objectModel.PlSqlMethod;
import com.cgi.objectModel.oracleAlert;
import com.cgi.objectModel.oracleBlock;
import com.cgi.objectModel.oracleItem;
import com.cgi.objectModel.oracleRadioButton;
import com.cgi.objectModel.oracleRadioGroup;

//~--- JDK imports ------------------------------------------------------------

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gerardj
 */
public class OracleBuilderParser {

    /**
     * @param args the command line arguments
     */
    static String m_currentState;
    public static void main(String[] args) {

       

        
        ParseFile("test.txt");
    }

    public static void ParseFile(String p_cheminRelatifDuFichier) {
        File                  v_fichier    = new File(p_cheminRelatifDuFichier);
        ArrayList<oracleItem> v_listObject = new ArrayList<>();
        ArrayList<oracleBlock> v_listBlock=new ArrayList<>();
        try {
            RandomAccessFile v_fileAccess = new RandomAccessFile(v_fichier, "r");
            avancerJusqua(v_fileAccess, "- Relations");
            nextLine(1, v_fileAccess);
            m_currentState="Item";
            avancerJusqua(v_fileAccess, "- Relations");
            nextLine(1, v_fileAccess);
            v_listBlock.add(getBlock(v_fileAccess));
            avancerJusqua(v_fileAccess, "* Items");
            nextLine(1, v_fileAccess);
            do{switch(m_currentState){
                case "Item" :
                    v_listObject.add(getItem(v_fileAccess));
                    checkWhatsNext(v_fileAccess, m_currentState);
                    break;
                case "Method" :
                    v_listObject.get(v_listObject.size()-1).addMethod(getMethod(v_fileAccess));
                    checkWhatsNext(v_fileAccess, m_currentState);
                case "Error" :
                    System.out.println("Erreur lors du parsage du fichier");
                    System.exit(1);
            }}while(!(v_listObject.get(v_listObject.size()-1).getobjectName().equals("DSP_LIB")));
            
            
            
            for(oracleItem o : v_listObject){
                System.out.println(o.getobjectItemType());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static String getValueFromLine(String p_line) {
        String[] v_lineSplit = p_line.split("  ");
        String   v_value     = v_lineSplit[v_lineSplit.length - 1];

        if (p_line.trim().startsWith(v_value.trim())) {
            v_value = "";
        }

        return v_value;
    }

    private static String delSpace(String p_value) {
        while (p_value.startsWith(" ")) {
            p_value = p_value.replaceFirst(" ", "");
        }

        return p_value;
    }

    private static String avancerJusqua(RandomAccessFile p_fileAccess, String p_regex) {
        String v_value = null;

        try {
            while((v_value=p_fileAccess.readLine().trim()).startsWith(p_regex)){
                System.out.println("v_value = "+v_value);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        }

        return v_value;
    }

    private static String formatMethodName(String p_methodName) {
        p_methodName = p_methodName.replace("/* ", "");
        p_methodName = p_methodName.replace(" */", "");

        return p_methodName;
    }

    private static oracleItem getItem(RandomAccessFile p_fileAccess) {
        oracleItem v_item = null;

        try {
            
            String v_objectName     = getValueFromLine(p_fileAccess.readLine());
            
            String v_objectItemType = delSpace(getValueFromLine(p_fileAccess.readLine()));

            nextLine(19, p_fileAccess);

            String v_objectComments      = p_fileAccess.readLine();
            String v_objectEnabled       = delSpace(getValueFromLine(avancerJusqua(p_fileAccess, "* Enabled")));
            String v_objectJustification = delSpace(getValueFromLine(p_fileAccess.readLine()));

            nextLine(1, p_fileAccess);

            String v_objectMultiline = delSpace(getValueFromLine(p_fileAccess.readLine()));

            nextLine(1, p_fileAccess);

            String v_objectCaseRestriction = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectDataConceal     = delSpace(getValueFromLine(p_fileAccess.readLine()));

            nextLine(3, p_fileAccess);

            String v_objectKeyboardNavigable      = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectPreviousNavigationItem = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectNextNavigationItem     = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectDataType               = delSpace(getValueFromLine(p_fileAccess.readLine()));

            nextLine(1, p_fileAccess);

            String v_objectDataMaxLength           = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectInitialValue            = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectRequired                = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectDataMask                = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectMinimalValue            = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectMaximalValue            = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectDataCopyFromItem        = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectDataSynchronizeWithItem = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectCalculationMode         = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectFormula                 = delSpace(getValueFromLine(p_fileAccess.readLine()));
            System.out.println("v_objectFormula = "+v_objectName);
            String v_objectSummaryFunction         = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectSummarizedBlock         = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectSummarizedItem          = delSpace(getValueFromLine(p_fileAccess.readLine()));

            nextLine(3, p_fileAccess);

            String v_objectIsDatabaseItem = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectColumnName     = delSpace(getValueFromLine(p_fileAccess.readLine()));

            nextLine(1, p_fileAccess);

            String v_objectQueryOnly          = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectQueryAllowed       = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectQueryLength        = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectCaseSensitiveQuery = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectInsertAllowed      = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectUpdateAllowed      = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectUpdateOnlyIfNull   = delSpace(getValueFromLine(p_fileAccess.readLine()));

            nextLine(1, p_fileAccess);

            String v_objectListOfValuesName = delSpace(getValueFromLine(p_fileAccess.readLine()));

            nextLine(2, p_fileAccess);

            String v_objectValidateFromList = delSpace(getValueFromLine(p_fileAccess.readLine()));

            nextLine(3, p_fileAccess);

            String v_objectVisible = delSpace(getValueFromLine(p_fileAccess.readLine()));

            nextLine(2, p_fileAccess);

            String v_objectPositionX = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectPositionY = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectWidth     = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectHeight    = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectBevel     = delSpace(getValueFromLine(p_fileAccess.readLine()));

            nextLine(3, p_fileAccess);

            String v_objectForeGroundColor = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectBackGroundColor = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectFillPattern     = delSpace(getValueFromLine(p_fileAccess.readLine()));

            nextLine(1, p_fileAccess);

            String v_objectFontName                 = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectFontSize                 = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectFontWeight               = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectFontStyle                = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectFontSpacing              = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectHint                     = delSpace(getValueFromLine(avancerJusqua(p_fileAccess, "* Hint")));
            String v_objectDisplayHintAutomatically = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_objectTooltip                  = delSpace(getValueFromLine(p_fileAccess.readLine()));

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

    private static oracleBlock getBlock(RandomAccessFile p_fileAccess) {
        oracleBlock v_block = null;

        try {
            String v_blockName                = delSpace(getValueFromLine(avancerJusqua(p_fileAccess, "* Name")));
            String v_blockSubclassInformation = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockNavigationStyle     = delSpace(getValueFromLine(avancerJusqua(p_fileAccess,
                                                    "- Navigation Style")));
            String v_PreviousNavigationDataBlock  = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockNextNavigationDataBlock = delSpace(getValueFromLine(p_fileAccess.readLine()));

            nextLine(1, p_fileAccess);
            String v_tmp=delSpace(getValueFromLine(p_fileAccess.readLine()));
            int    v_blockQueryArraySize =0;          
            if(!(v_tmp.equals(""))){
                v_blockQueryArraySize=Integer.parseInt(v_tmp);
            }
            int    v_blockNumberOfRecordsBuffered  =0;
            v_tmp=delSpace(getValueFromLine(p_fileAccess.readLine()));
            if(!(v_tmp.equals(""))){
                v_blockNumberOfRecordsBuffered=Integer.parseInt(v_tmp);
            }
            v_tmp=delSpace(getValueFromLine(p_fileAccess.readLine()));
            int    v_blockNumberofRecordDisplayed =0;
            if(!(v_tmp.equals(""))){
                v_blockNumberofRecordDisplayed=Integer.parseInt(delSpace(v_tmp));
            }
            String v_blockQueryAllRecord           = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockRecordOrientation        = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockSingleRecord             = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String m_blockDataBaseDataBlock        = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockEnforcePrimarykey        = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockQueryAllowed             = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockQueryDataSourceType      = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockQueryDataSourceName      = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockQueryDataSourceColumns   = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockQueryDataSourceArguments = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockAlias                    = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockIncludeRefItem           = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockWhereClause              = "";
            String v_where                         = "";

            do {
                v_blockWhereClause += v_where;
            } while ((v_where = p_fileAccess.readLine()).startsWith("         "));

            String v_blockOrderByClause                   = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockOptimizerHint                   = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockInsertAllowed                   = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockUpdateAllowed                   = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockLockingMode                     = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockDeleteAllowed                   = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockKeyMode                         = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockUpdateChangedColumnsOnly        = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockEnforceColumnSecurity           = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockMaximumQueryTime                = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockMaximumRecordsFetched           = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockDMLDataTargerType               = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockDMLDataTargetName               = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockInsertProcedureName             = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockInsertProcedureResultSetColumns = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockInsertProcedureArguments        = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockUpdateProcedureName             = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockUpdateProcedureResultSetColumns = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockUpdateProcedureArguments        = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockDeleteProcedureName             = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockDeleteProcedureResultSetColumns = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockDeleteProcedureArguments        = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockLockProcedureName               = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockLockProcedureResultSetColumns   = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockLockProcedureArguments          = delSpace(getValueFromLine(p_fileAccess.readLine()));
             v_tmp=delSpace(getValueFromLine(p_fileAccess.readLine()));
            int v_blockDMLArraySize=0;
            if(!(v_tmp.equals(""))){
                v_blockDMLArraySize                    =
                Integer.parseInt(v_tmp);}
            String v_blockPrecomputeSumarries             = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_blockDMLReturningValues              = delSpace(getValueFromLine(p_fileAccess.readLine()));

            avancerJusqua(p_fileAccess, "* Triggers");
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
                                      v_blockDMLReturningValues, new ArrayList<>(),
                                      new ArrayList<>());
        } catch (IOException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        }

        return (v_block);
    }

    private static String checkWhatsNext(RandomAccessFile p_fileAccess, String p_CurrentState) {
        
        try {
            Long v_currentPos = p_fileAccess.getFilePointer();
            switch (p_CurrentState) {
            case "Block" :
                

                nextLine(19, p_fileAccess);

                if (delSpace(getValueFromLine(p_fileAccess.readLine().trim())).equals("PL/SQL")) {
                    p_fileAccess.seek(v_currentPos);
                    avancerJusqua(p_fileAccess, "----------");
                    return "Method";
                }
                break;    
            case "Method" :
                nextLine(1, p_fileAccess);
                if((delSpace(getValueFromLine(p_fileAccess.readLine().trim())).startsWith("* Fire in Enter-Query"))){
                    p_fileAccess.seek(v_currentPos);
                    avancerJusqua(p_fileAccess, "----------");
                    return "Method";
                }
                p_fileAccess.seek(v_currentPos);
                nextLine(7, p_fileAccess);
                if((delSpace(getValueFromLine(p_fileAccess.readLine().trim())).startsWith("* Name"))){
                    p_fileAccess.seek(v_currentPos);
                    nextLine(7, p_fileAccess);
                    return "Item";
                }else{
                    nextLine(1, p_fileAccess);
                    if(p_fileAccess.readLine().trim().startsWith("* Name")){
                    p_fileAccess.seek(v_currentPos);
                    nextLine(8, p_fileAccess);
                    return "Item";
                }
                
            }break;
            case "Item" :
                nextLine(8, p_fileAccess);
                if((delSpace(getValueFromLine(p_fileAccess.readLine().trim())).equals("PL/SQL"))){
                    p_fileAccess.seek(v_currentPos);
                    nextLine(5, p_fileAccess);
                    return "Method";
                }
                p_fileAccess.seek(v_currentPos);
                nextLine(6, p_fileAccess);
                if(p_fileAccess.readLine().trim().startsWith("* Item Type")){
                    p_fileAccess.seek(v_currentPos);
                    nextLine(6, p_fileAccess);
                    if((delSpace(getValueFromLine(p_fileAccess.readLine().trim())).equals("Radio Group"))){
                        p_fileAccess.seek(v_currentPos);
                        nextLine(5, p_fileAccess);
                        return "Radio Group";
                    }
                    p_fileAccess.seek(v_currentPos);
                    nextLine(5, p_fileAccess);
                    return "Item";
                    
                }
                break;
            }

            
        

        
    }   catch (IOException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "error";
    }

    private static void nextLine(int p_nbLine, RandomAccessFile p_fileAccess) {
        for (int i = 0; i < p_nbLine; i++) {
            try {
                p_fileAccess.readLine();
            } catch (IOException ex) {
                Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static oracleAlert getAlert(RandomAccessFile p_fileAccess) {
        oracleAlert v_alert = null;

        try {
            String v_alertName                = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_alertSubclassInformation = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_alertComments            = delSpace(getValueFromLine(avancerJusqua(p_fileAccess, "- Comments")));
            String v_alertTitle               = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_alertMessage             = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_alertStyle               = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_alertButton1Label        = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_alertButton2Label        = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_alertButton3Label        = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_alertDefaultButton       = delSpace(getValueFromLine(p_fileAccess.readLine()));

            nextLine(1, p_fileAccess);

            String v_alertForegroundColor = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_alertBackGroundColor = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_alertFillPattern     = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_alertFont            = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_alertFontName        = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_alertFontSize        = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_alertFontWeight      = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_alertFontStyle       = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_alertFontSpacing     = delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_alertDirection       = delSpace(getValueFromLine(p_fileAccess.readLine()));

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

    public static PlSqlLibraries getLib(RandomAccessFile p_fileAccess) {
        PlSqlLibraries v_library=null;
        try {
            String v_libraryName=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_libraryComments=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_libraryLocation=delSpace(getValueFromLine(p_fileAccess.readLine()));
            v_library=new PlSqlLibraries(v_libraryName, v_libraryComments, v_libraryLocation);
        } catch (IOException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_library;
    }
    
    public static oracleRadioGroup getRadioGroup(RandomAccessFile p_fileAccess){
        oracleRadioGroup v_radioGroup=null;
        try {
            String v_oracleRadioGroupName=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupItemType=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupAccessKey=delSpace(getValueFromLine(avancerJusqua(p_fileAccess, "- Access Key")));
            String v_oracleRadioGroupMappingofOtherValue=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupPopupMenu=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupKeyboardNavigable=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupMouseNavigate=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupPreviousNavigationItem=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupNextNavigationItem=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupDataType=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupDataLengthSemantics=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupMaximumLength=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupInitialValue=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupCopyValueFromItem=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupSynchronizeWithItem=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupCalculationMode=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupFormula=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupSummaryFunction=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupSummarizedBlock=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupSummarizedItem=delSpace(getValueFromLine(p_fileAccess.readLine()));
            nextLine(1, p_fileAccess);
            String v_oracleRadioGroupNumberOfItemDisplayed=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupDatabaseItem=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupColumnName=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupPrimaryKey=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupQueryOnly=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupQueryAllowed=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupInsertAllowed=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupUpdateAllowed=delSpace(getValueFromLine(p_fileAccess.readLine()));
            nextLine(3, p_fileAccess);
            String v_oracleRadioGroupForegroundColor=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupBackGroundColor=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupFillPattern=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupFont=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupFontName=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupFontSize=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupFontWeight=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupFontStyle=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupFontSpacing=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupHint=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupDisplayHintAutomatically=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupTooltip=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupDirection=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_oracleRadioGroupTrigger=delSpace(getValueFromLine(p_fileAccess.readLine()));
            ArrayList<oracleRadioButton> v_listButton=(getRadioButton(p_fileAccess));
            v_radioGroup=new oracleRadioGroup(v_oracleRadioGroupName, v_oracleRadioGroupItemType, v_oracleRadioGroupAccessKey, v_oracleRadioGroupMappingofOtherValue, v_oracleRadioGroupPopupMenu, v_oracleRadioGroupKeyboardNavigable, v_oracleRadioGroupMouseNavigate, v_oracleRadioGroupPreviousNavigationItem, v_oracleRadioGroupNextNavigationItem, v_oracleRadioGroupDataType, v_oracleRadioGroupDataLengthSemantics, v_oracleRadioGroupMaximumLength, v_oracleRadioGroupInitialValue, v_oracleRadioGroupCopyValueFromItem, v_oracleRadioGroupSynchronizeWithItem, v_oracleRadioGroupCalculationMode, v_oracleRadioGroupFormula, v_oracleRadioGroupSummaryFunction, v_oracleRadioGroupSummarizedBlock, v_oracleRadioGroupSummarizedItem, v_oracleRadioGroupNumberOfItemDisplayed, v_oracleRadioGroupDatabaseItem, v_oracleRadioGroupColumnName, v_oracleRadioGroupPrimaryKey, v_oracleRadioGroupQueryOnly, v_oracleRadioGroupQueryAllowed, v_oracleRadioGroupInsertAllowed, v_oracleRadioGroupUpdateAllowed, v_oracleRadioGroupForegroundColor, v_oracleRadioGroupBackGroundColor, v_oracleRadioGroupFillPattern, v_oracleRadioGroupFont, v_oracleRadioGroupFontName, v_oracleRadioGroupFontSize, v_oracleRadioGroupFontWeight, v_oracleRadioGroupFontStyle, v_oracleRadioGroupFontSpacing, v_oracleRadioGroupHint, v_oracleRadioGroupDisplayHintAutomatically, v_oracleRadioGroupTooltip, v_oracleRadioGroupDirection, v_oracleRadioGroupTrigger, v_listButton);
            
        } catch (IOException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_radioGroup;
    }

    private static ArrayList<oracleRadioButton> getRadioButton(RandomAccessFile p_fileAccess) {
        ArrayList<oracleRadioButton> v_listButton=new ArrayList<>();
        
        try {
            nextLine(2, p_fileAccess);
            do{
            String v_radioButtonName=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_radioButtonSubClassInformation=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_radioButtonComments=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_radioButtonEnabled=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_radioButtonLabel=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_radioButtonAccessKey=delSpace(getValueFromLine(p_fileAccess.readLine()));
            
            String v_radioButtonRadioButtonValue=delSpace(getValueFromLine(p_fileAccess.readLine()));
            nextLine(1, p_fileAccess);
            String v_radioButtonVisible=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_radioButtonXPosition=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_radioButtonYPosition=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_radioButtonWidth=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_radioButtonHeight=delSpace(getValueFromLine(p_fileAccess.readLine()));
            nextLine(2, p_fileAccess);
            String v_radioButtonForegroundColor=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_radioButtonBackgroundColor=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_radioButtonFillPattern=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_radioButtonFont=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_radioButtonFontName=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_radioButtonFontSize=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_radioButtonFontWeight=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_radioButtonFontStyle=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_radioButtonFontSpacing=delSpace(getValueFromLine(p_fileAccess.readLine()));
            v_listButton.add(new oracleRadioButton(v_radioButtonName, v_radioButtonSubClassInformation, v_radioButtonComments, v_radioButtonEnabled, v_radioButtonLabel, v_radioButtonAccessKey, v_radioButtonRadioButtonValue, v_radioButtonVisible, v_radioButtonXPosition, v_radioButtonYPosition, v_radioButtonWidth, v_radioButtonHeight, v_radioButtonForegroundColor, v_radioButtonBackgroundColor, v_radioButtonFillPattern, v_radioButtonFont, v_radioButtonFontName, v_radioButtonFontSize, v_radioButtonFontWeight, v_radioButtonFontStyle, v_radioButtonFontSpacing));
                nextLine(15, p_fileAccess);
            }while(!(p_fileAccess.readLine().trim().equals("----------")));
        } catch (IOException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_listButton;
                
    }
    private static PlSqlMethod getMethod(RandomAccessFile p_fileAccess){
        PlSqlMethod v_plSqlMethod=null;
        try {
            String v_eventName=delSpace(getValueFromLine(avancerJusqua(p_fileAccess, "* Name")));
            String v_subclassInformation=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_comments=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_triggerStyle=delSpace(getValueFromLine(p_fileAccess.readLine()));
            String v_triggerText=delSpace(getValueFromLine(p_fileAccess.readLine()));
            nextLine(1, p_fileAccess);
            String v_name=formatMethodName(p_fileAccess.readLine());
            String v_methodDescription=formatMethodName(p_fileAccess.readLine());
            String v_method="";
            String v_tmp="";
            while (!((v_tmp= p_fileAccess.readLine()).startsWith("END;"))) {
                            v_method = v_method + "\n" + v_tmp;
                        }
            v_plSqlMethod=new PlSqlMethod(v_eventName, v_subclassInformation, v_comments, v_triggerStyle, v_triggerText, v_name, v_methodDescription, v_method);
        } catch (IOException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_plSqlMethod;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
