package linkedList;

public class EmpLL {
	
	public static class Emp {
		private int empid;
		private String ename;
		private float sal;
	}
	
	public static class Node {
		Emp e;
		Node next;
		
		Node(Emp e ){
			this.e = e;
			this.next = null;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
