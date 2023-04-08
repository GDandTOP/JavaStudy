class Temp {
	int num=10;
	static int snum=20;
	
	class Temp2 {
		int num2= num;
	}
	static class Temp3 {
//		int numt3 = num; // static class에서 outer class 변수 사용 못함
		int snumt3 = snum;
	}
	
	
	void method1() {
		Temp2 temp2 = new Temp2();
		Temp3 temp3 = new Temp3();
	}
	
	
	static void method2() {
		Temp a = new Temp();
		Temp2 temp2 = a.new Temp2();
	
		Temp3 temp3 = new Temp3();
	}
	
	
	void method3(int n) {
		int iv=0;
		final int N=n;
		
		class Temp4 {
			int numt4 = iv; // 일반 지역변수는 쓰면 안됨. (인스턴스 생성시에 지역변수는 사라지기 떄문에.)
			int cnumt4 = N; // > 그러니까 이런식으로 final 지역 변수를 사용해서 사라지지 않게 강제한다음 사용해야 한다.
			void tmethod() {
				System.out.println(N);
			}
		}
	}
	
	
}
public class InnerClassTest1 {

	public static void main(String[] args) {
		Temp a = new Temp();
		Temp.Temp2 b = a.new Temp2(); // 인스턴스클래스여서 바로 불가능
		
		Temp.Temp3 c = new Temp.Temp3(); // static class 라서 바로 가능
	
	}

}
