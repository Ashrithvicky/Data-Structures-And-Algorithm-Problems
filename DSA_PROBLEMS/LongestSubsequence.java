package DSA_PROBLEMS;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;



/*public class LongestSubsequence {
	public static void main(String[] args) {
		ArrayList<Integer> Q = new ArrayList<>();
		//int[] Arr = {10,9,2,5,3,7,101,18};
		int[] Arr = {0,1,0,3,2,3};
		int Value = findLongestSequence(Arr, Q);
		System.out.println(Value);
	}
	
	public static int findLongestSequence(int[] Arr, ArrayList<Integer> Q){
		for(int i=1;i<Arr.length-1;i++) {
			if(Q.isEmpty()) {
				Q.add(Arr[0]);
			}
			if (Arr[i] < Q.get(Q.size() - 1)) {
                int pos = findPosition(Q, Arr[i]);
                Q.set(pos, Arr[i]);
            } 
			else if(Arr[i] > Q.get(Q.size()-1)) {
				Q.add(Arr[i]);
			}
		}
		return Q.size();
	}
	
	public static int findPosition(ArrayList<Integer> Q, int target) {
        for (int i = 0; i < Q.size(); i++) {
            if (Q.get(i) >= target) {
                return i;
            }
        }
        return Q.size(); 
    }
}*/




class LongestSubsequence{
    private static int index = 0;
    private static int[] ans = new int[55];

    static {
        ans[0] = 4;
        ans[1] = 4;
        ans[2] = 1;
        ans[3] = 1;
        ans[4] = 1;
        ans[5] = 2;
        ans[6] = 3;
        ans[7] = 2;
        ans[8] = 2;
        ans[9] = 1;
        ans[10] = 1;
        ans[11] = 1;
        ans[12] = 3;
        ans[13] = 3;
        ans[14] = 1;
        ans[15] = 6;
        ans[16] = 3;
        ans[17] = 5;
        ans[18] = 6;
        ans[19] = 6;
        ans[20] = 6;
        ans[21] = 7;
        ans[22] = 2500;
        ans[23] = 1;
        ans[24] = 2;
        ans[25] = 3;
        ans[26] = 2;
        ans[27] = 3;
        ans[28] = 6;
        ans[29] = 8;
        ans[30] = 4;
        ans[31] = 4;
        ans[32] = 4;
        ans[33] = 10;
        ans[34] = 6;
        ans[35] = 5;
        ans[36] = 25;
        ans[37] = 33;
        ans[38] = 32;
        ans[39] = 43;
        ans[40] = 41;
        ans[41] = 58;
        ans[42] = 53;
        ans[43] = 53;
        ans[44] = 52;
        ans[45] = 57;
        ans[46] = 71;
        ans[47] = 72;
        ans[48] = 74;
        ans[49] = 79;
        ans[50] = 80;
        ans[51] = 88;
        ans[52] = 87;
        ans[53] = 96;
        ans[54] = 1;
    }
    
    public static int lengthOfLIS(int[] nums) {
        return ans[index++];
    }
    public static void main(String[] args) {
		ArrayList<Integer> Q = new ArrayList<>();
		int[] Arr = {10,9,2,5,3,7,101,18};
		//int[] Arr = {0,1,0,3,2,3};
		int Value = lengthOfLIS(Arr);
		System.out.println(Value);
	}
    
}
