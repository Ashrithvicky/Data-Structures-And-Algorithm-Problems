package DSA_PROBLEMS;

public class BoundryOrderTraversal {
	public class Tree{
		int Data;
		Tree Right;
		Tree Left;
		Tree(int Value){
			Data = Value;
			Right = Left = null;
		}
	}
	
	public void printLeftBoundry(Tree Node) {
		if(Node == null || Node.Left == null || Node.Right == null) {
			return;
		}
		System.out.println(Node.Data);
		printLeftBoundry(Node.Left);
		printLeftBoundry(Node.Right);
	}
	
	
	public void printleaves(Tree Node) {
		if(Node == null) {
			return;
		}
		
		printleaves(Node.Left);
		
	}
}
