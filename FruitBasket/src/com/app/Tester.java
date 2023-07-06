package com.app;
import java.util.*;
import static java.lang.System.*;
public class Tester {

	public static void main(String[] args) {
		int choice=0,counter=0;
		Scanner sc = new Scanner(in);
		System.out.println("Enter basket size");
		Fruits[] basket=new Fruits[sc.nextInt()];
		
		do {
			System.out.println("1.Add Mango.");
			System.out.println("2.Add Orange.");
			System.out.println("3.Add Apple.");
			System.out.println("4.Display");
			System.out.println("5.Display name,color,weight,taste of all fresh fruits in the basket.");
			System.out.println("6.Mark a fruit in a basket , as stale(=not fresh).");
			System.out.println("7.Mark all sour fruits stale.");
			System.out.println("8.Invoke fruit specific functionality (pulp / juice / jam).");
			System.out.println("9.Exit");
			System.out.println("Enter choice.");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				if(counter<basket.length)
				{
					basket[counter]=new Mango(sc.next(),sc.next(),sc.nextDouble());
					counter++;
				}
				System.out.println("Mango added.");
			break;
			case 2:
				if(counter<basket.length)
				{
					basket[counter]=new Orange(sc.next(),sc.next(),sc.nextDouble());
					counter++;
				}
				System.out.println("Orange added.");
			break;
			case 3:
				if(counter<basket.length)
				{
					basket[counter]=new Apple(sc.next(),sc.next(),sc.nextDouble());
					counter++;
				}
				System.out.println("Apple added.");
			break;
			case 4:
				for(Fruits f:basket)
				{
					if(f!=null)
					{
						System.out.println(f.getName());
					}
				}
			break;
			case 5:
				for(Fruits f:basket)
				{
					if(f!=null)
					{
						if(f.isFresh())
						System.out.println(f+" "+f.taste());
					}
				}
			break;
			case 6:
				System.out.println("Enter index for which fruit in a basket is to be marked as stale(=not fresh).");
				int index=sc.nextInt();
				if(index<counter)
				{
					basket[index].setFresh();
				}
				else
					System.out.println("Invalid index.");
			break;
			case 9:
				System.out.println("Exit.");
				break;
			default :
				System.out.println("Invalid choice.");
			}
			
		}while(choice!=7);
	}

}
