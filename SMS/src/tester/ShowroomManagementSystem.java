package tester;

import static utils.VehicleValidationRules.parseAndValidateColor;
import static utils.VehicleValidationRules.parseAndValidateDate;
import static utils.VehicleValidationRules.validateAllInputs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.app.core.Color;
import com.app.core.Vehicle;

import custom_exception.VehicleHandlingException;

public class ShowroomManagementSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Vehicle> showroom = new ArrayList<>();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1. Add a Vehicle 2. Display all "
						+ "3. Get specific vehicle details 4. Apply discount  "
						+ "5. Delete vehicle details  by ch no 6. Delete vehicles by color "
						+ "7. Sort the vehicles as per ch no " + "8. Sort the vehicles as per price "
						+ "9. Sort the vehicles as per date n price " + "10. Sort the vehicles as per date 0. Exit");
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter vehicle details : chasisNo, basePrice, vehicleColor, manufactureDate, company");
						Vehicle validVehicle = validateAllInputs(sc.next(), sc.nextDouble(), sc.next(), sc.next(),
								sc.next(), showroom);
						showroom.add(validVehicle);
						System.out.println("vehicle added.....");
						break;
					case 2:
						for (Vehicle v : showroom) {
							System.out.println(v);
						}
						break;
					case 3:
						System.out.println("Enter chasis no.");
						Vehicle specificVehicle = new Vehicle(sc.next());
						int index = showroom.indexOf(specificVehicle);
						if (index == -1)
							throw new VehicleHandlingException("Invalid chasis no.!!!! Vehicle not found");
						System.out.println(showroom.get(index));
						break;
					case 4:
						System.out.println("Enter manufacture date and discount.");
						LocalDate d1 = parseAndValidateDate(sc.next());
						double discount = sc.nextDouble();
						for (Vehicle v : showroom) {
							if (v.getManufactureDate().isBefore(d1)) {
								v.setNetPrice(v.getNetPrice() - discount);
								System.out.println(v);
							}
						}
						break;
					case 5:
						System.out.println("Enter chasis no , to delete vehicle details");
						index = showroom.indexOf(new Vehicle(sc.next()));
						if (index == -1)
							throw new VehicleHandlingException(
									"Invalid chasis no.!!!! Vehicle not found, can't be deleted.");
						System.out.println("Removed " + showroom.remove(index));
						break;
					case 6:
						System.out.println("Enter Color , to delete vehicle details");
						Color choosenColor = parseAndValidateColor(sc.next());
						Iterator<Vehicle> itr = showroom.iterator();
						while (itr.hasNext()) {
							if (itr.next().getVehicleColor() == choosenColor)
								itr.remove();
						}
						break;
					case 7:
						Collections.sort(showroom);
						break;
					case 8:
						Collections.sort(showroom, new Comparator<Vehicle>() {
							public int compare(Vehicle v1, Vehicle v2) {
								if (v1.getNetPrice() < v2.getNetPrice())
									return -1;
								else if (v1.getNetPrice() > v2.getNetPrice())
									return 1;
								return 0;
							}
						});
						break;
					case 9:
						Collections.sort(showroom, new Comparator<Vehicle>() {
							public int compare(Vehicle v1, Vehicle v2) {
								int i = v1.getManufactureDate().compareTo(v2.getManufactureDate());
								if (i == 0) {
									if (v1.getNetPrice() < v2.getNetPrice())
										return -1;
									else if (v1.getNetPrice() > v2.getNetPrice())
										return 1;
									return 0;
								}
								return i;
							}
						});
						break;
					case 0:
						exit = true;
						break;
					default:
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}
	}

}
