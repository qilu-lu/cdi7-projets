package anagram;

import java.util.ArrayList;
import java.util.List;

public class Anagram {
	private String words;
	private List<String> anagrams = new ArrayList<>();

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public List<String> getAnagrams() {
		return anagrams;
	}

	public void addAnagrams(String anagrams) {
		this.anagrams.add(anagrams);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anagrams == null) ? 0 : anagrams.hashCode());
		result = prime * result + ((words == null) ? 0 : words.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Anagram other = (Anagram) obj;
		if (anagrams == null) {
			if (other.anagrams != null)
				return false;
		} else if (!anagrams.equals(other.anagrams))
			return false;
		if (words == null) {
			if (other.words != null)
				return false;
		} else if (!words.equals(other.words))
			return false;
		return true;
	}

}
