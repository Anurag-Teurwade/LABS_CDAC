package linkedList;

public class CharLL {
	
	
	public static Node head;
	public static Node tail;


		
	public static class Node {
		char data;
		Node next;
		
		Node(char data){
			this.data = data;
			this.next = null;
		}
		
	}
	
	
	public void add(char data) {
		

		//1.create newNode
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		//2.tail next --> newNode
		tail.next = newNode;
		
		
		//3.head = newNode
		tail = newNode;
		
		
		
	}

	public static void main(String[] args) {
		
		CharLL ll = new CharLL();
		
		
		for(char ch = 'A' ; ch <= 'Z'; ch++) {
			ll.add(ch);
		}

		Node temp = head;
        while(temp != null) {
    		System.out.print(temp.data + "-->");
    		temp = temp.next;
        }
        System.out.println("null");
		

	}

}
