/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SellerManagement;

import Exceptions.CNICException;
import Exceptions.DataNotFoundException;
import Exceptions.IntegerNeededException;
import Exceptions.PhoneNoException;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import oop_project.*;

/**
 *
 * @author tusee
 */
public class editSellerGUI extends JFrame
{
    JTextField id,t1,t2,t3,t4,t5,t6,t7;
    JLabel l1,l2,l3,l4,l5,l6,l7,title,background;
    JButton b1,b2,b3,b4;
    JPanel p1;
    int check;
    
    /*public static void main(String[] args) 
    {
        editSellerGUI a = new editSellerGUI();
        //String name, String phone, String cnic, String gender, Address address, String des, String password
    }*/
    public editSellerGUI()
    {
        super("Edit Seller");
        setSize(1000, 700);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ImageIcon img = new ImageIcon("src/images/background1.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 1000, 700);
        
        Font f1 = new Font("Bauhaus 93", Font.PLAIN, 50);
        title = new JLabel("Edit Seller:");
        title.setFont(f1);
        title.setForeground(Color.decode("#ECECEC"));
        title.setBounds(110, 35, 700, 100);
        
        t1 = new JTextField(20); //id
        t2 = new JTextField(20); //name
        t3 = new JTextField(11); //phone no
        t4 = new JTextField(13); //cnic
        t5 = new JTextField(30); //company name
        t6 = new JTextField(15); //address
        t7 = new JTextField(15); //city
        
        Font f2 = new Font("Arial", Font.PLAIN, 25); // font style and size for text fields
        t1.setFont(f2);
        t2.setFont(f2);
        t3.setFont(f2);
        t4.setFont(f2);
        t5.setFont(f2);
        t6.setFont(f2);
        t7.setFont(f2);
        
        t1.setBounds(485, 125, 370, 40);
        t2.setBounds(485, 175, 370, 40);
        t3.setBounds(485, 280, 370, 40);
        t4.setBounds(485, 335, 370, 40);
        t5.setBounds(485, 390, 370, 40);
        t6.setBounds(485, 445, 370, 40);
        t7.setBounds(485, 500, 370, 40);
        
        Font f = new Font("Serif", Font.BOLD, 30); //font style and size for labels
        Color color1 = new Color(236,236,236); //RGB color code
        
        l1 = new JLabel("Seller's ID");
        l2 = new JLabel("Seller's Name");
        l3 = new JLabel("Phone No.");
        l4 = new JLabel("CNIC No.");
        l5 = new JLabel("Company Name");
        l6 = new JLabel("Address");
        l7 = new JLabel("City");
        
        l1.setBounds(150, 125, 330, 40);
        l2.setBounds(150, 175, 330, 40);
        l3.setBounds(150, 280, 330, 40);
        l4.setBounds(150, 335, 330, 40);
        l5.setBounds(150, 390, 330, 40);
        l6.setBounds(150, 445, 330, 40);
        l7.setBounds(150, 500, 330, 40);
        
        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);
        l5.setFont(f);
        l6.setFont(f);
        l7.setFont(f);

        l1.setForeground(color1);
        l2.setForeground(color1);
        l3.setForeground(color1);
        l4.setForeground(color1);
        l5.setForeground(color1);
        l6.setForeground(color1);
        l7.setForeground(color1);
        
        b1 = new JButton("Update");
        b1.setBounds(235, 565, 150, 40);
        b2 = new JButton("Clear");
        b2.setBounds(425, 565, 150, 40);
        b3 = new JButton("Back");
        b3.setBounds(615, 565, 150, 40);
        b4 = new JButton("Search");
        b4.setBounds(375, 228, 250, 40);

        p1 = new JPanel();
        p1.setLayout(null);
        
        p1.add(title);
        p1.add(t1);
        p1.add(t2);
        p1.add(t3);
        p1.add(t4);
        p1.add(t5);
        p1.add(t6);
        p1.add(t7);
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(l7);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(background);
        
        add(p1);
        
        setVisible(true);
        
        editSellerListener a1 = new editSellerListener();
        b1.addActionListener(a1);
        b2.addActionListener(a1);
        b3.addActionListener(a1);
        b4.addActionListener(a1);
    }
    
    public void diposeeditSellerFrame()
    {
        this.dispose();
    }
    
