package dsa;

public class FindFrequencyEachElementOfArray {
	
	public static void main(String[] args) {
		
		int nums[] = {1,2,3,3,4,4,6};
		int counter = 0;
		System.out.println("number  frequency");
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length; j++ ) {
				
				if(nums[i] == nums[j])
				{
					counter++;
				}
			}
			System.out.print(nums[i]+"    ");
			System.out.print("-    ");
			System.out.println(counter);
			counter = 0;
		}
	}
	
}
