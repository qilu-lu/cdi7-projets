package monstres_array;

public class ListeChainee {
	Node firstNode = null;

	public void add(Monster monsterAssocie) {
		if (firstNode == null) {
			firstNode = new Node();
			firstNode.setMonsterAssocie(monsterAssocie);
		} else {
			Node last = firstNode;
			do {
				if (last.getNext() != null) {
					last = last.getNext();
				} else {
					break;
				}
			} while (true);
			Node newNode = new Node();
			last.setNext(newNode);
			newNode.setMonsterAssocie(monsterAssocie);
		}
	}

	public Node getFirstNode() {
		return firstNode;
	}

}
