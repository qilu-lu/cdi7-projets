import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import anagram.Anagram;
import anagram.AnagramFinder;

public class AnagramTest {
	@Test
	public void when_4_words_with_two_wods_as_anagram_then_should_have_only_1_anagram() {
		List<Anagram> anagramsExpected = new ArrayList<Anagram>();
		Anagram marco = new Anagram();
		marco.setWords("marco");
		marco.addAnagrams("macro");
		anagramsExpected.add(marco);
		Anagram happy = new Anagram();
		happy.setWords("happy");
		happy.addAnagrams("hapyp");
		anagramsExpected.add(happy);

		String[] mots = { "marco", "macro", "happy", "hapyp" };
		List<Anagram> anagrams = AnagramFinder.chercherAnagram(mots);

		Assertions.assertThat(anagrams).isEqualTo(anagramsExpected);

	}

	@Test
	public void when_two_words_anagram_should_return_true() {
		Assertions.assertThat(AnagramFinder.isAnagram("cheating", "chaeting")).isEqualTo(true);
	}

	@Test
	public void when_two_words_with_different_length_should_return_false() {
		Assertions.assertThat(AnagramFinder.isAnagram("cheating", "chaetingj")).isEqualTo(false);
	}

	@Test
	public void when_two_words_with_1_different_letter_should_return_false() {
		Assertions.assertThat(AnagramFinder.isAnagram("cheating", "chaetinq")).isEqualTo(false);
	}

}
