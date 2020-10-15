package print;

public class Printer {
private IInkBox inkbox=null;//
private IPaper paper=null;
//打印机的打印方法使用墨盒和纸张
public void print(String content) {
	if(null==inkbox||null==paper){
		System.out.println("墨盒或纸张出现问题，请正确安装");
		return;
	}
	//打印过程
	String color=inkbox.getColor();
	String type=paper.getSize();
	System.out.println("以下文字是"+color+"颜色的");
	System.out.println("使用纸张"+type);
	System.out.println("内容"+content);
}
public IInkBox getInkbox() {
	return inkbox;
}
public void setInkbox(IInkBox inkbox) {
	this.inkbox = inkbox;
}
public IPaper getPaper() {
	return paper;
}
public void setPaper(IPaper paper) {
	this.paper = paper;
}

}


