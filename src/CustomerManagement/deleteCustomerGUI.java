/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerManagement;

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
class deleteCustomerGUI extends JFrame
{
    JTextField id,t1,t2,t3,t4,t5,t6,t7;
    JLabel l1,l2,l3,l4,l5,l6,l7,title,background;
    JButton b1,b2,b3,b4;
    JPanel p1;
    int check;
    
    /*public static void main(String[] args) 
    {
        deleteCustomerGUI a = new deleteCustomerGUI();
        //String name, String phone, String cnic, String gender, Address address, String des, String password
    }*/
    public deleteCustomerGUI()
    {
        super("Delete Customer");
        setSize(1000, 700);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ImageIcon img = new ImageIcon("src/images/background1.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 1000, 700);
        
        Font f1 = new Font("Bauhaus 93", Font.PLAIN, 50);
        title = new JLabel("Delete Customer:");
        title.setFont(f1);
        title.setForeground(Color.decode("#ECECEC"));
        title.setBounds(110, 35, 700, 100);
        
        t1 = new JTextField(20);
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
        
        t3.setEditable(false);
        t4.setEditable(false);
        t5.setEditable(false);
        t6.setEditable(false);
        t7.setEditable(false);
        
        t1.setBounds(485, 125, 370, 40);
        t2.setBounds(485, 175, 370, 40);
        t3.setBounds(485, 280, 370, 40);
        t4.setBounds(485, 335, 370, 40);
        t5.setBounds(485, 390, 370, 40);
        t6.setBounds(485, 445, 370, 40);
        t7.setBounds(485, 500, 370, 40);
        
        Font f = new Font("Serif", Font.BOLD, 30); //font style and size for labels
        Color color1 = new Color(236,236,236); //RGB color code
        
        l1 = new JLabel("Customer's ID");
        l2 = new JLabel("Customer's Name");
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
        
        b1 = new JButton("Delete");
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
        
        deleteCustomerListener a1 = new deleteCustomerListener();
        b1.addActionListener(a1);
        b2.addActionListener(a1);
        b3.addActionListener(a1);
        b4.addActionListener(a1);
    }
    
    public void diposedeleteCustomerFrame()
    {
        this.dispose();
    }
    
    public class deleteCustomerListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {   
            ObjectOutputStream output = null;
            if(e.getActionCommand().equals("Search"))
            {   
                ArrayList<Customer> customerList = ReadData.readCustomer();
                
                if(customerList.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Data not found.");
                }
                
                boolean check1 = false;
                int a = 0;
                try
                {
                    a = Integer.parseInt(t1.getText());
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(null, "An integer is required.");
                    t1.setText("");
                    check1 = true;
                }
                
                if(!((t1.getText().isEmpty()) || (t2.getText().isEmpty()) || (check1)))
                {
                    int t = Integer.parseInt(t1.getText());
                    for(int j = 0; j<customerList.size(); j++)
                    {
                        if(t == (customerList.get(j).getCustomerID()) && (t2.getText().equalsIgnoreCase(customerList.get(j).getName())))
                        {
                            t2.setText(customerList.get(j).getName()); //name
                            t3.setText(customerList.get(j).getPhone()); //phone no
                            t4.setText(customerList.get(j).getCnic()); //cnic
                            t5.setText(customerList.get(j).getIndustryName()); //company name
                            t6.setText(customerList.get(j).getAddress().getFull_address()); //address
                            t7.setText(customerList.get(j).getAddress().getCity()); //city
                            
                            check = j;
                            break;
                        }
                        else if(j == customerList.size()-1)
                        {
                            JOptionPane.showMessageDialog(null, "Data not found.");
                        }
                    }
                }    
            }
            else if(e.getActionCommand().equals("Delete"))
            {
                ArrayList<Customer> customerList = ReadData.readCustomer();
                
                try
                {
                    customerList.remove(customerList.get(check));
                    
                    output = new ObjectOutputStream(new FileOutputStream("src/files/Customer.ser"));
                    for(int i = 0; i < customerList.size(); i++)
                    {
                        output.writeObject(customerList.get(i));
                    }

                    output.close();
                    
                    JOptionPane.showMessageDialog(null, "Customer's data deleted successfully.");
                
                    t1.setText(""); //customer id
                    t2.setText(""); //name
                    t3.setText(""); //phone no
                    t4.setText(""); //cnic
                    t5.setText(""); //company name
                    t6.setText(""); //address
                    t7.setText(""); //city
                }
                catch(IOException a)
                {
                    JOptionPane.showMessageDialog(null, "Error in Writing.");
                }
                
            }
            else if(e.getActionCommand().equals("Clear"))
            {
                t1.setText(""); //customer id
                t2.setText(""); //name
                t3.setText(""); //phone no
                t4.setText(""); //cnic
                t5.setText(""); //company name
                t6.setText(""); //address
                t7.setText(""); //city

            }
            else if(e.getActionCommand().equals("Back"))
            {
                diposedeleteCustomerFrame();
                CustomerMainGUI cg = new CustomerMainGUI();
            }
        }
    }
}