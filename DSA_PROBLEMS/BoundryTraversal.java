package DSA_PROBLEMS;
import java.util.ArrayList;

public class BoundryTraversal{
	ArrayList<Integer> List;
	Node root;
	class Node{
		int data;
		Node left,right;
		Node(int value){
			data = value;
			left = null;
			right = null;
		}
	}
	
	public BoundryTraversal(){
		root = null;
		List = new ArrayList<Integer>();
	}
	
	public void convertTree(String[] Arr) {
		root = new Node(Integer.parseInt(Arr[0]));
		leftNodeValueAssign(root.left, Arr);
		rightNodeValueAssign(root.right, Arr);
	}
	
	public void leftNodeValueAssign(Node root, String[] Arr) {
		int i = 1;
		if(i > Arr.length || Arr[i] == "null") {
			return;
		}
		else {
			root.left = new Node(Integer.parseInt(Arr[i]));
			leftNodeValueAssign(root.left, Arr);
			i += 2;
		}
	}
	
	public void rightNodeValueAssign(Node root, String[] Arr) {
		int i = 2;
		if(i > Arr.length || Arr[i] == "null") {
			return;
		}
		else {
			root.right = new Node(Integer.parseInt(Arr[i]));
			rightNodeValueAssign(root.right, Arr);
			i += 2;
		}
	}
	
	public void ListAddTree(Node root) {
		List.add(root.data);
		leftValueAdd(root.left);
		rightValueAdd(root.right);
	}
	
	public void leftValueAdd(Node root) {
		if(root.left == null) {
			return;
		}
		else {
			List.add(root.left.data);
			leftValueAdd(root.left);
		}
	}
	
	public void rightValueAdd(Node root) {
		if(root.right == null) {
			return;
		}
		else {
			List.add(root.left.data);
			rightValueAdd(root.right);
		}
	}
	
	public void DisplayTree() {
		for(int i=0;i<List.size();i++) {
			System.out.println(List.get(i));
		}
	}
}
