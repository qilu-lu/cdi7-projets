package BookdemoV1;

//图书实体类
public class Book {
	private String bookid;// 图书内部编号
	private String bookName;
	private String isbn;
	private String type;// 图书类型
	private String author; // 暂时不用
	private String publisher;// 出版社-暂时不用
	private int count;// 当前书籍的库存量
	private double price;

	public Book() {

	}


	@Override
//重写图书对象的equal方法，方便后续进行的对象恒等性比较
//book1.equals(book2)比的就是bookID
	public boolean equals(Object obj) {
		// 如果传入参数为空或不是book类的实例。直接不需要判断返回false;
		if (null == obj || !(obj instanceof Book)) {
			return false;
		}
		Book book = (Book) obj;

		return bookid.equals(book.getBookid());
		
		//if(!bookid.equals(book.getBookid())) {
		//	return false;
		//}
		//return true;
	}


	public boolean equalsh(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookid == null) {
			if (other.bookid != null)
				return false;
		} else if (!bookid.equals(other.bookid))
			return false;
		return true;
	}


	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
