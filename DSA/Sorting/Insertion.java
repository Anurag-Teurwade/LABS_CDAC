package sorting;

import java.util.Scanner;

public class Insertion {
	

	public static void main(String[] args) {
		
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size:");
			int n=sc.nextInt();
			
		
			
			int arr[]=new int[n];	
			System.out.println("enter "+n+" values: ");
			
			for(int i=0;i<n;i++) 
			    arr[i]=sc.nextInt();//taking elements from user
			
			
			//start from index 1 as current element is consider as sorted
			for(int i = 1 ; i < n ; i++) {
				
				int key = arr[i];
				int j = i - 1;
				
				while(j >= 0 && arr[j] > key) {
					arr[j + 1] = arr[j]; //copy element
					j = j - 1; //decrement
				}
				
				//insert key at correct position
				arr[j + 1] = key;
				
			}

			
			System.out.println("After sorting : ");
			for(int i = 0 ; i < n ; i++) {
				System.out.print(arr[i] + " ");
			}
			sc.close();
		

	}

}
