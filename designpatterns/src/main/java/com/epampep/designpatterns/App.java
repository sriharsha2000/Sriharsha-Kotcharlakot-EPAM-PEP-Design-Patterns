package com.epampep.designpatterns;
public class App 
{
    public static void main( String[] args )
    {
    	Singleton s = Singleton.getInstance();
    	System.out.println("Singleton ID = " + s.getId());
    	System.out.println("Singleton Name = " + s.getName());   	
    }
}
