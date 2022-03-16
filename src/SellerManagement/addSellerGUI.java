/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SellerManagement;

import Exceptions.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import oop_project.*;

/**
 *
 * @author tusee
 */
class addSellerGUI extends JFrame
{
    JTextField id,t1,t2,t3,t4,t5,t6;
    JLabel l1,l2,l3,l4,l5,l6,title,background;
    JButton b1,b2,b3;
    JPanel p1;
    int ID;
    
   /* public static void main(String[] args) 
    {
        addSellerGUI a = new addSellerGUI();
        //String name, String phone, String cnic, String gender, Address address, String des, String password
    }*/
    public addSellerGUI()
    {
        super("New Seller Form");
        setSize(1000, 700);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ImageIcon img = new ImageIcon("src/images/background1.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 1000, 700);
        
        Font f1 = new Font("Bauhaus 93", Font.PLAIN, 50);
        title = new JLabel("Seller Form:");
        title.setFont(f1);
        title.setForeground(Color.decode("#ECECEC"));
        title.setBounds(110, 35, 700, 100);
        
        ArrayList<Seller> adminList = ReadData.readSeller();
        if(adminList != null)
        {
            //ID = (adminList.get(adminList.size()).getID()) + 1;
            ID = adminList.size() + 1;
        }
        else if(adminList == null)
        {
            ID = 1;
        }
        
        id = new JTextField(" Seller's ID:   " + ID ,20);
        id.setEditable(false);
        t1 = new JTextField(20); //name
        t2 = new JTextField(11); //phone no
        t3 = new JTextField(13); //cnic
        t4 = new JTextField(30); //company name
        t5 = new JTextField(15); //address
        t6 = new JTextField(15); //city
        
        Font f2 = new Font("Arial", Font.PLAIN, 25); // font style and size for text fields
        t1.setFont(f2);
        t2.setFont(f2);
        t3.setFont(f2);
        t4.setFont(f2);
        t5.setFont(f2);
        t6.setFont(f2);
        
        id.setBounds(585, 65, 270, 40);
        t1.setBounds(485, 155, 370, 40);
        t2.setBounds(485, 215, 370, 40);
        t3.setBounds(485, 275, 370, 40);
        t4.setBounds(485, 335, 370, 40);
        t5.setBounds(485, 395, 370, 40);
        t6.setBounds(485, 455, 370, 40);
        
        Font f = new Font("Serif", Font.BOLD, 30); //font style and size for labels
        Color color1 = new Color(236,236,236); //RGB color code
        
        l1 = new JLabel("Name");
        l2 = new JLabel("Phone No.");
        l3 = new JLabel("CNIC No.");
        l4 = new JLabel("Company Name");
        l5 = new JLabel("Address");
        l6 = new JLabel("City");
        
        l1.setBounds(150, 155, 330, 40);
        l2.setBounds(150, 215, 330, 40);
        l3.setBounds(150, 275, 330, 40);
        l4.setBounds(150, 335, 330, 40);
        l5.setBounds(150, 395, 330, 40);
        l6.setBounds(150, 455, 330, 40);
        
        id.setFont(f);
        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);
        l5.setFont(f);
        l6.setFont(f);

        l1.setForeground(color1);
        l2.setForeground(color1);
        l3.setForeground(color1);
        l4.setForeground(color1);
        l5.setForeground(color1);
        l6.setForeground(color1);
        
        b1 = new JButton("Submit");
        b1.setBounds(235, 550, 150, 40);
        b2 = new JButton("Clear");
        b2.setBounds(425, 550, 150, 40);
        b3 = new JButton("Back");
        b3.setBounds(615, 550, 150, 40);

        p1 = new JPanel();
        p1.setLayout(null);
        
        p1.add(title);
        p1.add(id);
        p1.add(t1);
        p1.add(t2);
        p1.add(t3);
        p1.add(t4);
        p1.add(t5);
        p1.add(t6);
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(background);
        
        add(p1);
        
        setVisible(true);
        
        addSellerListener a1 = new addSellerListener();
        b1.addActionListener(a1);
        b2.addActionListener(a1);
        b3.addActionListener(a1);
    }
    
