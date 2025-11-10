package sorting;

import java.util.Scanner;

public class Selection {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();
		
		
		int arr[]=new int[n];	
		System.out.println("enter "+n+" values: ");
		
		for(int i=0;i<n;i++) 
		    arr[i]=sc.nextInt();//taking elements from user
		
		for(int i  = 0 ; i < n - 1; i++) {
			//Assume the current position holds the minimum element
			int minIdx = i;
			
			//Iterate through unsorted portion to find the actual minimum
			for(int j = i + 1 ; j < n  ; j++) {
				
				
				if(arr[j] < arr[minIdx]) {
					//update minIdx if smallest element found
					minIdx = j;
				}
			}
			
			    //Move minimum element to its correct position
				int temp = arr[i];
				arr[i] = arr[minIdx];
				arr[minIdx] = temp;
			
		}

		System.out.println("After sorting : ");
		for(int a : arr) {
			System.out.print(a + " ");
		}
		sc.close();
	}

}
