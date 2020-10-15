package monstres_array;

public class Army {
	private Monster[] monstres = new Monster[5];
	private int top = 0;

	public Army() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Monster[] getMonstres() {
		return monstres;
	}

	public void setMonstres(Monster[] monstres) {
		this.monstres = monstres;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public Monster[] add(Monster monster) {
		if (top < monstres.length) {
			monstres[top] = monster;
		} else if (top >= monstres.length) {
			Monster[] nMonster = new Monster[monstres.length * 2];
			System.arraycopy(monstres, 0, nMonster, 0, monstres.length);
			nMonster[top] = monster;
			monstres = nMonster;
		}
		top++;
		return getMonstres();
	}

	public Army create() {
		Army army = new Army();
		Monster[] monstres = new Monster[4];
		army.setTop(0);
		return army;
	}

	// army.addMonster(monster);
	// army.setTop(army.getTop()+1);
	// }
	public static void display(Army army) {
		army.getMonstres();// monster[]
		for (int i = 0; i < army.getTop(); i++) {
			Monster.display(army.getMonstres()[i]);
		}
	}
}
