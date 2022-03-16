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


public class editManagerGUI extends JFrame
{
    JTextField t1,t2,t3,t4,t5,t6,t7,t8;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,background,title;
    JButton b1,b2,b3,b4;
    JPanel p1,p2;
    int check;
    
    /*public static void main(String[] args) 
    {
        editManagerGUI a = new editManagerGUI();
        //String name, String phone, String cnic, String gender, Address address, String des, String password
    }*/
    public editManagerGUI()
    {
        super("Edit Manager");
        setSize(900, 600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ImageIcon img = new ImageIcon("src/images/pattern.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 900, 600);
        
        Font f1 = new Font("Bauhaus 93", Font.PLAIN, 50);
        title = new JLabel("Edit Manager:");
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
        
        t1.setBounds(480, 90, 330, 30);
        t2.setBounds(480, 130, 330, 30);
        t3.setBounds(480, 240, 330, 30);
        t4.setBounds(480, 280, 330, 30);
        t5.setBounds(480, 320, 330, 30);
        t6.setBounds(480, 360, 330, 30);
        t7.setBounds(480, 400, 330, 30);
        t8.setBounds(480, 440, 330, 30);
        
        l1.setBounds(110, 90, 330, 30);
        l2.setBounds(110, 130, 330, 30);
        l3.setBounds(110, 240, 330, 30);
        l4.setBounds(110, 280, 330, 30);
        l5.setBounds(110, 320, 330, 30);
        l6.setBounds(110, 360, 330, 30);
        l7.setBounds(110, 400, 330, 30);
        l8.setBounds(110, 440, 330, 30);
        
        b1 = new JButton("Search");
        b1.setBounds(300, 182, 330, 35);
        b2 = new JButton("Clear");
        b2.setBounds(375, 510, 150, 35);
        b3 = new JButton("Update");
        b3.setBounds(185, 510, 150, 35);
        b4 = new JButton("Back");
        b4.setBounds(565, 510, 150, 35);
        
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
        
        addManagerListener a1 = new addManagerListener();
        b1.addActionListener(a1);
        b2.addActionListener(a1);
        b3.addActionListener(a1);
        b4.addActionListener(a1);
        
    }
    
    public void diposedeleteManager()
    {
        this.dispose();
    }
    
    public class addManagerListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {   
            ObjectOutputStream output = null;
            
            if(e.getActionCommand().equals("Search"))
            {
                int t = 0;
                boolean check1 = false;
                
                ArrayList<Admin> adminList = ReadData.readAdmin();
                if(adminList.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Data not found.");
                }
                else if(!((t1.getText().isEmpty()) || (t2.getText().isEmpty())))
                {
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
                    
                    if(!check1)
                    {
                        for(int j = 0; j<adminList.size(); j++)
                        {
                            if(t == (adminList.get(j).getID()) && (t2.getText().equalsIgnoreCase(adminList.get(j).getName())))
                            {
                                t1.setEditable(false);
                                t2.setEditable(false);
                                t3.setText(adminList.get(j).getPhone()); //phone no
                                t4.setText(adminList.get(j).getCnic()); //cnic
                                t5.setText(adminList.get(j).getGender()); //gender
                                t6.setText(adminList.get(j).getDes()); //designation
                                t7.setText(adminList.get(j).getAddress().getFull_address()); //address
                                t8.setText(adminList.get(j).getAddress().getCity()); //city

                                check = j;
                                break;
                            }
                            else if(j == adminList.size()-1)
                            {
                                JOptionPane.showMessageDialog(null, "Data not found.");
                            }
                        }
                    }
                }
                else if(!check1)
                {
                    JOptionPane.showMessageDialog(null, "ID or Name field is empty.");
                }   
            }
            else if(e.getActionCommand().equals("Update"))
            {
                try
                {
                    ArrayList<Admin> adminList = ReadData.readAdmin();
                    if(!((t1.getText().isEmpty()) || (t2.getText().isEmpty()) || (t3.getText().isEmpty()) || (t4.getText().isEmpty())
                        || (t5.getText().isEmpty()) || (t6.getText().isEmpty()) || (t7.getText().isEmpty()) || (t8.getText().isEmpty())))
                    {
                        int a1 = Integer.parseInt(t1.getText()); //id
                        String a2 = t2.getText(); //name
                        String a3 = t3.getText(); //phone
                        String a4 = t4.getText(); //cnic
                        String a5 = t5.getText(); //gender
                        String a6 = t6.getText(); //designation
                        String a7 = t7.getText(); //address
                        String a8 = t8.getText(); //city
                        String a9 = adminList.get(check).getPassword(); //password

                        adminList.remove(check);

                        Address address = new Address(a7, a8);
                        Admin update = new Admin(a1, a2, a3, a4, a5,address, a6, a9);

                        adminList.add(check, update);

                        output = new ObjectOutputStream(new FileOutputStream("src/files/AdminLoginDetailes.ser"));

                        for(int i = 0; i < adminList.size(); i++)
                        {
                            output.writeObject(adminList.get(i));
                        }

                        output.close();
                        JOptionPane.showMessageDialog(null, "Data Updated Successfully.");
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
                
                /*t1.setText(""); //manager id
                t2.setText(""); //name
                t3.setText(""); //phone no
                t4.setText(""); //cnic
                t5.setText(""); //gender
                t6.setText(""); //designation
                t7.setText(""); //address
                t8.setText(""); //city*/
            }
            
            else if(e.getActionCommand().equals("Clear"))
            {
                t1.setEditable(true);
                t2.setEditable(true);
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
                diposedeleteManager();
                MainGUI mg = new MainGUI();
            }
            
        }
    }
    
}