package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HashMap ");
		hashMap();
		System.out.println("linkedHashMap ");
		linkedHashMap();
		System.out.println("TreeMap output sorted");
		treeMap();
	}
	// truy xuat toc do cham vi no se load lai khi co mot phan tu update xoa
	private static void treeMap() {
		// TODO Auto-generated method stub
		TreeMap lk= new TreeMap();
		lk.put("course_001", "android");
		lk.put("course_004", "java");
		lk.put("course_005", "python");
		lk.put("course_003", "HTML");
		lk.put("course_002", "C");
		System.out.println(lk.toString());
		Iterator iter= lk.keySet().iterator();
		while(iter.hasNext()) {
			Object key= iter.next();
			Object value= lk.get(key);
			System.out.println(key+"  "+value);
		}
	}

	private static void linkedHashMap() {
		// TODO Auto-generated method stub
		LinkedHashMap lk= new LinkedHashMap();
		lk.put("course_001", "android");
		lk.put("course_004", "java");
		lk.put("course_005", "python");
		lk.put("course_003", "HTML");
		lk.put("course_002", "C");
		System.out.println(lk.toString());
		Iterator iter= lk.keySet().iterator();
		while(iter.hasNext()) {
			Object key= iter.next();
			Object value= lk.get(key);
			System.out.println(key+"  "+value);
		}
	}

	private static void hashMap() {
		// TODO Auto-generated method stub
		Map hashMap= new HashMap();
		hashMap.put("course_001", "android");
		hashMap.put("course_004", "java");
		hashMap.put("course_005", "python");
		hashMap.put("course_003", "HTML");
		hashMap.put("course_002", "C");
		System.out.println(hashMap.toString());
		Iterator itr= hashMap.keySet().iterator();
		while(itr.hasNext()) {
			Object key=itr.next();
			Object value= hashMap.get(key);
			System.out.println(key + "  "+ value);
		}
		
	}

}
