package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ComparableCollection {

	public static void main(String[] args) {

		Course course = new Course("Android", 12);
		Course course1 = new Course("Java", 45);
		Course course12 = new Course("learn C", 3);

		ArrayList arr = new ArrayList();
		arr.add(course);
		arr.add(course1);
		arr.add(course12);

		Iterator it = arr.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		Collections.sort(arr);
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
