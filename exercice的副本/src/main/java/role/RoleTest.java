package role;

public class RoleTest {
	public static void main(String[] args) {
		RoleBiz biz=new RoleBiz();
		Role role1=new Role("每场苏","才子1",50,450);
		Role role2=new Role("每苏0","才子2",150,350);
		Role role3=new Role("每场苏2","才子3",250,250);
		Role role4=new Role("每场苏3","才子4",350,150);
		Role role5=new Role("每场苏4","才子5",450,50);
		
		biz.add(role1);
		biz.add(role2);
		biz.add(role3);
		biz.add(role4);
		biz.add(role5);
		
		
		
		biz.delete(new Role("每场苏3","才子4",350,150));
		biz.show();
		biz.sort();
	}

}
