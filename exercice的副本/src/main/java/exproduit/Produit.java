package exproduit;

import java.util.Date;

public class Produit {
	private int id;
	private Date date;
	private boolean valide;
	private String isin;
	private double prix;
	
	public Produit(int id, Date date, boolean valide, String isin, double prix) {
		super();
		this.id = id;
		this.date = date;
		this.valide = valide;
		this.isin = isin;
		this.prix = prix;
	}
	public Produit() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isValide() {
		
		
			
		return valide;
	}
	public void setValide(boolean valide) {
		this.valide = valide;
	}
	public String getIsin() {
		return isin;
	}
	public void setIsin(String isin) {
		this.isin = isin;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

}
