package monstres_array;

public class ArmyLC {
	private int size = 0;
	private ListeChainee monstres = new ListeChainee();

	public ArmyLC() {
		super();
	}

	public ListeChainee getMonstres() {
		return monstres;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void add(Monster monster) {
		monstres.add(monster);
		size++;
	}

	public ArmyLC create() {
		ArmyLC army = new ArmyLC();
		army.setSize(0);
		return army;
	}

	// army.addMonster(monster);
	// army.setTop(army.getTop()+1);
	// }
	public static void display(ArmyLC army) {
		Node n = army.getMonstres().getFirstNode();
		while (n != null) {
			Monster.display(n.getMonsterAssocie());
			n = n.getNext();
		}
	}
}
