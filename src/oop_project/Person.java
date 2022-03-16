/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

import java.io.Serializable;



public class Person implements Serializable
{
    private String name,phone,gender,cnic;
    private Address address;
    
    public Person()
    {
        this.name = "Tuseeq";
        this.phone = "0123456789";
        this.cnic = "3320207686093";
        this.gender = "male";
        this.address = new Address();
    }
    
    public Person(String name, String phone, String cnic, String gender, Address address)
    {
        this.name = name;
        this.phone = phone;
        this.cnic = cnic;
        this.gender = gender;
        this.address = address;
    }
    
    public Person(String name, String phone, String cnic, Address address)
    {
        this.name = name;
        this.phone = phone;
        this.cnic = cnic;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public void Display()
    {
        System.out.println("Name   : " + name);
        System.out.println("Phone  : " + phone);
        System.out.println("CNIC   : " + cnic);
        System.out.println("Gender : " + gender);
    }
    
}