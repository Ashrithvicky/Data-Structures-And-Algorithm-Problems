package AccentureTCSPrep;
import java.util.Arrays;


public class ArrayConcept {
	public static void main(String[] args) {
		String S1 = "aa";
		String S2 = "ab";
		int value = S2.indexOf(S1.charAt(0));
		String n = S2.substring(value, S2.length()) + S2.substring(0, value);
		if(S1.equals(n)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}

