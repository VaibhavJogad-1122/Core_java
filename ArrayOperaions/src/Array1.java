import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		int choice=0;
		int [] arr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Array elemnts: ");
		int size = sc.nextInt();
		arr = new int[size];
		System.out.println("Array created for storing "+arr.length+" elements.");
		
		do {
			System.out.println("\nMENU");
			System.out.println("1.Read Array\n2.Print Array\n3.Search element in array\n4.Reverse array\n5.Even numbers from array\n6.Sum of array elements\n7.Exit");
			System.out.println("Enter choice. ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			    case 1: 
					System.out.println("Enter array elements");
					for(int i=0; i<arr.length; i++)
					{
						arr[i] = sc.nextInt();
					}
				break;
				case 2:
					System.out.println("Array elements you entered are: ");
					for(int i=0; i<arr.length; i++)
					{
						System.out.print(arr[i]+" ");
					}
				break;
				case 3:
					System.out.println("\nEnter element to search");
					int num = sc.nextInt();
					int flag = 0;
					for(int i:arr) 
					{
						if(i==num)
						{
							flag=1;
							break;	
						}
					}
					if(flag==1)
					{
						System.out.println("Element found");
					}
					else
					{
						System.out.println("Element not found");
					}
				break;
				case 4:
					int temp=0;
					for(int i=0,j=arr.length-1; i<j; i++,j--)
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
					System.out.println("Reversed array:");
					for(int i=0; i<arr.length; i++)
					{
						System.out.print(" "+arr[i]);
					}
				break;
				case 5:
					System.out.println("\nEven numbers from array:");
					for(int i:arr)
					{
						if(i%2==0)
						{
							System.out.print(" "+i);
						}
					}
				break;
	            case 6:
					int sum=0;
					for(int i:arr)
					{
						sum=sum+i;
					}
					System.out.println("\nSum of all array elements= "+sum);
				break;
				case 7:
					System.out.println("Exit");
				break;
				default:
					System.out.println("Invalid input");
					
			}
		}while(choice!=7);
			
	}

}
