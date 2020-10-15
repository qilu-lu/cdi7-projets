package fr.isika.cdi7.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzGeneratorTest {

	private FizzBuzzGenerator generator = new FizzBuzzGenerator();

	@Test
	public void generateOneWhenGivenOne() {
		String generated = generator.genererSuiteFizzBuzz(1, 1); 
		assertEquals("1", generated);
	}

	@Test
	public void generateSequenceWhenGivenOneToFifteen() {
		String generated = generator.genererSuiteFizzBuzz(1, 15); 
		assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz", generated);
	}
}
