package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mangnhapvao();
		//saochepmang();
		sapsep();
		
	}
	public static void sapsep() {
		int arrint[]= {1,2,2,4,5,26,6,23};
		System.out.println("input "+ Arrays.toString(arrint));
		
		Arrays.sort(arrint);
		System.out.println("tang dan  "+ Arrays.toString(arrint));
		
		int length = arrint.length;
		for( int i = 0 ; i < length/2; i ++) {
			int temp = arrint[i];
			arrint[i] = arrint[length - 1- i];
			arrint[length -1 -i ]= temp;	
		}
		System.out.println("giam dan  "+ Arrays.toString(arrint));
		
		
	}
	public static void saochepmang() {
		String array1[]= {"a", "b","c"};
		
		String arrCP[]= Arrays.copyOfRange(array1,0, 2);
		System.out.println("gia tri  "+ arrCP[1] + arrCP[0]);
	}
	public static void mangnhapvao() {
		System.out.println(" nhap vao length : ");
		Scanner scanner  = new Scanner(System.in);
		int lenght = scanner.nextInt();
		scanner.nextLine();
		int[] arrNumber= new int[lenght];
		for(int i=0; i <lenght; i ++) {
			System.out.println("nhap so phan tu mang ");
			arrNumber[i] = scanner.nextInt();
			scanner.nextLine();
		}
		scanner.close();
	}
	public static void khaibao() {
		int mang[];
		int[] mang1;
		int[] mang2= new int[5];
		int array[]= {1,2,3};
		String array1[]= {"a", "b","c"};
		
		for(String n: array1) {
			System.out.println("man "+ n);
		}
	}

}
