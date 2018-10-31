package OOP;

public class PhanSo {
	private int tuSo;
	private int mauSo;
	
	public PhanSo() {
		
	}
	public String print() {
		return this.getTuSo() +" / "+ this.getMauSo();
	}
	public PhanSo(int tuSo, int mauSo) {
		super();
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}
	public int getTuSo() {
		return tuSo;
	}
	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}
	public int getMauSo() {
		return mauSo;
	}
	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}
	public int UCLN(int a, int b) {
		int result = Math.min(a, b);
		if(a % result == 0 & b % result== 0) {
			return result;
			
		}
		result --;
		return result;
	}
	public boolean KTtoigian() {
		if(this.UCLN(this.tuSo, this.getMauSo()) == 1) return true;
		return false;
	}
	public void ToiGian() {
		int ucln= this.UCLN(this.getTuSo(), this.getMauSo());
		if(ucln >1) {
			this.setTuSo(this.getTuSo() /ucln);
			this.setMauSo(this.getMauSo() /ucln);
		}
	}
	
}
