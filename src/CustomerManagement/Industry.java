/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerManagement;

import java.io.Serializable;
import java.util.ArrayList;
import oop_project.*;

public class Industry extends Person implements Serializable
{
    private String industryName;
    private ArrayList<Bill> bills = new ArrayList<Bill>();
    private ArrayList<Receive>  payment  = new ArrayList<Receive>();
    
    public Industry()
    {
        super();
        industryName = "Embroidry";
        bills.add(0, new Bill());
        payment.add(0, new Receive());
    }
    
    public Industry(String name, String phone, String cnic, String gender, String industryName, Address address, Bill bills, Receive payment)
    {
        super(name, phone, cnic, gender, address);
        this.industryName = industryName;
        this.bills.add(bills);
        this.payment.add(payment);
    }
    
    public Industry(String name, String phone, String cnic, String industryName, Address address)
    {
        super(name, phone, cnic, address);
        this.industryName = industryName;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public Bill getbills(int i) {
        return bills.get(i);
    }

    public Receive getpayment(int i) {
        return payment.get(i);
    }

    public ArrayList<Bill> getBills() {
        return bills;
    }

    public void setBills(ArrayList<Bill> bills) {
        this.bills = bills;
    }
    
    public void setBills(Bill bills) {
        this.bills.add(bills);
    }

    public ArrayList<Receive> getPayment() {
        return payment;
    }

    public void setPayment(ArrayList<Receive> payment) {
        this.payment = payment;
    }
    
    public void setPayment(Receive payment) {
        this.payment.add(payment);
    }
    
    public double totalBillsAmount()
    {
        double totalBill = 0.0;
        
        for(int i = 0; i < bills.size(); i++)
        {
            totalBill += bills.get(i).getTotalBill();
        }
        
        return totalBill;
    } 
    
    public double totalPaymentsAmount()
    {
        double totalPayment = 0.0;
        
        for(int i = 0; i < payment.size(); i++)
        {
            totalPayment += payment.get(i).getAmount();
        }
        
        return totalPayment;
    }
    
}
