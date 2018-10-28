package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("linkedHashSet ");
		linkedHashSet();
		System.out.println("HashSet ");
		hashSet();
		System.out.println("TreeSet output sorted");
		treeSet();
	}

	private static void linkedHashSet() {
		// TODO Auto-generated method stub
		LinkedHashSet lk= new LinkedHashSet<>();
		lk.add(8);
		lk.add(12);
		lk.add("java");
		Iterator it= lk.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

	private static void hashSet() {
		// TODO Auto-generated method stub
		HashSet lk= new HashSet<>();
		lk.add(8);
		lk.add(12);
		lk.add("java");
		Iterator it= lk.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	private static void treeSet() {
		// TODO Auto-generated method stub
		TreeSet lk= new TreeSet();
		lk.add(8);
		lk.add(12);
		lk.add(55);
		lk.add(23);
		Iterator it= lk.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
