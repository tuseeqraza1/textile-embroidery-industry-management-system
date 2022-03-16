/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeManagement;

import java.io.Serializable;
import oop_project.*;

public class PerDaySalariedEmployee extends Employee implements Serializable
{
    private double advance = 0.0;
    private int days;
    private double salary_per_day;
    
    public PerDaySalariedEmployee()
    {
        super();
        days = 3;
        salary_per_day = 5000;
    }
    
    public PerDaySalariedEmployee(String name, String phone, String cnic, String gender, String des, Address address, Date1 date, int days, double spd, int ID)
    {
        super(name, phone, cnic, gender, des, address, date, "Per Day Salaried", ID);
        this.days = days;
        this.salary_per_day = spd;
    }
    
    public PerDaySalariedEmployee(String name, String phone, String cnic, String gender, String des, Address address, Date1 date, double spd, int ID)
    {
        super(name, phone, cnic, gender, des, address, date, "Per Day  Salaried", ID);
        this.salary_per_day = spd;
    }

    public double getSalary_per_day() {
        return salary_per_day;
    }

    public void setSalary_per_day(double s) {
        this.salary_per_day = s;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getSalary() {
        return advance;
    }

    public void setSalary(double salary) {
        this.advance = salary;
    }
    
    @Override
    public double getEarning()
    {
        return salary_per_day;
    }

    @Override
    public void setEarning(double salary) 
    {
        this.salary_per_day = salary;
    }

    @Override
    public double getAdvance() 
    {
        return advance;
    }

    @Override
    public void setAdvance(double advance) 
    {
        this.advance += advance;
    }
    
    @Override
    public void resetAdvance(double a) 
    {
        this.advance = a;
    }

    @Override
    public double getEarningZero() 
    {
        return 0.0;
    }
}
