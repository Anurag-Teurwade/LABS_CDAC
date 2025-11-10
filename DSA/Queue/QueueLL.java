package queue;

import java.util.Scanner;



public class QueueLL {
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	
	private Node front,rear;
	
	public QueueLL() {
		this.front = this.rear = null;
	}
	
	public void enQueue(int data) {
		Node newNode = new Node(data);
		if(rear == null) {
			front = rear = newNode;
			return;
		}
		
		rear.next = newNode;
		rear = newNode;
		
	}
	
	public int deQueue() {
		if(rear == null) {
			System.out.println("Queue is empty!");
		}
		
		int value = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		
		return value;
	}
	
	public int peek() {
		if(rear == null) {
			System.out.println("Queue is empty!");
		}
		
		return front.data;
	}
	
	public boolean isEmpty() {
		return (front == null);
	}

	public void display() {
		if(front == null) {
             System.out.println("Queue is empty");
		}
		Node temp = front;
		
		while(temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
QueueLL queue = new QueueLL();
		
		int choice = 0;
		
		do {
			System.out.println("---------Stack Menu----------\n");
			System.out.println("1.EnQueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Peek");
			System.out.println("4.Display");
			System.out.println("0.Exit");
			
			choice = sc.nextInt();
			
			
			switch(choice) {
			case 1:
				System.out.println("Enter the value to enqueue into queue : ");
				int val = sc.nextInt();
				queue.enQueue(val);
				break;
			case 2:
				int dequeued = queue.deQueue();
				if(dequeued != -1) {
					System.out.println("Front value : " + dequeued);
				}
				break;
			case 3:
				int front = queue.peek();
				if(front != -1) {
					System.out.println("Front value : " +front);
				}
				break;
				
			case 4:

				System.out.println("----QueueLL----");
				queue.display();
				System.out.println("\n\n");
				
				break;
				
			case 6:
				System.exit(0);
				break;
			default :
			System.out.println("Exited!");
			}
		}while(choice != 0);
		
	
		
		sc.close();
	}

}
