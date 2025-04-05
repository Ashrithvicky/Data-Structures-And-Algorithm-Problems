package DSA_PROBLEMS;

public class LinkedList {
	Node Head;
	class Node{
		int Data;
		Node Next;
		Node(int value){
			Data = value;
		}
	}
	
	public LinkedList() {
		Head = null;
	}
	
	public void InsertBeginning(int value){
		Node NewNode = new Node(value);
		if(Head == null) {
			Head = NewNode;
		}
		else {
			NewNode.Next = Head;
			Head = NewNode;
		}
	}
	
	public void InsertAtPosition(int value, int position) {
		Node NewNode = new Node(value);
		Node Temp = Head;
		for(int i=1;i<position;i++) {
			Temp = Temp.Next;
		}
		NewNode.Next = Temp;
		Temp.Next = NewNode;
	}
	
	public void Display() {
		Node Temp = Head;
		while(Temp != null) {
			System.out.print(Temp.Data + " ");
			Temp = Temp.Next;
		}
	}
}
