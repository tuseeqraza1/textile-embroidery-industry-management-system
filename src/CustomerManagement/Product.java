/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerManagement;

import java.io.Serializable;
import java.util.ArrayList;


public class Product implements Serializable 
{
    private String products;
    private Double price;
    
    public Product()
    {
        products = ("Saree");
        price = (2000.0);
    }
    
    public Product(String products, double price)
    {
        this.products = products;
        this.price = price;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
}
