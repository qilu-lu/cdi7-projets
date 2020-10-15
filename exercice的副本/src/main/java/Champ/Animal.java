package Champ;

public abstract class Animal {
	public Integer x;
	public Integer y;

	public Animal() {

	}

	public void eat() {
		jourSansManger = 0;
	}

	int jourSansManger = 0;

	public int getJourSansManger() {
		return jourSansManger;
	}

	public void ajouterJourSansManger() {
		this.jourSansManger++;
	}
}
