package BookdemoV1;

import java.util.Scanner;

//图书系统的视图-啤酒妹
public class BookView {
	private Scanner input = null;
	private BookBiz bookBiz = null;

	public BookView() {
		input = new Scanner(System.in);
		bookBiz = new BookBiz();

		System.out.println("*************************");
		System.out.println("欢迎使用图书管理系统");
		System.out.println("1.dengku2 tuichuxitomg");
		System.out.println("****************");
		String choice = input.next();
		if ("1".equals(choice)) { // 执行登陆操作，如果验证成功就显示主菜单
			System.out.println("登陆功能暂未实现，默认已登陆");
			while (showMainView()) {
			}

		}

		System.out.println("系统退出 欢迎下次使用");

	}

	public boolean showMainView() {
		System.out.println("图书管理系统>>主菜单");
		System.out.println("1.新增图书2.删除图书 3查看所有图书4按编号查询5入库6出库7退出");
		System.out.println("请选择");
		String choice = input.next();
		switch (choice) {
		case "1":
			showAddNewBookView();
			showBooks(Datas.Bookstore);
			break;

		case "2":
			showDelBookView();

			break;
		case "3":
			showBooks();
			break;
		case "4":
			showFindById();
			break;
		case "5":
			showInStore();
			break;
		case "6":
			showOutStore();
			break;	
		case "7":

			return false;

		default:
			break;
		}// 或者在调一次；ShowMainView() case 7 直接return ，方法返回值变成void
		return true;
	}
public void showOutStore()	{
	System.out.println("图书管理系统 图书出库");
	System.out.print("请输入图书的内部编号；");
	String bookid = input.next();
	System.out.print("请输入要出库的图书数量；");
	int bookCount=input.nextInt();
	if(bookBiz.outStore(bookid, bookCount)) {
		System.out.print("出库成功");
		showBooks();
	}else {
		System.out.print("出库失败,请检查输入的图书编号");
	}
}
	
public void showInStore() {
	//两个参数：图书ID，入库数量（入库只能入库已存在图书）
	System.out.println("图书管理系统 图书入库");
	System.out.print("请输入图书的内部编号；");
	String bookid = input.next();
	System.out.print("请输入要入库的图书数量；");
	int bookCount=input.nextInt();
	if(bookBiz.inStore(bookid,bookCount)==true) {
		System.out.print("入库成功");
		showBooks();
	}
	else {
		System.out.print("入库失败,请检查输入的图书编号");
	}	
}
	public void showFindById() {
		System.out.println("图书管理系统 按编号查询");
		System.out.print("请输入要查询图书的内部编号；");
		String bookid = input.next();
		Book book = bookBiz.findById(bookid);
		if (book == null) {
			System.out.println("没有找到任何的图书信息");
		}
		showBooks(book);
	}

	public Book showAddNewBookView() {
		System.out.println("图书管理系统 新增图书");
		System.out.print("内部编号；");
		String bookid = input.next();
		// 这里需要验证用户输入的编号是否存在；
		Book newBook = bookBiz.findById(bookid);
		if (newBook == null) {
			// 可以增加图书
			newBook = new Book();
			newBook.setBookid(bookid);
			System.out.println("名称");
			newBook.setBookName(input.next());
			System.out.println("库存");
			newBook.setCount(input.nextInt());
			// ……
			bookBiz.addBook(newBook);// 调用图书业务对象，将新增的图书添加到图书仓库中
		} else {
			// 图书以存在
			System.out.print("此编号已经存在，请重新录入");
			newBook = showAddNewBookView();// 重新调用此方法，让用户再次输入-递归调用

		}
		return newBook;
	}

	public void showDelBookView() {
		System.out.println("图书管理系统 删除图书");
		System.out.print("内部编号；");
		String bookid = input.next();
		Book newBook = new Book();
		newBook.setBookid(bookid);
		newBook = bookBiz.findById(bookid);
		if (newBook == null) {
			System.out.print("此图书已经不存在");

		}
		if (newBook != null) {
			bookBiz.delBook(newBook);
			System.out.println("删除成功");
			showBooks();// 打印默认图书仓库，相当于刷新显示当前图书仓库中的内容
		}

	}

//如果传入的是null。默认显示图书仓库中的数组，Datas。Bookstore
	public void showBooks(Book... BookArray) {
		if (BookArray == null || BookArray.length == 0) {
			BookArray = Datas.Bookstore;
		}
		System.out.println("内部编号\t名称\t库存");
		int bookcount = bookBiz.getBookCount(BookArray);
		for (int i = 0; i < bookcount; i++) {
			System.out.printf("%s\t%s\t%d\n", BookArray[i].getBookid(), BookArray[i].getBookName(),
					BookArray[i].getCount());
		}
	}
}
