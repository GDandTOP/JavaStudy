class Base {
	private int pv=1;
	protected int rv=2;
	int dv=3;
	public int bv=4;
	public int getPv() {
		return pv;
	}
	public void setPv(int pv) {
		this.pv = pv;
	}
	public int getRv() {
		return rv;
	}
	public void setRv(int rv) {
		this.rv = rv;
	}
	public int getDv() {
		return dv;
	}
	public void setDv(int dv) {
		this.dv = dv;
	}
	public int getBv() {
		return bv;
	}
	public void setBv(int bv) {
		this.bv = bv;
	}
	void func() {
		pv=10;
		rv=20;
		dv=30;
		bv=40;
	}
}

class Derived extends Base {
	void funct() {
		//pv=10; // 부모의 private 변수 접근 불가능
		rv = 20;
		dv=30;
		bv=40;
	}
}

public class AccessTest1 {

	public static void main(String[] args) {
		Base b = new Base();	
//		b.pv = 123; // private 변수 접근 불가능
		b.setPv(50);
		System.out.println(b.getPv()); // setter getter로 접근 가능
		
		Derived d = new Derived();
		d.setPv(90);
		System.out.println(d.getPv()); // setter getter로 접근 가능
//		d.pv = 100; // private 변수 접근 불가능
		d.rv = 141; // protected / 경우에 따라 접근 가능, (같은 패키지에 있을 경우 접근 가능) protected : 같은 패키지에 있을 경우 접근 가능
		d.dv = 123; // default : 경우에 따라 가능. 같은 패키지에 있을 경우 접근 가능
		d.bv = 123; // public : 당연히 가능
		
	}

}
