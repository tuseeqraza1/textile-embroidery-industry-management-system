/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SellerManagement;

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
public class SellerMainGUI extends JFrame
{
    JTextField t1;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,title1,background;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    JPanel p1,p2;
    
    /*public static void main(String[] args)
    {
        SellerMainGUI g = new SellerMainGUI();
    }*/
    
    public SellerMainGUI()
    {
        super("Seller Main Frame");
        setSize(1000, 700);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ImageIcon img = new ImageIcon("src/images/background1.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 1000, 700);
        
        Font f1 = new Font("Bauhaus 93", Font.BOLD, 50);
        title1 = new JLabel("Seller Menu", SwingConstants.CENTER);
        title1.setFont(f1);
        title1.setForeground(Color.decode("#ECECEC"));
        title1.setBounds(0, 45, 1000, 70);
        
        
        ImageIcon addSeller = new ImageIcon("src/images/sellerAdd.png");
        b1 = new JButton(addSeller);
        b1.setBackground(Color.decode("#C0DAD9"));
        b1.setBorder(null);
        b1.setBounds(115, 130, 170, 170);
        
        ImageIcon deleteSeller = new ImageIcon("src/images/sellerDelete.png");
        b2 = new JButton(deleteSeller);
        b2.setBackground(Color.decode("#C0DAD9"));
        b2.setBorder(null);
        b2.setBounds(315, 130, 170, 170);
        
        ImageIcon editSeller = new ImageIcon("src/images/sellerEdit.png");
        b3 = new JButton(editSeller);
        b3.setBackground(Color.decode("#C0DAD9"));
        b3.setBorder(null);
        b3.setBounds(515, 130, 170, 170);
        
        ImageIcon searchSeller = new ImageIcon("src/images/sellerSearch.png");
        b4 = new JButton(searchSeller);
        b4.setBackground(Color.decode("#C0DAD9"));
        b4.setBorder(null);
        b4.setBounds(715, 130, 170, 170);
        
        ImageIcon bill = new ImageIcon("src/images/bill1.png");
        b5 = new JButton(bill);
        b5.setBackground(Color.decode("#C0DAD9"));
        b5.setBorder(null);
        b5.setBounds(115, 370, 170, 170);
        
        ImageIcon payment = new ImageIcon("src/images/payment.png");
        b6 = new JButton(payment);
        b6.setBackground(Color.decode("#C0DAD9"));
        b6.setBorder(null);
        b6.setBounds(315, 370, 170, 170);
        
        ImageIcon thread = new ImageIcon("src/images/thread.png");
        b7 = new JButton(thread);
        b7.setBackground(Color.decode("#C0DAD9"));
        b7.setBorder(null);
        b7.setBounds(515, 370, 170, 170);
        
        ImageIcon back = new ImageIcon("src/images/backicon.png");
        b8 = new JButton(back);
        b8.setBackground(Color.decode("#C0DAD9"));
        b8.setBorder(null);
        b8.setBounds(715, 370, 170, 170);
        
        l1 = new JLabel("Add", SwingConstants.CENTER);
        l2 = new JLabel("Delete", SwingConstants.CENTER);
        l3 = new JLabel("Edit", SwingConstants.CENTER);
        l4 = new JLabel("Search", SwingConstants.CENTER);
        l5 = new JLabel("Bill", SwingConstants.CENTER);
        l6 = new JLabel("Payment", SwingConstants.CENTER);
        l7 = new JLabel("Raw Material", SwingConstants.CENTER);
        l8 = new JLabel("Back", SwingConstants.CENTER);
        
        Font f = new Font("Comic Sans MS", Font.BOLD, 25);
        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);
        l5.setFont(f);
        l6.setFont(f);
        l7.setFont(f);
        l8.setFont(f);
        
        l1.setForeground(Color.decode("#ECECEC"));
        l2.setForeground(Color.decode("#ECECEC"));
        l3.setForeground(Color.decode("#ECECEC"));
        l4.setForeground(Color.decode("#ECECEC"));
        l5.setForeground(Color.decode("#ECECEC"));
        l6.setForeground(Color.decode("#ECECEC"));
        l7.setForeground(Color.decode("#ECECEC"));
        l8.setForeground(Color.decode("#ECECEC"));
        
        l1.setBounds(115, 240, 170, 170);
        l2.setBounds(315, 240, 170, 170);
        l3.setBounds(515, 240, 170, 170);
        l4.setBounds(715, 240, 170, 170);
        l5.setBounds(115, 485, 170, 170);
        l6.setBounds(315, 485, 170, 170);
        l7.setBounds(515, 485, 170, 170);
        l8.setBounds(715, 485, 170, 170);
        
        p1 = new JPanel();
        p1.setLayout(null);
        
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(l7);
        p1.add(l8);
        p1.add(title1);
        p1.add(background);
        
        add(p1);
        setVisible(true);
        
        SellerMainListener a1 = new SellerMainListener();
        b1.addActionListener(a1);
        b2.addActionListener(a1);
        b3.addActionListener(a1);
        b4.addActionListener(a1);
        b5.addActionListener(a1);
        b6.addActionListener(a1);
        b7.addActionListener(a1);
        b8.addActionListener(a1);
        
    }
    
    public void diposeSellerFrame()
    {
        this.dispose();
    }
    
    public class SellerMainListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(e.getSource().equals(b1))
            {
                addSellerGUI asg = new addSellerGUI();
                diposeSellerFrame();
            }
            else if(e.getSource().equals(b2))
            {
                deleteSellerGUI dsg = new deleteSellerGUI();
                diposeSellerFrame();
            }
            else if(e.getSource().equals(b3))
            {
                editSellerGUI esg = new editSellerGUI();
                diposeSellerFrame();
            }
            else if(e.getSource().equals(b4))
            {
                searchSellerGUI ssg = new searchSellerGUI();
                diposeSellerFrame();
            }
            else if(e.getSource().equals(b5))
            {
                billSellerGUI bsg = new billSellerGUI();
                diposeSellerFrame();
            }
            else if(e.getSource().equals(b6))
            {
                paymentSellerGUI psg = new paymentSellerGUI();
                diposeSellerFrame();
            }
            else if(e.getSource().equals(b7))
            {
                productSellerGUI psg = new productSellerGUI();
                diposeSellerFrame();
            }
            else if(e.getSource().equals(b8))
            {
                MainGUI lg = new MainGUI();
                diposeSellerFrame();
            }
        }
        
    }
}