package BookdemoV1;

import java.io.File;
import java.io.IOException;

public class FileUtil {
	//用来进行读写操作的图书信息文件路径
	private static final String  BookFile="src/main/java/BookdemoV1/Bookinfo.dat";
	//write//将传入的图书对象数组写入到文件中
	//注意本方法会将图书仓库数组中的内容全新的写到文件中（覆盖操作）
	public static void SaveBooks(Book...bookArray) {
	File bookFile=new File(BookFile);
	if(!bookFile.exists())
		try {
			bookFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	try(FileInputStream Fin=new FileInput Stream(bookFile));
}
}