    public class editSellerListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {   
            ObjectOutputStream output = null;
            if(e.getActionCommand().equals("Search"))
            {   
                boolean check1 = false;
                int t = 0;
                try
                {
                    t = Integer.parseInt(t1.getText());
                    t1.setEditable(false);
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(null, "An integer is required.");
                    t1.setText("");
                    check1 = true;
                }
                
                ArrayList<Seller> SellerList = ReadData.readSeller();
                
                try
                {
                    if(SellerList.isEmpty())
                        throw new DataNotFoundException();
                }catch(DataNotFoundException ex)
                {
                    JOptionPane.showMessageDialog(null, "Data not found.");
                    t1.setEditable(true);
                    t1.setText("");
                    t2.setText("");
                    check1 = true;
                }
                
                if(!((t1.getText().isEmpty()) || (t2.getText().isEmpty()) || (check1)))
                {
                    for(int j = 0; j<SellerList.size(); j++)
                    {
                        if(t == (SellerList.get(j).getSellerID()) && (t2.getText().equalsIgnoreCase(SellerList.get(j).getName())))
                        {
                            t2.setText(SellerList.get(j).getName()); //name
                            t3.setText(SellerList.get(j).getPhone()); //phone no
                            t4.setText(SellerList.get(j).getCnic()); //cnic
                            t5.setText(SellerList.get(j).getIndustryName()); //company name
                            t6.setText(SellerList.get(j).getAddress().getFull_address()); //address
                            t7.setText(SellerList.get(j).getAddress().getCity()); //city
                            
                            check = j;
                            break;
                        }
                        
                        try
                        {
                            if(j == SellerList.size()-1)
                                throw new DataNotFoundException();
                        }catch(DataNotFoundException ex)
                        {
                            JOptionPane.showMessageDialog(null, "Data not found.");
                            t1.setEditable(true);
                            t1.setText("");
                            t2.setText("");
                        }
                    }
                }    
            }
            else if(e.getActionCommand().equals("Update"))
            {
                ArrayList<Seller> SellerList = ReadData.readSeller();
                try
                {
                    if(!((t1.getText().isEmpty()) || (t2.getText().isEmpty()) || (t3.getText().isEmpty()) || (t4.getText().isEmpty())
                        || (t5.getText().isEmpty()) || (t6.getText().isEmpty()) || (t7.getText().isEmpty())))
                    {
                        boolean check1 = false;
                        int a1 = Integer.parseInt(t1.getText()); //id
                        String a2 = t2.getText(); //name
                        String a3 = null; //phone
                        String a4 = null; //cnic
                        
                        try
                        {
                            a3 = t3.getText();
                            if((a3.length() > 11) || (a3.length() < 11))
                                throw new PhoneNoException();
                        } catch (PhoneNoException ex) {
                            JOptionPane.showMessageDialog(null, "Phone no. can not be more/less then 11 digits.");
                            check1 = true;
                        } 
                        try
                        {
                            a4 = t4.getText();
                            if((a4.length() > 11) || (a4.length() < 11))
                                throw new CNICException();  
                        }
                        catch (CNICException ex) {
                            JOptionPane.showMessageDialog(null, "CNIC can not be more/less then 13 digits.");
                            check1 = true;
                        }
                        String a5 = t5.getText(); //company name
                        String a6 = t6.getText(); //address
                        String a7 = t7.getText(); //city
                        
                        if(!check1)
                        {
                            SellerList.remove(check);
                            //String name, String phone, String cnic, String industryName, Address address, int SellerID
                            Address address = new Address(a6, a7);
                            Seller update = new Seller(a2, a3, a4, a5, address, a1);

                            SellerList.add(check, update);

                            output = new ObjectOutputStream(new FileOutputStream("src/files/Seller.ser"));
                            for(int i = 0; i < SellerList.size(); i++)
                            {
                                output.writeObject(SellerList.get(i));
                            }

                            output.close();
                            
                            JOptionPane.showMessageDialog(null, "Seller's data updated successfully.");
                            t1.setEditable(true);
                            t1.setText(""); //Seller id
                            t2.setText(""); //name
                            t3.setText(""); //phone no
                            t4.setText(""); //cnic
                            t5.setText(""); //company name
                            t6.setText(""); //address
                            t7.setText(""); //city
                        }
                    }    
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Fields are empty.");
                    }
                }
                catch(IOException a)
                {
                    JOptionPane.showMessageDialog(null, "Error in Writing.");
                }
                
            }
            else if(e.getActionCommand().equals("Clear"))
            {
                t1.setEditable(true);
                t1.setText(""); //Seller id
                t2.setText(""); //name
                t3.setText(""); //phone no
                t4.setText(""); //cnic
                t5.setText(""); //company name
                t6.setText(""); //address
                t7.setText(""); //city

            }
            else if(e.getActionCommand().equals("Back"))
            {
                diposeeditSellerFrame();
                SellerMainGUI cg = new SellerMainGUI();
            }
        }
    }
}
