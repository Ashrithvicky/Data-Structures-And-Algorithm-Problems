package DSA_PROBLEMS;

public class LinkedListSort {
	Node Head;
	public class Node{
		int Data;
		Node Next;
		public Node(int Value) {
			Data = Value;
		}
	}
	
	public LinkedListSort() {
		Head = null;
	}
	
	public void AddData(int Value) {
		Node NewNode = new Node(Value);
		if(Head == null) {
			Head = NewNode;	
		}
		else {
			NewNode.Next = Head;
			Head = NewNode;
		}
	}

	public void Display() {
		System.out.println("Entered Display:");
		Node Temp = Head;
		while(Temp!= null) {
			System.out.println(Temp.Data);
			Temp = Temp.Next;
		}
	}
	
	public void SortingBubble() {
	    System.out.println("Entered Sorting Bubble:");
	    
	    if (Head == null || Head.Next == null) {
	        return; // If the list is empty or has only one node, it's already sorted.
	    }
	    
	    boolean Swapped;
	    do {
	        Swapped = false; // Reset swap flag for each pass.
	        Node Temp = Head;
	        
	        while (Temp.Next != null) { // Traverse the list
	            if (Temp.Data > Temp.Next.Data) {
	                // Swap the data of the two nodes
	                int D = Temp.Next.Data;
	                Temp.Next.Data = Temp.Data;
	                Temp.Data = D;

	                Swapped = true; // Indicate a swap occurred
	            }
	            Temp = Temp.Next;
	        }
	    } while (Swapped); // Repeat until no swaps are made in a pass.
	}

	
	/*public void SortingBubble() {
		System.out.println("Entered Sorting Bubble:");
		Node Temp = Head;
		if(Temp == null || Temp.Next == null) {
			return;
		}
		while(Temp != null) {
			if(Temp.Data > Temp.Next.Data) {
				int D = Temp.Next.Data;
				Temp.Next.Data = Temp.Data;
				Temp.Data = D;
			}
			Temp = Temp.Next;
		}
	}
	
	/*public void Sort() {
		Node Temp = Head;
		while(Temp!= null) {
			if(Temp.Data > Temp.Next.Data) {
				Temp.Next = Temp.Next.Next;
				Temp.Next = Temp;
			}
		}
		while(Temp!=null) {
			System.out.println(Temp.Data);
			Temp = Temp.Next;
		}
	}*/
	
	/*public void SortElement(Node NewNode) {
		Node Temp = NewNode;
		if(Temp.Data > Temp.Next.Data) {
			Node TempVar = Temp.Next;
			Temp.Next = Temp;
			Temp = TempVar;
		}
	}*/
	
	 /*private void SortList(Node Current) {
	        // Base case: If the list is empty or there's only one node
	        if (Current == null || Current.Next == null) {
	            return;
	        }

	        // If current node's data is greater than the next node's data, swap them
	        if (Current.Data > Current.Next.Data) {
	            int Temp = Current.Data;
	            Current.Data = Current.Next.Data;
	            Current.Next.Data = Temp;
	        }

	        // Recursive call for the next node
	        SortList(Current.Next);
	    }*/
}
