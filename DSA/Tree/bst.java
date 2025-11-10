package Tree;

import java.util.Scanner;

public class bst {
	
	static class Node {
		int data;
		Node left , right;
		
		Node(int data){
			this.data = data;
		}
		
		
	}
	
    public static Node insert(Node root , int val) {
    	
    	if(root == null) {
    		root = new Node(val);
    		return root;
    	}
    	
    	if(root.data > val) {
    		//left subtree
    		root.left = insert(root.left , val);
    	}else {
    		//right subtree
    		root.right = insert(root.right , val);
    	}
    	
    	return root;
    }
    
    public static void degreeOfNodes(Node root) {
    	
    	if(root == null) return;
    	
    	degreeOfNodes(root.left);
    	
    	int degree = 0;
    	
    	if(root.left != null) degree++;
    	if(root.right != null) degree++;
    	
    	System.out.println("Node : " + root.data + "  Degree : " + degree);
    	
    	degreeOfNodes(root.right);
    	
    }
    
    public static Node minValueNode(Node root) {
    	Node current = root;
    	
    	if(current.left != null) {
    		current = current.left;
    	}
    	
    	return current;
    }
    
    public static Node deleteNode(Node root , int key) {
    	
    	if(root == null) return root;
    	
    	if(key < root.data) {
    		root.left = deleteNode(root.left , key);
    	}else if(key > root.data) {
    		root.right = deleteNode(root.right , key);
    	}
    	
    	else {
    		
    		//1.No child
    		if(root.left == null && root.right == null) {
    			return null;
    		}
    		
    		//2. one child
    		else if(root.left == null) {
    			return root.right;
    		}
    		else if(root.right == null) {
    			return root.left;
    		}
    		
    		//3. two child
    		Node successor = minValueNode(root.right);
    		root.data = successor.data;
    		
    		root.right = deleteNode(root.right,successor.data);
    	}
    	
    	return root;
    	
    }
    
    
    public static void preOrder(Node root) {
    	
    	if(root == null) return;
    	
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
        
    }
    
    public static void inOrder(Node root) {
    	
    	if(root == null) return;
    	
    	inOrder(root.left);
    	System.out.print(root.data +  " ");
    	inOrder(root.right);
    }
    
    
    public static void postOrder(Node root) {
    	if(root == null) return;
    	
    	postOrder(root.left);
    	postOrder(root.right);
    	System.out.print(root.data + " ");
    }
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        int option=0,value=0;
        Node root = null;
		
		do{
			System.out.println("\n------------Menu--------");
			System.out.println("1:Add"+
					           "\n2:DegreeOfNode"+
					           "\n3:DeleteNode"+
			                   "\n11:PreOrder"+
					           "\n22:InOrder"+
			                   "\n33:PostOrder"+
			                   "\n0:exit");
			System.out.println("\nEnter choice:: ");
			option = sc.nextInt();
			
			switch(option)
			{
			case 1:
				System.out.println("Enter value: ");
				value = sc.nextInt();
				root = bst.insert(root , value);
				break;
				
			case 2 :
				System.out.println("----Degree of node-----");
				degreeOfNodes(root);
				break;
				
			case 3 :
			   System.out.println("Enter node to delete : ");
			   int del = sc.nextInt();
			   deleteNode(root , del);
			   System.out.println("Deleted Node succesfully : " + del);
			   break;
			   
			case 11:
				System.out.println("\nPreorder:: ");
                preOrder(root);
				System.out.println("\n");
				break;
			case 22:
				System.out.println("\nInOrder:: ");
                inOrder(root);
				System.out.println("\n");
				break;
			case 33:
				System.out.println("\nPostOrder:: ");
                postOrder(root);
				System.out.println("\n");
				break;
			case 0:
				System.exit(0);
			
			}//switch
		}while(option!=0);

		sc.close();

	}

}


