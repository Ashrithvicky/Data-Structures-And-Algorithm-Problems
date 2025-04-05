package DSA_PROBLEMS;

public class RemoveDuplicates {
	public void removeDuplicates(int[] nums) {
		int Count = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				Count += 1;
				if (Count > 2) {
					nums[i + 1] = 10;
					System.out.println(i);
					Swap(i + 1, nums); 
					i--;
				}
			} else {
				Count = 1; 
			}
		}
		Display(nums);
	}
	
	public void Swap(int i, int[] nums) {
		if (i == nums.length - 1 || nums[i + 1] == 10) { 
			return;
		} else {
			int Temp = nums[i];
			nums[i] = nums[i + 1];
			nums[i + 1] = Temp;
			Swap(i + 1, nums); 
		}
	}
	
	private void Display(int[] nums) {
		for (int i : nums) {
			if(i == 10) {
				System.out.println("_");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
