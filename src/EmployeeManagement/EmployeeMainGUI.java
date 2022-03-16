/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeManagement;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.*;
import oop_project.MainGUI;

/**
 *
 * @author tusee
 */
public class EmployeeMainGUI extends JFrame
{
    JTextField t1;
    JLabel l1,l2,l3,l4,l5,l6,l7,title1,background;
    JButton b1,b2,b3,b4,b5,b6,b7;
    JPanel p1,p2;
    
    /*public static void main(String[] args)
    {
        EmployeeMainGUI g = new EmployeeMainGUI();
    }*/
    
    public EmployeeMainGUI()
    {
        super("Employee Main Frame");
        setSize(1000, 700);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ImageIcon img = new ImageIcon("src/images/background1.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 1000, 700);
        
        Font f1 = new Font("Bauhaus 93", Font.BOLD, 50);
        title1 = new JLabel("Employee Menu", SwingConstants.CENTER);
        title1.setFont(f1);
        title1.setForeground(Color.decode("#ECECEC"));
        title1.setBounds(0, 45, 1000, 70);
        
        
        ImageIcon add = new ImageIcon("src/images/employeeAdd.png");
        b1 = new JButton(add);
        b1.setBackground(Color.decode("#C0DAD9"));
        b1.setBorder(null);
        b1.setBounds(115, 130, 170, 170);
        
        ImageIcon delete = new ImageIcon("src/images/employeeDelete.png");
        b2 = new JButton(delete);
        b2.setBackground(Color.decode("#C0DAD9"));
        b2.setBorder(null);
        b2.setBounds(315, 130, 170, 170);
        
        ImageIcon edit = new ImageIcon("src/images/employeeEdit.png");
        b3 = new JButton(edit);
        b3.setBackground(Color.decode("#C0DAD9"));
        b3.setBorder(null);
        b3.setBounds(515, 130, 170, 170);
        
        ImageIcon search = new ImageIcon("src/images/employeeSearch.png");
        b4 = new JButton(search);
        b4.setBackground(Color.decode("#C0DAD9"));
        b4.setBorder(null);
        b4.setBounds(715, 130, 170, 170);
        
        ImageIcon advance = new ImageIcon("src/images/employeeAdvance.png");
        b5 = new JButton(advance);
        b5.setBackground(Color.decode("#C0DAD9"));
        b5.setBorder(null);
        b5.setBounds(115, 370, 170, 170);
        
        ImageIcon pay = new ImageIcon("src/images/employeePay.png");
        b6 = new JButton(pay);
        b6.setBackground(Color.decode("#C0DAD9"));
        b6.setBorder(null);
        b6.setBounds(315, 370, 170, 170);
        
        ImageIcon back = new ImageIcon("src/images/backicon.png");
        b7 = new JButton(back);
        b7.setBackground(Color.decode("#C0DAD9"));
        b7.setBorder(null);
        b7.setBounds(515, 370, 170, 170);
        
        l1 = new JLabel("Add", SwingConstants.CENTER);
        l2 = new JLabel("Delete", SwingConstants.CENTER);
        l3 = new JLabel("Edit", SwingConstants.CENTER);
        l4 = new JLabel("Search", SwingConstants.CENTER);
        l5 = new JLabel("Advance", SwingConstants.CENTER);
        l6 = new JLabel("Pay", SwingConstants.CENTER);
        l7 = new JLabel("Back", SwingConstants.CENTER);
        
        Font f = new Font("Comic Sans MS", Font.BOLD, 25);
        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);
        l5.setFont(f);
        l6.setFont(f);
        l7.setFont(f);
        
        l1.setForeground(Color.decode("#ECECEC"));
        l2.setForeground(Color.decode("#ECECEC"));
        l3.setForeground(Color.decode("#ECECEC"));
        l4.setForeground(Color.decode("#ECECEC"));
        l5.setForeground(Color.decode("#ECECEC"));
        l6.setForeground(Color.decode("#ECECEC"));
        l7.setForeground(Color.decode("#ECECEC"));
        
        l1.setBounds(115, 240, 170, 170);
        l2.setBounds(315, 240, 170, 170);
        l3.setBounds(515, 240, 170, 170);
        l4.setBounds(715, 240, 170, 170);
        l5.setBounds(115, 485, 170, 170);
        l6.setBounds(315, 485, 170, 170);
        l7.setBounds(515, 485, 170, 170);
        
        p1 = new JPanel();
        p1.setLayout(null);
        
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(l7);
        p1.add(title1);
        p1.add(background);
        
        add(p1);
        setVisible(true);
        
        EmployeeMainListener a1 = new EmployeeMainListener();
        b1.addActionListener(a1);
        b2.addActionListener(a1);
        b3.addActionListener(a1);
        b4.addActionListener(a1);
        b5.addActionListener(a1);
        b6.addActionListener(a1);
        b7.addActionListener(a1);
        
    }
    
    public void diposeEmployeeFrame()
    {
        this.dispose();
    }
    
    public class EmployeeMainListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getSource().equals(b1))
            { 
                addEmployeeGUI acg = new addEmployeeGUI();
                diposeEmployeeFrame();
            }
            else if(e.getSource().equals(b2))
            {
                deleteEmployeeGUI acg = new deleteEmployeeGUI();
                diposeEmployeeFrame();
            }
            else if(e.getSource().equals(b3))
            {
                editEmployeeGUI acg = new editEmployeeGUI();
                diposeEmployeeFrame();
            }
            else if(e.getSource().equals(b4))
            {
                searchEmployeeGUI acg = new searchEmployeeGUI();
                diposeEmployeeFrame();
            }
            else if(e.getSource().equals(b5))
            {
                advanceEmployeeGUI acg = new advanceEmployeeGUI();
                diposeEmployeeFrame();
            }
            else if(e.getSource().equals(b6))
            {
                payEmployeeGUI acg = new payEmployeeGUI();
                diposeEmployeeFrame();
            }
            else if(e.getSource().equals(b7))
            {
                MainGUI lg = new MainGUI();
                diposeEmployeeFrame();
            }
        }
        
    }
}