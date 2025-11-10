package stack;

import java.util.Scanner;

public class LinkedStack {
	
	public static class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public static class LLStack{
		
		private Node top;
		
		LLStack(){
			top = null;
		}
		
		public void push(int data) {
			
			Node newNode = new Node(data);
			newNode.next = top;
			
			top = newNode;
			
			System.out.println(data +" push to stack");
		}
		
		public int pop() {
			if(isEmpty()) {
				System.out.println("Stack is empty!");
			}
			int val = top.data;
			top = top.next;
			return val;
		}
		
		public int peek() {
			if(isEmpty()) {
				System.out.println("Stack is empty!");
				return 0;
			}
			
			
			    return top.data;
		}
		
		public boolean isEmpty() {
			return (top == null);
		}
		
		public void display() {
			
			Node temp = top;
			
			if(!isEmpty()) {
				
				while(temp != null) {
					System.out.print(temp.data + "-->");
					temp = temp.next;
				}
				System.out.println("null");
				
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LLStack stack = new LLStack();
		
		int choice = 0;
		
		do {
			System.out.println("---------Stack Menu----------\n");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Display");
			System.out.println("0.Exit");
			
			choice = sc.nextInt();
			
			
			switch(choice) {
			case 1:
				System.out.println("Enter the value to push into stack : ");
				int val = sc.nextInt();
				stack.push(val);
				break;
			case 2:
				int popped = stack.pop();
				if(popped != -1) {
					System.out.println("Popped value : " + popped);
				}
				break;
			case 3:
				int top = stack.peek();
				if(top != -1) {
					System.out.println("Top value : ");
				}
				break;
				
			case 4:

				System.out.println("----StackLL----");
				stack.display();
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
