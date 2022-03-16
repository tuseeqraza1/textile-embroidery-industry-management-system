/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SellerManagement;

import CustomerManagement.Product;
import Exceptions.IntegerNeededException;
import Exceptions.PriceException;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import oop_project.*;

/**
 *
 * @author tusee
 */
class productSellerGUI extends JFrame
{
    JTextField t1,t2;
    JLabel l1,l2,title,background;
    JButton b1,b2,b3;
    JPanel p1;
    JTable table;
    JScrollPane sp;
    String[] coloumnNames;
    String[][] data;
    Object[] row = new Object[2];
    DefaultTableModel model;
    
    /*public static void main(String[] args) 
    {
        productSellerGUI a = new productSellerGUI();
        //String name, String phone, String cnic, String gender, Address address, String des, String password
    }*/
    public productSellerGUI()
    {
        super("New Raw Material Form");
        setSize(1000, 700);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ImageIcon img = new ImageIcon("src/images/background1.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 1000, 700);
        
        Font f1 = new Font("Bauhaus 93", Font.PLAIN, 50);
        title = new JLabel("Raw Material Form:");
        title.setFont(f1);
        title.setForeground(Color.decode("#ECECEC"));
        title.setBounds(110, 35, 700, 100);
      
        t1 = new JTextField(20); //product name
        t2 = new JTextField(11); //product price
        
        Font f2 = new Font("Arial", Font.PLAIN, 20); // font style and size for text fields
        t1.setFont(f2);
        t2.setFont(f2);
      
        t1.setBounds(485, 155, 370, 30);
        t2.setBounds(485, 205, 370, 30);
        
        Font f = new Font("Serif", Font.BOLD, 25); //font style and size for labels
        Color color1 = new Color(236,236,236); //RGB color code
        
        l1 = new JLabel("Material Name");
        l2 = new JLabel("Material Price");
        
        l1.setBounds(150, 155, 330, 30);
        l2.setBounds(150, 205, 330, 30);
        
        l1.setFont(f);
        l2.setFont(f);

        l1.setForeground(color1);
        l2.setForeground(color1);
        
        String[] coloumnNames = {"Material Name","Material Price"};
        data = rowsData();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(coloumnNames);
        model.setDataVector(data, coloumnNames);
        table = new JTable(model)
        {
            public boolean isCellEditable(int data, int coloumn)
            {
                return false;
            }
            
            public Component prepareRenderer(TableCellRenderer r, int data, int coloumn)
            {
                Component c = super.prepareRenderer(r, data, coloumn);
                
                if(data%2 == 0)
                    c.setBackground(Color.WHITE);
                else
                    c.setBackground(Color.decode("#E5E7E9"));
                if(isCellSelected(data,coloumn))
                    c.setBackground(Color.decode("#85C1E9"));
                
                return c;
            }
        };
        table.setRowHeight(25); 
        
        sp = new JScrollPane(table);
        sp.setBounds(200, 320, 600, 250);
        
        b1 = new JButton("Add");
        b1.setBounds(235, 255, 150, 35);
        b2 = new JButton("Clear");
        b2.setBounds(425, 255, 150, 35);
        b3 = new JButton("Back");
        b3.setBounds(615, 255, 150, 35);

        p1 = new JPanel();
        p1.setLayout(null);
        
        p1.add(title);
        p1.add(t1);
        p1.add(t2);
        p1.add(l1);
        p1.add(l2);
        p1.add(sp);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(background);
        
        add(p1);
        
        setVisible(true);
        
        productCustomerListener a1 = new productCustomerListener();
        b1.addActionListener(a1);
        b2.addActionListener(a1);
        b3.addActionListener(a1);
    }
    
    public void diposeproductSellerFrame()
    {
        this.dispose();
    }
    
    public class productCustomerListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {   
            if(e.getActionCommand().equals("Add"))
            {   
                if(!((t1.getText().isEmpty()) || (t2.getText().isEmpty())))
                {
                    boolean check1 = false;
                    String productName = t1.getText();
                    double productPrice = 0;
                    
                    try
                    {
                        productPrice = Double.parseDouble(t2.getText());
                    }
                    catch(NumberFormatException ex)
                    {
                        JOptionPane.showMessageDialog(null, "Integer is required.");
                        t2.setText("");
                        check1 = true;
                    }
                    
                    try
                    {
                        if(!check1)
                        {
                            productPrice = Double.parseDouble(t2.getText());
                            if(productPrice < 0)    
                                throw new PriceException();
                        }
                    }
                    catch(PriceException ex)
                    {
                        JOptionPane.showMessageDialog(null, "Price can not be negative.");
                        t2.setText("");
                        check1 = true;
                    }
                    
                    
                    ArrayList<Product> rawList = ReadData.readRaw();
                    
                    boolean check = false;
                    for(int i = 0; i<rawList.size(); i++)
                    {
                        if(((rawList.get(i).getProducts().equalsIgnoreCase(productName)) &&
                            (rawList.get(i).getPrice() == productPrice)))
                        {
                            check = true;
                            break;
                        }
                    }
                    if(!((check) || (check1)))
                    {
                        Product product = new Product(productName, productPrice);
                        
                        ObjectOutputStream output = null;

                        try
                        {
                            rawList.add(product);

                            output = new ObjectOutputStream(new FileOutputStream("src/files/RawMaterial.ser"));

                            for(int j = 0; j < rawList.size(); j++)
                            {
                                output.writeObject(rawList.get(j));
                            }

                            output.close();
                        }
                        catch(IOException a)
                        {
                            JOptionPane.showMessageDialog(null, "Error in file writing.");
                        }
                        finally
                        {
                            JOptionPane.showMessageDialog(null, "New Raw Material added Successfully.");
                            t1.setText(""); //product name
                            t2.setText(""); //product price
                            
                            updateData();
                        }
                    }
                    else if(check) 
                    {
                        JOptionPane.showMessageDialog(null, "Data Already Exists.");
                        t1.setText(""); //product name
                        t2.setText(""); //product price
                        
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Raw material name or price field is empty.");
                }
            }
            else if(e.getActionCommand().equals("Clear"))
            {
                t1.setText(""); //product name
                t2.setText(""); //product price

            }
            else if(e.getActionCommand().equals("Back"))
            {
                diposeproductSellerFrame();
                SellerMainGUI cg = new SellerMainGUI();
            }
        }
    }

    public String[][] rowsData()
    {
        ArrayList<Product> rawList = ReadData.readRaw();
        
        String[][] RowsData = new String[rawList.size()][2];

        for(int i = 0; i<rawList.size(); i++)
        {
            String name = rawList.get(i).getProducts();
            String price = Double.toString(rawList.get(i).getPrice());
            
            RowsData[i][0] = name;
            RowsData[i][1] = price;
        }
        return RowsData;
    }
    
    public void updateData()
    {        
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        data = rowsData();
        String[] row1 = new String[2];
        for(int i = 0; i<data.length; i++)
        {
            row1[0] = data[i][0];
            row1[1] = data[i][1];

            model.addRow(row1);
        }
    }
}
