package BookdemoV1;
//模拟的数据仓库
public class Datas {
	static Book[]Bookstore=new Book[999];
	//未来有用户也放在这里
	//使用静态快为图书仓库添加书籍信息，以便测试
	
	static {
		Book book1=new Book();
		book1.setBookid("1000");
		book1.setBookName("外传");
		book1.setIsbn("100-101");
		book1.setCount(10);
		book1.setPrice(99.9);
		Bookstore[0]=book1;
		
		Book book2=new Book();
		book2.setBookid("1001");
		book2.setBookName("外传2");
		book2.setIsbn("100-102");
		book2.setCount(10);
		book2.setPrice(99.9);
		Bookstore[1]=book2;
				
		Book book3=new Book();
		book3.setBookid("1002");
		book3.setBookName("外传3");
		book3.setIsbn("100-103");
		book3.setCount(10);
		book3.setPrice(99.9);
		Bookstore[2]=book3;
		
		Book book4=new Book();
		book4.setBookid("1003");
		book4.setBookName("外传4");
		book4.setIsbn("100-104");
		book4.setCount(10);
		book4.setPrice(99.9);
		Bookstore[3]=book4;
		
		
		Book book5=new Book();
		book5.setBookid("1004");
		book5.setBookName("外传5");
		book5.setIsbn("100-105");
		book5.setCount(10);
		book5.setPrice(99.9);
		Bookstore[4]=book5;
		
		//new BookView().showBooks(Bookstore); 
		
	}
	
	
	
	
}
