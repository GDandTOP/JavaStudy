import acc.SpeacialAccount;
import acc.Account;
public class AccountTest {
	public static void main(String[] args) {
		SpeacialAccount sacc = 
				new SpeacialAccount(
						100,"mike",100000,"VIP");
		System.out.println(sacc.getNum());
		System.out.println(sacc.info());
		sacc.deposit(1234567);
		System.out.println(sacc.info());
		// upcating : 자식 객체를 부모티ㅣㅂ의 래퍼런스 변수에 담을 수 있다
		Account acc = new SpeacialAccount(100,"hike",100000,"VIP");
		
		System.out.println(acc.info());
		SpeacialAccount ssacc = (SpeacialAccount)acc;
		acc.info(); // 자식ㄲ[ 호출이됨
		// upcasting 후 오버라이딩한 메소드ㅡ 호출시 자식 메소드호출
		// 다형성
		System.out.println(acc.info());
		
		
		
		
		
	}

}
