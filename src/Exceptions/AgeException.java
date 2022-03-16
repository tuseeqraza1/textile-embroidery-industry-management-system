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
public class AgeException extends Exception
{
    public AgeException()
    {
        super("Age can not be negative.");
    }
    public AgeException(String msg)
    {
        super(msg);
    }
    
}
