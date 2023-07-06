package com.app;

public class Mango extends Fruits{
	
	public Mango(String color, String name, double weight)
	{
		super(color,name,weight);
	}
	
	@Override
	public String taste()
	{
		return "Sweet";
	}

	public void pulp()
	{
		System.out.println(getName()+" "+getColor()+" "+"Creating pulp!");
	}
}
