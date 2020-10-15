package exercice;

public class EleveMaster extends EleveECTS {
	
	public EleveMaster(String nom){
		this.nom=nom;
	}
	public int resultat() {
		Integer x = 0;
		for (Integer note : this.listeNotes) {

			if (note >= 10) {
				x = x + 6;
				
			} else if (note >= 8 && note < 10) {
				x = x + 3;
				
			}

		}
		return x;

	}
}
