import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Scanner;

public class ATM2 {

	public static void main(String[] args) {
		
		DecimalFormat formater = new DecimalFormat("#,###");
		
		// TODO Auto-generated method stub
		final int NAM_TRAM_NGAN =500000;
		final int HAI_TRAM_NGAN=200000;
		final int MOT_TRAM_NGAN=100000;
		final int NAM_MUOI_NGAN=50000;
		final int HAI_MUOI_NGAN=20000;
		final int MUOI_NGAN=10000;
		
		int monney=0;
		
		int namtramngan=0;
		int haitramngan=0;
		int mottramngan=0;
		int nammuoingan=0;
		int haimuoingan=0;
		int muoingan=0;
		
		Scanner scanner= new Scanner(System.in);
		
		do {
			System.out.println("Nhap so tien can rut ");
			monney = scanner.nextInt();
		}while(monney % 10000 !=0 );
		scanner.close();
		
		System.out.println("------------------------------");
		
		if(monney >= NAM_TRAM_NGAN) {
			namtramngan = monney/ NAM_TRAM_NGAN;
			monney  = monney % NAM_TRAM_NGAN;
			System.out.printf("menh gia 500k co %s: %d %n"+ formater.format(NAM_TRAM_NGAN), namtramngan);
		}
		
		if(monney >= HAI_TRAM_NGAN) {
			haitramngan = monney/ HAI_TRAM_NGAN;
			monney  = monney % HAI_TRAM_NGAN;
			System.out.printf("menh gia 200k co %s: %s %n"+ formater.format(HAI_TRAM_NGAN), haitramngan);
		}
		
		
	}

}
