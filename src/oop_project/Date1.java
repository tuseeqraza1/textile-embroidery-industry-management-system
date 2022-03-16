/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

import java.io.*;


public class Date1 implements Serializable 
{
    private int day,month,year;
    
    public Date1()
    {
        this.day = 01;
        this.month = 06;
        this.year = 1997;
    }
    
    public Date1(int day,int month,int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public String showDate()
    {
        return day + " / " + month + " / " + year;
    }

}
