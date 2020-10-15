package seul;

public class BookBiz {
	public void test(Integer num) {
		num = num + 1;
		
	}

	// 图书业务类 对图书数组的增删该查方法
	// 如果销售成功，返回销售数量，销售失败返回-1
	public int sellBook(Book book) {
		// 判断图书库存是否大于1
		// 销售书籍库存-1
		// 返回销售数量
		if (!(book.getCount() > 1)) {
			return -1;
		}
		book.setCount(book.getCount() - 1);
		return 1;
	}

}
