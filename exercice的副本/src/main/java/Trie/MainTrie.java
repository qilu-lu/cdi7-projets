package Trie;

public class MainTrie {
	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.inserer(0);
		trie.inserer(1);
		trie.inserer(4);
		trie.inserer(8);
		trie.inserer(3);
		System.out.println(trie);
		trie.supprimer(4);
	}
}
