/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Exceptions.CNICException;
import Exceptions.PhoneNoException;
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
public class addManagerGUI extends JFrame
{
    JTextField id,t1,t2,t3,t4,t5,t6,t7;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,title,background;
    JPasswordField pw1,pw2;
    JButton b1,b2,b3,b4;
    JRadioButton rb1,rb2,rb3;
    JPanel p1,p2;
    ButtonGroup radiogroup;
    int ID;
    
    /*public static void main(String[] args) 
    {
        addManagerGUI a = new addManagerGUI();
        //String name, String phone, String cnic, String gender, Address address, String des, String password
    }*/
    public addManagerGUI()
    {
        super("New Manager Form");
        setSize(900, 600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ImageIcon img = new ImageIcon("src/images/pattern.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 900, 600);
        
        Font f1 = new Font("Bauhaus 93", Font.PLAIN, 50);
        title = new JLabel("Manager Form:");
        title.setFont(f1);
        title.setBounds(70, 5, 700, 100);
        
        ArrayList<Admin> adminList = ReadData.readAdmin();
        if(adminList != null)
        {
            //ID = (adminList.get(adminList.size()).getID()) + 1;
            ID = adminList.size() + 1;
        }
        else if(adminList == null)
        {
            ID = 1;
        }
        
        id = new JTextField(" Manager's ID:   " + ID ,20);
        id.setEditable(false);
        t1 = new JTextField(20); //name
        t2 = new JTextField(11); //phone no
        t3 = new JTextField(13); //cnic
        t4 = new JTextField(30); //address
        t5 = new JTextField(15); //city
        t6 = new JTextField("Manager",15); //designationt
        t6.setEditable(false);
        pw1 = new JPasswordField(20); //password
        pw2 = new JPasswordField(20); //re password
        
        id.setBounds(575, 45, 220, 30);
        t1.setBounds(465, 115, 330, 30);
        t2.setBounds(465, 155, 330, 30);
        t3.setBounds(465, 195, 330, 30);
        t4.setBounds(465, 275, 330, 30);
        t5.setBounds(465, 315, 330, 30);
        t6.setBounds(465, 355, 330, 30);
        pw1.setBounds(465, 395, 330, 30);
        pw2.setBounds(465, 435, 330, 30);
        
        Font f = new Font("Serif", Font.BOLD, 20); //font style and size
        Color color1 = new Color(0,0,0); //RGB color code
        
        l1 = new JLabel("Name");
        l2 = new JLabel("Phone No.");
        l3 = new JLabel("CNIC No.");
        l4 = new JLabel("Gender");
        l5 = new JLabel("Address");
        l6 = new JLabel("City");
        l7 = new JLabel("Designation");
        l8 = new JLabel("Password");
        l9 = new JLabel("Re-Password");
        
        l1.setBounds(150, 115, 330, 30);
        l2.setBounds(150, 155, 330, 30);
        l3.setBounds(150, 195, 330, 30);
        l4.setBounds(150, 235, 330, 30);
        l5.setBounds(150, 275, 330, 30);
        l6.setBounds(150, 315, 330, 30);
        l7.setBounds(150, 355, 330, 30);
        l8.setBounds(150, 395, 330, 30);
        l9.setBounds(150, 435, 330, 30);
        
        id.setFont(f);
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
        
        rb1 = new JRadioButton("Male", true);
        rb2 = new JRadioButton("Female", false);
        rb3 = new JRadioButton("Other", false);
        
        radiogroup = new ButtonGroup();
        radiogroup.add(rb1);
        radiogroup.add(rb2);
        radiogroup.add(rb3);
        
        rb1.setBounds(490, 235, 80, 30);
        rb2.setBounds(590, 235, 80, 30);
        rb3.setBounds(690, 235, 80, 30);
        
        b1 = new JButton("Submit");
        b1.setBounds(185, 510, 150, 35);
        b2 = new JButton("Clear");
        b2.setBounds(375, 510, 150, 35);
        b3 = new JButton("Back");
        b3.setBounds(565, 510, 150, 35);

        p1 = new JPanel();
        p1.setLayout(null);
        
        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,0,80));
        p2.setBounds(70, 85, 760, 410);
        
        p1.add(title);
        p1.add(id);
        p1.add(t1);
        p1.add(t2);
        p1.add(t3);
        p1.add(t4);
        p1.add(t5);
        p1.add(t6);
        p1.add(pw1);
        p1.add(pw2);
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(l7);
        p1.add(l8);
        p1.add(l9);
        p1.add(rb1);
        p1.add(rb2);
        p1.add(rb3);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(p2);
        p1.add(background);
        
        add(p1);
        
        setVisible(true);
        
        addManagerListener a1 = new addManagerListener();
        b1.addActionListener(a1);
        b2.addActionListener(a1);
        b3.addActionListener(a1);
    }
    
    public void diposeaddManagerFrame()
    {
        this.dispose();
    }
    
    public class addManagerListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {   
            if(e.getActionCommand().equals("Submit"))
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
                String gender = "";
                if(rb1.isSelected())
                {
                    gender = "Male";
                }
                if(rb2.isSelected())
                {
                    gender = "Female";
                }
                if(rb3.isSelected())
                {
                    gender = "Other";
                }
                String address1 = t4.getText();
                String city = t5.getText();
                String des = t6.getText();
                String password1 = pw1.getText();
                String password2 = pw2.getText();
                
                if(!(((check) || (t1.getText().isEmpty()) || (t2.getText().isEmpty()) || (t3.getText().isEmpty()) || (t4.getText().isEmpty())
                        || (t5.getText().isEmpty()) || (t6.getText().isEmpty()) || (pw1.getText().isEmpty()) || (pw2.getText().isEmpty()))))
                {
                    if(password1.equals(password2))
                    {
                        Address address = new Address(address1, city);

                        Admin admin = new Admin(ID, name, phone, cnic, gender, address, des, password1);

                        ObjectOutputStream output = null;

                        try
                        {
                            ArrayList<Admin> adminList = ReadData.readAdmin();
                            adminList.add(admin);

                            output = new ObjectOutputStream(new FileOutputStream("src/files/AdminLoginDetailes.ser"));

                            for(int i = 0; i < adminList.size(); i++)
                            {
                                output.writeObject(adminList.get(i));
                            }

                            output.close();
                        }
                        catch(IOException a)
                        {
                            JOptionPane.showMessageDialog(null, "Error in Writing.");
                        }
                        finally
                        {
                            JOptionPane.showMessageDialog(null, "Form Submitted Successfully.");
                            
                            ID++;
                            id.setText(" Manager's ID:   " + ID);
                            t1.setText(""); //name
                            t2.setText(""); //phone no
                            t3.setText(""); //cnic
                            t4.setText(""); //address
                            t5.setText(""); //city
                            t6.setText("Manager"); //designation
                            pw1.setText(""); //password
                            pw2.setText(""); //re password
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Password do not match.");
                        pw1.setText(""); //password
                        pw2.setText(""); //re password
                    }
                }
                else if(!check)
                {
                    JOptionPane.showMessageDialog(null, "A field is empty.");
                }
            }
            else if(e.getActionCommand().equals("Clear"))
            {
                t1.setText(""); //name
                t2.setText(""); //phone no
                t3.setText(""); //cnic
                t4.setText(""); //address
                t5.setText(""); //city
                t6.setText("Manager"); //designation
                pw1.setText(""); //password
                pw2.setText(""); //re password
            }
            else if(e.getActionCommand().equals("Back"))
            {
                diposeaddManagerFrame();
                MainGUI mg = new MainGUI();
            }
            
        }
    }
}
