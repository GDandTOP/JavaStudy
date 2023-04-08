class MyClass2{
	final int num;// 인스턴스 변수가 이렇게 선언되면 모든 객체가 20으로 됨 
	MyClass2(int num){
		this.num = num; //각각의 객체가 상수로 가지고 있어서 선언 동시에 초기화 안함
		
	}
	void func() {
//		this.num = num;
	}
}
public class FinalTest {

	public static void main(String[] args) {
		int n = 10;
		n = 20;
		
		final int m = 20; // 선언할때 초기화 바로함
		// 변경 불가능 변수 
		// m=30;// 이건 에러

	}

}
