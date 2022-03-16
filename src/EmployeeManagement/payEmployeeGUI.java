/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeManagement;

import java.awt.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.*;
import oop_project.ReadData;
/**
 *
 * @author tusee
 */
class payEmployeeGUI extends JFrame
{
    JTextField id,t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,title,background;
    JButton b1,b2,b3,b4,b5;
    JPanel p1;
    int check;
    boolean check1 = false;
    double total,adv,remaining,perDay;
    
    /*public static void main(String[] args) 
    {
        payEmployeeGUI a = new payEmployeeGUI();
    }*/
    
    public payEmployeeGUI()
    {
        super("Employee Pay");
        setSize(1000, 700);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ImageIcon img = new ImageIcon("src/images/background1.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 1000, 700);
        
        Font f1 = new Font("Bauhaus 93", Font.PLAIN, 50);
        title = new JLabel("Employee Pay:");
        title.setFont(f1);
        title.setForeground(Color.decode("#ECECEC"));
        title.setBounds(110, 35, 700, 100);
        
        Font f2 = new Font("Arial", Font.PLAIN, 20); // font style and size for text fields
        
        t1 = new JTextField(20); //id
        t2 = new JTextField(20); //name
        t3 = new JTextField(20); //employee type
        t4 = new JTextField(11); //salary
        t5 = new JTextField(13); //advance
        t6 = new JTextField(13); //working days
        t7 = new JTextField(13); //total salary
        
        t1.setFont(f2);
        t2.setFont(f2);
        t3.setFont(f2);
        t4.setFont(f2);
        t5.setFont(f2);
        t6.setFont(f2);
        t7.setFont(f2);
        
        t1.setBounds(485, 125, 370, 30);
        t2.setBounds(485, 175, 370, 30);
        t3.setBounds(485, 275, 370, 30);
        t4.setBounds(485, 325, 370, 30);
        t5.setBounds(485, 375, 370, 30);
        t6.setBounds(485, 425, 370, 30);
        t7.setBounds(485, 525, 370, 30);
        
        t5.setEditable(false);
        t6.setEditable(false);
        t7.setEditable(false);
        
        Font f = new Font("Serif", Font.BOLD, 25); //font style and size for labels
        Color color1 = new Color(236,236,236); //RGB color code
        
        l1 = new JLabel("Employee's ID");
        l2 = new JLabel("Employee's Name");
        l3 = new JLabel("Employee Type");
        l4 = new JLabel("Salary");
        l5 = new JLabel("Advance");
        l6 = new JLabel("Working Days*");
        l7 = new JLabel("Total Remaining Salary");
        
        l1.setBounds(150, 125, 330, 30);
        l2.setBounds(150, 175, 330, 30);
        l3.setBounds(150, 275, 330, 30);
        l4.setBounds(150, 325, 330, 30);
        l5.setBounds(150, 375, 330, 30);
        l6.setBounds(150, 425, 330, 30);
        l7.setBounds(150, 525, 330, 30);
        
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
        
        b1 = new JButton("Search");
        b1.setBounds(400, 225, 200, 30);
        b2 = new JButton("Pay");
        b2.setBounds(225, 575, 150, 30);
        b3 = new JButton("Clear");
        b3.setBounds(425, 575, 150, 30);
        b4 = new JButton("Back");
        b4.setBounds(625, 575, 150, 30);
        b5 = new JButton("Calculate");
        b5.setBounds(400, 475, 200, 30);
        
        p1 = new JPanel();
        p1.setLayout(null);
        
        p1.add(title);
        p1.add(t1);
        p1.add(t2);
        p1.add(t3);
        p1.add(t4);
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(t5);
        p1.add(t6);
        p1.add(t7);
        p1.add(l5);
        p1.add(l6);
        p1.add(l7);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(background);
        
        add(p1);
        
        setVisible(true);
        
        payEmployeeListener a1 = new payEmployeeListener();
        b1.addActionListener(a1);
        b2.addActionListener(a1);
        b3.addActionListener(a1);
        b4.addActionListener(a1);
        b5.addActionListener(a1);
    }
    
    public void diposepayEmployeeFrame()
    {
        this.dispose();
    }
    
    public class payEmployeeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            ArrayList<Employee> employeeList = ReadData.readEmployee();
            if(e.getActionCommand().equals("Search"))
            {   
                int t = 0;
                if(employeeList.isEmpty())
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
                        for(int j = 0; j<employeeList.size(); j++)
                        {
                            if(t == (employeeList.get(j).getID()) && (t2.getText().equalsIgnoreCase(employeeList.get(j).getName())))
                            {   
                                t1.setEditable(false);
                                t2.setEditable(false);
                                t3.setEditable(false);
                                t4.setEditable(false);

                                t2.setText(employeeList.get(j).getName()); //name
                                t3.setText(employeeList.get(j).getType()); //employeec type

                                if(t3.getText().equals("Monthly Salaried"))
                                {
                                    perDay = (employeeList.get(j).getEarning());
                                    adv = (employeeList.get(j).getAdvance());
                                    t4.setText(Double.toString(perDay)); //salary
                                    l4.setText("Monthly Salary");
                                    t5.setText(Double.toString(adv));

                                    t6.setText("1");
                                }
                                else
                                {
                                    perDay = employeeList.get(j).getEarning();
                                    t4.setText(Double.toString(perDay));
                                    l4.setText("Per Day Salary");
                                    adv = employeeList.get(j).getAdvance();
                                    t5.setText(Double.toString(adv));

                                    t5.setEditable(true);
                                    t6.setEditable(true);
                                    t7.setEditable(true);

                                    t6.setText("");
                                }

                                check = j;
                                break;
                            }
                            else if(j == employeeList.size()-1)
                            {
                                JOptionPane.showMessageDialog(null, "Data not found.");
                                t1.setEditable(true);
                                t1.setText("");
                                t2.setText("");
                            }
                        }
                    }
                }
                else if(!check1)
                {
                    JOptionPane.showMessageDialog(null, "ID or Name field is empty.");
                }
            }
            else if(e.getActionCommand().equals("Calculate"))
            {
                if(!((t1.getText().isEmpty()) || (t2.getText().isEmpty()) || (t3.getText().isEmpty()) || (t4.getText().isEmpty()) 
                        || (t5.getText().isEmpty())))
                {
                    try
                    {
                        double days = Double.parseDouble(t6.getText());
       
                        remaining = (perDay * days) - adv;

                        t7.setText(Double.toString(remaining));
                    }
                    catch(NumberFormatException ex)
                    {
                        JOptionPane.showMessageDialog(null, "An integer value is required for advance.");
                        t5.setText("");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Fields are empty.");
                }
            }
            else if(e.getActionCommand().equals("Pay"))
            {
                if(!((t1.getText().isEmpty()) || (t2.getText().isEmpty()) || (t3.getText().isEmpty()) || (t4.getText().isEmpty())
                         || (t5.getText().isEmpty()) || (t6.getText().isEmpty()) || (t7.getText().isEmpty())))
                {
                    ObjectOutputStream output = null;
                    try
                    {
                        employeeList.get(check).resetAdvance(0.0);
                        
                        output = new ObjectOutputStream(new FileOutputStream("src/files/Employee.ser"));
                        for(int i = 0; i < employeeList.size(); i++)
                        {
                            output.writeObject(employeeList.get(i));
                        }

                        output.close();

                        JOptionPane.showMessageDialog(null, "Payed successfully.");

                        t1.setEditable(true);
                        t2.setEditable(true);
                        t3.setEditable(true);
                        t4.setEditable(true);

                        t1.setText(""); //customer id
                        t2.setText(""); //name
                        t3.setText(""); //type
                        t4.setText(""); //salary
                        t5.setText(""); //advance
                        t6.setText(""); //total
                        t7.setText(""); //total
                    }
                    catch(IOException ex)
                    {
                        JOptionPane.showMessageDialog(null, "Error in file writing.");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Fields are empty.");
                }
            }
            else if(e.getActionCommand().equals("Clear"))
            {
                t1.setEditable(true);
                t2.setEditable(true);
                t3.setEditable(true);
                t4.setEditable(true);
                
                l4.setText("Salary");
                l5.setText("Advance");
                l6.setText("Working Days");
                l7.setText("Total Salary");
                
                t1.setText(""); //customer id
                t2.setText(""); //name
                t3.setText(""); //type
                t4.setText(""); //salary
                t5.setText(""); //advance
                t6.setText(""); //total
                t7.setText(""); //total
            }
            else if(e.getActionCommand().equals("Back"))
            {
                diposepayEmployeeFrame();
                EmployeeMainGUI cg = new EmployeeMainGUI();
            }
        }
    }
}
