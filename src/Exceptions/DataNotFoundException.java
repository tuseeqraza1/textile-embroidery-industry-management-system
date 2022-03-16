/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author tusee
 */
public class DataNotFoundException extends Exception
{
    public DataNotFoundException()
    {
        super("Data not found.");
    }
    public DataNotFoundException(String msg)
    {
        super(msg);
    }
    
}