package seul;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collectiondemo {
	public static void main(String[] args) {
		List<Integer>intCollection=new ArrayList<>();
		intCollection.add(1);
		intCollection.add(24);
		intCollection.add(3);
		intCollection.add(4);
		intCollection.add(6);
		intCollection.forEach(value->System.out.println(value));
		Collections.shuffle(intCollection);
		System.out.println("乱序后");
		intCollection.forEach(value->System.out.println(value));
		//for(Integer value:intCollection) {
		//	System.out.println(value);
		System.out.println("集合的复制");
		
		   
		}
	}


