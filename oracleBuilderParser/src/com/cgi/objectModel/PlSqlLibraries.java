/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cgi.objectModel;

/**
 *
 * @author gerardj
 */
public class PlSqlLibraries {
    String m_libraryName;
    String m_libraryComments;
    String m_libraryLocation;

    public PlSqlLibraries(String p_libraryName, String p_libraryComments, String p_libraryLocation) {
        this.m_libraryName = p_libraryName;
        this.m_libraryComments = p_libraryComments;
        this.m_libraryLocation = p_libraryLocation;
    }
    
}
