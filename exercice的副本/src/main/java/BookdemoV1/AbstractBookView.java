package BookdemoV1;

import java.util.Scanner;

public abstract class AbstractBookView {
	public AbstractBookView() {
		
	}//本方法用来规定固定的程序逻辑
	public void doMainView() {
		String result =showMainView();
		switch (result) {
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
			return;
		default:
			break;
		}// 或者在调一次；ShowMainView() case 7 直接return ，方法返回值变成void
		doMainView();
	}
	//返回用户选择的菜单项1-7之间

	public abstract String showMainView();

	public abstract void showOutStore();

	public abstract void showInStore();

	public abstract void showFindById();

	public abstract Book showAddNewBookView();

	public abstract void showDelBookView();

	public abstract void showBooks(Book... BookArray);
}
