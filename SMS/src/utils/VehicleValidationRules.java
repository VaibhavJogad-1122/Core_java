package utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

import com.app.core.Color;
import com.app.core.Vehicle;

import custom_exception.VehicleHandlingException;

public class VehicleValidationRules {

	public static Vehicle validateAllInputs(String chasisNo, double basePrice, String vehicleColor, String manufactureDate, String company, List<Vehicle> vehicles) 
			throws VehicleHandlingException {
		checkForDuplicates(chasisNo, vehicles);
		Color validColor = parseAndValidateColor(vehicleColor);
		double netPrice = basePrice + validColor.getColorCost();
		LocalDate validDate = parseAndValidateDate(manufactureDate);
		return new Vehicle(chasisNo,netPrice,validColor,validDate,company);
	}
	
	public static LocalDate parseAndValidateDate(String date) throws DateTimeParseException, VehicleHandlingException{
		LocalDate d1 = LocalDate.parse(date);
		LocalDate beginYear = LocalDate.of(LocalDate.now().getYear(),01,01);
		if(d1.isAfter(beginYear))
			return d1;
		throw new VehicleHandlingException("Vehicle manufacture date must be after 1st Jan of the curnt year");
	}

	public static Color parseAndValidateColor(String clr) throws IllegalArgumentException
	{
		return Color.valueOf(clr.toUpperCase());
	}
	public static void checkForDuplicates(String newChasisNo,List<Vehicle> vehicles) throws VehicleHandlingException
	{
		Vehicle newVehicle = new Vehicle(newChasisNo);
		if(vehicles.contains(newVehicle))
		{
			throw new VehicleHandlingException("Dup Chasis No!!!!!!!!!!!");
		}
		System.out.println("no dup found!!!!");
	}
}
