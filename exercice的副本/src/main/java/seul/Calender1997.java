package seul;

//1997。07 已知7月1日星期二；
public class Calender1997 {

	public static void main(String[] args) {
		System.out.println("lundi\tmardi\tmercre\tjeudi\tvendre\tsamedi\tdimanch");
		System.out.print("\t");
		int dayofmonth = 31;
		for (int i = 1; i <= dayofmonth; i++) {

			System.out.print(i);
			if ((i + 1) % 7 == 0) {
				System.out.println(System.lineSeparator());
			} else {
				System.out.print("\t");

			}
		}

	}
}
