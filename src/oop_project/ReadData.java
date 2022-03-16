/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

import CustomerManagement.Bill;
import Manager.Admin;
import CustomerManagement.Customer;
import CustomerManagement.Product;
import EmployeeManagement.Employee;
import SellerManagement.Seller;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author tusee
 */
public abstract class ReadData 
{
    public static ArrayList<Admin> readAdmin()
    {

        ArrayList<Admin> adminList = new ArrayList<Admin>(0);

        ObjectInputStream inputStream = null;
        try
        {
            inputStream = new ObjectInputStream(new FileInputStream("src/files/AdminLoginDetailes.ser"));

            boolean EOF = false;

            while(!EOF) 
            {
                try 
                {
                    Admin myObj = (Admin) inputStream.readObject();

                    adminList.add(myObj);
                }
                catch (ClassNotFoundException e) 
                {

                }
                catch (EOFException end) 
                {
                    EOF = true;
                }
            }
        }
        catch(FileNotFoundException e) 
        {
            //inputStream.
        }
        catch (IOException e) 
        {
        }
        finally 
        {
            try
            {
                if(inputStream != null)
                    inputStream.close( );
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(null, "IO Exception while closing file");
            }
        }

        return adminList;
    }
    
    public static ArrayList<Employee> readEmployee()
    {

        ArrayList<Employee> employeeList = new ArrayList<Employee>(0);

        ObjectInputStream inputStream = null;
        try
        {
            inputStream = new ObjectInputStream(new FileInputStream("src/files/Employee.ser"));

            boolean EOF = false;

            while(!EOF) 
            {
                try 
                {
                    Employee myObj = (Employee) inputStream.readObject();

                    employeeList.add(myObj);
                }
                catch (ClassNotFoundException e) 
                {

                }
                catch (EOFException end) 
                {
                    EOF = true;
                }
            }
        }
        catch(FileNotFoundException e) 
        {
            //inputStream.
        }
        catch (IOException e) 
        {
        }
        finally 
        {
            try
            {
                if(inputStream != null)
                    inputStream.close( );
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(null, "IO Exception while closing file");
            }
        }

        return employeeList;
    }
    
    public static ArrayList<Customer> readCustomer()
    {

        ArrayList<Customer> customerList = new ArrayList<Customer>(0);

        ObjectInputStream inputStream = null;
        try
        {
            inputStream = new ObjectInputStream(new FileInputStream("src/files/Customer.ser"));

            boolean EOF = false;

            while(!EOF) 
            {
                try 
                {
                    Customer myObj = (Customer) inputStream.readObject();

                    customerList.add(myObj);
                }
                catch (ClassNotFoundException e) 
                {

                }
                catch (EOFException end) 
                {
                    EOF = true;
                }
            }
        }
        catch(FileNotFoundException e) 
        {
            File f = new File("src/files/Customer.ser");
        }
        catch (IOException e) 
        {
        }
        finally 
        {
            try
            {
                if(inputStream != null)
                    inputStream.close( );
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(null, "IO Exception while closing file");
            }
        }

        return customerList;
    }
    
    public static ArrayList<Seller> readSeller()
    {

        ArrayList<Seller> sellerList = new ArrayList<Seller>(0);

        ObjectInputStream inputStream = null;
        try
        {
            inputStream = new ObjectInputStream(new FileInputStream("src/files/Seller.ser"));

            boolean EOF = false;

            while(!EOF) 
            {
                try 
                {
                    Seller myObj = (Seller) inputStream.readObject();

                    sellerList.add(myObj);
                }
                catch (ClassNotFoundException e) 
                {

                }
                catch (EOFException end) 
                {
                    EOF = true;
                }
            }
        }
        catch(FileNotFoundException e) 
        {
            //inputStream.
        }
        catch (IOException e) 
        {
        }
        finally 
        {
            try
            {
                if(inputStream != null)
                    inputStream.close( );
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(null, "IO Exception while closing file");
            }
        }

        return sellerList;
    }
    
    public static ArrayList<Product> readProduct()
    {

        ArrayList<Product> productList = new ArrayList<Product>(0);

        ObjectInputStream inputStream = null;
        try
        {
            inputStream = new ObjectInputStream(new FileInputStream("src/files/Product.ser"));

            boolean EOF = false;

            while(!EOF) 
            {
                try 
                {
                    Product myObj = (Product) inputStream.readObject();

                    productList.add(myObj);
                }
                catch (ClassNotFoundException e) 
                {

                }
                catch (EOFException end) 
                {
                    EOF = true;
                }
            }
        }
        catch(FileNotFoundException e) 
        {
            //inputStream.
        }
        catch (IOException e) 
        {
        }
        finally 
        {
            try
            {
                if(inputStream != null)
                    inputStream.close( );
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(null, "IO Exception while closing file");
            }
        }

        return productList;
    }
    
    public static ArrayList<Product> readRaw()
    {

        ArrayList<Product> rawList = new ArrayList<Product>(0);

        ObjectInputStream inputStream = null;
        try
        {
            inputStream = new ObjectInputStream(new FileInputStream("src/files/RawMaterial.ser"));

            boolean EOF = false;

            while(!EOF) 
            {
                try 
                {
                    Product myObj = (Product) inputStream.readObject();

                    rawList.add(myObj);
                }
                catch (ClassNotFoundException e) 
                {

                }
                catch (EOFException end) 
                {
                    EOF = true;
                }
            }
        }
        catch(FileNotFoundException e) 
        {
            //inputStream.
        }
        catch (IOException e) 
        {
        }
        finally 
        {
            try
            {
                if(inputStream != null)
                    inputStream.close( );
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(null, "IO Exception while closing file");
            }
        }

        return rawList;
    }
    
    public static ArrayList<Bill> readCustomerBills()
    {

        ArrayList<Bill> customerBillsList = new ArrayList<Bill>(0);

        ObjectInputStream inputStream = null;
        try
        {
            inputStream = new ObjectInputStream(new FileInputStream("src/files/CustomerBills.ser"));

            boolean EOF = false;

            while(!EOF) 
            {
                try 
                {
                    Bill myObj = (Bill) inputStream.readObject();

                    customerBillsList.add(myObj);
                }
                catch (ClassNotFoundException e) 
                {

                }
                catch (EOFException end) 
                {
                    EOF = true;
                }
            }
        }
        catch(FileNotFoundException e) 
        {
            //inputStream.
        }
        catch (IOException e) 
        {
        }
        finally 
        {
            try
            {
                if(inputStream != null)
                    inputStream.close( );
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(null, "IO Exception while closing file");
            }
        }

        return customerBillsList;
    }
    
    public static ArrayList<Bill> readSellerBills()
    {

        ArrayList<Bill> sellerBillsList = new ArrayList<Bill>(0);

        ObjectInputStream inputStream = null;
        try
        {
            inputStream = new ObjectInputStream(new FileInputStream("src/files/SellerBills.ser"));

            boolean EOF = false;

            while(!EOF) 
            {
                try 
                {
                    Bill myObj = (Bill) inputStream.readObject();

                    sellerBillsList.add(myObj);
                }
                catch (ClassNotFoundException e) 
                {

                }
                catch (EOFException end) 
                {
                    EOF = true;
                }
            }
        }
        catch(FileNotFoundException e) 
        {
            //inputStream.
        }
        catch (IOException e) 
        {
        }
        finally 
        {
            try
            {
                if(inputStream != null)
                    inputStream.close( );
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(null, "IO Exception while closing file");
            }
        }

        return sellerBillsList;
    }
}
