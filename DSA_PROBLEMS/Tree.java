package DSA_PROBLEMS;

import java.util.Scanner;

public class Tree {
	Node Head;
	class Node{
		int value;
		Node Left;
		Node Right;
		Node(int Value) {
			value = Value;
		}
	}
	
	public Tree() {
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
		boolean Bool_left = sc.nextBoolean();
		if(Bool_left) {
			System.out.println("Enter Value for Left Node "+Node.value+ " :");
			int Val = sc.nextInt();
			Node.Left = new Node(Val);
			insertNode(sc,Node.Left);		
		}	
		System.out.println("Do you Wanna Enter Right Value for the Node "+Node.value+" (True/false): ");
		boolean Bool_right = sc.nextBoolean();
		if(Bool_right) {
			System.out.println("Enter Value for Left Node "+Node.value+ " :");
			int Val = sc.nextInt();
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
