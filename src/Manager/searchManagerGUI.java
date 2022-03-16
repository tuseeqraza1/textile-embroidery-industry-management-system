/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import oop_project.*;

/**
 *
 * @author tusee
 */
public class searchManagerGUI extends JFrame
{
    JTextField t1,t2,t3,t4,t5,t6,t7,t8;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,background,title;
    JButton b1,b2,b3,b4;
    JPanel p1,p2;
    
    /*public static void main(String[] args) 
    {
        searchManagerGUI a = new searchManagerGUI();
        //String name, String phone, String cnic, String gender, Address address, String des, String password
    }*/
    public searchManagerGUI()
    {
        super("Search Manager");
        setSize(900, 600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ImageIcon img = new ImageIcon("src/images/pattern.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 900, 600);
        
        Font f1 = new Font("Bauhaus 93", Font.PLAIN, 50);
        title = new JLabel("Search Manager:");
        title.setFont(f1);
        title.setBounds(68, -10, 700, 100);
        
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        t4 = new JTextField(20);
        t5 = new JTextField(20);
        t6 = new JTextField(20);
        t7 = new JTextField(20);
        t8 = new JTextField(20);
        
        /*t3.setEditable(false);
        t4.setEditable(false);
        t5.setEditable(false);
        t6.setEditable(false);
        t7.setEditable(false);
        t8.setEditable(false);
        */
        
        l1 = new JLabel("Manager's ID");
        l2 = new JLabel("Manager's Name");
        l3 = new JLabel("Phone No.");
        l4 = new JLabel("CNIC no.");
        l5 = new JLabel("Gender");
        l6 = new JLabel("Designation");
        l7 = new JLabel("Address");
        l8 = new JLabel("City");
        
        
        Font f = new Font("Serif", Font.BOLD, 20); //font style and size
        Color color1 = new Color(0,0,0); //RGB color code
        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);
        l5.setFont(f);
        l6.setFont(f);
        l7.setFont(f);
        l8.setFont(f);
        
        l1.setForeground(color1);
        l2.setForeground(color1);
        l3.setForeground(color1);
        l4.setForeground(color1);
        l5.setForeground(color1);
        l6.setForeground(color1);
        l7.setForeground(color1);
        l8.setForeground(color1);
        
        t1.setBounds(320, 90, 330, 30);
        t2.setBounds(320, 135, 330, 30);
        t3.setBounds(480, 215, 330, 30);
        t4.setBounds(480, 260, 330, 30);
        t5.setBounds(480, 305, 330, 30);
        t6.setBounds(480, 350, 330, 30);
        t7.setBounds(480, 395, 330, 30);
        t8.setBounds(480, 440, 330, 30);
        
        l1.setBounds(110, 90, 330, 30);
        l2.setBounds(110, 135, 330, 30);
        l3.setBounds(110, 215, 330, 30);
        l4.setBounds(110, 260, 330, 30);
        l5.setBounds(110, 305, 330, 30);
        l6.setBounds(110, 350, 330, 30);
        l7.setBounds(110, 395, 330, 30);
        l8.setBounds(110, 440, 330, 30);
        
        ImageIcon search = new ImageIcon("src/images/search1.png");
        
        b1 = new JButton(search);
        b1.setBounds(730, 90, 80, 30);
        b2 = new JButton(search);
        b2.setBounds(730, 135, 80, 30);
        b3 = new JButton("Clear");
        b3.setBounds(275, 510, 150, 35);
        b4 = new JButton("Back");
        b4.setBounds(465, 510, 150, 35);
        
        b1.setBackground(Color.decode("#D8D8D8"));
        b2.setBackground(Color.decode("#D8D8D8"));
        b1.setBorderPainted(false);
        b2.setBorderPainted(false);
        
        p1 = new JPanel();
        p1.setLayout(null);
        
        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,0,80));
        p2.setBounds(70, 65, 760, 430);
        
