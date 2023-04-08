class Only {
	int n=10;

	static Only only;
	private Only() {
//		if (only==null) {
//			only = new Only();
//		}
	}
	public static Only getOnlyRef() {
		if (only==null) only = new Only();
		return only;
	}
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
}


public class SingleTonTest {
	private SingleTonTest() {
		
	}
	public SingleTonTest(int n) {}
	
	
	
	public static void main(String[] args) {
			Only o1 = Only.getOnlyRef();
			System.out.println(o1.getN());
			o1.setN(30);
			
			Only o2 = Only.getOnlyRef();
			System.out.println(o2.getN());
			System.out.println(o1.getN());
			
//			
//			SingleTonTest s1 = new SingleTonTest();
//			SingleTonTest s2 = new SingleTonTest(20);
			
	}

}
