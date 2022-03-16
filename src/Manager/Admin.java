/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import java.io.Serializable;
import java.util.ArrayList;
import oop_project.Address;
import oop_project.Person;


public class Admin extends Person implements Serializable
{
    private int ID;
    private String des;
    private String password;
    
    public Admin()
    {
        super();
        des = "Manager";
        password = "12345";
        ID = 01;
    }
        
    public Admin(int ID, String name, String phone, String cnic, String gender, Address address, String des, String password)
    {
        super( name, phone, cnic, gender, address);
        this.des = des;
        this.password = password;
        this.ID = ID;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
}
