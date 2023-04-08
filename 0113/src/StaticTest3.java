class MyClass3{
	static int[] narr =  
			new int[] {10,20,30,40,50,60,70,80,90,100};
	// 얘는 어디서 초기화 하면 될까?
	// 스택틱 블럭으로 초기화
	static {
		// 초기화 하는 명령어를 넣으면 된다
		for(int i = 0; 1<narr.length; i++) {
			narr[i]= (int)(Math.random()*100)+1;
		}
	}
	
}
public class StaticTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
