package com.app.core;

import java.time.LocalDate;

public class Vehicle implements Comparable<Vehicle>{
	
	private String chasisNo;
	private double netPrice;
	private Color vehicleColor;
	private LocalDate manufactureDate;
	private String company;
	private boolean isAvailable;
	
	public Vehicle(String chasisNo, double netPrice, Color vehicleColor, LocalDate manufactureDate, String company) {
		super();
		this.chasisNo = chasisNo;
		this.netPrice = netPrice;
		this.vehicleColor = vehicleColor;
		this.manufactureDate = manufactureDate;
		this.company = company;
		this.isAvailable = true;
	}

	public Vehicle(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", netPrice=" + netPrice + ", vehicleColor=" + vehicleColor
				+ ", manufactureDate=" + manufactureDate + ", company=" + company + ", isAvailable=" + isAvailable
				+ "]";
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Vehicle)
			return this.chasisNo.equals(((Vehicle) o).chasisNo);
		return false;
	}
	
	@Override
	public int compareTo(Vehicle anotherVehicle)
	{
		return this.chasisNo.compareTo(anotherVehicle.chasisNo);
	}
	public String getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	public double getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}

	public Color getVehicleColor() {
		return vehicleColor;
	}

	public void setVehicleColor(Color vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	
}
