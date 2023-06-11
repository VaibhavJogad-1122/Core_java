package Tester;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import static Validation.ValidationRules.validateNewOwner;

import com.app.core.Owner;

public class PropertyRentManagementSystem {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in))
		{
			Set<Owner> properties = new HashSet<>();
			boolean exit=false;
			
			while(!exit)
			{
				try
				{
					System.out.println("Option 1.Add new owner. 2. Display owner details");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter all the owner details as adharNo,firstName,lastName,email,address,mob_no,propertyType,availabilityDate,rent");
						Owner newOwner = validateNewOwner(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt());
						properties.add(newOwner);
						break;
					case 2:
						for(Owner o: properties)
						{
							System.out.println(o);
						}

					default:
						break;
					}
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
				
		}
		
	}

}
