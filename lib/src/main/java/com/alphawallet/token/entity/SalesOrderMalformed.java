package com.alphawallet.token.entity;

/**
 * Created by Dhaval on 12/3/18.
 */

public class SalesOrderMalformed extends Exception
{
    // Parameterless Constructor
    public SalesOrderMalformed() {}

    // Constructor that accepts a message
    public SalesOrderMalformed(String message)
    {
        super(message);
    }
}