package duotai;

import java.io.IOException;
import java.util.Properties;

public class ChunwanTest {
	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		Director Zhang=new Director();
		Singer actor1=new Singer("gugu");
		//Actor actor2=new Actor("sb");
		actor1.performs();
		Zhang.action(actor1);
		
		
		//模拟程序的升级，要求添加相声演员
		CrossActor feng=new CrossActor("feng");
		Zhang.action(feng);
		//要求main方法中的代码不修改的前提下实现某个代码的升级
		//解决方法；使用反射➕多态技术实现无缝升级
		Properties props=new Properties();//对应Java中的配置文件
		//读取配置文件中的内容
		props.load(ChunwanTest.class.getResourceAsStream("ActorConfig.properties"));
		Actor actor=(Actor)Class.forName(props.getProperty("crossactor")).newInstance();
		//System.out.println(props.getProperty("crossactor"));//配置文件等号之前
		actor.setName("bb");
		Zhang.action(actor);
	}

}
