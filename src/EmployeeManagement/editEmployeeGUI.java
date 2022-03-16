/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeManagement;

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
class editEmployeeGUI extends JFrame
{
    JTextField id,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,title,background;
    JButton b1,b2,b3,b4;
    JPanel p1;
    int check;
    
    /*public static void main(String[] args) 
    {
        editEmployeeGUI a = new editEmployeeGUI();
        //String name, String phone, String cnic, String gender, Address address, String des, String password
    }*/
    public editEmployeeGUI()
    {
        super("Edit Employee");
        setSize(1000, 700);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ImageIcon img = new ImageIcon("src/images/background1.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 1000, 700);
        
        Font f1 = new Font("Bauhaus 93", Font.PLAIN, 50);
        title = new JLabel("Edit Employee:");
        title.setFont(f1);
        title.setForeground(Color.decode("#ECECEC"));
        title.setBounds(110, 35, 700, 100);
        
        t1 = new JTextField(20); //id
        t2 = new JTextField(20); //name
        t3 = new JTextField(11); //phone no
        t4 = new JTextField(13); //cnic
        t5 = new JTextField(30); //des
        t6 = new JTextField(30); //date of hire
        t7 = new JTextField(30); //employee type
        t8 = new JTextField(15); //salary
        t9 = new JTextField(15); //address
        t10 = new JTextField(15); //city
        
        Font f2 = new Font("Arial", Font.PLAIN, 20); // font style and size for text fields
        t1.setFont(f2);
        t2.setFont(f2);
        t3.setFont(f2);
        t4.setFont(f2);
        t5.setFont(f2);
        t6.setFont(f2);
        t7.setFont(f2);
        t8.setFont(f2);
        t9.setFont(f2);
        t10.setFont(f2);
        
        t6.setEditable(false);
        
        t1.setBounds(485, 125, 370, 30);
        t2.setBounds(485, 165, 370, 30);
        t3.setBounds(485, 260, 370, 30);
        t4.setBounds(485, 305, 370, 30);
        t5.setBounds(485, 350, 370, 30);
        t6.setBounds(485, 395, 370, 30);
        t7.setBounds(485, 440, 370, 30);
        t8.setBounds(485, 485, 370, 30);
        t9.setBounds(485, 530, 370, 30);
        t10.setBounds(485, 575, 370, 30);
        
        Font f = new Font("Serif", Font.BOLD, 25); //font style and size for labels
        Color color1 = new Color(236,236,236); //RGB color code
        
        l1 = new JLabel("Employee's ID");
        l2 = new JLabel("Employee's Name");
        l3 = new JLabel("Phone No.");
        l4 = new JLabel("CNIC No.");
        l5 = new JLabel("Designation");
        l6 = new JLabel("Date of Hire");
        l7 = new JLabel("Employee Type");
        l8 = new JLabel("Salary");
        l9 = new JLabel("Address");
        l10 = new JLabel("City");
        
        l1.setBounds(150, 125, 330, 30);
        l2.setBounds(150, 165, 330, 30);
        l3.setBounds(150, 260, 330, 30);
        l4.setBounds(150, 305, 330, 30);
        l5.setBounds(150, 350, 330, 30);
        l6.setBounds(150, 395, 330, 30);
        l7.setBounds(150, 440, 330, 30);
        l8.setBounds(150, 485, 330, 30);
        l9.setBounds(150, 530, 330, 30);
        l10.setBounds(150, 575, 330, 30);
        
        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);
        l5.setFont(f);
        l6.setFont(f);
        l7.setFont(f);
        l8.setFont(f);
        l9.setFont(f);
        l10.setFont(f);

        l1.setForeground(color1);
        l2.setForeground(color1);
        l3.setForeground(color1);
        l4.setForeground(color1);
        l5.setForeground(color1);
        l6.setForeground(color1);
        l7.setForeground(color1);
        l8.setForeground(color1);
        l9.setForeground(color1);
        l10.setForeground(color1);
        
        b1 = new JButton("Update");
        b1.setBounds(235, 620, 150, 30);
        b2 = new JButton("Clear");
        b2.setBounds(425, 620, 150, 30);
        b3 = new JButton("Back");
        b3.setBounds(615, 620, 150, 30);
        b4 = new JButton("Search");
        b4.setBounds(375, 213, 250, 30);

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
        p1.add(t10);
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(l7);
        p1.add(l8);
        p1.add(l9);
        p1.add(l10);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(background);
        
        add(p1);
        
        setVisible(true);
        
        editEmployeeListener a1 = new editEmployeeListener();
        b1.addActionListener(a1);
        b2.addActionListener(a1);
        b3.addActionListener(a1);
        b4.addActionListener(a1);
    }
    
