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
public class PriceException extends Exception
{
    public PriceException()
    {
        super("Price can not be negative.");
    }
    public PriceException(String msg)
    {
        super(msg);
    }
    
}