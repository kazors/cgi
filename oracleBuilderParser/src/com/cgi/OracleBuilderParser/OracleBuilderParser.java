
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package com.cgi.OracleBuilderParser;

//~--- non-JDK imports --------------------------------------------------------

import com.cgi.Tools.Localise;
import com.cgi.Tools.Navigate;
import com.cgi.Tools.Refactoring;
import com.cgi.Tools.oracleChecker;
import com.cgi.Tools.oracleGetter;
import static com.cgi.Tools.oracleGetter.getGraphicTextObject;
import com.cgi.objectModel.GraphicTextObject;
import com.cgi.objectModel.PlSqlLibraries;
import com.cgi.objectModel.PlSqlMethod;
import com.cgi.objectModel.oracleAlert;
import com.cgi.objectModel.oracleBlock;
import com.cgi.objectModel.oracleCheckBox;
import com.cgi.objectModel.oracleItem;
import com.cgi.objectModel.oraclePushButton;
import com.cgi.objectModel.oracleRadioButton;
import com.cgi.objectModel.oracleRadioGroup;
import com.cgi.Tools.MappingTrigger;

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
    static int m_tailleX,m_tailleY;
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
        ArrayList<GraphicTextObject> v_listGraphicTextObject=new ArrayList<>();
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
                   
                    v_listBlock.add(oracleGetter.getBlock(v_fileAccess));
                   
                    break;
                case "Item" :
                    
                    v_listObject.add(oracleGetter.getItem(v_fileAccess));
                    
                    
                     
                    
                    m_currentState=oracleChecker.checkWhatsNext(v_fileAccess, m_currentState);
                    
                    break;
                case "Method" :
                        
                    v_listObject.get(v_listObject.size()-1).getlistMethod().addAll(oracleGetter.getMethod(v_fileAccess));
                    
                    m_currentState=oracleChecker.checkWhatsNext(v_fileAccess, m_currentState);
                    
                    break;
                case "Radio Group" :
                    
                    v_listRadioGroup.add(oracleGetter.getRadioGroup(v_fileAccess));
                    m_currentState=oracleChecker.checkWhatsNext(v_fileAccess, m_currentState);
                   
                    break;
                    
                case "Push Button" :
                    
                    v_listPushButton.add(oracleGetter.getPushButton(v_fileAccess));
                    if(v_listPushButton.get(v_listPushButton.size()-1).getlistMethod().size()==0){
                    m_currentState=oracleChecker.checkWhatsNext(v_fileAccess, m_currentState);}
                    else{
                        
                        m_currentState=oracleChecker.checkWhatsNext(v_fileAccess, "Method");
                        break;
                    }
                    
                    
                    break;
                    
                case "Check Box" :
                    
                    v_listCheckBox.add(oracleGetter.getCheckBox(v_fileAccess));
                    
                    if(v_listCheckBox.get(v_listCheckBox.size()-1).getlistMethod().size()!=0){
                        
                        m_currentState=oracleChecker.checkWhatsNext(v_fileAccess, "Method");
                        break;
                    }else{
                        
                        m_currentState=oracleChecker.checkWhatsNext(v_fileAccess, m_currentState);
                         
                        break;
                    }
                   
                    
                case "Error" :
                    
                    System.out.println("Erreur lors du parsage du fichier");
                    
            }
                }while(!(m_currentState=="error"));
            Navigate.avancerJusqua(v_fileAccess, v_fileAccess.getFilePointer(), "* Graphics Objects");
            while(!v_fileAccess.readLine().equals("   ----------")){
                GraphicTextObject v_graphicTextObject=getGraphicTextObject(v_fileAccess);
                
                if(v_graphicTextObject.getgraphicTextObjectType().equals("Text")){
                    v_listGraphicTextObject.add(v_graphicTextObject);
                }
            }
            
            
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
        
        v_listBlock.get(0).setlistGraphicObject(v_listGraphicTextObject);
        return v_listBlock;
    }
    
    public static void writeFile(ArrayList<oracleBlock> p_listBlock){
        try {
            Refactoring.RefactoPos(p_listBlock.get(0).getListItem(), p_listBlock.get(0).getlistCheckBox(), p_listBlock.get(0).getListPushButton(), p_listBlock.get(0).getlistRadioGroup(), p_listBlock.get(0).getlistGraphicObject());
            m_tailleX=Localise.getTailleX(p_listBlock.get(0).getListItem(),p_listBlock.get(0).getListPushButton(),p_listBlock.get(0).getlistCheckBox(),p_listBlock.get(0).getlistRadioGroup())+5;
            m_tailleY=Localise.getTailleY(p_listBlock.get(0).getListItem(),p_listBlock.get(0).getListPushButton(),p_listBlock.get(0).getlistCheckBox(),p_listBlock.get(0).getlistRadioGroup())+5;
            
            FileWriter v_fileWriter= new FileWriter(new File("view.html"));
            v_fileWriter.write("<!doctype html>\n");
            v_fileWriter.write("<html lang=\"fr\">\n");
            v_fileWriter.write("<head>\n");
            v_fileWriter.write("  <meta charset=\"utf-8\">\n");
            v_fileWriter.write("  <title>Test</title>\n");
            v_fileWriter.write(" <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\"");
            v_fileWriter.write(" <link href=\"bootstrap/css/bootstrap-theme.min.css\" rel=\"stylesheett\"");
            v_fileWriter.write("</head>\n");
            v_fileWriter.write("<body >\n");
            v_fileWriter.write("<div class=\"container\">\n");
            for(int i=0;i<m_tailleY;i++){
                
                v_fileWriter.write("<div class=\"row\">\n");
                
                ArrayList<oracleCheckBox> v_listCheckBoxInRow=oracleGetter.getCheckBoxInRow(p_listBlock.get(0).getlistCheckBox(),i);
                
                ArrayList<oracleItem> v_listItemInRow=oracleGetter.getItemInRow(p_listBlock.get(0).getListItem(),i);
                ArrayList<oraclePushButton> v_listPushButtonInRow=oracleGetter.getPushButtonInRow(p_listBlock.get(0).getListPushButton(),i);
                ArrayList<GraphicTextObject> v_listGraphicTextObjectInRow=oracleGetter.getGraphicTextObjectInRow(p_listBlock.get(0).getlistGraphicObject(),i);
                ArrayList<oracleRadioGroup> v_listRadioGroupInRow=oracleGetter.getRadioGroupInRow(p_listBlock.get(0).getlistRadioGroup(),i);
                com.cgi.Tools.Localise.PlaceOrder(v_listCheckBoxInRow,v_listItemInRow,v_listPushButtonInRow,v_listRadioGroupInRow,v_listGraphicTextObjectInRow,v_fileWriter,m_tailleX);
                v_fileWriter.write("</div>\n");
                v_fileWriter.write("<div class=\"row\">");
                v_fileWriter.write("<div class=\" col-sm-offset 12\">");
                v_fileWriter.write("</div>");
                v_fileWriter.write("</div>");
                
            }
            v_fileWriter.write("</div>\n");
            
            
            v_fileWriter.write("<script src=\"validation.js\"></script>");
            v_fileWriter.write("</body>\n");
            v_fileWriter.write("</html>\n");
            v_fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    

    

    

    

    

    

    

    

    
    
    

    
    
    
    
    
}


//~ Formatted by Jindent --- http://www.jindent.com
