
	package decorator;

	import java.io.BufferedInputStream;
	import java.io.BufferedOutputStream;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.OutputStream;

	public class CopyColler {

		private static final String Filepath1 = "Users/qilu/Desktop/退保险信.docx";
		private static final String Filepath2 = "Users/qilu/Desktop/test.pdf";

		public static void main(String[] args) throws IOException{
			long time=CopyFileByBufferedStream();
			System.out.println("拷贝用时"+time+"毫秒");
		}

	// 使用缓存流拷贝文件，拷贝过程的用时（毫秒）
		private static long CopyFileByBufferedStream() {
			File file=new File(Filepath1);
			if(!file.exists()) {
				System.out.println("文件不存在，复制失败");
				return 0;
			}
			long starTime=System.currentTimeMillis();
			InputStream inStream=null;
			BufferedInputStream bInStream=null;
			OutputStream outStream=null;
			BufferedOutputStream bOutStream=null;
			try {
				inStream=new FileInputStream(file);
				bInStream=new BufferedInputStream(inStream);
				outStream=new FileOutputStream(Filepath2);
				bOutStream=new BufferedOutputStream(outStream);
				int i=-1;//读取出的临时变量
			
				while((i=bInStream.read())!=-1){
						bOutStream.write(i);//注意读取一个字节就写入了缓存中.需要在最后把缓存中的东西写到文件中
					 //即 需要清空缓冲区，将缓存区内容写到文件中-flush()
					}
				 System.out.println("文件复制成功");
			}catch (FileNotFoundException e) {
						e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}finally{
				try {
				bOutStream.close();//可以直接调用close方法，内部已经自动调用flush方法
				outStream.close();
				bInStream.close();
				inStream.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			}
			long endTime=System.currentTimeMillis();
			return endTime-starTime; 
		}
		}
		

