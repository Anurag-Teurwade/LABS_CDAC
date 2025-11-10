package stack;

import java.util.Scanner;

public class CharStackUsingLL {
	
	public static class Node{
		char data;
		Node next;
		
		Node(char data){
			this.data = data;
			this.next = null;
		}
	}
	
	public static class CharStackLL{
		private Node top;
		
		CharStackLL(){
			top = null;
		}
		
		public void push(char data) {
			
			Node newNode = new Node(data);
			newNode.next = top;
			
			top = newNode;
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
		
		public boolean isEmpty() {
			return (top == null);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CharStackLL stack = new CharStackLL();
		
		System.out.println("Enter the string : ");
		String str = sc.next();
		
		for(int i = 0 ; i < str.length(); i++) {
			char ch = str.charAt(i);
			stack.push(ch);
		}
		
		System.out.println("Reverse order of string :");
		stack.display();
		
		
		
				
				
	
	}

}


