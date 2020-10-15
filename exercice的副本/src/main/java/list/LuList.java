package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LuList implements List {

	Object[] alist = new String[1009];

	public LuList() {
		super();
	}

	public int size() {
		int m = 0;
		for (int i = 0; i < alist.length; i++) {

			if (alist[i] != null) {
				m++;
			}
		}

		return m;
	}

	@Override
	public String toString() {
		return "LuList [alist=" + Arrays.toString(alist) + "]";
	}

	@Override
	public boolean isEmpty() {
		if (size() == 0) {

			return true;
		}
		return false;
	}

	@Override
	public boolean contains(Object o) {
		for (int i = 0; i < alist.length; i++) {
			if (alist[i] != null && o.equals(alist[i])) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Iterator iterator() {
		return null;
	}

	@Override
	public Object[] toArray() {
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		int s = size();
		alist[s] = e;

		return true;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		int index = indexOf(o);
		if (index < 0) {
			return false;
		}
		alist[index] = null;

		for (int i = index; i < size(); i++) {

			alist[i] = alist[i + 1];
			alist[size() - 1] = null;
		}

		return true;
	}

	@Override
	public boolean containsAll(Collection c) {
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		return false;
	}

//??
	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub

		int size = size();
		int w = 0;
		for (int i = size - 1; i >= 0; i--) {
			for (Object object : c) {

				if (alist[i].equals(object)) {
					remove(alist[i]);
					w++;
				}
			}
		}
		if (w == 0) {
			return false;
		}
		return true;
	}

	@Override
	public boolean retainAll(Collection c) {
		return false;
	}

	@Override
	public void clear() {
		int size = size();
		for (int i = 0; i < size; i++) {
			alist[i] = null;
		}
	}

	@Override
	public Object get(int index) {
		Object in = alist[index];

		return in;
	}

	@Override
	public Object set(int index, Object element) {
		return null;
	}

	@Override
	public void add(int index, Object element) {

	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		for (int i = index; i < size(); i++) {
			alist[index] = alist[index + 1];
		}

		return alist;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		int index = -1;
		for (int i = 0; i < alist.length; i++) {
			if (alist[i] == o) {
				index = i;
			}
		}
		return index;
	}

	@Override
	public int lastIndexOf(Object o) {
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		return null;
	}

}
