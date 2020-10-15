package BookdemoV1;
//controllor图书业务类--销售经理
//private static book[]bookstore=new book[999];
//用来保存所有图书信息的数组，可以理解成图书仓库---操作对象
public class BookBiz {
//基本业务方法
	// 增加图书 出库 入库 查询 排序
	public int getBookConut() {
		// 获得图书仓库中data.Bookstore数组中图书对象的个数
		return getBookCount(Datas.Bookstore);
		/*int count = 0;
		for (Book book : Datas.Bookstore) {
			if (book == null)
				break;
			count++;
		}
		return count;*/
	}

	public int getBookCount(Book... books) {
		int count = 0;
		for (Book book : books) {
			if (book == null)
				break;
			count++;
		}
		return count;

	}

	public boolean addBook(Book book) {
		// 将传入的图书对象放置到图书仓库（数组）中去
		// return是否放置成功，假设图书仓库空间已满，返回false
		int bookCount = getBookConut();
		if (Datas.Bookstore.length == bookCount) {
			return false;
		} // 如果仓库不满，就将传入的图书对象放置在数组tableau的最后一个位置，因为bookcount从0开始
		Datas.Bookstore[bookCount] = book;
		return true;
	}// 删除传入的图书对象
 
	public boolean delBook(Book book) {
		int bookCount = getBookConut();
		int delIndex = -1;
		for (int i = 0; i < bookCount; i++) {
			// 太长了 ，重写equal方法 if(book.getBookid().equals(Datas.Bookstore[i].getBookid())) {
			if (book.equals(Datas.Bookstore[i])) {
				delIndex = i;
				break;
			}
		}
		// 执行删除套路
		if (delIndex == -1) {
			return false;
		}
		for (int i = delIndex; i < bookCount - 1; i++) {
			Datas.Bookstore[i] = Datas.Bookstore[i + 1];
		}
		// 将最后一个元素置为空；
		Datas.Bookstore[bookCount - 1] = null;
		return true;
	}

	// 通过图书ID 查找对应的图书对象
	// 没有找到返回 null
	public Book findById(String bookid) {
		int bookCount = getBookConut();
		for (int i = 0; i < bookCount; i++) {
			if (bookid.equals(Datas.Bookstore[i].getBookid())) {
				return Datas.Bookstore[i];
			}
		} 
		return null;
	}

//入库 为仓库中现有的图书增加库存
//boodId 入库的数量 
//return 如果入库的bookId不存在，入库失败。
	public boolean inStore(String bookId, int count) {
		Book book = findById(bookId);
		if (null == book) {// 如果入库的bookID不存在
			return false;// 尽量在业务层中使用打印
		}
		// 增加库存.这里是引用传递
		book.setCount(book.getCount() + count);
		return true;
	}

	public boolean outStore(String bookId, int count) {
		Book book = findById(bookId);
		if (null == book || book.getCount() < count) {// 如果入库的bookID不存在
			return false;// 尽量在业务层中使用打印
		}
		book.setCount(book.getCount() - count);
		return true;
	}
}