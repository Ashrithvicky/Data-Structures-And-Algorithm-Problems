package Placement_Training;

public class RotateLinkedList {
	Node Head;
	static int i = 1;
	class Node{
		int Data;
		Node Next;
		Node(int Data){
			this.Data = Data;
		}
	}
	
	public RotateLinkedList() {
		Head = null;
	}
	
	/*public void insertNode(int Value) {
		Node newNode = new Node(Value);
		if(Head == null) {
			Head = newNode;
		}
		else {
			insertAtPosition(i,Value);
			i++;
		}
	}
	
	private void insertAtPosition(int i, int Value) {
		Node newNode = new Node(Value);
		Node Temp = Head;
		for(int j=0;j<i;j++) {
			Temp = Temp.Next;
		}
	}*/
	
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
		if(position == 0) {
			InsertBeginning(value);
			return;
		}
		Node NewNode = new Node(value);
		Node Temp = Head;
		for(int i=1;i<position;i++) {
			Temp = Temp.Next;
		}
		//Temp.Next = NewNode.Next;
		NewNode.Next = Temp.Next;
	    Temp.Next = NewNode;
	}
	
	public void Display() {
		Node Temp = Head;
		while(Temp != null) {
			System.out.print(Temp.Data + " ");
			Temp = Temp.Next;
		}
	}
	
	public void RotateList() {
		Node Temp  = Head;
		while(Temp.Next.Next != null) {
			Temp = Temp.Next;
		}
		int ValueStore = Temp.Next.Data;
		Temp.Next = null;
		InsertBeginning(ValueStore);
	}
	
}
