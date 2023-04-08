package Employee;

public class Sales extends Permanent implements IBusinessTrip {


	private int incentive;
	public Sales(int id, String name, int pay, int incentive ) {
		super(id, name,pay);
		this.incentive=incentive;
		// TODO Auto-generated constructor stub
	}
	
//	@Override
//	public String toString() {
//		return super.toString()+" 급여 : "+getPay();
//	}
	
	@Override
	public int getPay() {
		return super.getPay() + getIncentive();
	}

	
	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	@Override
	public void goBusinessTrip(int day) {
		// TODO Auto-generated method stub
		this.incentive+=(10000*day);
	}
}
