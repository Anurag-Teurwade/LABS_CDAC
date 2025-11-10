package linkedList;

import java.util.Scanner;


public class DoubleLL {
	
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	public static int size;
	public static Node head;
	public static Node tail;
	
	/*--------------------------------------Insertion----------------------------------*/
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		size++;
		
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		newNode.next = head;  // 20 --> 10
		head.prev = newNode; // 20 <--- 10
		head = newNode;  
	}
	

	
	public void addByValue(int targetData,int newData) {
		
		//1.LL is empty
		if(head == null) {
			System.out.println("LL is empty");
			return ;
		}
		
		Node temp = head;
		
		//2.Find Node
		while(temp != null && temp.data != targetData) {
			temp = temp.next;
		}
		
		//3.Node not found
		if(temp == null) {
			System.out.println(targetData + "Not found !");
			return;
		}
		
		//4.Actually logic 
		Node newNode = new Node(newData);
		size++;
		
		//1.connect newNode and temp adjacent node
		newNode.next = temp.next;
		
		temp.next.prev = newNode;
		
		//2.connect temp and newNode
		temp.next = newNode;
		newNode.prev = temp;
	}
	
	public void addMiddle(int idx , int data) {
		
		if(idx >= 0 || idx < size) {
			System.out.println("Invalid index!");
			return ;
		}
		
		Node newNode = new Node(data);
		size++;
		
		Node temp = head;
	    int i = 0; //for iterating ll
	    while(i < idx - 1) {
	    	temp = temp.next;
	    	i++;
	    	
	    }
	    
	  //1.connect newNode and temp adjacent node
	    
	    newNode.next = temp.next;
	    temp.next.prev = newNode;
	    
	    
	  //2.connect temp and newNode
	    
	    temp.next = newNode;
	    newNode.prev = temp;
	   
	}
	
	
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		size++;
		
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}
	
	
	
	
	/*--------------------------------------Deletion----------------------------------*/
	public int removeFirst() {
		if(size == 0) {
			System.out.println("LL is empty");
			return 0;
		}
		
		else if(size == 1) {
			int val = head.data; //save what we are deleting
			head = tail = null;
			size = 0;
			return val;
		}
		
		//Actually logic
		int val = head.data;
		head = head.next;
		head.prev= null;  
		size--;
		return val;
			
	}



	public int removeByValue(int data) {
		
		//1.LL is empty
		if(size == 0) {
			System.out.println("LL is empty");
			return 0;
		}
			
		else if(size == 1) {
			int val = head.data; //save what we are deleting
			head = head.next;
			size = 0;
			return val;
		}
		
	    
	     Node temp = head;
		
		//2.Find Node
		while(temp != null && temp.data != data) {
			temp = temp.next;
		}
		
		//3.Node not found
		if(temp == null) {
			System.out.println(data + " Not found !");
			return 0;
		}
		
		//4.Actually logic 
		
		
		int val = temp.data;
		temp.prev.next = temp.next;
		temp.next.prev = temp.prev;
		
		//clean up
		temp.next = null;
		temp.prev = null;
		size--;
		
		return val;
		
			
	}


	public int removeMiddle(int idx) {
		

		
		//1.LL is empty
			if(size == 0) {
				System.out.println("LL is empty");
				return 0;
			}
				
			else if(size == 1) {
				int val = head.data; //save what we are deleting
				head = head.next;
				size = 0;
				return val;
			}
			
			else if(idx < 0 || idx >= size) {
				System.out.println("Invalid index!");
				return 0;
			}
			
			
			
		   
		   Node temp = head;
			
			//2.Find Node
			for(int i = 0 ; i < idx ; i++) {
				temp = temp.next;
			}
			
			//3.Node not found
			if(temp == null) {
				System.out.println(idx + " Not found !");
				return 0;
			}
			
			//4.Actually logic 
			
			int val = temp.data;
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
			
			
			temp.next = null;
			temp.prev = null;
			size--;
			
			return val;
			
	}


	public int removeLast() {
		if(size == 0) {
			System.out.println("LL is empty");
			return 0;
		}
		
		else if(size == 1) {
			int val = tail.data; 
			head = tail = null;
			size--;
			return val;
		}
		
			int val = tail.data;
			tail = tail.prev;
			tail.next = null;
			size--;
			return val;

	}

	/*--------------------------------------Count nodes of doubleLL----------------------------------*/
	
	public void count() {
		System.out.println("Number of nodes in Double LinkedList : " + size);
	}
	
	/*--------------------------------------Print LL----------------------------------*/

	public void display() {
		if(head == null) {
			System.out.println("LL is empty!");
			return;
		}
		Node temp = head;
		
		System.out.print("null<-->");
		while(temp != null) {
			System.out.print(temp.data + "<-->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public void reversePrint() {
		if(head == null) {
			System.out.println("LL is empty!");
			return;
		}
		Node temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		
		System.out.print("null<-->");
		while(temp != null) {
			System.out.print(temp.data + "<-->");
			temp = temp.prev;
		}
		System.out.println("null");
	}
	
	
	


	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DoubleLL ll = new DoubleLL();
		
		int choice = 0;
		int val = 0;
		
		
	    do {
	   	 
		    System.out.println("----------Menu-------");
		    System.out.println("1.AddFirst"+
		                       "\n2.AddLast"+
		                       "\n3.AddByValue"+
		                       "\n4.AddAtPosition"+
		                       "\n5.DeleteFirst"+
		                       "\n6.DeleteLast"+
		                       "\n7.DeleteByValue"+
		                       "\n8.DeleteByPostion"+
		                       "\n9.Count of Nodes"+
		                       "\n10.Reverse Print"+
		                       "\n11.Display"+
		    		           "\n0: Exit");
		    System.out.println("Enter your choice:: ");
		    choice = sc.nextInt();
		    
		    switch(choice) {
		    case 1:
		    	System.out.println("Enter the element to add at first : ");
		    	val = sc.nextInt();
		        ll.addFirst(val);
		    	break;
		    	
		    case 2:
		    	System.out.println("Enter the element to add at last : ");
		    	val = sc.nextInt();
		    	 ll.addLast(val);
		    	break;
		    case 3:
		    	System.out.println("Enter targetValue to add :");
		    	int targetValue = sc.nextInt();
		    	System.out.println("Enter newData to add :");
		    	int newData = sc.nextInt();
		    	ll.addByValue(targetValue, newData);
		    	break;
		    case 4:
		    	System.out.println("Enter index where node to add : ");
		    	int idx = sc.nextInt();
		    	System.out.println("Enter Data to add :");
		    	int data = sc.nextInt();
		    	ll.addMiddle(idx, data);
		    	break;
		    	
		    case 5:
	            System.out.println(ll.removeFirst());
	            System.out.println("Removed first node successfully!");
	            break;
	            
		    case 6:
	            System.out.println(ll.removeLast());
	            System.out.println("Removed last node successfully!");
	            break;
		    case 7:
		    	System.out.println("Enter the data to remove : ");
		    	int value = sc.nextInt();
		        ll.removeByValue(value);

		    	break;
		    	
		    case 8:
		    	System.out.println("Enter the idx of node to remove : ");
		    	int del = sc.nextInt();
		    	int v =ll.removeMiddle(del);
		    	System.out.println(v);
		    	System.out.println("Removed node from idx : "+ v +" successfully!");
		    	break;
		    case 9:
                ll.count();
		    	break;
		    	
		    case 10:
		    	System.out.println("---------Reverse Order Print--------\n");
		    	ll.reversePrint();
		    	System.out.println("----------------");
		    	break;
		    case 11:
		    	System.out.println("************");
		    	ll.display();
		    	System.out.println("************");
		    	break;
		    	
		    
		    	
		    case 12:
		    	System.exit(0);
		    }
		    
	    }while(choice != 0);
		    
		   
		
		sc.close();

	}

}


