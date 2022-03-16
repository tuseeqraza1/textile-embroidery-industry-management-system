/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeManagement;

import CustomerManagement.*;
import Exceptions.CNICException;
import Exceptions.PhoneNoException;
import com.toedter.calendar.*;
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
class addEmployeeGUI extends JFrame
{
    JTextField id,t1,t2,t3,t4,t5,t6,t7,t8,t9,l10;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l11,title,background;
    JButton b1,b2,b3;
    JPanel p1;
    JRadioButton rb1,rb2,rb3;
    ButtonGroup radiogroup;
    JDateChooser date;
    JComboBox cb;
    String gender,type;
    int ID;
    
    /*public static void main(String[] args) 
    {
        addEmployeeGUI a = new addEmployeeGUI();
        //String name, String phone, String cnic, String gender, Address address, String des, String password
    }*/
    
    public addEmployeeGUI()
    {
        super("New Employee Form");
        setSize(1000, 700);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ImageIcon img = new ImageIcon("src/images/background1.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 1000, 700);
        
        Font f1 = new Font("Bauhaus 93", Font.PLAIN, 50);
        title = new JLabel("Employee Form:");
        title.setFont(f1);
        title.setForeground(Color.decode("#ECECEC"));
        title.setBounds(110, 35, 700, 100);
        
        ArrayList<Employee> employeeList = ReadData.readEmployee();
        if(!(employeeList.isEmpty()))
        {
            //ID = (adminList.get(adminList.size()).getID()) + 1;
            ID = (employeeList.get((employeeList.size() -1)).getID()) + 1;
        }
        else if(employeeList.isEmpty())
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
        t6 = new JTextField(15); //designationt
        t7 = new JTextField(15); // salary
        
        id.setBounds(585, 75, 270, 30);
        t1.setBounds(485, 125, 370, 30);
        t2.setBounds(485, 170, 370, 30);
        t3.setBounds(485, 215, 370, 30);
        t4.setBounds(485, 305, 370, 30);
        t5.setBounds(485, 350, 370, 30);
        t6.setBounds(485, 395, 370, 30);
        t7.setBounds(485, 530, 370, 30);
        //t8.setBounds(465, 435, 330, 30);
        
        Font f2 = new Font("Arial", Font.PLAIN, 20);
        
        date = new JDateChooser();
        date.setBounds(485, 440, 370, 30);
        
        String[] pr = {"Select Employee Type","Monthly Salaried" , "Per Day Salaried"};
        cb = new JComboBox(pr);
        cb.setBounds(485, 485, 370, 30);
        
        date.setFont(f2);
        cb.setFont(f2);
        t1.setFont(f2);
        t2.setFont(f2);
        t3.setFont(f2);
        t4.setFont(f2);
        t5.setFont(f2);
        t6.setFont(f2);
        t7.setFont(f2);
        
        Font f = new Font("Serif", Font.BOLD, 25); //font style and size for labels
        Color color1 = new Color(236,236,236); //RGB color code
        
        l1 = new JLabel("Name");
        l2 = new JLabel("Phone No.");
        l3 = new JLabel("CNIC No.");
        l4 = new JLabel("Gender");
        l5 = new JLabel("Address");
        l6 = new JLabel("City");
        l7 = new JLabel("Designation");
        l8 = new JLabel("Date of Hire");
        l9 = new JLabel("Employee Type");
        l11 = new JLabel("Salary");
        
        l1.setBounds(150, 125, 330, 30);
        l2.setBounds(150, 170, 330, 30);
        l3.setBounds(150, 215, 330, 30);
        l4.setBounds(150, 260, 330, 30);
        l5.setBounds(150, 305, 330, 30);
        l6.setBounds(150, 350, 330, 30);
        l7.setBounds(150, 395, 330, 30);
        l8.setBounds(150, 440, 330, 30);
        l9.setBounds(150, 485, 330, 30);
        l11.setBounds(150, 530, 330, 30);
        
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
        l11.setFont(f);

        l1.setForeground(color1);
        l2.setForeground(color1);
        l3.setForeground(color1);
        l4.setForeground(color1);
        l5.setForeground(color1);
        l6.setForeground(color1);
        l7.setForeground(color1);
        l8.setForeground(color1);
        l9.setForeground(color1);
        l11.setForeground(color1);
        
        rb1 = new JRadioButton("Male", true);
        rb2 = new JRadioButton("Female", false);
        rb3 = new JRadioButton("Other", false);
        
        radiogroup = new ButtonGroup();
        radiogroup.add(rb1);
        radiogroup.add(rb2);
        radiogroup.add(rb3);
        
        rb1.setBounds(530, 260, 80, 30);
        rb2.setBounds(630, 260, 80, 30);
        rb3.setBounds(730, 260, 80, 30);
        
        b1 = new JButton("Submit");
        b1.setBounds(235, 585, 150, 30);
        b2 = new JButton("Clear");
        b2.setBounds(425, 585, 150, 30);
        b3 = new JButton("Back");
        b3.setBounds(615, 585, 150, 30);

        p1 = new JPanel();
        p1.setLayout(null);
        
        p1.add(title);
        p1.add(date);
        p1.add(cb);
        p1.add(id);
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
        p1.add(l8);
        p1.add(l9);
        p1.add(l11);
        p1.add(rb1);
        p1.add(rb2);
        p1.add(rb3);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(background);
        
        add(p1);
        
        setVisible(true);
        
        addEmployeeListener a1 = new addEmployeeListener();
        b1.addActionListener(a1);
        b2.addActionListener(a1);
        b3.addActionListener(a1);
        cb.addActionListener(a1);
        rb1.addActionListener(a1);
        rb2.addActionListener(a1);
        rb3.addActionListener(a1);
    }
    
    public void diposeaddEmployeeFrame()
    {
        this.dispose();
    }
    
    public class addEmployeeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {   
            if(e.getSource() == cb)
            {
                String type1 = (String)(cb.getSelectedItem());
                
                if(type1.equals("Monthly Salaried"))
                {
                    l11.setText("Monthly Salary");
                    type = "monthly";
                }
                else if(type1.equals("Per Day Salaried"))
                {
                    l11.setText("Per-Day Salary");
                    type = "per day";
                }
                else
                {
                    l11.setText("Salary");
                    type = "select";
                }
            }
            else if(e.getActionCommand().equals("Submit"))
            {   
                
                if(!((t1.getText().isEmpty()) || (t2.getText().isEmpty()) || (t3.getText().isEmpty()) || (t4.getText().isEmpty())
                        || (t5.getText().isEmpty()) || (t6.getText().isEmpty()) || (t7.getText().isEmpty())))
                {
                    
                    if(rb1.isSelected())
                    {
                        gender = "Male";
                    }
                    else if(rb2.isSelected())
                    {
                        gender = "Female";
                    }
                    else if(rb3.isSelected())
                    {
                        gender = "Other";
                    }
                    
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
                    String address1 = t4.getText();
                    String city = t5.getText();
                    String des = t6.getText();
                    double salary = 0.0;
                    
                    int day = 3 ,month = 5 ,year =1999;
                    
                    try
                    {
                        day = date.getDate().getDay();
                        month = date.getDate().getMonth();
                        year = date.getDate().getYear();
                    }catch(NullPointerException ex)
                    {
                        JOptionPane.showMessageDialog(null, "Date is not selected.");
                    }
                    Date1 d = new Date1(day, month, year);
                    
                    try
                    {
                        salary = Double.parseDouble(t7.getText());
                    }
                    catch(NumberFormatException ex)
                    {
                        JOptionPane.showMessageDialog(null, "An integer is required for salary.");
                        t7.setText("");
                        check = true;
                    }

                    ArrayList<Employee> employeeList = ReadData.readEmployee();
                    
                    boolean check2 = false;
                    
                    for(int i = 0; i<employeeList.size(); i++)
                    {
                        if(((employeeList.get(i).getName().equalsIgnoreCase(name)) &&
                            (employeeList.get(i)).getCnic().equals(cnic)))
                        {
                            check2 = true;
                            check = true;
                            break;
                        }
                    }
                    
                    Address address = new Address(address1, city);
                    //String name, String phone, String cnic, String gender,String des, Address address, Date1 date, double basic_salary
                    Employee employee = null;
                    if(!((check) || (check2)))
                    {
                        if(type.equals("monthly"))
                        {
                            employee = new MonthlySalariedEmployee(name, phone, cnic, gender,des , address, d, salary, ID);
                        }
                        else if(type.equals("per day"))
                        {
                            employee = new PerDaySalariedEmployee(name, phone, cnic, gender,des , address, d, salary, ID);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Employee type not selected.");
                            check = true;
                        }
                    }
                    
                    if(!check)
                    {
                        ObjectOutputStream output = null;

                        try
                        {
                            employeeList.add(employee);

                            output = new ObjectOutputStream(new FileOutputStream("src/files/Employee.ser"));

                            for(int j = 0; j < employeeList.size(); j++)
                            {
                                output.writeObject(employeeList.get(j));
                            }

                            output.close();
                        }
                        catch(IOException a)
                        {
                            JOptionPane.showMessageDialog(null, "Error in file writing.");
                        }
                        finally
                        {
                            JOptionPane.showMessageDialog(null, "Employee's Form Submitted Successfully.");
                            
                            ID++;
                            id.setText(" Customer's ID:   " + ID);
                            t1.setText(""); //name
                            t2.setText(""); //phone no
                            t3.setText(""); //cnic
                            t4.setText(""); //company name
                            t5.setText(""); //address
                            t6.setText(""); //city
                            t7.setText(""); //salary
                            
                            cb.setSelectedIndex(0);
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
                        t7.setText(""); //salary
                        
                        cb.setSelectedIndex(0);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Field/s  is/are  empty.");
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
                t7.setText(""); //salary
                
                cb.setSelectedIndex(0);

            }
            else if(e.getActionCommand().equals("Back"))
            {
                diposeaddEmployeeFrame();
                EmployeeMainGUI cg = new EmployeeMainGUI();
            }
        }
    }
}
