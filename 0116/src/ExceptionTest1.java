public class ExceptionTest1 {
	static void func() throws Exception {
		try {
			
			System.out.println("1차 try");
			
			String str=null;
			System.out.println(str.toString());
		} catch(Exception e) {
			System.out.println("1차 처리");
			throw new Exception("다시 생성");
			}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			func();	
		} catch(Exception e) {
			System.out.println("종료");
			System.out.println(e);
		}
		
		
		
	}

}
