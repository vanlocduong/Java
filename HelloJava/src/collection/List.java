package collection;

import java.util.*;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayList();
		arrayListCallFunction();
	}
	// call function with object
	public static void arrayListCallFunction(){
		ArrayList<Course> arrCourse= new ArrayList<Course>();
		Course course1= new Course();
		course1.setName("Android");
		course1.setTime(20);
		arrCourse.add(course1);
		
		Course course2= new Course();
		course2.setName("Python");
		course2.setTime(23);
		arrCourse.add(course2);
		if(!arrCourse.isEmpty()) {
			Iterator it= arrCourse.iterator();
			while (it.hasNext()) {
				Object obj= it.next();
				if(obj instanceof Course) {
					Course cose=(Course) obj;
					System.out.println(cose.getNameCourse());
				}
				
			}
		}
		
		
		
		
	}
	
	public static void arrayList() {
		ArrayList arrList= new ArrayList<>();
		arrList.add("Java");
		arrList.add(4);
		arrList.add(true);
		for(int i =0; i<arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		arrList.add(1, "Android");
		for(Object obj: arrList) {
			System.out.println(obj);
		}
		if(!arrList.isEmpty()) {
			Iterator it= arrList.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		
		}else {
			System.out.println("arraylist is empty");
		}
		
	}

}
