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
public class DataExistsException extends Exception
{
    public DataExistsException()
    {
        super("Similar data already exists.");
    }
    public DataExistsException(String msg)
    {
        super(msg);
    }
    
}