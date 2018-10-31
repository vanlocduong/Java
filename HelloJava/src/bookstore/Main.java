package bookstore;

import java.util.Scanner;

public class Main {

	private static Book book= null;

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int functionID= 0;
		 boolean flag= true;
		do {
			showMenu();
			functionID= sc.nextInt();
			sc.nextLine();
			switch (functionID) {
			case 1: addBook(); break;
			case 2: editBook(); break;
			case 3: infoBook(); break;
			case 4:
			default: flag = false;
				break;
			}
		} while (flag);
		sc.close();
		
		
//		Book book = new Book("1","thinking difference",12.0);
//		book.showInfo();
	}
	private static void showMenu() {
		myPrint("Book Manager-------------");
		myPrint("1 add Book Manager");
		myPrint("2 edit Book Manager");
		myPrint("3 info Book Manager");
		myPrint("4 exit");
	}
	
	private static void myPrint(String content) {
		System.out.println(content);
	}

	private static void infoBook() {
		// TODO Auto-generated method stub
		if(book != null) {
			book.showInfo();
		}else {
			System.out.println("sach chua co trong store");
		}
		
	}	

	private static void editBook() {
		// TODO Auto-generated method stub
		if(book != null) {
			Scanner sc= new Scanner(System.in);
			String bookName= "";
			double bookPrice= 0;
			myPrint("bookName ");
			bookName= sc.nextLine();
			myPrint("bookPrice ");
			bookPrice= sc.nextDouble();
			book.setName(bookName);
			book.setPrice(bookPrice);
			System.out.println("sau khi cap nhat ");
			book.showInfo();
		}else {
			System.out.println("sach chua co trong store");
		}
		
	}

	private static void addBook() {
		// TODO Auto-generated method stub
		myPrint("addBook()");
		Scanner sc= new Scanner(System.in);
		String bookID= "";
		String bookName= "";
		double bookPrice= 0;
		myPrint("ID ");
		bookID= sc.nextLine();
		myPrint("bookName ");
		bookName= sc.nextLine();
		myPrint("bookPrice ");
		bookPrice= sc.nextDouble();
		book= new Book(bookID, bookName, bookPrice);
		book.showInfo();
	}

}
