package seul;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[]array= {2,5,8,10,15,25,35,45,55,65,75,95,95};
		System.out.print("give a number");
		int searchNum=input.nextInt();
		
		boolean isFind=false;//find or not
		int low =0;
		int high=array.length-1;
		while(high>=low) {
			int mid=(high+low)/2;
		if(searchNum<array[mid]) {
			high=mid-1;
			
		}else if(searchNum>array[mid]) {
			low=mid+1;
			
		}else {
			System.out.println("找到了数字下标是"+mid);
		break;
		}
		}
	}

}
