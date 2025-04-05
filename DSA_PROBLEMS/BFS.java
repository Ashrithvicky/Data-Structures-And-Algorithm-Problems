package DSA_PROBLEMS;

import java.util.Queue;
import java.util.LinkedList;

public class BFS {
	static class Tree{
		int Data;
		Tree Left;
		Tree Right;
		public Tree(int value) {
			Data = value;
			Left = Right = null;
		}
	}
	
	public static Tree ConvertIntoTree(String[] Arr, int i) {
		if(i>Arr.length-1 || Arr[i] == null) {
			return null;
		}
		Tree Root = new Tree(Integer.parseInt(Arr[i]));
		Root.Left = ConvertIntoTree(Arr,i*2+1);
		Root.Right = ConvertIntoTree(Arr,i*2+2);	
		
		return Root;
	}
	
	public static void DisplayTreeDFS(Tree Root) {
		if(Root == null) {
			return;
		}
		System.out.println(Root.Data);
		DisplayTree(Root.Left);
		DisplayTree(Root.Right);
	}
	
	public static void DisplayTree(Tree Root) {
		if(Root == null) {
			return;
		}
		Queue<Tree> q = new LinkedList<>();
		q.add(Root);
		
		while(!q.isEmpty()) {
			Tree Curr = q.poll();
			System.out.println(Curr.Data);
			if(Curr.Left!= null) {
				q.add(Curr.Left);
			}
			if(Curr.Right != null) {
				q.add(Curr.Right);
			}
		}
	}
	
	
	public static void main(String[] args) {
		String[] Arr = {"1","2","3","4","5","6","7"};
		Tree Root = ConvertIntoTree(Arr, 0);
		DisplayTree(Root);
	}
}

