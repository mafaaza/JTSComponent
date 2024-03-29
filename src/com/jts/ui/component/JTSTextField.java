/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jts.ui.component;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author muflih
 */
public class JTSTextField extends javax.swing.JPanel {

    /**
     * Creates new form JTSTextField
     */
    public JTSTextField() {
        initComponents();
        jcinitComponent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();
        text = new javax.swing.JTextField();

        label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label)
                .addGap(6, 6, 6)
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label)
                    .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label;
    private javax.swing.JTextField text;
    // End of variables declaration//GEN-END:variables

    /**
     * *************************************************************************
     * Variable area ***********************************************************
     */
    private int JCTextLength;
    private Case JCTextCase;
    private TextType JCTextType;
    private String JCCaptions;
    private int JCCaptionsWidth;
    private int height;
    private Font JCTextFont;
    private Font JCCaptionsFont;
    private boolean JCTextEditable = true;
    
    

    /**
     * @return the JCTextLength
     */
    public int getJCTextLength() {
        return JCTextLength;
    }

    /**
     * @param JCTextLength the JCTextLength to set
     */
    public void setJCTextLength(int JCTextLength) {
        this.JCTextLength = JCTextLength;
        this.text.setPreferredSize(new Dimension((JCTextLength * 8) + 14, height));
        this.text.setDocument(new TextDocument());
    }

    /**
     * @return the JCTextCase
     */
    public Case getJCTextCase() {
        return JCTextCase;
    }

    /**
     * @param JCTextCase the JCTextCase to set
     */
    public void setJCTextCase(Case JCTextCase) {
        this.JCTextCase = JCTextCase;
        this.text.setDocument(new TextDocument());
    }

    /**
     * @return the JCtextType
     */
    public TextType getJCTextType() {
        return JCTextType;
    }

    /**
     * @param JCtextType the JCtextType to set
     */
    public void setJCTextType(TextType JCtextType) {
        this.JCTextType = JCtextType;
        this.text.setDocument(new TextDocument());
    }

    /**
     * @return the JCCaptions
     */
    public String getJCCaptions() {
        return JCCaptions;
    }

    /**
     * @param JCCaptions the JCCaptions to set
     */
    public void setJCCaptions(String JCCaptions) {
        this.JCCaptions = JCCaptions;
        this.label.setText(JCCaptions);
    }

    /**
     * @return the JCCaptionsWidth
     */
    public int getJCCaptionsWidth() {
        return JCCaptionsWidth;
    }

    /**
     * @param JCCaptionsWidth the JCCaptionsWidth to set
     */
    public void setJCCaptionsWidth(int JCCaptionsWidth) {
        this.JCCaptionsWidth = JCCaptionsWidth;
        if (this.JCCaptionsWidth > 0) {
            this.label.setMinimumSize(new Dimension(JCCaptionsWidth * 8, height));
            this.label.setSize(new Dimension(JCCaptionsWidth * 8, height));
        }
    }

    /**
     * @return the JCTextFont
     */
    public Font getJCTextFont() {
        return JCTextFont;
    }

    /**
     * @param JCTextFont the JCTextFont to set
     */
    public void setJCTextFont(Font JCTextFont) {
        this.JCTextFont = JCTextFont;
        this.text.setFont(JCTextFont);
    }

    /**
     * @return the JCCaptions
     */
    public Font getJCCaptionsFont() {
        return JCCaptionsFont;
    }

    /**
     * @param JCLabelFont the JCLabelFont to set
     */
    public void setJCCaptionsFont(Font JCLabelFont) {
        this.JCCaptionsFont = JCLabelFont;
        this.label.setFont(JCTextFont);
    }

    /**
     * @return the JCTextEditable
     */
    public boolean isJCTextEditable() {
        return JCTextEditable;
    }

    /**
     * @param JCTextEditable the JCTextEditable to set
     */
    public void setJCTextEditable(boolean JCTextEditable) {
        this.JCTextEditable = JCTextEditable;
        this.text.setEditable(JCTextEditable);
    }

    /**
     * *************************************************************************
     * Enum area ************************************************************
     */
    public enum Case {
        UPPER_CASE,
        LOWER_CASE,
        NORMAL_CASE
    }

    public enum TextType {
        OL_ALL,
        OL_NUMERIC,
        OL_UPP,
        OL_LOW,
        OL_UPP_LOW,
        OL_DATE
    }

    /**
     * *************************************************************************
     * Initial area ************************************************************
     */
    private void jcinitComponent() {
        JCTextLength = 1;
        JCTextCase = Case.NORMAL_CASE;
        JCTextType = TextType.OL_ALL;
        JCCaptions = "Captions";
        label.setText(JCCaptions);
        JCCaptionsWidth = 0;
        height = 23;
        JCTextFont = this.text.getFont();
        JCCaptionsFont = this.label.getFont();
        setJCTextEditable(true);
        setJCTextLength(1);
    }

    /**
     * *************************************************************************
     * Private method area *****************************************************
     *
     */
    private class TextDocument extends PlainDocument {

        private String all = "~!@#$%^&*()_+`1234567890-=QWERTYUIOP{}|qwertyuiop[]ASDFGHJKL:asdfghjkl;'ZXCVBNM<>?zxcvbnm,./ '";
        private String numeric = "0123456789.-,";
        private String upp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ 01234567890";
        private String low = "0123456789 abcdefghijklmnopqrstuvwxyz";
        private String upp_low = "ABCDEFGHIJKLMNOPQRSTUVWXYZ 01234567890abcdefghijklmnopqrstuvwxyz";
        private String date = "1234567890-";
        private String acceptedChars = null;

        public TextDocument() {
            super();
            if (null != JCTextType) {
                switch (JCTextType) {
                    case OL_ALL:
                        this.acceptedChars = all;
                        break;
                    case OL_NUMERIC:
                        this.acceptedChars = numeric;
                        break;
                    case OL_UPP:
                        this.acceptedChars = upp;
                        break;
                    case OL_LOW:
                        this.acceptedChars = low;
                        break;
                    case OL_UPP_LOW:
                        this.acceptedChars = upp_low;
                        break;
                    case OL_DATE:
                        this.acceptedChars = date;
                        break;
                    default:
                        break;
                }
            }
        }

        public void masukinString(int offset, String str, AttributeSet attr) throws BadLocationException {
            if (str == null) {
                return;
            }

            for (int i = 0; i < str.length(); i++) {
                if (!acceptedChars.contains(String.valueOf(str.charAt(i)))) {
                    return;
                }
            }
            if (null != JCTextCase) {
                switch (JCTextCase) {
                    case LOWER_CASE:
                        str = str.toLowerCase();
                        break;
                    case UPPER_CASE:
                        str = str.toUpperCase();
                        break;
                    case NORMAL_CASE:
                    default:
                        break;
                }
            }
            super.insertString(offset, str, attr);
        }

        @Override
        public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
            if (str == null) {
                return;
            }
            if ((getLength() + str.length()) <= JCTextLength) {
                masukinString(offset, str, attr);
            }
        }
    }
}