    public void diposeaddSellerFrame()
    {
        this.dispose();
    }
    
    public class addSellerListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {   
            if(e.getActionCommand().equals("Submit"))
            {   
                if(!((t1.getText().isEmpty()) || (t2.getText().isEmpty()) || (t3.getText().isEmpty()) || (t4.getText().isEmpty())
                        || (t5.getText().isEmpty()) || (t6.getText().isEmpty())))
                {
                    boolean check = false;
                    
                    String name = t1.getText();
                    String phone = null;
                    
                    try
                    {
                        phone = t2.getText();
                        if((phone.length()>11) || (phone.length()<11))
                            throw new PhoneNoException();
                    }catch(PhoneNoException ex)
                    {
                        JOptionPane.showMessageDialog(null, "Phone no. can not be more/less then 11 digits.");
                        t2.setText("");
                        check = true;
                    }
                    
                    String cnic = null;
                    
                    try
                    {
                        cnic = t3.getText();
                        if((cnic.length()>13) || (cnic.length()<13))
                            throw new CNICException();
                    }catch(CNICException ex)
                    {
                        JOptionPane.showMessageDialog(null, "CNIC can not be more/less then 13 digits.");
                        t3.setText("");
                        check = true;
                    }
                    String companyName = t4.getText();
                    String address1 = t5.getText();
                    String city = t6.getText();

                    ArrayList<Seller> sellerList = ReadData.readSeller();
                    
                    boolean check2 = false;
                    for(int i = 0; i<sellerList.size(); i++)
                    {
                        if(((sellerList.get(i).getName().equalsIgnoreCase(name)) &&
                            (sellerList.get(i).getIndustryName().equalsIgnoreCase(companyName))))
                        {
                            check2 = true;
                            break;
                        }
                    }
                    if(!((check) || (check2)))
                    {
                        Address address = new Address(address1, city);

                        Seller seller = new Seller(name, phone, cnic, companyName, address, ID);
                        
                        ObjectOutputStream output = null;

                        try
                        {

                            sellerList.add(seller);

                            output = new ObjectOutputStream(new FileOutputStream("src/files/Seller.ser"));

                            for(int j = 0; j < sellerList.size(); j++)
                            {
                                output.writeObject(sellerList.get(j));
                            }

                            output.close();
                        }
                        catch(IOException a)
                        {
                            JOptionPane.showMessageDialog(null, "Error in file writing.");
                        }
                        finally
                        {
                            JOptionPane.showMessageDialog(null, "Seller's Form Submitted Successfully.");

                            id.setText(" Seller's ID:   " + (ID+1));
                            t1.setText(""); //name
                            t2.setText(""); //phone no
                            t3.setText(""); //cnic
                            t4.setText(""); //company name
                            t5.setText(""); //address
                            t6.setText(""); //city
                        }
                    }
                    else if(check2)
                    {
                        JOptionPane.showMessageDialog(null, "Data Already Exists.");
                        t1.setText(""); //name
                        t2.setText(""); //phone no
                        t3.setText(""); //cnic
                        t4.setText(""); //company name
                        t5.setText(""); //address
                        t6.setText(""); //city
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "A field is empty.");
                }
            }
            else if(e.getActionCommand().equals("Clear"))
            {
                t1.setText(""); //name
                t2.setText(""); //phone no
                t3.setText(""); //cnic
                t4.setText(""); //company name
                t5.setText(""); //address
                t6.setText(""); //city

            }
            else if(e.getActionCommand().equals("Back"))
            {
                diposeaddSellerFrame();
                SellerMainGUI cg = new SellerMainGUI();
            }
        }
    }
}
