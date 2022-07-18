/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.social_medial_two.view;
import com.mycompany.social_medial_two.obsever.SocialObserverble;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Nipun Lakshitha
 */
public class Channel extends javax.swing.JFrame {

    /**
     * Creates new form Channel
     */
    private JButton btnContentAdd;
    private JButton btnSubcribe;
    private JButton btnUnSubcribe;
    private JTextField txtContent;
    private JTextField txtSubsciberName;
    private SocialObserverble socialObserverble;

    public Channel() {
        socialObserverble = new SocialObserverble();

        setSize(300,300);
        setTitle("Water Tank Window");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        txtContent = new JTextField(null,null,20);
        txtSubsciberName = new JTextField(null,null,20);
        btnContentAdd = new JButton("Add");
        btnSubcribe = new JButton("Subscribe");
        btnUnSubcribe = new JButton("UnSubscribe");

        btnSubcribe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               socialObserverble.subscribeChannel(new ShowContent(txtSubsciberName.getText().toString()),txtSubsciberName.getText());
            }
        });

        btnUnSubcribe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                socialObserverble.unSubsribeChannel(txtSubsciberName.getText());
            }
        });

        btnContentAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                socialObserverble.sendContent(txtContent.getText());
            }
        });

        add(txtContent);
        add(btnContentAdd);
        add(txtSubsciberName);
        add(btnSubcribe);
        add(btnUnSubcribe);
    }


}
