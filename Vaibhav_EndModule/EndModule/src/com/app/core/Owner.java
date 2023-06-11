package com.app.core;

import java.time.LocalDate;

public class Owner {
	private String adharNo;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private String mob_no;
	private Property_Type propertyType;
	private LocalDate availabilityDate;
	private int rent;
	private boolean isRentOut;
	
	public Owner(String adharNo, String firstName, String lastName, String email, String address, String mob_no,
			Property_Type propertyType, LocalDate availabilityDate, int rent) {
		super();
		this.adharNo = adharNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.mob_no = mob_no;
		this.propertyType = propertyType;
		this.availabilityDate = availabilityDate;
		this.rent = rent;
		this.isRentOut = true;
	}

	@Override
	public String toString() {
		return "Owner [adharNo=" + adharNo + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", address=" + address + ", mob_no=" + mob_no + ", propertyType=" + propertyType
				+ ", availabilityDate=" + availabilityDate + ", rent=" + rent + ", isRentOut=" + isRentOut + "]";
	}
	
	
	

	
}
