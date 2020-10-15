package duotai;

import exercice.testgroupeleves;
//
public class Static {
public static int static_num=1;//静态变量相当于类属性
public int normal_num=1;//成员
public void test() {
	static_num++;
	normal_num++;
}

public static void main(String[] args) {
	Static coucou=new Static();
	coucou.test();
	System.out.println(coucou.static_num);
	System.out.println(coucou.normal_num);
	Static coucou2=new Static();
	coucou2.test();
	System.out.println(coucou2.static_num);
	System.out.println(coucou2.normal_num);
	
}
}
