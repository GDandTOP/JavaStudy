class Test{
	void tfunc1() {}
}
public class Statictest1 {
	public  void func1() {}
	public  static void func2() {}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//func1();// 에러 void 앞에스태틱 부르거나 new 로 생성
		Statictest1
		st = new Statictest1();
		st.func1();
		func2();
		
		Test test = new Test();
		test.tfunc1();
		
		
		

	}

}
