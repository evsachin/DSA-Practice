package dsa;

import java.util.Arrays;

public class CopyArrray {

	public static void main(String[] args) {

		int nums[] = { 2, 4, 5, 6, 7, 8, 9 };
		int copy[] = new int[nums.length];

		System.out.println("with for loop : ");
		copyArray(nums);

		System.out.println("with copy of : ");
		copyWithCopyOf(nums, copy);
		
		System.out.println("with clone : ");
		copyWithClone(nums,copy);
	}

	private static void copyWithClone(int[] nums, int[] copy) {
		// TODO Auto-generated method stub
		
		copy = nums.clone();
		System.err.println(Arrays.toString(copy));
	}

	private static void copyWithCopyOf(int[] nums, int[] copy) {
		// TODO Auto-generated method stub

		copy = Arrays.copyOf(nums, nums.length);
		System.out.println(Arrays.toString(copy));

	}

	private static void copyArray(int[] nums) {
		// TODO Auto-generated method stub
		int copy[] = new int[nums.length];

		for (int index = 0; index < nums.length; index++) {
			copy[index] = nums[index];
		}

		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(copy));
	}
}
