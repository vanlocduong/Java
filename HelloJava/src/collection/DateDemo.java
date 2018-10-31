package collection;
import  java.util.*;
import java.text.*;  
public class DateDemo {
	
		public DateDemo(){
			Date dt=new Date();
			System.out.println ("Thoi gian hien tai ="+ dt);
			System.out.println ("+++++++++++++++++");
			System.out.println ("Thoi gian hien tai  ="+ ngayThang(dt));
			System.out.println ("++++++++++++++");
			CalenderDemo();
			} 
	//	lấy ngày tháng năm hiện tại. có 2 cách. SimpleDateFormat, Calender
		public String ngayThang(Date dt){
			SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
			return f.format(dt).toString();
			
			} 	
	   
	//	ngay hang nam
		public void CalenderDemo(){
			Calendar ca=Calendar.getInstance();
			System.out.println ("Hom nay la ngay : "+ ca.get(Calendar.DATE));
			System.out.println ("DAY_OF_MONTH : "+ ca.get(Calendar.DAY_OF_MONTH));
			System.out.println ("Hom nay la ngay : "+ ca.get(Calendar.DAY_OF_WEEK_IN_MONTH));
			
			}	

}
