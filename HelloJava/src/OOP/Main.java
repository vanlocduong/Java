package OOP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhanSo ps= new PhanSo(2,4);
		System.out.println("phan so "+ ps.print());
		System.out.println("UCLN "+ ps.UCLN(3, 9));
		
		ps.ToiGian();
		System.out.println("toi gian phan so "+ ps.print());
		
//		if(ps.KTtoigian()) {
//			System.out.println("phan so da toi gian");
//		}else {
//			System.out.println("phan so chua toi gian");
//		}
//		
	}

}
