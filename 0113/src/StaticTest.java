class TempClass{
	int value; // instance value
	static int svalue; // class value (stactic value)
	void func(){
		value = 10;
		svalue = 20;
		sfunc();
	}//일반 메소드
	void func2() {
		func();
	}
	static void sfunc() {
		// value = 1; // static 메소드 에서는 인스턴스 변수 접근 불가능
		// func(); // static 메소드에서는 인스턴스 메서드 호출 불가능
		svalue = 2; //즉 static끼리만 instance 끼리만 호출 가능
		sfunc2();
	}
	static void sfunc2() {}
}
public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempClass.svalue = 100; // 클래스 이름을 통해 객체 생성 없이도 접근 가능
		
		System.out.println(TempClass.svalue);
		
//		TempClass.value =200; // error
		TempClass tc = new TempClass();// tc 라는 메소드 안에있는 지역 변수에 담았다!!
		tc.value = 200; // 객체 생성 후 레퍼런스 변수를 통해서만 접근 가능
		System.out.println(tc.value);
		System.out.println(tc.svalue);// 이렇게도 접근 가능하다 
		
		TempClass.sfunc();// static 메소드  역시 객체 생성 없이 클래스명으로만도 호출 가능
		tc.func();//아ㅣㄴ스턴스 메서드는 객체 생성 후 레퍼런스를 통해서만 호출 가능
		
		
	}

}
