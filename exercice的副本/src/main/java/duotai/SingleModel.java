package duotai;
//单例模式
public class SingleModel {
	//用来保存唯一的本类的实例
	private static SingleModel me=null;
	private SingleModel() {}
	//获得本类唯一一个实例，单例模式的核心方法
public static SingleModel getInstance() {
	if(null==me) 
		me=new SingleModel();
		return me;
	
	
			
}
}
