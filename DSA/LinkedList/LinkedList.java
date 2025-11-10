package linkedList;

import java.util.Scanner;

public class LinkedList {

public static Node head;
public static Node tail;
public static int size;

	
public static class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
	
}

/*--------------------------------------Insertion----------------------------------*/

public void addFirst(int data) {
	
	//1.create newNode
	
	Node newNode = new Node(data);
	size++;
	
	if(head == null) {
		head = tail = newNode;
		return;
	}
	
	//2.newNode next --> head
	newNode.next = head;
	
	//3.head = newNode
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
	
	newNode.next = temp.next;
	
	temp.next = newNode;
	
	
	
}


public void addMiddle(int idx , int data) {
	
	Node newNode = new Node(data);
	size++;
	
	Node temp = head;
    int i = 0; //for iterating ll
    while(i < idx - 1) {
    	temp = temp.next;
    	i++;
    	
    }
    
    newNode.next = temp.next;
    temp.next = newNode;
}


public void addLast(int data) {
	
	//1.create newNode
	
	Node newNode = new Node(data);
	size++;
	
	if(head == null) {
		head = tail = newNode;
		return;
	}
	
	//2.tail next --> newNode
	tail.next = newNode;
	
	
	//3.head = newNode
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
	
Node prev = null;
Node temp = head;
	
	//2.Find Node
	while(temp != null && temp.data != data) {
		prev = temp;
		temp = temp.next;
	}
	
	//3.Node not found
	if(temp == null) {
		System.out.println(data + "Not found !");
		return 0;
	}
	
	//4.Actually logic 
	
	
	int val = temp.next.data;
	prev.next = temp.next;
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
		
		else if(idx >= 0 || idx < size) {
			System.out.println("Invalid index!");
			return 0;
		}
		
	   Node prev = null;
	   Node temp = head;
		
		//2.Find Node
		while(temp != null && temp.data != idx) {
			temp = temp.next;
		}
		
		//3.Node not found
		if(temp == null) {
			System.out.println(idx + "Not found !");
			return 0;
		}
		
		//4.Actually logic 
		
		
		int val = temp.next.data;
		prev.next = temp.next;
		size--;
		
		return val;
		
}


public int removeLast() {
	if(size == 0) {
		System.out.println("LL is empty");
		return 0;
	}
	
	else if(size == 1) {
		int val = head.data; //save what we are deleting
		head = tail = null;
		size--;
		return val;
	}
	
	Node prev = head;
	
   //Find Pivot --> previous to tail
	for(int i = 0 ; i < size- 2;i++) {
		prev = prev.next;
	}
	
	int val = prev.next.data;
	prev.next = null;
	prev = tail;
	size--;
	return val;
		
}


/*--------------------------------------Update----------------------------------*/

public void UpdateByValue(int oldValue,int newValue) {
	
	//1.LL is empty
	if(head == null) {
		System.out.println("LL is empty");
		return ;
	}
	
	Node temp = head;
	
	//2.Find Node
	while(temp != null && temp.data != oldValue) {
		temp = temp.next;
	}
	
	//3.Node not found
	if(temp == null) {
		System.out.println(oldValue + "Not found !");
		return;
	}
	
	//4.Actually logic 
    temp.data = newValue;
	
	
	
}


/*--------------------------------------Reverse LinkedList----------------------------------*/

public void reverse() {
	//3 pointers
	Node prev = null;
	Node curr = tail = head;
	Node next;
	
	while(curr != null) {
		next = curr.next;
		curr.next = prev; //reverse
		prev = curr;
		curr = next;
	}
	
	head = prev; //now prev --> head
}



/*--------------------------------------Print LL----------------------------------*/

public void display() {
	if(head == null) {
		System.out.println("LL is empty!");
	}
	Node temp = head;
	
	while(temp != null) {
		System.out.print(temp.data + "-->");
		temp = temp.next;
	}
	System.out.println("null");
}





public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	
	LinkedList ll = new LinkedList();
	
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
	                       "\n9.UpdateByValue"+
	                       "\n10.ReverseLL"+
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
	    	 System.out.println("Removed node successfully!");
	    	break;
	    	
	    case 8:
	    	System.out.println("Enter the idx of node to remove : ");
	    	int del = sc.nextInt();
	    	int v =ll.removeMiddle(del);
	    	System.out.println(v);
	    	System.out.println("Removed node from idx : "+ v +" successfully!");
	    	break;
	    case 9:
	    	System.out.println("Enter the oldValue :  ");
	    	int oldval = sc.nextInt();
	    	System.out.println("Enter the newValue :  ");
	    	int newval = sc.nextInt();
	    	ll.UpdateByValue(oldval, newval);
	    	 System.out.println("Updated successfully!");
	    	break;
	    	
	    case 10:
	    	System.out.println("---------Reverse LinkedList--------");
	    	ll.reverse();
	    	ll.display();
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
