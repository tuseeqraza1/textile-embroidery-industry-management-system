/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

import Exceptions.*;
import Manager.Admin;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author tusee
 */
public class LoginGUI extends JFrame
{
    JTextField t1;
    JPasswordField pw1;
    JLabel l1,l2,l3,title,background;
    JButton b1,b2;
    JPanel p1,p2;
    
    /*public static void main(String[] args)
    {
        LoginGUI lg = new LoginGUI();
    }*/
    
    public LoginGUI()
    {
        super("Manager Login");
        setSize(700, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ImageIcon img = new ImageIcon("src/images/Embroidery.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 700, 500);
        
        Font f1 = new Font("Bauhaus 93", Font.BOLD, 60);
        title = new JLabel("Textile Embroidery");
        title.setFont(f1);
        title.setBounds(65, 20, 700, 100);
        
        Font f = new Font("Serif", Font.PLAIN, 25); //font style and size
        Color color1 = new Color(240,240,240); //RGB color code
        
        l1 = new JLabel("Username");
        l1.setFont(f);
        l1.setForeground(color1);
        l1.setBounds(120, 200, 150, 30);
        
        l2 = new JLabel("Password");
        l2.setFont(f);
        l2.setForeground(color1);
        l2.setBounds(120, 250, 150, 30);
        
        l3 = new JLabel("Manager Login:");
        l3.setFont(new Font("Bauhaus 93", Font.BOLD, 30));
        //l3.setForeground(color1);
        l3.setBounds(230, 110, 250, 30);
        
        t1 = new JTextField(20);
        t1.setBounds(300, 200, 280, 30);
        pw1 = new JPasswordField(20);
        pw1.setBounds(300, 250, 280, 30);
        
        pw1.addKeyListener(new KeyAdapter() 
        {
            public void keyPressed(KeyEvent e)
            {
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    login();
                }
            }
        });
        
        b1 = new JButton("LogIn");
        b1.setBounds(180, 330, 150, 30);
        b2 = new JButton("Exit");
        b2.setBounds(370, 330, 150, 30);
        
        p1 = new JPanel();
        p1.setLayout(null);
        
        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,0,80));
        p2.setBounds(95, 180, 500, 200);
        
        p1.add(title);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(l3);
        p1.add(pw1);
        p1.add(b1);
        p1.add(b2);
        p1.add(p2);
        p1.add(background);
        
        add(p1);
        setVisible(true);
        
        MainListener a1 = new MainListener();
        b1.addActionListener(a1);
        b2.addActionListener(a1);
    }
    
    public void diposeLoginFrame()
    {
        this.dispose();
    }

    public class MainListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {   
            if(e.getActionCommand().equals("LogIn"))
            {
                login();
            }
            else if(e.getActionCommand().equals("Exit"))
            {
                System.exit(0);
            }
            
        }
    }
    
    public void login()
    {
        String username = t1.getText();
        String password = pw1.getText();

        if(username.contains("admin") && password.contains("admin"))
        {
            diposeLoginFrame();
            MainGUI mg = new MainGUI();
            mg.setVisible(true);
        }

        ArrayList<Admin> adminList = ReadData.readAdmin();

        for(int i = 0; i<adminList.size(); i++)
        {
            if((username.contains(adminList.get(i).getName())) && (password.contains(adminList.get(i).getPassword())))
            {
                diposeLoginFrame();
                MainGUI mg = new MainGUI();
                mg.setVisible(true);
                break;
            }

            try
            {
                if(i == (adminList.size() - 1))
                {
                    throw new DataNotFoundException();
                }
            } catch (DataNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "No Data found.");
            }
        }
    }
}
