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
public class IntegerNeededException extends Exception
{
    public IntegerNeededException()
    {
        super("An integer is required.");
    }
    public IntegerNeededException(String msg)
    {
        super(msg);
    }
    
}