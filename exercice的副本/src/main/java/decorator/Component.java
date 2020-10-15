package decorator;

import java.io.BufferedInputStream;
import java.io.IOException;

public class Component {
	public static void main(String[] args) throws IOException {
		//使用缓存流装饰系统的输入对象
		BufferedInputStream inStream=new BufferedInputStream(System.in);
	byte[]bytes=new byte[200];
	System.out.println("请输入字符串");
	inStream.read(bytes);
	System.out.println("用户输入的字符串是："+new String(bytes));
	}
}
 