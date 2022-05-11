package com.alphawallet.token.entity;

import java.util.Map;

/**
 * Created by Dhaval on 2/04/2019.
 */
public class TSAction
{
    public int order;
    public String exclude;
    public TSTokenView view;
    public String style = "";
    public String name;

    public Map<String, Attribute> attributes;
    public FunctionDefinition function;
}
