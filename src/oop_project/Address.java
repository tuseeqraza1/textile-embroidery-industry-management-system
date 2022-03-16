/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

import java.io.Serializable;


public class Address implements Serializable
{
    private String city,full_address;
    
    public Address()
    {
        this.city = "Islamabad";
        this.full_address = "Street.7A, Royal Avenue";
    }
    
    public Address(String full_address, String city)
    {
        this.city = city;
        this.full_address = full_address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFull_address() {
        return full_address;
    }

    public void setFull_address(String full_address) {
        this.full_address = full_address;
    }
    
}
