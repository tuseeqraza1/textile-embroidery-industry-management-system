/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SellerManagement;

import CustomerManagement.Product;
import CustomerManagement.Receive;
import Exceptions.IntegerNeededException;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import oop_project.*;

/**
 *
 * @author tusee
 */
class paymentSellerGUI extends JFrame
{
    JTextField id,t1,t2,t3,t4,t5,t8,t9,bill_ID;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,search,title,background;
    JButton b1,b2,b3,b4,b5;
    JPanel p1;
    JDateChooser date;
    JComboBox cb;
    String cName;
    double balance,t;
    int check,check2,bill_no;
    
    /*public static void main(String[] args) 
    {
        paymentSellerGUI a = new paymentSellerGUI();
        //String name, String phone, String cnic, String gender, Address address, String des, String password
    }*/
    public paymentSellerGUI()
    {
        super("Seller Payment");
        setSize(1000, 700);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ImageIcon img = new ImageIcon("src/images/background1.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 1000, 700);
        
        Font f1 = new Font("Bauhaus 93", Font.PLAIN, 50);
        title = new JLabel("Seller Payment:");
        title.setFont(f1);
        title.setForeground(Color.decode("#ECECEC"));
        title.setBounds(110, 35, 700, 100);
        
        date = new JDateChooser();
        date.setBounds(485, 315, 370, 30);
        
        Font f2 = new Font("Arial", Font.PLAIN, 20); // font style and size for text fields
        
        t1 = new JTextField(20); //id
        t2 = new JTextField(20); //company name
        t3 = new JTextField(20); //balance
        t4 = new JTextField(30); //amount
        t5 = new JTextField(30); //new balance
        
        t3.setEditable(false);
        t5.setEditable(false);
        
        t1.setFont(f2);
        t2.setFont(f2);
        t3.setFont(f2);
        date.setFont(f2);
        t4.setFont(f2);
        t5.setFont(f2);
        
        t1.setBounds(315, 125, 370, 30);
        t2.setBounds(485, 195, 370, 30);
        t3.setBounds(485, 255, 370, 30);
        //t5.setBounds(485, 275, 370, 30);
        t4.setBounds(485, 375, 200, 30);
        t5.setBounds(485, 435, 370, 30);
        
        
        Font f = new Font("Serif", Font.BOLD, 25); //font style and size for labels
        Color color1 = new Color(236,236,236); //RGB color code
        
        l1 = new JLabel("Company's ID");
        l2 = new JLabel("Company's Name");
        l3 = new JLabel("Previeus Balance");
        l4 = new JLabel("Billing Date");
        l5 = new JLabel("Amount Given");
        l6 = new JLabel("New Balance");
        
        
        l1.setBounds(150, 125, 330, 30);
        l2.setBounds(150, 195, 330, 30);
        l3.setBounds(150, 255, 330, 30);
        l4.setBounds(150, 315, 330, 30);
        l5.setBounds(150, 375, 330, 30);
        l6.setBounds(150, 435, 330, 30);
        
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
        
        b1 = new JButton("Add");
        b1.setBounds(235, 550, 150, 30);
        b2 = new JButton("Clear");
        b2.setBounds(425, 550, 150, 30);
        b3 = new JButton("Back");
        b3.setBounds(615, 550, 150, 30);
        b4 = new JButton("Search");
        b4.setBounds(705, 125, 150, 30);
        b5 = new JButton("Calculate");
        b5.setBounds(705, 375, 150, 30);

        p1 = new JPanel();
        p1.setLayout(null);
        
        p1.add(title);
        p1.add(t1);
        p1.add(t2);
        p1.add(t3);
        p1.add(date);
        p1.add(t4);
        p1.add(t5);
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(background);
        
        add(p1);
        
        setVisible(true);
        
        paymentCustomerListener a1 = new paymentCustomerListener();
        b1.addActionListener(a1);
        b2.addActionListener(a1);
        b3.addActionListener(a1);
        b4.addActionListener(a1);
        b5.addActionListener(a1);
    }
    public class paymentCustomerListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {   
            ArrayList<Product> p = ReadData.readRaw();
            ArrayList<Seller> sellerList = ReadData.readSeller();
            
            if(e.getActionCommand().equals("Calculate"))
            {
                if(!(t3.getText().isEmpty() || t4.getText().isEmpty()))
                {
                    try
                    {
                        int q = Integer.parseInt(t4.getText());
                        t = balance - q;
                        
                        t5.setText((Double.toString(t)));
                        
                    }
                    catch(NumberFormatException ex)
                    {
                        t4.setText("");
                        JOptionPane.showMessageDialog(null, "An integer is required.");
                    }   
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Enter the Amount.");
                }
            }
            else if(e.getActionCommand().equals("Search"))
            {
                if(!(t1.getText().isEmpty()))
                {   
                    if(sellerList.isEmpty())
                    {
                        JOptionPane.showMessageDialog(null, "Data not found.");
                    }
                    
                    for(int j = 0; j<sellerList.size(); j++)
                    {
                        String textID = Integer.toString(sellerList.get(j).getSellerID());
                        
                        if((t1.getText().equals(textID)))
                        {
                            check = j; //index of customer.
                            cName = sellerList.get(j).getIndustryName();
                            balance = (sellerList.get(j).totalBillsAmount() - sellerList.get(j).totalPaymentsAmount());
                            String B = Double.toString(balance);
                            
                            t2.setText(cName);
                            t3.setText(B);
                            break;
                        }
                        if(j == sellerList.size()-1)
                        {
                            JOptionPane.showMessageDialog(null, "Data not found.");
                            
                            t1.setText(""); //id
                            t2.setText(""); //company name
                            t3.setText(""); //balance
                            t4.setText(""); //amount
                            t5.setText(""); //new balance

                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "The Search field is empty.");
                }
            }
            else if(e.getActionCommand().equals("Add"))
            {   
                if(!((t1.getText().isEmpty()) || (t2.getText().isEmpty()) || (t3.getText().isEmpty())
                        || (t4.getText().isEmpty()) || (t5.getText().isEmpty())))
                {
                    boolean check1 = false;
                    int amount = 0;
                    
                    try
                    {
                        amount = Integer.parseInt(t4.getText());
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "An Integer is required.");
                        t4.setText("");
                        check1 = true;
                    }
                    
                    int day = date.getDate().getDay();
                    int month = date.getDate().getMonth();
                    int year = date.getDate().getYear();
                    
                    if(!check1)
                    {
                        Date1 d = new Date1(day, month, year);
                        Receive r = new Receive(d, amount);

                        ObjectOutputStream output = null;

                        try
                        {
                            sellerList.get(check).setPayment(r);

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
                            JOptionPane.showMessageDialog(null, "Payment Made Successfully.");

                            t1.setText(""); //id
                            t2.setText(""); //company name
                            t3.setText(""); //balance
                            t4.setText(""); //amount
                            t5.setText(""); //new balance

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
                t1.setText(""); //id
                t2.setText(""); //company name
                t3.setText(""); //balance
                t4.setText(""); //amount
                t5.setText(""); //new balance
                
                
            }
            else if(e.getActionCommand().equals("Back"))
            {
                diposepaymentSellerFrame();
                SellerMainGUI cg = new SellerMainGUI();
            }
        }
    }
    public void diposepaymentSellerFrame()
    {
        this.dispose();
    }
}
