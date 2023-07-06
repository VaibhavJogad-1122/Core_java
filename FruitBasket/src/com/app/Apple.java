package com.app;

public class Apple extends Fruits {
	
	public Apple(String color, String name, double weight)
	{
		super(color,name,weight);
	}
	
	@Override
	public String taste()
	{
		return "Sweet n sour";
	}
	
	public void jam()
	{
		System.out.println(getName()+" "+"Making jam!");
	}

}
