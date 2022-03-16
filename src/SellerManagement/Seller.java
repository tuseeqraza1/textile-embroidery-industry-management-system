/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SellerManagement;

import CustomerManagement.*;
import java.io.Serializable;
import oop_project.Address;


public class Seller extends Industry implements Serializable
{
    private int sellerID;
    
    public Seller()
    {
        super();
        sellerID = 1;
    }
    
    public Seller(String name, String phone, String cnic, String gender, String industryName, Address address, int customerID, Bill bills, Receive payments)
    {
        super(name, phone, cnic, gender, industryName, address, bills, payments);
        this.sellerID = customerID;
    }
    
    public Seller(String name, String phone, String cnic, String industryName, Address address, int sellerID)
    {
        super(name, phone, cnic, industryName, address);
        this.sellerID = sellerID;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }
}
