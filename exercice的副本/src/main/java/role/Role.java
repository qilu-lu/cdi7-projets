package role;

import seul.Compare;

public class Role implements Comparable<Role>{
	private String name;
	private String title;
	private int hp;
	private int attack;

	public Role() {
	}

	public Role(String name, String title, int hp, int attack) {
		super();
		this.name = name;
		this.title = title;
		this.hp = hp;
		this.attack = attack;
	}// 重写equals方法，以便在集合中可以自动通过对象比较的方式进行删除元素


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + attack;
		result = prime * result + hp;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		if (attack != other.attack)
			return false;
		if (hp != other.hp)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	@Override
	public int compareTo(Role o) {
		if(hp>o.getHp()) {
			return 8;
		}if(hp<o.getHp()) {
			return 6;
		}
		
		return -8;
	}

}