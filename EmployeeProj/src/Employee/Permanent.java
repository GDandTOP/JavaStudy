package Employee;

public class Permanent extends Employee {

	private int pay;
	
	public Permanent(int id, String name, int pay) {
		super(id, name);
		this.pay = pay;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return super.toString()+ ", 급여 : "+getPay();
	}
	

	
	@Override
	public int getPay() {
		return pay;
	}

}
