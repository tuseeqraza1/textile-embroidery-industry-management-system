/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerManagement;

import com.toedter.calendar.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import oop_project.*;


class billCustomerGUI extends JFrame
{
    JTextField id,t1,t2,t3,t6,t7,t8,t9,bill_ID;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,search,title,background;
    JButton b1,b2,b3,b4,b5,b6;
    JPanel p1;
    JDateChooser date;
    JComboBox cb;
    String cName;
    double balance,t;
    int check,check2,bill_no;
    
    public static void main(String[] args) 
    {
        billCustomerGUI a = new billCustomerGUI();
        //String name, String phone, String cnic, String gender, Address address, String des, String password
    }
    public billCustomerGUI()
    {
        super("Customer Bill");
        setSize(1000, 700);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        ImageIcon img = new ImageIcon("src/images/background1.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 1000, 700);
        
        Font f1 = new Font("Bauhaus 93", Font.PLAIN, 50);
        title = new JLabel("Customer Bill:");
        title.setFont(f1);
        title.setForeground(Color.decode("#ECECEC"));
        title.setBounds(110, 35, 700, 100);
        
        date = new JDateChooser();
        date.setBounds(485, 285, 370, 30);
        date.setDateFormatString("yyyy-MM-dd");
        
        String[] pr = comboProducts();
        cb = new JComboBox(pr);
        cb.setBounds(485, 335, 370, 30);
        //cb.setSelectedIndex(0);
        
        ArrayList<Bill> billsList = ReadData.readCustomerBills();
        if(!(billsList.isEmpty()))
            bill_no = billsList.get(billsList.size() - 1).getBillNo() + 1;
        else
            bill_no = 1;
        
        Font f2 = new Font("Arial", Font.PLAIN, 20); // font style and size for text fields
        
        bill_ID = new JTextField("  Bill No :   " + bill_no, 20); // bill id
        t1 = new JTextField(20); //id
        t2 = new JTextField(20); //company name
        t3 = new JTextField(20); //balance
        //t5 = new JTextField(11); //
        t6 = new JTextField(13); //price
        t7 = new JTextField(30); //quantity
        t8 = new JTextField(30); //total
        t9 = new JTextField(30); //new balance
        
        bill_ID.setEditable(false);
        t6.setEditable(false);
        t9.setEditable(false);
        
        bill_ID.setFont(f2);
        t1.setFont(f2);
        t2.setFont(f2);
        t3.setFont(f2);
        date.setFont(f2);
        cb.setFont(f2);
        t6.setFont(f2);
        t7.setFont(f2);
        t8.setFont(f2);
        t9.setFont(f2);
        
        bill_ID.setBounds(600, 75, 255, 30);
        t1.setBounds(315, 125, 370, 30);
        t2.setBounds(485, 185, 370, 30);
        t3.setBounds(485, 235, 370, 30);
        //t5.setBounds(485, 275, 370, 30);
        t6.setBounds(485, 385, 370, 30);
        t7.setBounds(485, 435, 200, 30);
        t8.setBounds(485, 485, 370, 30);
        t9.setBounds(485, 535, 370, 30);
        
        Font f = new Font("Serif", Font.BOLD, 25); //font style and size for labels
        Color color1 = new Color(236,236,236); //RGB color code
        
        l1 = new JLabel("Company's ID");
        l2 = new JLabel("Company's Name");
        l3 = new JLabel("Previeus Balance");
        l4 = new JLabel("Billing Date");
        l5 = new JLabel("Product");
        l6 = new JLabel("Price");
        l7 = new JLabel("Quantity");
        l8 = new JLabel("Total");
        l9 = new JLabel("New Balance");
        
        
        l1.setBounds(150, 125, 330, 30);
        l2.setBounds(150, 185, 330, 30);
        l3.setBounds(150, 235, 330, 30);
        l4.setBounds(150, 285, 330, 30);
        l5.setBounds(150, 335, 330, 30);
        l6.setBounds(150, 385, 330, 30);
        l7.setBounds(150, 435, 330, 30);
        l8.setBounds(150, 485, 330, 30);
        l9.setBounds(150, 535, 330, 30);
        
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
        
        b1 = new JButton("Add");
        b1.setBounds(230, 590, 150, 30);
        b2 = new JButton("Clear");
        b2.setBounds(410, 590, 150, 30);
        b3 = new JButton("Back");
        b3.setBounds(590, 590, 150, 30);
        b4 = new JButton("Search");
        b4.setBounds(705, 125, 150, 30);
        b5 = new JButton("Calculate");
        b5.setBounds(705, 435, 150, 30);

        p1 = new JPanel();
        p1.setLayout(null);
        
        p1.add(title);
        p1.add(bill_ID);
        p1.add(t1);
        p1.add(t2);
        p1.add(t3);
        p1.add(date);
        p1.add(cb);
        p1.add(t6);
        p1.add(t7);
        p1.add(t8);
        p1.add(t9);
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(l7);
        p1.add(l8);
        p1.add(l9);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(background);
        
        add(p1);
        
        setVisible(true);
        
        billCustomerListener a1 = new billCustomerListener();
        b1.addActionListener(a1);
        b2.addActionListener(a1);
        b3.addActionListener(a1);
        b4.addActionListener(a1);
        b5.addActionListener(a1);
        cb.addActionListener(a1);
    }
    
    public void diposebillCustomerFrame()
    {
        this.dispose();
    }
    
    public class billCustomerListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {   
            //ateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            ArrayList<Product> p = ReadData.readProduct();
            
            if(e.getSource() == cb)
            {
                String product = (String)(cb.getSelectedItem());
                
                for(int i = 0; i<p.size(); i++)
                {
                    if(product.equals(p.get(i).getProducts()))
                    {
                        t6.setText(Double.toString(p.get(i).getPrice()));
                        check2 = i;
                        break;
                    }
                }
            }
            /*else if(e.getActionCommand().equals("Invoice"))
            {
                if(!(t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() || t6.getText().isEmpty()
                        || t7.getText().isEmpty() || t8.getText().isEmpty() || t9.getText().isEmpty()))
                {
                    //InvoiceCustomerGUI icg = new InvoiceCustomerGUI(bill_no,);
                }
                
                
            }*/
            else if(e.getActionCommand().equals("Calculate"))
            {
                if(!(t6.getText().isEmpty() || t7.getText().isEmpty()))
                {
                    ArrayList<Product> productList = ReadData.readProduct();
                    try
                    {
                        int q = Integer.parseInt(t7.getText());
                        t = productList.get(check2).getPrice() * q;
                        
                        t8.setText((Double.toString(t)));
                        
                        t9.setText(Double.toString( t + Double.parseDouble(t3.getText())));
                    }
                    catch(NumberFormatException ex)
                    {
                        t7.setText("");
                        JOptionPane.showMessageDialog(null, "An integer is required.");
                    }   
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Enter required quantity.");
                }
            }
            else if(e.getActionCommand().equals("Search"))
            {
                if(!(t1.getText().isEmpty()))
                {
                    ArrayList<Customer> customerList = ReadData.readCustomer();
                    
                    if(customerList.isEmpty())
                    {
                        JOptionPane.showMessageDialog(null, "Data not found.");
                    }
                    
                    for(int j = 0; j<customerList.size(); j++)
                    {
                        String textID = Integer.toString(customerList.get(j).getCustomerID());
                        
                        if((t1.getText().equals(textID)))
                        {
                            check = j; //index of customer.
                            cName = customerList.get(j).getIndustryName();
                            balance = (customerList.get(j).totalBillsAmount() - customerList.get(j).totalPaymentsAmount());
                            String B = Double.toString(balance);
                            
                            t2.setText(cName);
                            t3.setText(B);
                            break;
                        }
                        if(j == customerList.size()-1)
                        {
                            JOptionPane.showMessageDialog(null, "Data not found.");
                            
                            t1.setText(""); //id
                            t2.setText(""); //company name
                            t3.setText(""); //balance
                            t6.setText(""); //price
                            t7.setText(""); //quantity
                            t8.setText(""); //total

                            cb.setSelectedItem(p.get(0).getProducts());
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
                        || (t6.getText().isEmpty()) || (t7.getText().isEmpty()) || 
                        (t8.getText().isEmpty()) || (t9.getText().isEmpty())))
                {
                    ArrayList<Customer> customerList = ReadData.readCustomer();
                    ArrayList<Bill> billsList = ReadData.readCustomerBills();
                    ArrayList<Product> productList = ReadData.readProduct();
                    
                    boolean check1 = false;
                    
                    int bill = bill_no; // nill id no
                    Product product = productList.get(check2); // store product selected
                    
                    int quantity = 0;
                    
                    try
                    {
                        quantity = Integer.parseInt(t7.getText());
                    }catch(NumberFormatException ex)
                    {
                        JOptionPane.showMessageDialog(null, "An integer is required.");
                        t7.setText("");
                        check1 = true;
                    }
                    
                    //String d1 = date.toString();
                    //System.out.println(d1);
                    
                    int day = date.getDate().getDay();
                    int month = date.getDate().getMonth();
                    int year = date.getDate().getYear();
                    
                    if(!check1)
                    {
                        Date1 d = new Date1(day, month, year);
                        Bill bill1 = new Bill(d, product, quantity, bill);

                        ObjectOutputStream output = null;
                        ObjectOutputStream output1 = null;

                        try
                        {
                            customerList.get(check).setBills(bill1);
                            billsList.add(bill1);

                            output = new ObjectOutputStream(new FileOutputStream("src/files/Customer.ser"));
                            output1 = new ObjectOutputStream(new FileOutputStream("src/files/CustomerBills.ser"));

                            for(int j = 0; j < customerList.size(); j++)
                            {
                                output.writeObject(customerList.get(j));
                            }
                            output.close();

                            for(int j = 0; j < billsList.size(); j++)
                            {
                                output1.writeObject(billsList.get(j));
                            }
                            output1.close();
                        }
                        catch(IOException a)
                        {
                            JOptionPane.showMessageDialog(null, "Error in file writing.");
                        }
                        finally
                        {
                            JOptionPane.showMessageDialog(null, "Bill added Successfully.");

                            bill_no++;
                            bill_ID.setText("  Bill No :   " + bill_no);
                            t1.setText(""); //id
                            t2.setText(""); //company name
                            t3.setText(""); //balance
                            t6.setText(""); //price
                            t7.setText(""); //quantity
                            t8.setText(""); //total
                            t9.setText(""); //new balance

                            try
                            {
                                cb.setSelectedItem(p.get(0).getProducts());
                            }
                            catch(IndexOutOfBoundsException ex)
                            {    }
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "A field is empty.");
                }
            }
            else if(e.getActionCommand().equals("Clear"))
            {
                t1.setText(""); //id
                t2.setText(""); //company name
                t3.setText(""); //balance
                t6.setText(""); //price
                t7.setText(""); //quantity
                t8.setText(""); //total
                
                try
                {
                    cb.setSelectedItem(p.get(0).getProducts());
                }
                catch(IndexOutOfBoundsException ex)
                {    }
                
            }
            else if(e.getActionCommand().equals("Back"))
            {
                diposebillCustomerFrame();
                CustomerMainGUI cg = new CustomerMainGUI();
            }
        }
    }
    
    public String[] comboProducts()
    {
        ArrayList<Product> p = ReadData.readProduct();
        String[] prod = new String[p.size()];
        
        for(int i = 0; i<p.size(); i++)
        {
            prod[i] = p.get(i).getProducts();
        }
        
        return prod;
    }
}