package DSA_PROBLEMS;
import java.util.*;
public class BinaryTree {
	Node Head;
	class Node{
		int value;
		Node Left;
		Node Right;
		Node(int Value) {
			value = Value;
		}
	}
	
	public BinaryTree() {
		Head = null;
	}
	
	private Node root;
	
	public void insertNode(Scanner sc) {
		System.out.println("Enter Root Value:");
		int Value = sc.nextInt();
		root = new Node(Value);
		insertNode(sc,root);
	}
	
	public void insertNode(Scanner sc, Node Node) {
		System.out.println("Do you Wanna Enter Left Value for the Node "+Node.value+" (True/false): ");
		boolean Bool = sc.nextBoolean();
		int Val = sc.nextInt();
		if(Bool == true && Val < Node.value) {
			System.out.println("Enter Value for Left Node "+Node.value+ " :");
			Node.Left = new Node(Val);
			insertNode(sc,Node.Left);		
		}			
		else if(Bool == true && Val > Node.value) {
			System.out.println("Enter Value for Left Node "+Node.value+ " :");
			Node.Right = new Node(Val);
			insertNode(sc,Node.Right);
		}
	}
	
	public void Display() {
		Display(root, " ");
	}

	private void Display(Node Node, String indent) {
		if(Node == null) {
			return;
		}
		System.out.println(Node.value + indent);
		Display(Node.Left,"\t");
		Display(Node.Right,"\t");
	}
}
