package queue;

import java.util.Scanner;

public class QueueClient {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int choice = 0 , size , val;
		QueueArray q = new QueueArray();
		
		
		
         do {
        	 
 		    System.out.println("----------Menu-------");
 		    System.out.println("1.InitQueue"+
 		                       "\n2.EnQueue"+
 		    		           "\n3.DeQueue"+
 		                       "\n4.Display"+
 		    		           "\n0: Exit");
 		    System.out.println("Enter your choice:: ");
 		    choice = sc.nextInt();
 		    
 		    switch(choice) {
 		    case 1 :
 		    	System.out.println("Enter the size of queue");
 		    	size = sc.nextInt();
 		    	q.initQueue(size);
 		    	break;
 		    	
 		    case 2 :
 		    	System.out.println("Enter the value to enqueue");
 		    	val = sc.nextInt();
 		    	q.enQueue(val);
 		    	System.out.println("Value enqueued successfully !");
 		    	break;
 		    case 3 :
 		    	val = q.deQueue();
 		    	
 		    	if(val != -1) {
 		    		System.out.println("Dequeued value : "+val);
 		    	}
 		    	break;
 		    	
 		    case 4 :
 		    	System.out.println("********************");
 		    	q.display();
 		    	System.out.println("********************");
 		    	break;
 		    	
 		    case 5 :
 		    	System.exit(0);
 		    	break;
 		    }
        	 
         }while(choice!= 0);
sc.close();
	}

}
