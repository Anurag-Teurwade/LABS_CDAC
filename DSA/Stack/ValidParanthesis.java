package stack;

public class ValidParanthesis {
	
	public static class Mystack{
		
		private char[] arr;
		private int top;
		private int capacity ;
		
		Mystack(int size){
			arr = new char[size];
			top = -1;
		    capacity = size;
		    
		}
		
		public void push(char data) {
			
			if(top <  capacity - 1) {
				arr[++top] = data;
			}
			
		}
		
		public char pop() {
			
			
			if(isEmpty()) {
				System.out.println("Stack is empty!");
				return 0;
			}
			
			char value = arr[top--];
			
			return value;
				
			
		}
		
		public char peek() {
			
			if(isEmpty()) {
				System.out.println("Stack is empty!");
			}
			
			return arr[top];
		}
		
		public boolean isEmpty() {
			return (top == -1);
		}
	}
	
public static boolean isValid(String str) {
	
	Mystack stack = new Mystack(str.length());
	
	for(int i = 0 ; i < str.length() ; i++) {
		char ch = str.charAt(i);
		
		if(ch == '(' || ch == '{' || ch == '[') {
			stack.push(ch);
		}else {
			if(stack.isEmpty()) {
				return false;
			}
			
			char top = stack.peek();
			if((top == '(' && ch == ')') || (top == '{' && ch == '}') || (top == '[' && ch == ']')) {
				stack.pop();
			}
			
			else {
				return false;
			}
		}
	}
	
	return stack.isEmpty();
}

	public static void main(String[] args) {
		
		
		String str = "({[]})";
		System.out.println(isValid(str));
		
		
		
		

	}

}
