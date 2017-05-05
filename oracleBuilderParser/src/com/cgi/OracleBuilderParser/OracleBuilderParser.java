
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
import com.cgi.objectModel.oracleCheckBox;
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
        
        
        ArrayList<oracleBlock> v_blockList=ParseFile("cc__e_1206.txt");
        writeFile(v_blockList);
        
        
    }

    public static ArrayList<oracleBlock> ParseFile(String p_cheminRelatifDuFichier) {
        
        File                  v_fichier    = new File(p_cheminRelatifDuFichier);
        ArrayList<oracleItem> v_listObject = new ArrayList<>();
        ArrayList<oracleBlock> v_listBlock=new ArrayList<>();
        ArrayList<oracleRadioGroup> v_listRadioGroup=new ArrayList<>();
        ArrayList<oraclePushButton> v_listPushButton=new ArrayList<>();
        ArrayList<oracleCheckBox> v_listCheckBox=new ArrayList<>();
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
                    if(v_listPushButton.get(v_listPushButton.size()-1).getlistMethod().size()==0){
                    m_currentState=oracleChecker.checkWhatsNext(v_fileAccess, m_currentState);}
                    else{
                        System.out.println("le push button avait des method");
                        m_currentState=oracleChecker.checkWhatsNext(v_fileAccess, "Method");
                        break;
                    }
                    
                    System.out.println("j'ai ajouter un push button du nom de "+v_listPushButton.get(v_listPushButton.size()-1).getoraclePushButtonName());
                    break;
                    
                case "Check Box" :
                    System.out.println("j'ajoute une checkbox");
                    v_listCheckBox.add(oracleGetter.getCheckBox(v_fileAccess));
                    System.out.println("la list box : "+v_listCheckBox.get(0).getlistMethod().size());
                    if(v_listCheckBox.get(v_listCheckBox.size()-1).getlistMethod().size()!=0){
                        System.out.println("la checkbox a des methodes");
                        m_currentState=oracleChecker.checkWhatsNext(v_fileAccess, "Method");
                        break;
                    }else{
                        
                        m_currentState=oracleChecker.checkWhatsNext(v_fileAccess, m_currentState);
                         System.out.println("j'ai ajouter une checkbox du nom de "+v_listCheckBox.get(v_listCheckBox.size()-1).getoracleCheckBoxName());
                        break;
                    }
                   
                    
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
        
        v_listBlock.get(0).setListItem(v_listObject);
        v_listBlock.get(0).setlistCheckBox(v_listCheckBox);
        v_listBlock.get(0).setlistPushButton(v_listPushButton);
        v_listBlock.get(0).setlistRadioGroup(v_listRadioGroup);
        return v_listBlock;
    }
    
    public static void writeFile(ArrayList<oracleBlock> p_listBlock){
        try {
            FileWriter v_fileWriter= new FileWriter(new File("view.html"));
            v_fileWriter.write("<!doctype html>\n");
            v_fileWriter.write("<html lang=\"fr\">\n");
            v_fileWriter.write("<head>\n");
            v_fileWriter.write("  <meta charset=\"utf-8\">\n");
            v_fileWriter.write("  <title>Test</title>\n");
            v_fileWriter.write(" <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\"");
            v_fileWriter.write(" <link href=\"bootstrap/css/bootstrap-theme.min.css\" rel=\"stylesheett\"");
            v_fileWriter.write("</head>\n");
            v_fileWriter.write("<body>\n");
            
            
            
            v_fileWriter.write("<h1>"+p_listBlock.get(0).getblockName()+"</h1>\n");
            // l'a je genere les input
            v_fileWriter.write("<br> <br> <br> <br> <br> <br>Liste des textes areas <br> \n");
            for(oracleItem v_item : p_listBlock.get(0).getListItem()){
                if(v_item.getobjectVisible().equals("yes"))
                v_fileWriter.write("<form>\n");
                v_fileWriter.write(" "+v_item.getobjectName()+"\n");
                v_fileWriter.write(" <input type=\"text\" name=\""+v_item.getobjectName()+"\"><br>\n");
                v_fileWriter.write("</form>\n");
            }
            v_fileWriter.write("<br> <br> <br> <br> <br> <br> liste des buttons <br>\n");
            for(oraclePushButton v_pushButton : p_listBlock.get(0).getListPushButton()){
                if(v_pushButton.getoraclePushButtonLabel().equals("")){
                    v_fileWriter.write("<input type=\button\" onclick=\"alert('"+v_pushButton.getoraclePushButtonName()+"')\" value=\""+"c'est une icone "+"\"readonly>\n");
                }else{
               v_fileWriter.write("<input type=\button\" onclick=\"alert('"+v_pushButton.getoraclePushButtonName()+"')\" value=\""+v_pushButton.getoraclePushButtonLabel()+"\">");
                }}
            
            v_fileWriter.write("<br> <br> <br> <br> <br> <br> <br> <br> liste des radio buttons <br> \n");
            
            for(oracleRadioGroup v_radioGroup :p_listBlock.get(0).getlistRadioGroup()){
                v_fileWriter.write("nom du radio group : "+v_radioGroup.getoracleRadioGroupName());
                v_fileWriter.write("<form>\n");
                for(oracleRadioButton v_radioButton: v_radioGroup.getListButton()){
                    v_fileWriter.write(" <input type=\"radio\" name = \""+"radio button"+"\" value=\""+v_radioButton.getradioButtonLabel()+"\">"+v_radioButton.getradioButtonLabel()+"<br>\n");
                }
                v_fileWriter.write("</form>");
            }
            
            
            v_fileWriter.write("</body>\n");
            v_fileWriter.write("</html>\n");
            v_fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    

    

    

    

    

    

    

    

    
    
    

    
    
    
    
    
}


//~ Formatted by Jindent --- http://www.jindent.com
