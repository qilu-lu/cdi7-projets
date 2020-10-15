package LuList;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import list.LuList;

public class LuListTest {
	@Test
	public void when_size_should_return_size_de_table() {
		List<String> l = new LuList();
		l.add("bfdgdfgd");
		l.add("fff");
		l.add("sss");
		Assertions.assertThat(l.size()).isEqualTo(3);
	}

	@Test
	public void when_empty_should_return_true() {
		Assertions.assertThat(new LuList().isEmpty()).isEqualTo(true);
	}

	@Test
	public void when_not_contains_should_return_false() {
		Assertions.assertThat(new LuList().contains("b")).isEqualTo(false);
	}

	@Test
	public void when_contains_should_return_true() {
		List<String> l = new LuList();
		l.add("bfdgdfgd");
		l.add("fff");
		l.add("sss");
		Assertions.assertThat(l.contains("b")).isEqualTo(false);
	}

	@Test
	public void when_not_contains_should_return_true() {
		List<String> l = new LuList();
		l.add("bfdgdfgd");
		l.add("fff");
		l.add("sss");
		l.add("b");
		Assertions.assertThat(l.contains("b")).isEqualTo(true);
	}

	@Test
	// 有意义吗
	public void when_add_should_return_true() {
		List<String> l = new LuList();
		Assertions.assertThat(l.add("b")).isEqualTo(true);
	}

	@Test
	// 有意义吗
	public void when_remove_should_return_true() {
		List<String> l = new LuList();
		l.add("bfdgdfgd");
		l.add("fff");
		l.add("sss");
		l.add("b");
		Assertions.assertThat(l.remove("b")).isEqualTo(true);
	}

//	@Test
	// 有意义吗
	/*
	 * public void when_removeall_should_return_true() { List<String> l = new
	 * LuList(); l.add("bfdgdfgd"); l.add("fff"); l.add("sss"); l.add("sss");
	 * l.add("b"); Assertions.assertThat(l.removeAll(l)).isEqualTo(true); }
	 */
	@Test
	public void when_clear_should_return_0() {
		List<String> l = new LuList();
		l.add("bfdgdfgd");
		l.add("fff");
		l.add("sss");
		l.add("b");
		l.add("d");
		l.add("eb");
		l.clear();
		System.out.println(l);
		Assertions.assertThat(l.size()).isEqualTo(0);
	}

	@Test
	public void when_get_wtih_index_should_return_element() {
		List<String> l = new LuList();
		l.add("bfdgdfgd");
		l.add("fff");
		l.add("sss");
		l.add("b");
		Assertions.assertThat(l.get(1)).isEqualTo("fff");
	}

	@Test
	public void when_removeAll_should_return_false_when_element_not_exists() {
		List<String> l = new LuList();
		List<String> l2 = new ArrayList<>();
		l.add("bfdgdfgd");
		l.add("fff");
		l.add("sss");
		l.add("b");
		l2.add("w");

		Boolean removed = l.removeAll(l2);

		Assertions.assertThat(removed).isEqualTo(false);
		Assertions.assertThat(l.contains("w")).isEqualTo(false);
	}

	@Test
	public void when_removeAll_should_return_true_and_remove_element_when_element_exists() {
		List<String> l = new LuList();
		List<String> l2 = new ArrayList<String>();
		l.add("bfdgdfgd");
		l.add("fff");
		l.add("sss");
		l.add("w");
		l2.add("w");

		Assertions.assertThat(l.contains("w")).isEqualTo(true);
		Boolean removed = l.removeAll(l2);

		Assertions.assertThat(removed).isEqualTo(true);
		Assertions.assertThat(l.contains("w")).isEqualTo(false);
	}

}
