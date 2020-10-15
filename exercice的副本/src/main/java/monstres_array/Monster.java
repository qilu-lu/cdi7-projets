package monstres_array;

public class Monster {
	private String name;
	private Integer health;

	public Monster(String name, Integer health) {
		super();
		this.name = name;
		this.health = health;
	}

	public Monster(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}

	public static void display(Monster monster) {
	
		System.out.println("Monster<" + monster.getName() + ">");
	
	}

	public static Monster create(String name, int health) {
	
		Monster monster = new Monster(name, health);
		// System.out.println(monster.getName());
		return monster;
	
	}

}
