package exercice;
import java.util.ArrayList;
import java.util.List;


public class delete {
//supprimer un elemen sur deux
	public static void remove(List<String>liste) {
		for (int i = 1; i < liste.size(); i++) {
			 liste.remove(i);
		}
	}

public static void main (String []args) {
	List<String>liste=new ArrayList<String>();
	liste.add("A");
	liste.add("B");
	liste.add("c");
	liste.add("d");
	liste.add("e");
	liste.add("f");
	remove (liste);
	System.out.println(liste);
	
}
}