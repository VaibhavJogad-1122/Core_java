package com.app;

public class Orange extends Fruits{
	
	public Orange(String color, String name, double weight)
	{
		super(color,name,weight);
	}
	
	@Override
	public String taste()
	{
		return "Sour";
	}
	
	public void juice()
	{
		System.out.println(getName()+" "+getWeight()+" "+"Extracting juice!");
	}

}
