/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.social_medial_two.view;

import com.mycompany.social_medial_two.obsever.SocailObserver;
import com.mycompany.social_medial_two.obsever.SocialObserverble;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Nipun Lakshitha
 */
public class ShowContent extends javax.swing.JFrame implements SocailObserver {

    /**
     * Creates new form ShowContent
     */

    private JTextField showText;
    private SocialObserverble socialObserverble;
    public ShowContent(String name) {
        setSize(300,300);
        setTitle(name);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        showText = new JTextField(null,null,20);
        add(showText);
        setVisible(true);
    }


    @Override
    public void shareContent(String content) {
        showText.setText(content);
    }

    @Override
    public void closeContent(){
        setVisible(false);
    }

}
