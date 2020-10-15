package oiseaux;

import java.util.ArrayList;
import java.util.List;



public class Mainoiseaux {
	public static void main(String[] args) {
		List<Oiseaux> liste = new ArrayList<>();
		Oiseaux hc = new Merle("hc");
		Oiseaux yy = new Merle("yy");
		Oiseaux xx = new Merle("xx");
		Oiseaux tt = new Pie("tt");
		Oiseaux yx = new Pie("yx");
		
		liste.add(yx);
		liste.add(tt);
		liste.add(xx);
		liste.add(yy);
		liste.add(hc);
		
		for (Oiseaux oiseaux : liste) {
			oiseaux.decrire();
			System.out.println("----");
		}
}}
