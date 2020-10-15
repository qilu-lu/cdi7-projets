package seul;

public class ParaDemo {
	public static void main(String[] args) {
	paraTest("str");
}
public static void paraTest(String str,int...nums) {
	System.out.println("第一个参数"+str);
	for (int i=0;i<nums.length;i++) {
		System.out.println(nums[i]);
	}
}
}