    public void diposeeditEmployeeFrame()
    {
        this.dispose();
    }
    
    public class editEmployeeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {   
            ArrayList<Employee> employeeList = ReadData.readEmployee();
            ObjectOutputStream output = null;
            if(e.getActionCommand().equals("Search"))
            {   
                int t = 0;
                boolean check1 = false;
                
                
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

                                t2.setText(employeeList.get(j).getName()); //name
                                t3.setText(employeeList.get(j).getPhone()); //phone no
                                t4.setText(employeeList.get(j).getCnic()); //cnic
                                t5.setText(employeeList.get(j).getDes()); //des
                                t6.setText(employeeList.get(j).getDate_of_hire().showDate()); //date of hire
                                t7.setText(employeeList.get(j).getType()); //employee tupe
                                t8.setText(Double.toString(employeeList.get(j).getEarning())); //salary
                                t9.setText(employeeList.get(j).getAddress().getFull_address()); //address
                                t10.setText(employeeList.get(j).getAddress().getCity()); //city

                                check = j;
                                break;
                            }
                            else if(j == employeeList.size()-1)
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
                    if(!((t1.getText().isEmpty()) || (t2.getText().isEmpty()) || (t3.getText().isEmpty()) || (t4.getText().isEmpty())
                        || (t5.getText().isEmpty()) || (t6.getText().isEmpty()) || (t7.getText().isEmpty()) || (t8.getText().isEmpty())
                            || (t9.getText().isEmpty()) || (t10.getText().isEmpty())))
                    {
                        int a1 = Integer.parseInt(t1.getText()); //id
                        String a2 = t2.getText(); //name
                        String a3 = t3.getText(); //phone
                        String a4 = t4.getText(); //cnic
                        String a5 = t5.getText(); //des
                        String a6 = t6.getText(); //DATE OF HIRE
                        String a7 = t7.getText(); //employee type
                        String a8 = t8.getText(); //salary
                        String a9 = t9.getText(); //address
                        String a10 = t10.getText(); //city
                        String gender = employeeList.get(check).getGender();
                        int day = employeeList.get(check).getDate_of_hire().getDay();
                        int month = employeeList.get(check).getDate_of_hire().getMonth();
                        int year = employeeList.get(check).getDate_of_hire().getYear();
                        
                        boolean check1 = false;
                        double salary = 0.0;
                        try
                        {
                            salary = Double.parseDouble(a8);
                        }catch(NumberFormatException ex)
                        {
                            JOptionPane.showMessageDialog(null, "An integer is required for salary.");
                            check1 = true;
                        }
                        if(!check1)
                        {
                            employeeList.remove(check);
                            //String name, String phone, String cnic, String gender,String des, Address address, Date1 date, double basic_salary, int ID
                            Address address = new Address(a9, a10);
                            Date1 date = new Date1(day, month, year);
                            Employee update = null;

                            if(a7.equals("Monthly Salaried"))
                            {
                                update = new MonthlySalariedEmployee(a2, a3, a4, gender, a5, address, date, salary, a1);
                            }
                            else if(a7.equals("Per Day Salaried"))
                            {
                                update = new PerDaySalariedEmployee(a2, a3, a4, gender, a5, address, date, salary, a1);
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Employe Type invalid 'Monthly Salaried or Per Day Salaried' required.");
                                t7.setText("");
                                check1 = true;
                            }

                            if(!check1)
                            {
                                employeeList.add(check, update);

                                output = new ObjectOutputStream(new FileOutputStream("src/files/Employee.ser"));
                                for(int i = 0; i < employeeList.size(); i++)
                                {
                                    output.writeObject(employeeList.get(i));
                                }

                                output.close();
                                
                                JOptionPane.showMessageDialog(null, "Employee's data updated successfully.");
                                t1.setEditable(true);
                                t2.setEditable(true);

                                t1.setText(""); //customer id
                                t2.setText(""); //name
                                t3.setText(""); //phone no
                                t4.setText(""); //cnic
                                t5.setText(""); //des
                                t6.setText(""); //date of hire
                                t7.setText(""); //employee type
                                t8.setText(""); //salary
                                t9.setText(""); //address
                                t10.setText(""); //city
                            }
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
                t2.setEditable(true);
                
                t1.setText(""); //customer id
                t2.setText(""); //name
                t3.setText(""); //phone no
                t4.setText(""); //cnic
                t5.setText(""); //des
                t6.setText(""); //date of hire
                t7.setText(""); //employee type
                t8.setText(""); //salary
                t9.setText(""); //address
                t10.setText(""); //city
            }
            else if(e.getActionCommand().equals("Back"))
            {
                diposeeditEmployeeFrame();
                EmployeeMainGUI cg = new EmployeeMainGUI();
            }
        }
    }
}