        p1.add(title);
        p1.add(t1);
        p1.add(t2);
        p1.add(t3);
        p1.add(t4);
        p1.add(t5);
        p1.add(t6);
        p1.add(t7);
        p1.add(t8);
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(l7);
        p1.add(l8);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(p2);
        p1.add(background);
        
        add(p1);
        setVisible(true);
        
        searchManagerListener a1 = new searchManagerListener();
        b1.addActionListener(a1);
        b2.addActionListener(a1);
        b3.addActionListener(a1);
        b4.addActionListener(a1);
    }
    
    public void diposesearchManager()
    {
        this.dispose();
    }
    
    public class searchManagerListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {   
            
            if((e.getSource().equals(b1)))
            {
                boolean check1 = false;
                if(!(t1.getText().isEmpty()))
                {                    
                    ArrayList<Admin> adminList = ReadData.readAdmin();
                    if(adminList.isEmpty())
                    {
                        JOptionPane.showMessageDialog(null, "Data not found.");
                    }
                    else if(!((t1.getText().isEmpty())))
                    {
                        int t = 0;

                        try
                        {
                            t = Integer.parseInt(t1.getText());
                        }
                        catch(NumberFormatException ex)
                        {
                            JOptionPane.showMessageDialog(null, "An integer is required.");
                            t1.setText("");
                            check1 = true;
                        }
                        if(!check1)
                        {
                            for(int j = 0; j<adminList.size(); j++)
                            {
                                if(t == (adminList.get(j).getID()))
                                {
                                    String a = Integer.toString(adminList.get(j).getID());
                                    t1.setText(a);
                                    t2.setText(adminList.get(j).getName());
                                    t3.setText(adminList.get(j).getPhone()); //phone no
                                    t4.setText(adminList.get(j).getCnic()); //cnic
                                    t5.setText(adminList.get(j).getGender()); //gender
                                    t6.setText(adminList.get(j).getDes()); //designation
                                    t7.setText(adminList.get(j).getAddress().getFull_address()); //address
                                    t8.setText(adminList.get(j).getAddress().getCity()); //city

                                    break;
                                }
                                else if(j == adminList.size()-1)
                                {
                                    JOptionPane.showMessageDialog(null, "Data not found.");
                                }
                            }
                        }
                    }
                }
                else if(!check1)
                {
                    JOptionPane.showMessageDialog(null, "ID field is empty.");
                }
            }
            
            else if(e.getSource().equals(b2))
            {
                if(!(t2.getText().isEmpty()))
                {
                    ArrayList<Admin> adminList = ReadData.readAdmin();
                    if(adminList.isEmpty())
                    {
                        JOptionPane.showMessageDialog(null, "Data not found.");
                    }

                    for(int j = 0; j<adminList.size(); j++)
                    {
                        if(t2.getText().equalsIgnoreCase(adminList.get(j).getName()))
                        {
                            String a = Integer.toString(adminList.get(j).getID());
                            t1.setText(a);
                            t2.setText(adminList.get(j).getName());
                            t3.setText(adminList.get(j).getPhone()); //phone no
                            t4.setText(adminList.get(j).getCnic()); //cnic
                            t5.setText(adminList.get(j).getGender()); //gender
                            t6.setText(adminList.get(j).getDes()); //designation
                            t7.setText(adminList.get(j).getAddress().getFull_address()); //address
                            t8.setText(adminList.get(j).getAddress().getCity()); //city

                            break;
                        }
                        else if(j == adminList.size()-1)
                        {
                            JOptionPane.showMessageDialog(null, "Data not found.");
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Names is not entered.");
                }
            }
            
            else if(e.getActionCommand().equals("Clear"))
            {
                t1.setText(""); //manager id
                t2.setText(""); //name
                t3.setText(""); //phone no
                t4.setText(""); //cnic
                t5.setText(""); //gender
                t6.setText(""); //designation
                t7.setText(""); //address
                t8.setText(""); //city

            }
            else if(e.getActionCommand().equals("Back"))
            {
                diposesearchManager();
                MainGUI mg = new MainGUI();
            }
            
        }
    }
}