package DSA_PROBLEMS;

import DSA_PROBLEMS.DoublyLinkedList.Node;

public class PriorityQueue<T> {
	Node Head;
	Node Tail;
	class Node{
		T Value;
		Node Prev;
		Node Next;
		public Node(T Val){
			Value = Val;
			Next = null;
			Prev = null;
		}
	}
	
	public PriorityQueue() {
		Head = null;
		Tail = null;
	}
	
	public void InsertNodeAtBeginning(T Value) {
		Node NN = new Node(Value);
		if(Head == null) {
			Head = NN;
			Tail = NN;
		}
		else {
			Head.Prev = NN;
			NN.Next = Head;
			Head = NN;
		}
	}
	
	public void InsertNodeAtPosition(T Val, int Pos) {
		if(Pos == 0) {
			InsertNodeAtBeginning(Val);
		}
		Node NN =  new Node(Val);
		Node Temp = Head;
		for(int i=1;i<Pos;i++) {
			Temp = Temp.Next;
		}
		NN.Next = Temp.Next;
		if(Temp.Next == null) {
			Temp.Next = NN;
			Temp.Next.Prev = NN;
			NN.Prev = Temp;
		}
		Temp.Next.Prev = NN;
		Temp.Next = NN;
		NN.Prev = Temp;
	}
	
	public void Display() {
		Node Temp = Head;
		while(Temp != null) {
			System.out.println(Temp.Value);
			Temp = Temp.Next;
		}
	}
}
