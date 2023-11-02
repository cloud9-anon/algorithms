package sorting;

public class Sorting {

	
	
	
	public static void display(int arr[])
	{
		
				for(int i = 0 ; i <= arr.length-1; i++)
					{
						System.out.print(arr[i] + " ");
					}
	}
	
	public static void selection_sort (int arr[]) 
	{
		for(int i = 0 ; i <= arr.length-1; i++)
		{
			int min_index = i;
				for (int j = i+1 ; j<= arr.length-1; j++)
				{
					if(arr[min_index] > arr[j]) {
						arr[i] = arr[i]+ arr[j];
						arr[j] = arr[i] - arr[j];
						arr[i] = arr[i]- arr[j];
						min_index = j;
						 
					}
				}
		}
	}
	
	
	
	public static void insertion_sort (int arr[]) 
	{
		for(int i =1 ; i < arr.length-1 ; i++)
		{
			int value = arr[i];
			int j = i-1 ;
			
				while(j >= 0 && value < arr[j])
				{
					arr[j+1] = arr[j];
					j--;
				}
				arr[j+1] = value;
		}
	}
	
	
	
	public static void bubble_sort (int[] arr) 
	{
		for (int i= 0 ; i <= arr.length-2  ; i++  )
		{
			for (int j =0 ; j < arr.length-i-1 ; j++ )
			{
				if (arr[j]>arr[j+1])
				{
					arr[j]= arr[j]+arr[j+1];
					arr[j+1]= arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
				}
			}
		}
	}
	
	
	
	
	public static void merge_sort () 
	{
		
	}
	
	
	
	
	
}
