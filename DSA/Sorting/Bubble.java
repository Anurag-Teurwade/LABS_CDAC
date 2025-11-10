package sorting;


import java.util.Scanner;

public class Bubble {
public static void main(String[]  args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size:");
	int size=sc.nextInt();
	
	int count=0;
	
	int arr[]=new int[size];	
	System.out.println("enter "+size+" values: ");
	
	for(int i=0;i<size;i++) 
	    arr[i]=sc.nextInt();

	//4 7 1 `
	
	
	for(int i=0;i<size-1;i++) {
		System.out.println("pass"+(i+1));
		for(int j=0;j<size-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				count++;
			}			

			for(int z=0;z<size;z++) {
				System.out.print("\t"+arr[z]);
			
			}	System.out.println("");
			}
		

	}	
System.out.println("pass:"+(size-1));	
System.out.println("swap:"+count);
System.out.println("Final Sorted Array");
for(int z=0;z<size;z++) {
	System.out.print("\t"+arr[z]);}

sc.close();

}


}