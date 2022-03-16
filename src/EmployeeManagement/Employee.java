/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeManagement;

import java.io.Serializable;
import oop_project.*;


public abstract class Employee extends Person implements Serializable
{
    private int ID;
    private String des;
    private Date1 date_of_hire;
    private String type;
    
    public Employee()
    {
        super();
        des = "Manager";
        date_of_hire = new Date1();
        ID = 1;
    }
    
    public Employee(String name, String phone, String cnic, String gender, String des, Address address, Date1 date, String type, int ID)
    {
        super(name, phone, cnic, gender, address);
        this.des = des;
        this.date_of_hire = date;
        this.type = type;
        this.ID = ID;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Date1 getDate_of_hire() {
        return date_of_hire;
    }

    public void setDate_of_hire(Date1 date_of_hire) {
        this.date_of_hire = date_of_hire;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public abstract double getEarning();
    
    public abstract double getEarningZero();
    
    public abstract void setEarning(double a);
    
    public abstract double getAdvance();
    
    public abstract void setAdvance(double a);
    
    public abstract void resetAdvance(double a);
    
    @Override
    public void Display()
    {
        System.out.println("Destination   : " + des);
        System.out.println("Date of Hire  : " + date_of_hire);
    }
    
}
