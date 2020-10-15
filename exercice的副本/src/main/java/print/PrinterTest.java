package print;

public class PrinterTest {
public static void main(String[] args) {
	Printer printer=new Printer();
	printer.setInkbox(new  ColorInkBoxImpl());
	printer.setPaper(new B5PaperImp1());
	
	printer.print("测试内容");
}
}
