package product;

import javax.swing.JOptionPane;

//商品管理类
public class ProductBiz {
	public static void main(String[] args) {
		// 用来表示每中商品的总库存
		int[] counts = new int[3];
		double total = 0;// 最终支付的总金额
		//使用对象数组
		Product[]products=new Product[3];
		for (int i = 0; i < counts.length; i++) {
			if(products[i]==null)
				products[i]=new Product();
			//Product product=new Product();
			String name=JOptionPane.showInputDialog("Nom de produit");
			products[i].setName(name);
			//接收用户输入的商品单价，注意 返回值是字符串类型
			String strPrice=JOptionPane.showInputDialog("prix de ce produit");
			//需要将字符串类型转换为double类型再进行赋值
			//转换前最好进行验证，以避免异常
			products[i].setPrice(Double.parseDouble(strPrice));
			String strCount=JOptionPane.showInputDialog("combien de produit");
			counts[i]=Integer.parseInt(strCount);
			total+=products[i].getPrice()*counts[i];
		}
		System.out.println("购物结算：");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].getName()+products[i].getPrice());
			
		}
		
		System.out.println("商品金额："+total);
	}
}
