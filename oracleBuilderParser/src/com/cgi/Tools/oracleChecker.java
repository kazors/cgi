/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cgi.Tools;

import com.cgi.OracleBuilderParser.OracleBuilderParser;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gerardj
 */
public class oracleChecker {
    public static boolean NextIsARadioButton(RandomAccessFile p_fileAccess,long p_position){
        try {
            Navigate.nextLine(22, p_fileAccess);
            
            Boolean v_radioButton=p_fileAccess.readLine().trim().startsWith("* Radio Button Value");
            p_fileAccess.seek(p_position);
            if(v_radioButton){
                Navigate.nextLine(12, p_fileAccess);
            }
            return v_radioButton;
        } catch (IOException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false ;
    }
    
    public static String checkWhatsNext(RandomAccessFile p_fileAccess, String p_CurrentState) {
        
        try {
            Long v_currentPos = p_fileAccess.getFilePointer();
            switch (p_CurrentState) {
            case "Block" :
                

                Navigate.nextLine(19, p_fileAccess);

                if (Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine().trim())).equals("PL/SQL")) {
                    
                    p_fileAccess.seek(v_currentPos);
                    Navigate.avancerJusqua(p_fileAccess,p_fileAccess.getFilePointer(), "----------");
                    return "Method";
                }
                break;    
            case "Method" :
                Navigate.nextLine(10, p_fileAccess);
                
                if((Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine().trim()))).startsWith("PL/SQL")){
                    
                    p_fileAccess.seek(v_currentPos);
                    Navigate.avancerJusqua(p_fileAccess,p_fileAccess.getFilePointer(), "----------");
                    
                    return "Method";
                    
                }
                p_fileAccess.seek(v_currentPos);
                Navigate.nextLine(9, p_fileAccess);
                String v_line=p_fileAccess.readLine().trim();
                 System.out.println("v_line dans le checker : "+v_line);
                if((v_line.startsWith("* Item Type"))||(v_line.startsWith("^ Item Type"))){
                    p_fileAccess.seek(v_currentPos);
                    Navigate.nextLine(9, p_fileAccess);
                    v_line=Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine()));
                   
                    if((v_line.startsWith("Radio Group"))){
                        p_fileAccess.seek(v_currentPos);
                        Navigate.nextLine(6, p_fileAccess);
                        return "Radio Group";
                    }else if((v_line).startsWith("Push Button")){
                        System.out.println("PUSH BUTTON");
                        p_fileAccess.seek(v_currentPos);
                        Navigate.nextLine(8, p_fileAccess);
                        return "Push Button";
                    }
                    p_fileAccess.seek(v_currentPos);
                    Navigate.nextLine(8, p_fileAccess);
                    
                    return "Item";
                    
                }
                else{
                    Navigate.nextLine(1, p_fileAccess);
                    
                    if(p_fileAccess.readLine().trim().startsWith("* Name")){
                    p_fileAccess.seek(v_currentPos);
                    Navigate.nextLine(8, p_fileAccess);
                    return "Item";
                
                
                    }}break;
            case "Radio Group" :
                
                Navigate.nextLine(18, p_fileAccess);
                
                if(p_fileAccess.readLine().trim().startsWith("* Item Type")){
                    p_fileAccess.seek(v_currentPos);
                    Navigate.nextLine(17, p_fileAccess);
                    return "Item";
                }
                break;
            case "Item" :
                Navigate.nextLine(6, p_fileAccess);
                System.out.println("je veux lire ça : "+p_fileAccess.readLine());
                p_fileAccess.seek(v_currentPos);
                Navigate.nextLine(9, p_fileAccess);
                
                if((Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine().trim())).equals("PL/SQL"))){
                    System.out.println("la");
                    p_fileAccess.seek(v_currentPos);
                    Navigate.nextLine(6, p_fileAccess);
                    
                    return "Method";
                }
                
                
                p_fileAccess.seek(v_currentPos);
                Navigate.nextLine(7, p_fileAccess);
                 v_line=p_fileAccess.readLine().trim();
                System.out.println("v_line 123"+v_line);
                if((v_line.startsWith("* Item Type"))||(v_line.startsWith("^ Item Type"))){
                    System.out.println(" TU RENTRE LA?");
                    p_fileAccess.seek(v_currentPos);
                    Navigate.nextLine(7, p_fileAccess);
                    
                    
                    
                    if((Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine().trim())).startsWith("Radio Group"))){
                        p_fileAccess.seek(v_currentPos);
                        Navigate.nextLine(6, p_fileAccess);
                        
                        return "Radio Group";
                    }else if((Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine())).equals("Push Button"))){
                        p_fileAccess.seek(v_currentPos);
                        Navigate.nextLine(6, p_fileAccess);
                        return "Push Button";
                    }
                    p_fileAccess.seek(v_currentPos);
                    Navigate.nextLine(6, p_fileAccess);
                    
                    
                    return "Item";
                    
                }
                break;
                
            case "Push Button" :
                 Navigate.nextLine(8, p_fileAccess);
                
                 
                v_line=p_fileAccess.readLine().trim();
                if((v_line.startsWith("* Item Type"))||(v_line.startsWith("^ Item Type"))){
                    p_fileAccess.seek(v_currentPos);
                    Navigate.nextLine(7, p_fileAccess);
                    
                    
                    if((Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine())).equals("Radio Group"))){
                        p_fileAccess.seek(v_currentPos);
                        Navigate.nextLine(6, p_fileAccess);
                        return "Radio Group";
                    }else if((Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine())).equals("Push Button"))){
                        p_fileAccess.seek(v_currentPos);
                        Navigate.nextLine(6, p_fileAccess);
                        return "Push Button";
                    }
                    p_fileAccess.seek(v_currentPos);
                    Navigate.nextLine(6, p_fileAccess);
                    return "Item";
            }
                p_fileAccess.seek(v_currentPos);
                 Navigate.nextLine(5, p_fileAccess);
                
                
                if((Refactoring.delSpace(Refactoring.getValueFromLine(p_fileAccess.readLine().trim())).equals("PL/SQL"))){
                    
                    p_fileAccess.seek(v_currentPos);
                    Navigate.nextLine(2, p_fileAccess);
                    
                    return "Method";
                }

            }
        

        
    }   catch (IOException ex) {
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "error";
    }
    
}
