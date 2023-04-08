// 모든 객체가 하나를 공유해야 할떄 static 을 쓴다 
class Product{
	static int snum;
	int serialNum;
	public Product() {
		serialNum = ++snum;
	}
	
}
public class StaticTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] pros = new Product[] {
				new Product(), 
				new Product(), 
				new Product(),
		};
		for( int i=0; i<pros.length; i++) {
			System.out.println(pros[i].serialNum);
		}
		

	}

}
