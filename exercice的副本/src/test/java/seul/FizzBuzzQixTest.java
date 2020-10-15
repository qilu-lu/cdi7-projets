package seul;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzBuzzQixTest {
	@Test
	public void when_divisable_par_3_should_return_Fizz() {
		Assertions.assertThat(FizzBuzzQix2.changerChiffre(6)).isEqualTo("Fizz");
	}

	@Test
	public void when_divisable_par_5_should_return_Buzz() {
		Assertions.assertThat(FizzBuzzQix2.changerChiffre(10)).isEqualTo("Buzz*");
	}

	@Test
	public void when_divisable_par_7_should_return_Qix() {
		Assertions.assertThat(FizzBuzzQix2.changerChiffre(7)).isEqualTo("QixQix");
	}

	@Test
	public void when_divisable_par_0_should_return_etoile() {
		Assertions.assertThat(FizzBuzzQix2.changerChiffre(101)).isEqualTo("1*1");
	}

	@Test
	public void when_divisable_par_3_et_7_should_return_FizzQix() {
		Assertions.assertThat(FizzBuzzQix2.changerChiffre(21)).isEqualTo("FizzQix");
	}

	@Test
	public void when_divisable_par_3_et_5_should_return_FizzBuzz() {
		Assertions.assertThat(FizzBuzzQix2.changerChiffre(15)).isEqualTo("FizzBuzzBuzz");
	}

	@Test
	public void when_contains_3_should_return_Fizz() {
		Assertions.assertThat(FizzBuzzQix2.changerChiffre(3)).isEqualTo("FizzFizz");
	}

	@Test
	public void when_contains_5_should_return_Buzz() {
		Assertions.assertThat(FizzBuzzQix2.changerChiffre(5)).isEqualTo("BuzzBuzz");
	}

	@Test
	public void when_contains_7_should_return_Buzz() {
		Assertions.assertThat(FizzBuzzQix2.changerChiffre(17)).isEqualTo("Qix");

	}

	@Test
	public void when_noncontains_357_et_nondivisible_par_357_should_return_chiffre() {
		Assertions.assertThat(FizzBuzzQix2.changerChiffre(11)).isEqualTo("11");

	}
}