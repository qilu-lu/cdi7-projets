package BookdemoV1;

import javax.swing.JOptionPane;

//使用对话框升级的图书系统界面
public class BookViewDialogImpl extends AbstractBookView {
	private BookBiz bookBiz = null;

	public BookViewDialogImpl() {
		bookBiz = new BookBiz();
	}

	@Override
	public String showMainView() {
		/*
		 * System.out.println("图书管理系统>>主菜单");
		 * System.out.println("1.新增图书2.删除图书 3查看所有图书4按编号查询5入库6出库7退出");
		 * System.out.println("请选择");
		 */
		String strMenu="图书管理系统>>主菜单\n";
		strMenu+="1.新增图书2.删除图书 3查看所有图书4按编号查询5入库6出库7退出\n";
		strMenu+="请选择";
		String result=JOptionPane.showInputDialog(strMenu);
		if(result==null)result="7";
		return result;
		
	}

	@Override
	public void showOutStore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showInStore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showFindById() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book showAddNewBookView() {
	Book newbook=new Book();
	String bookid=null;
	String bookName=null;
	int count=-1;
	//注意 这里需要验证输入的合法性  暂时不管
	bookid=JOptionPane.showInputDialog("请输入图书编号");
	bookName=JOptionPane.showInputDialog("请输入图书名称");
	count=Integer.parseInt(JOptionPane.showInputDialog("请输入图书数量"));
	
	newbook.setBookid(bookid);
	newbook.setBookName(bookName);
	newbook.setCount(count);
	if(bookBiz.addBook(newbook)){
		JOptionPane.showMessageDialog(null,"添加成功");
	}else {
		JOptionPane.showMessageDialog(null,"添加失败");
	}
	
		return newbook;
	}

	@Override
	public void showDelBookView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showBooks(Book... BookArray) {
		// TODO Auto-generated method stub
		
	}
}
