package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparatorCollecion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course course = new Course("Android", 12);
		Course course1 = new Course("Java", 45);
		Course course12 = new Course("learn C", 3);
		Course course13 = new Course("Android C", 12);

		ArrayList arr = new ArrayList();
		arr.add(course);
		arr.add(course1);
		arr.add(course12);
		arr.add(course13);
		
		Iterator it = arr.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

//		Collections.sort(arr,new TimeComparator());
//		Collections.sort(arr, new NameComparator());
		Collections.sort(arr,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Course course1=(Course) o1;
				Course course2=(Course) o2;
				if(course1.getTime() > course2.getTime()) return 1;
				if(course1.getTime() < course2.getTime()) return -1;
				return 0;
			}
			
		});
		
		System.out.println("-----------------------");
		Iterator it1 = arr.iterator();
		while (it1.hasNext()) {
			Object obj = it1.next();
			if (obj instanceof Course) {
				Course cs = (Course) obj;
				System.out.println(cs.getNameCourse() + " " + cs.getTime());
			}
		}
	}

}
