package fr.isika.cdi07.devoir;

public class MainPeople {
	public static void main(String[] args) {

		Client c1 = new Client("toto", 29, "toto.@gmail.com", 5000);
		Client c2 = new Client("tata", 40, "tata.@gmail.com", 9000);

		Fournisseur f1 = new Fournisseur("fofo", 40, "xx@gmail.com", "75012 paris");
		People p1 = new People("sophie", 23, "8989@gmail.com");

		Transmission tran = (p) -> p.getAdresse();

		System.out.println("lambda expression  " + tran.envoyer(f1));
//	if(p instanceof Fournisseur) {
//	Transmission tran2=((Fournisseur) p)->p.getAdresse();
//	}

	}

}
