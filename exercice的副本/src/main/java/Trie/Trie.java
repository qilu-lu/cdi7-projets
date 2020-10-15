package Trie;

import java.util.ArrayList;
import java.util.Arrays;

public class Trie extends ArrayList<Integer> {

	public void inserer(int entier) {
		Integer index = this.size();
		for (int i = 0; i < this.size(); i++) {
			if (get(i) < entier) {
				index = i+1;
			}
		}
		super.add(null);
		for (int i = size() - 2; i >= index; i--) {
			set(i + 1, get(i));
		}
		super.set(index, entier);
		System.out.println(this);
	}
	
	void supprimer(Integer entier) {
		this.remove(entier);
		System.out.println(this);
	}
	void afficher() {
		System.out.println(toString());
	}

}
