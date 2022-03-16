/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SellerManagement;

import Exceptions.DataNotFoundException;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import oop_project.ReadData;
/**
 *
 * @author tusee
 */
class searchSellerGUI extends JFrame
{
    JTextField id,t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,title,background;
    JButton b1,b2,b3,b4;
    JPanel p1;
    
    /*public static void main(String[] args) 
    {
        searchSellerGUI a = new searchSellerGUI();
        //String name, String phone, String cnic, String gender, Address address, String des, String password
    }*/
    
    public searchSellerGUI()
    {
        super("Search Seller");
        setSize(1000, 700);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ImageIcon img = new ImageIcon("src/images/background1.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 1000, 700);
        
        Font f1 = new Font("Bauhaus 93", Font.PLAIN, 50);
        title = new JLabel("Search Seller:");
        title.setFont(f1);
        title.setForeground(Color.decode("#ECECEC"));
        title.setBounds(110, 35, 700, 100);
        
        t1 = new JTextField(20); //id
        Font f2 = new Font("Arial", Font.PLAIN, 20); // font style and size for text fields
        
        t2 = new JTextField(20); //id
        t3 = new JTextField(20); //name
        t4 = new JTextField(11); //phone no
        t5 = new JTextField(13); //cnic
        t6 = new JTextField(30); //company name
        t7 = new JTextField(15); //address
        t8 = new JTextField(15); //city
        t9 = new JTextField(15); //city
        
        t1.setFont(f2);
        t2.setFont(f2);
        t3.setFont(f2);
        t4.setFont(f2);
        t5.setFont(f2);
        t6.setFont(f2);
        t7.setFont(f2);
        t8.setFont(f2);
        t9.setFont(f2);
        
        t1.setBounds(315, 125, 370, 30);
        t2.setBounds(485, 175, 370, 30);
        t3.setBounds(485, 225, 370, 30);
        t4.setBounds(485, 275, 370, 30);
        t5.setBounds(485, 325, 370, 30);
        t6.setBounds(485, 375, 370, 30);
        t7.setBounds(485, 425, 370, 30);
        t8.setBounds(485, 475, 370, 30);
        t9.setBounds(485, 525, 370, 30);
        
        Font f = new Font("Serif", Font.BOLD, 25); //font style and size for labels
        Color color1 = new Color(236,236,236); //RGB color code
        
        l1 = new JLabel("ID/Name etc.");
        l1.setBounds(150, 125, 330, 30);
        
        l2 = new JLabel("Seller's ID");
        l3 = new JLabel("Seller's Name");
        l4 = new JLabel("Phone No.");
        l5 = new JLabel("CNIC No.");
        l6 = new JLabel("Company Name");
        l7 = new JLabel("Address");
        l8 = new JLabel("City");
        l9 = new JLabel("Balance");
        
        l2.setBounds(150, 175, 330, 30);
        l3.setBounds(150, 225, 330, 30);
        l4.setBounds(150, 275, 330, 30);
        l5.setBounds(150, 325, 330, 30);
        l6.setBounds(150, 375, 330, 30);
        l7.setBounds(150, 425, 330, 30);
        l8.setBounds(150, 475, 330, 30);
        l9.setBounds(150, 525, 330, 30);
        
        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);
        l5.setFont(f);
        l6.setFont(f);
        l7.setFont(f);
        l8.setFont(f);
        l9.setFont(f);

        l1.setForeground(color1);
        l2.setForeground(color1);
        l3.setForeground(color1);
        l4.setForeground(color1);
        l5.setForeground(color1);
        l6.setForeground(color1);
        l7.setForeground(color1);
        l8.setForeground(color1);
        l9.setForeground(color1);
        
        b1 = new JButton("Search");
        b1.setBounds(705, 125, 150, 30);
        b2 = new JButton("Clear");
        b2.setBounds(325, 575, 150, 30);
        b3 = new JButton("Back");
        b3.setBounds(510, 575, 150, 30);
        
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
        p1.add(t8);
        p1.add(t9);
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(l7);
        p1.add(l8);
        p1.add(l9);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(background);
        
        add(p1);
        
        setVisible(true);
        
        searchSellerListener a1 = new searchSellerListener();
        b1.addActionListener(a1);
        b2.addActionListener(a1);
        b3.addActionListener(a1);
    }
    
    public void diposesearchSellerFrame()
    {
        this.dispose();
    }
    
    public class searchSellerListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getActionCommand().equals("Search"))
            { 
                if(!(t1.getText().isEmpty()))
                {
                    boolean check = true;
                    ArrayList<Seller> SellerList = ReadData.readSeller();
                    try
                    {
                        if(SellerList.isEmpty())
                            throw new DataNotFoundException();
                    }
                    catch(DataNotFoundException ex)
                    {
                        JOptionPane.showMessageDialog(null, "Data not found.");
                        check = false;
                    }
                    if(check)
                    {
                        for(int j = 0; j<SellerList.size(); j++)
                        {
                            String textID = Integer.toString(SellerList.get(j).getSellerID());
                            if((t1.getText().equalsIgnoreCase(textID)) || (t1.getText().equalsIgnoreCase(SellerList.get(j).getName())) || (t1.getText().equalsIgnoreCase(SellerList.get(j).getPhone()))
                                    || (t1.getText().equalsIgnoreCase(SellerList.get(j).getCnic())) || (t1.getText().equalsIgnoreCase(SellerList.get(j).getIndustryName())))
                            {
                                String a = textID;
                                t2.setText(a);
                                t3.setText(SellerList.get(j).getName());
                                t4.setText(SellerList.get(j).getPhone()); //phone no
                                t5.setText(SellerList.get(j).getCnic()); //cnic
                                t6.setText(SellerList.get(j).getIndustryName()); //company name
                                t7.setText(SellerList.get(j).getAddress().getFull_address()); //address
                                t8.setText(SellerList.get(j).getAddress().getCity()); //city
                                String b = "0";
                                try
                                {
                                    b = Double.toString((SellerList.get(j).totalBillsAmount()) - (SellerList.get(j).totalPaymentsAmount()));
                                }
                                catch(Exception ex)
                                {}
                                t9.setText(b); //balance

                                break;
                            }
                            else if(j == SellerList.size()-1)
                            {
                                JOptionPane.showMessageDialog(null, "Data not found.");
                                t1.setText(""); //search
                                t2.setText(""); //id
                                t3.setText(""); //name
                                t4.setText(""); //phone
                                t5.setText(""); //cnic
                                t6.setText(""); //company name
                                t7.setText(""); //address
                                t8.setText(""); //city
                                t9.setText(""); //balance
                            }
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Fields are empty.");
                }
            }
            
            else if(e.getActionCommand().equals("Clear"))
            { 
                t1.setText(""); //search
                t2.setText(""); //id
                t3.setText(""); //name
                t4.setText(""); //phone
                t5.setText(""); //cnic
                t6.setText(""); //company name
                t7.setText(""); //address
                t8.setText(""); //city
                t9.setText(""); //balance
            }
            else if(e.getActionCommand().equals("Back"))
            { 
                diposesearchSellerFrame();
                SellerMainGUI cg = new SellerMainGUI();
            }
        }
        
    }
}
