package prix;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Product {
	String isin;
	double prix;
	boolean isValide;
	Date d;

	public Product(String isin, double prix, boolean isValide, Date d) {
		super();
		this.isin = isin;
		this.prix = prix;
		this.isValide = isValide;
		this.d = d;
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

	public boolean isValide() {
		return isValide;
	}

	public void setValide(boolean isValide) {
		this.isValide = isValide;
	}

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

}

public class PrixMain {

	public static int count1(List<Product> prix) {
		int count = 0;
		List<Date> date = new ArrayList<Date>();
		for (int i = 0; i < prix.size(); i++) {

			if (prix.get(i).isValide()) {

				if (!date.contains(prix.get(i).getD())) {
					count++;
					date.add(prix.get(i).getD());

				}
			}

		}

		return count;
	}

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		List<Product> p = new ArrayList<Product>();
		p.add(new Product("FR8765", 10, true, sdf.parse("2020-09-17")));
		p.add(new Product("FR8765", 10, true, sdf.parse("2020-09-18")));
		p.add(new Product("FR8765", 10, false, sdf.parse("2020-09-19")));
		p.add(new Product("FR8765", 10, true, sdf.parse("2020-09-17")));
		p.add(new Product("FR8765", 10, false, sdf.parse("2020-09-17")));
		int c = count1(p);
		System.out.println(c);
	}
}
