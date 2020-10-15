package Filess;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//使用字符流对文件进行基本读写操作
public class ReadAndWriteDemo {
	private static final String Filepath1="src/main/java/Filess/FileDemo.java";
	private static final String Filepath2 ="src/main/java/Filess/FileDemo1.java";
	public static void main(String[] args){
		try {
			BufferedReader bReader=new BufferedReader(new FileReader(Filepath1));
			//固定的读写格式
			String line=null;
			while((line=bReader.readLine())!=null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//写入的字符串
		String content="package bla bla bla ";
		content+="public qqch";
		
				try(BufferedWriter bWriter=new BufferedWriter(new FileWriter(Filepath2));) {
				//使用了jdk1.7之后新增的自动关闭资源的方法
					bWriter.write(content);//将字符串写入到缓冲中
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}catch (Exception e) {
					
					//注意；bWriter。close会抛出ioexception,这里的异常被新结构抑制了
				if(e.getSuppressed()!=null) {
					Throwable[]throwables=e.getSuppressed();
					for(Throwable t:throwables) {
					
				
				}
				
	}

}}}
