class Calculator{
	int val1;
	int val2;
	
//	public Calculator() {
//		System.out.println("I am Calculator ");
//	}
	
	public Calculator(int val1, int val2) {
		this.val1 = val1;
//		v2=val2;
		
	}
	int add() {
		return val1 + val2;
	}
	int add(int data1,int data2) {
		return data1+data2;
	}
	
	int add(int d1,int d2, int d3) {
		return d1+d2+d3;
	} // 매개변수의 갯수가 다르면 메소드 오버로딩이라는 함수명 같아도 된다
	
	double add(double data1,double data2) {
		return data1+data2;
	}// 매매개변수의 타입이 다르면 메소드 오버로딩이라는 함수명 같아도 된다
	
	public Calculator(int val1) {
		this.val1 = val1;
		this.val2 = 0;
//		v2=val2;
		
	}
	
	public Calculator() {} // 기본 생성자, 생성자가 없을때만 자동 생성 됨 생성자가 하나라도 있으면 수동으로만들어야 된다
}
public class MethondTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator(20,200000);
		
		
		Calculator cal2 = new Calculator(100); //생성자 변수 하나짜리
		Calculator cal3 = new Calculator(); // 생성자 변수 없는거  
//		위에서 해당 상황을 만들어서 오류가 안뜸
//		기본 생성자는 생성자를 안만들었을때 자동으로 만들어짐
//		
		
		
		System.out.println(cal.add());
		cal.val1=10;
		cal.val2=20;
		System.out.println(cal.add());
		System.out.println(cal.add(100,200));
		System.out.println(cal.add(1000.0,900.0));
		System.out.println(cal.add(1000,90,1));

	}

}
