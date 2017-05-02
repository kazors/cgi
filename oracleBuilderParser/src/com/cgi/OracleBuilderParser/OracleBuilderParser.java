
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package com.cgi.OracleBuilderParser;

//~--- non-JDK imports --------------------------------------------------------

import com.cgi.Tools.Navigate;
import com.cgi.Tools.oracleChecker;
import com.cgi.Tools.oracleGetter;
import com.cgi.objectModel.PlSqlLibraries;
import com.cgi.objectModel.PlSqlMethod;
import com.cgi.objectModel.oracleAlert;
import com.cgi.objectModel.oracleBlock;
import com.cgi.objectModel.oracleItem;
import com.cgi.objectModel.oraclePushButton;
import com.cgi.objectModel.oracleRadioButton;
import com.cgi.objectModel.oracleRadioGroup;

//~--- JDK imports ------------------------------------------------------------

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
        
        FileWriter v_fileWriter= null;
        try {
            v_fileWriter = new FileWriter(new File("test.txt"));
            ArrayList<oracleBlock> v_blockList=ParseFile("cc__e_1206.txt");
            v_fileWriter.write("Il y a "+v_blockList.get(0).getListItem().size()+" item  dans ce fichier \n");
            for(oracleBlock e : v_blockList){
                for(oracleItem v : e.getListItem()){
                v_fileWriter.write("L'item "+v.getobjectName()+" est un objet de type "+v.getobjectItemType()+"\n");
                v_fileWriter.write("Il accepte des donnée de type "+v.getobjectDataType()+"\n sa position en x est "+v.getobjectPositionX());
                v_fileWriter.write("et sa position en y "+v.getobjectPositionY()+"\n");
                v_fileWriter.write("il y a "+v.getlistMethod().size()+" methode pl sql associé \n");
                    
                }v_fileWriter.write("il y a "+e.getlistRadioGroup().get(0).getListButton().size());}
            
        } catch (IOException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                v_fileWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

    public static ArrayList<oracleBlock> ParseFile(String p_cheminRelatifDuFichier) {
        
        File                  v_fichier    = new File(p_cheminRelatifDuFichier);
        ArrayList<oracleItem> v_listObject = new ArrayList<>();
        ArrayList<oracleBlock> v_listBlock=new ArrayList<>();
        ArrayList<oracleRadioGroup> v_listRadioGroup=new ArrayList<>();
        ArrayList<oraclePushButton> v_listPushButton=new ArrayList<>();
        try {
            RandomAccessFile v_fileAccess = new RandomAccessFile(v_fichier, "r");
            Navigate.avancerJusqua(v_fileAccess,v_fileAccess.getFilePointer(), "- Relations");
           
            
            Navigate.nextLine(1, v_fileAccess);
            
            m_currentState="Item";
            Navigate.avancerJusqua(v_fileAccess,v_fileAccess.getFilePointer(), "- Relations");
            Navigate.nextLine(1, v_fileAccess);
            
            v_listBlock.add(oracleGetter.getBlock(v_fileAccess));
            Navigate.avancerJusqua(v_fileAccess,v_fileAccess.getFilePointer(), "* Items");
            Navigate.nextLine(1, v_fileAccess);
            
            do{switch(m_currentState){
                case "Block":
                    System.out.println("je lit un block");
                    v_listBlock.add(oracleGetter.getBlock(v_fileAccess));
                    System.out.println("j'ai ajouter un block du nom de "+v_listBlock.get(v_listBlock.size()-1).getblockName());
                    break;
                case "Item" :
                    System.out.println("je lit un text item");
                    v_listObject.add(oracleGetter.getItem(v_fileAccess));
                    
                    
                     
                    
                    m_currentState=oracleChecker.checkWhatsNext(v_fileAccess, m_currentState);
                    System.out.println("j'ai ajouter un text item du nom de "+v_listObject.get(v_listObject.size()-1).getobjectName());
                    break;
                case "Method" :
                        System.out.println("je lit une methode");
                    v_listObject.get(v_listObject.size()-1).addMethod(oracleGetter.getMethod(v_fileAccess));
                    
                    m_currentState=oracleChecker.checkWhatsNext(v_fileAccess, m_currentState);
                    System.out.println("j'ai ajouter une method  ");
                    break;
                case "Radio Group" :
                    System.out.println("j'ajoute un radio group");
                    v_listRadioGroup.add(oracleGetter.getRadioGroup(v_fileAccess));
                    m_currentState=oracleChecker.checkWhatsNext(v_fileAccess, m_currentState);
                    System.out.println("j'ai ajouter un radio group du nom de "+v_listRadioGroup.get(v_listRadioGroup.size()-1).getoracleRadioGroupName());
                    break;
                    
                case "Push Button" :
                    System.out.println("j'ajoute un push button");
                    v_listPushButton.add(oracleGetter.getPushButton(v_fileAccess));
                    m_currentState=oracleChecker.checkWhatsNext(v_fileAccess, m_currentState);
                    System.out.println("j'ai ajouter un push button du nom de "+v_listPushButton.get(v_listPushButton.size()-1).getoraclePushButtonName());
                    break;
                case "Error" :
                    System.out.println("j'ai une erreur");
                    System.out.println("Erreur lors du parsage du fichier");
                    
            }System.out.println("m_current = "+m_currentState);
                }while(!(m_currentState=="error"));
            
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        v_listBlock.get(0).addItemList(v_listObject);
        v_listBlock.get(0).addRadioGroupList(v_listRadioGroup);
        return v_listBlock;
    }

    

    

    

    

    

    

    

    

    

    
    
    

    
    
    
    
    
}


//~ Formatted by Jindent --- http://www.jindent.com
