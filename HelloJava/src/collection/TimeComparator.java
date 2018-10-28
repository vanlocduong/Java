package collection;

import java.util.Comparator;

public class TimeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Course course1=(Course) o1;
		Course course2=(Course) o2;
		if(course1.getTime() > course2.getTime()) return 1;
		if(course1.getTime() < course2.getTime()) return -1;
		return 0;
	}

}
