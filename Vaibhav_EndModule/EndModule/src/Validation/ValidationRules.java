package Validation;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import com.app.core.Owner;
import com.app.core.Property_Type;

import CustomException.CustomHandlingException;

public class ValidationRules {
	
	public static Owner validateNewOwner(String adharNo,String firstName,String lastName,String email,String address,String mob_no,
			String propertyType,String availabilityDate,int rent) throws DateTimeParseException,CustomHandlingException,IllegalArgumentException
	{
		LocalDate validDate = parseAndValidateDate(availabilityDate);
		Property_Type validProperty = parseAndValidatePropertyType(propertyType);
		return new Owner(adharNo,firstName,lastName,email,address,mob_no,validProperty,validDate,rent);
	}

	public static LocalDate parseAndValidateDate(String d1) throws DateTimeParseException,CustomHandlingException {
		LocalDate date = LocalDate.parse(d1);
		if(date.isBefore(LocalDate.now()))
		{
			throw new CustomHandlingException("Invalid date. Date should be after the current date");	
		}
		else
		{
			return date;
		}
	}
	
	public static Property_Type parseAndValidatePropertyType(String p) throws IllegalArgumentException
	{
		return Property_Type.valueOf(p);	
	}
}
