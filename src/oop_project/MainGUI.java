/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

import CustomerManagement.CustomerMainGUI;
import EmployeeManagement.EmployeeMainGUI;
import Manager.*;
import SellerManagement.SellerMainGUI;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;


public class MainGUI extends JFrame
{
    JTextField t1;
    JLabel l1,l2,title1,title2,background;
    JButton b1,b2,b3,b4;
    JPanel p1,p2;
    JMenuBar mb;
    JMenu file, logout;
    JMenuItem addManager, searchManager, editManager, deleteManager,exit;
    
    /*public static void main(String[] args)
    {
        MainGUI g = new MainGUI();
    }*/
    
    public MainGUI()
    {
        super("Home");
        setSize(700, 500);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ImageIcon img = new ImageIcon("src/images/MainGUI.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 700, 500);
        
        mb = new JMenuBar();
        file = new JMenu("File  ");
        logout = new JMenu("LogOut");
        mb.add(file);
        mb.add(logout);
        
        addManager = new JMenuItem("Add Manager");
        editManager = new JMenuItem("Edit Manager");
        searchManager  = new JMenuItem("Search Manager");
        deleteManager = new JMenuItem("Delete Manager");
        exit  = new JMenuItem("Exit");
        file.add(addManager);
        file.add(editManager);
        file.add(searchManager);
        file.add(deleteManager);
        file.add(exit);
        
        Font f1 = new Font("Bauhaus 93", Font.BOLD, 30);
        title1 = new JLabel("Textile");
        title1.setFont(f1);
        title1.setForeground(Color.decode("#1C2833"));
        title1.setBounds(563, 360, 200, 70);
        
        title2 = new JLabel("Embroidery");
        title2.setFont(f1);
        title2.setForeground(Color.decode("#1C2833"));
        title2.setBounds(500, 387, 200, 70);
        
        ImageIcon customer = new ImageIcon("src/images/customer.png");
        b1 = new JButton(customer);
        b1.setBackground(Color.decode("#F0B27A"));
        b1.setHorizontalTextPosition(SwingConstants.CENTER);
        b1.setBorder(null);
        b1.setBounds(20, 15, 200, 200);
        
        ImageIcon supplier = new ImageIcon("src/images/Supplier.png");
        b2 = new JButton(supplier);
        b2.setBackground(Color.decode("#85C1E9"));
        b2.setHorizontalTextPosition(SwingConstants.CENTER);
        b2.setBorder(null);
        b2.setBounds(240, 15, 200, 200);
        
        ImageIcon employee = new ImageIcon("src/images/workers.png");
        b3 = new JButton(employee);
        b3.setBackground(Color.decode("#7DCEA0"));
        b3.setHorizontalTextPosition(SwingConstants.CENTER);
        b3.setBorder(null);
        b3.setBounds(20, 235, 200, 200);
        
        p1 = new JPanel();
        p1.setLayout(null);
        
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(title1);
        p1.add(title2);
        p1.add(background);
        
        add(p1);
        setJMenuBar(mb);
        setVisible(true);
        
        MainListener a1 = new MainListener();
        b1.addActionListener(a1);
        b2.addActionListener(a1);
        b3.addActionListener(a1);
        addManager.addActionListener(a1);
        editManager.addActionListener(a1);
        deleteManager.addActionListener(a1);
        searchManager.addActionListener(a1);
        exit.addActionListener(a1);
        logout.addActionListener(a1);
        logout.addMenuListener(a1);
        
    }
    
    public void diposeHomeFrame()
    {
        this.dispose();
    }
    
    public class MainListener implements ActionListener,MenuListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {   
            if(e.getSource().equals(exit))
            {
                System.exit(0);
            }
            else if(e.getSource().equals(addManager))
            {
                addManagerGUI amg = new addManagerGUI();
                diposeHomeFrame();
            }
            else if(e.getSource().equals(editManager))
            {
                editManagerGUI emg = new editManagerGUI();
                diposeHomeFrame();
            }
            else if(e.getSource().equals(deleteManager))
            {
                deleteManagerGUI dmg = new deleteManagerGUI();
                diposeHomeFrame();
            }
            else if(e.getSource().equals(searchManager))
            {
                searchManagerGUI smg = new searchManagerGUI();
                diposeHomeFrame();
            }
            else if(e.getSource().equals(b1))
            {
                CustomerMainGUI cmg = new CustomerMainGUI();
                diposeHomeFrame();
            }
            else if(e.getSource().equals(b2))
            {
                SellerMainGUI smg = new SellerMainGUI();
                diposeHomeFrame();
            }
            else if(e.getSource().equals(b3))
            {
                EmployeeMainGUI smg = new EmployeeMainGUI();
                diposeHomeFrame();
            }

        }

        @Override
        public void menuSelected(MenuEvent e) {
            //To change body of generated methods, choose Tools | Templates.
            if(e.getSource().equals(logout))
            {
                LoginGUI lg = new LoginGUI();
                diposeHomeFrame();
            }

        }

        @Override
        public void menuDeselected(MenuEvent e) {
            //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void menuCanceled(MenuEvent e) {
            //To change body of generated methods, choose Tools | Templates.
        }
    }
}
