package com.app.core;

public enum Color {
WHITE(10000),SILVER(15000),BLACK(20000),BLUE(25000),RED(30000);
	
	private double colorCost;
	
	private Color(double colorCost)
	{
		this.colorCost=colorCost;
	}

	public double getColorCost() {
		return colorCost;
	}
	
	@Override
	public String toString()
	{
		return name()+ "@"+colorCost;
	}
}
