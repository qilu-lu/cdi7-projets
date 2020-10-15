package seul;

public class Shuzu {
	public static void main(String[] args) {
		int[] nums = new int[10];
		int count1 = 0;
		int count2=0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int) (Math.random() * 10000)) % 1000;
			System.out.print(nums[i]+",");
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]%2==0) {
				count1++;

			}
			else {
				count2++;
		}
	}System.out.println(count1);
	System.out.println(count2);
	;
}
}