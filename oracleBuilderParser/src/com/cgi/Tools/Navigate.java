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
public class Navigate {
    public static void nextLine(int p_nbLine, RandomAccessFile p_fileAccess) {
        for (int i = 0; i < p_nbLine; i++) {
            try {
                p_fileAccess.readLine();
            } catch (IOException ex) {
                Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static String avancerJusqua(RandomAccessFile p_fileAccess,long p_cursor, String p_regex) throws IOException {
        String v_value = "test";
        p_fileAccess.seek(p_cursor);
        
        try {
            
            boolean v_test=false;
            
            
            while(!(v_test)){
               
                
                v_value=(p_fileAccess.readLine()).trim();
                v_test=v_value.startsWith(p_regex);
                
                
            }
            
        } catch (IOException ex) {
            
            Logger.getLogger(OracleBuilderParser.class.getName()).log(Level.SEVERE, null, ex);
        }

        return v_value;
    }
}
