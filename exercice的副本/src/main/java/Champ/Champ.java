package Champ;

public class Champ {
	Parcelle[][] parcelle;

	public Champ(int parcelleHeight, int parcelleWidth) {
		parcelle = new Parcelle[parcelleHeight][parcelleWidth];
		for (int i = 0; i < parcelle.length; i++) {
			for (int j = 0; j < parcelle[i].length; j++) {
				parcelle[i][j] = new Parcelle();
			}
		}
	}

	@Override
	public String toString() {
		String ret = "";
		for (int i = 0; i < parcelle.length; i++) {
			for (int j = 0; j < parcelle[i].length; j++) {
				ret = ret + parcelle[i][j] + "|";
			}
			ret += "\n";
		}

		return ret;
	}

}
