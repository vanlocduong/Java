package collection;

import java.util.Comparator;

public class NameComparator implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Course course1=(Course) o1;
		Course course2=(Course) o2;
		return course1.getNameCourse().compareTo(course2.getNameCourse());
	}
	
}
