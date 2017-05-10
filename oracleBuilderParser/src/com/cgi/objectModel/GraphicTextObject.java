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
public class GraphicTextObject {
    String m_graphicTextObjectName;
    String m_graphicTextObjectType;
    String m_graphicTextObjectXPosition;
    String m_graphicTextObjectYPosition;
    String m_graphicTextObjectWidth;
    String m_graphicTextObjectHeight;
    String m_graphicTextObjectLineWidth;
    String m_graphicTextObjectDashStyle;
    String m_graphicTextObjectCapStyle;
    String m_graphicTextObjectJoinStyle;
    String m_graphicTextObjectRotationAngle;
    String m_graphicTextObjectCustomSpacing;
    String m_graphicTextObjectLineSpacing;
    String m_graphicTextObjectFixedBoundingBox;
    String m_graphicTextObjectWrapText;
    String m_graphicTextObjectBoundingBoxScaleable;
    String m_graphicTextObjectFontScaleable;
    String m_graphicTextObjectHorizontalJustification;
    String m_graphicTextObjectVerticalJustification;
    String m_graphicTextObjectHorizontalOrigin;
    String m_graphicTextObjectVerticalOrigin;
    String m_graphicTextObjectBevel;
    String m_graphicTextObjectDirection;
    CompoundTextObject m_textObject;

    public GraphicTextObject(String p_graphicTextObjectName, String p_graphicTextObjectType, String p_graphicTextObjectXPosition, String p_graphicTextObjectYPosition, String p_graphicTextObjectWidth, String p_graphicTextObjectHeight, String p_graphicTextObjectLineWidth, String p_graphicTextObjectDashStyle, String p_graphicTextObjectCapStyle, String p_graphicTextObjectJoinStyle, String p_graphicTextObjectRotationAngle, String p_graphicTextObjectCustomSpacing, String p_graphicTextObjectLineSpacing, String p_graphicTextObjectFixedBoundingBox, String p_graphicTextObjectWrapText, String p_graphicTextObjectBoundingBoxScaleable, String p_graphicTextObjectFontScaleable, String p_graphicTextObjectHorizontalJustification, String p_graphicTextObjectVerticalJustification, String p_graphicTextObjectHorizontalOrigin, String p_graphicTextObjectVerticalOrigin, String p_graphicTextObjectBevel, String p_graphicTextObjectDirection, CompoundTextObject p_textObject) {
        this.m_graphicTextObjectName = p_graphicTextObjectName;
        this.m_graphicTextObjectType = p_graphicTextObjectType;
        this.m_graphicTextObjectXPosition = p_graphicTextObjectXPosition;
        this.m_graphicTextObjectYPosition = p_graphicTextObjectYPosition;
        this.m_graphicTextObjectWidth = p_graphicTextObjectWidth;
        this.m_graphicTextObjectHeight = p_graphicTextObjectHeight;
        this.m_graphicTextObjectLineWidth = p_graphicTextObjectLineWidth;
        this.m_graphicTextObjectDashStyle = p_graphicTextObjectDashStyle;
        this.m_graphicTextObjectCapStyle = p_graphicTextObjectCapStyle;
        this.m_graphicTextObjectJoinStyle = p_graphicTextObjectJoinStyle;
        this.m_graphicTextObjectRotationAngle = p_graphicTextObjectRotationAngle;
        this.m_graphicTextObjectCustomSpacing = p_graphicTextObjectCustomSpacing;
        this.m_graphicTextObjectLineSpacing = p_graphicTextObjectLineSpacing;
        this.m_graphicTextObjectFixedBoundingBox = p_graphicTextObjectFixedBoundingBox;
        this.m_graphicTextObjectWrapText = p_graphicTextObjectWrapText;
        this.m_graphicTextObjectBoundingBoxScaleable = p_graphicTextObjectBoundingBoxScaleable;
        this.m_graphicTextObjectFontScaleable = p_graphicTextObjectFontScaleable;
        this.m_graphicTextObjectHorizontalJustification = p_graphicTextObjectHorizontalJustification;
        this.m_graphicTextObjectVerticalJustification = p_graphicTextObjectVerticalJustification;
        this.m_graphicTextObjectHorizontalOrigin = p_graphicTextObjectHorizontalOrigin;
        this.m_graphicTextObjectVerticalOrigin = p_graphicTextObjectVerticalOrigin;
        this.m_graphicTextObjectBevel = p_graphicTextObjectBevel;
        this.m_graphicTextObjectDirection = p_graphicTextObjectDirection;
        this.m_textObject = p_textObject;
    }

    public String getgraphicTextObjectName() {
        return m_graphicTextObjectName;
    }

    public String getgraphicTextObjectType() {
        return m_graphicTextObjectType;
    }

    public String getgraphicTextObjectXPosition() {
        return m_graphicTextObjectXPosition;
    }

    public String getgraphicTextObjectYPosition() {
        return m_graphicTextObjectYPosition;
    }

    public String getgraphicTextObjectWidth() {
        return m_graphicTextObjectWidth;
    }

    public String getgraphicTextObjectHeight() {
        return m_graphicTextObjectHeight;
    }

    public String getgraphicTextObjectLineWidth() {
        return m_graphicTextObjectLineWidth;
    }

    public String getgraphicTextObjectDashStyle() {
        return m_graphicTextObjectDashStyle;
    }

    public String getgraphicTextObjectCapStyle() {
        return m_graphicTextObjectCapStyle;
    }

    public String getgraphicTextObjectJoinStyle() {
        return m_graphicTextObjectJoinStyle;
    }

    public String getgraphicTextObjectRotationAngle() {
        return m_graphicTextObjectRotationAngle;
    }

    public String getgraphicTextObjectCustomSpacing() {
        return m_graphicTextObjectCustomSpacing;
    }

    public String getgraphicTextObjectLineSpacing() {
        return m_graphicTextObjectLineSpacing;
    }

    public String getgraphicTextObjectFixedBoundingBox() {
        return m_graphicTextObjectFixedBoundingBox;
    }

    public String getgraphicTextObjectWrapText() {
        return m_graphicTextObjectWrapText;
    }

    public String getgraphicTextObjectBoundingBoxScaleable() {
        return m_graphicTextObjectBoundingBoxScaleable;
    }

    public String getgraphicTextObjectFontScaleable() {
        return m_graphicTextObjectFontScaleable;
    }

    public String getgraphicTextObjectHorizontalJustification() {
        return m_graphicTextObjectHorizontalJustification;
    }

    public String getgraphicTextObjectVerticalJustification() {
        return m_graphicTextObjectVerticalJustification;
    }

    public String getgraphicTextObjectHorizontalOrigin() {
        return m_graphicTextObjectHorizontalOrigin;
    }

    public String getgraphicTextObjectVerticalOrigin() {
        return m_graphicTextObjectVerticalOrigin;
    }

    public String getgraphicTextObjectBevel() {
        return m_graphicTextObjectBevel;
    }

    public String getgraphicTextObjectDirection() {
        return m_graphicTextObjectDirection;
    }

    public CompoundTextObject gettextObject() {
        return m_textObject;
    }
    
    
}
