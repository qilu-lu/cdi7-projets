package BookdemoV1;

public class MainTest {
	public static void main(String[] args) {
	//new BookView();
	//AbstractBookView bookView=new BookViewConsoleImpl();
	AbstractBookView bookView=new BookViewDialogImpl();	//使用对话框实现的图书管理系统界面
	bookView.doMainView();
	}
}
// Book newBook = new Book();
// newBook.setBookid("111");
// newBook.setBookName("天龙八部");
// newBook.setCount(1000);

// BookBiz bookBiz = new BookBiz();
// bookBiz.addBook(newBook);
// show();
// bookBiz.delBook(newBook);
// show();
// bookBiz.findById("10");
// show();
// bookBiz.inStore("10", 10);
// show();
// bookBiz.outStore("10", 2);
// show();

// }
/*
 * public static void show() { BookBiz bookBiz = new BookBiz();
 * if(bookBiz.getBookConut()<=0) { System.out.println("仓库空空如也");
 * 
 * } for (int i = 0; i < new BookBiz().getBookConut(); i++) {
 * System.out.println(Datas.Bookstore[i].getBookid() + "\t" +
 * Datas.Bookstore[i].getBookName()+"\t"+Datas.Bookstore[i].getCount()); } }
 */
