package DSA_PROBLEMS;
import java.util.*;

public class MaxActivitySelectionNotOverlap {
	public static class Activity{
		int Start;
		int End;
		Activity(int Val1, int Val2){
			Start = Val1;
			End = Val2;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Activity> SE = new ArrayList<>();
		for(int i=0;i<N;i++) {
			int Start = sc.nextInt();
			int End = sc.nextInt();
			SE.add(new Activity(Start,End));
		}
		 /*int value = ActivitySelection(SE);
		 System.out.println(value);*/
		ActivitySelectionList(SE);
	}
	
	public static int ActivitySelection(List<Activity> SE) {
		int count = 0;
		int lastEnd = -1;
		Collections.sort(SE,(A,B) -> A.End - B.End);
		
		for(Activity act: SE) {
			if(act.Start >= lastEnd) {
				count++;
				lastEnd = act.End;
			}
		}
		return count;
	}
	
	public static void ActivitySelectionList(List<Activity> SE) {
		int lastEnd = -1;
		HashSet<Integer> edge = new HashSet<>();
		Collections.sort(SE,(A,B) -> A.End - B.End);
		
		for(Activity act: SE) {
			if(act.Start >= lastEnd) {
				lastEnd = act.End;
				edge.add(act.Start);
				edge.add(act.End);
			}
		}
		for(int i: edge) {
		    System.out.println("Edge " + i + " is Coloured");
		}

	}
	
	
}
