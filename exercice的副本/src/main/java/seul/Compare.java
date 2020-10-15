package seul;

public class Compare {
	public static void main(String[] args) {
		
		int[]nums= {45,32,56,90,27};
		
		for (int i = 0; i < nums.length -1; i++) {
			for (int j = 0; j < nums.length -i-1; j++) {
				if(nums[j]<nums[j+1]) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp; 
					
				}
			}
		}
	}

}
