package role;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RoleBiz {
	List<Role>roleList=null;
//Role[]roleArray=new Role[999];
	public RoleBiz() {
	roleList=new ArrayList<Role>();	
}
	public void add(Role role) {
		if (role!=null) {
			
			roleList.add(role);
		}
	}
	public void delete(Role role) {
		roleList.remove(role); 
	}
	public void sort() {
		Collections.sort(roleList);
	}
	public void show() {
		System.out.println("角色\t称号\t气血\t攻击力");
		Iterator<Role>roleIt=roleList.iterator();
		while(roleIt.hasNext()) {
			Role role=roleIt.next();
			System.out.println(role.getName()+"\t"+role.getTitle()+"\t"+role.getHp()+"\t"+role.getAttack());
		}
		
		
		}
	}
