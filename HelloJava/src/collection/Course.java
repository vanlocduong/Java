package collection;

	public class Course implements Comparable{
		private String nameCourse;
		private int time;
		public Course() {
			
		}
		public Course(String name, int time) {
			super();
			this.nameCourse = name;
			this.time = time;
		}
		@Override
		public String toString() {
			return "Course [name=" + nameCourse + ", time=" + time + "]";
		}
		public String getNameCourse() {
			return nameCourse;
		}
		public void setName(String name) {
			this.nameCourse = name;
		}
		public int getTime() {
			return time;
		}
		public void setTime(int time) {
			this.time = time;
		}
		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			Course crs=(Course) o;
			if(this.getTime() > crs.getTime()) return 1;
			else if(this.getTime() < crs.getTime()) return -1;
			return 0;
		}
		
		
	
	}
