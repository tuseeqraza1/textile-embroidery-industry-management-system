/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeManagement;

import java.io.Serializable;
import oop_project.*;


public class MonthlySalariedEmployee extends Employee implements Serializable
{
    private double advance = 0.0;
    private double basic_salary;
    
    public MonthlySalariedEmployee()
    {
        super();
        basic_salary = 5000;
    }
    
    public MonthlySalariedEmployee(String name, String phone, String cnic, String gender,String des, Address address, Date1 date, double basic_salary, int ID)
    {
        super(name, phone, cnic, gender, des, address, date, "Monthly Salaried", ID);
        this.basic_salary = basic_salary;
    }

    public double getBasic_salary() {
        return basic_salary;
    }

    public void setBasic_salary(double basic_salary) {
        this.basic_salary = basic_salary;
    }

    public double getSalary() {
        return advance;
    }

    public void setSalary(double advance) {
        this.advance = advance;
    }
    
    @Override
    public double getEarning()
    {
        return basic_salary;
    }
    
    @Override
    public void setEarning(double salary) 
    {
        this.basic_salary = salary;
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
        return basic_salary;
    }
}
