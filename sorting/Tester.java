package sorting;

import java.util.Scanner;
import static sorting.Sorting.*;

public class Tester {

	
	
	
	public static void main(String[] args) {
			try(Scanner sc = new Scanner(System.in))
			{
				int arr[] ;
				
				System.out.println("Enter array size ");
					arr = new int[sc.nextInt()];
					
				for (int i = 0; i <= arr.length -1 ; i++)
				{
					System.out.println("Enter " + (i+1) + " element : ");
					arr[i] = sc.nextInt();
				}
				
				System.out.println("Press 1 : For Selection Sort. \n"
						+ "Press 2 : For Insertion Sort. \n"
						+ "Press 3 : For Bubble Sort. \n"
						+ "Press 4 : For Merge Sort. \n");
				
				
				switch(sc.nextInt()) 
				{
				case 1 :
						System.out.println("Before Sorting Array : ");
						display(arr);
						System.out.println();
						System.out.println("After Selection Sorting Array : ");
						selection_sort(arr);
						display(arr);
					break;
				
				
				case 2 :
					System.out.println("Before Sorting Array : ");
					display(arr);
					System.out.println();
					System.out.println("After Insertion Sorting Array : ");
					insertion_sort(arr);
					display(arr);
					break;
				
				
				case 3 :
					System.out.println("Before Sorting Array : ");
					display(arr);
					System.out.println();
					System.out.println("After Bubble Sorting Array : ");
					bubble_sort(arr);
					display(arr);
					break;
				
				
				case 4 :
					System.out.println("Enter searching element ");
					int key4 = sc.nextInt();
					break;
				}
				
				
			}catch(Exception e)
			{
				e.printStackTrace();
				System.out.println(e);
			}
	}

}
