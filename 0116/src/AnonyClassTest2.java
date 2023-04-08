class Button {
	void onClick() {
		System.out.println("버튼이 꾹 눌림");
	}
}

class LoginButton extends Button {
	@Override
	void onClick() {
		super.onClick();
		System.out.println("로그인 처리");
	}
}


public class AnonyClassTest2 {

	public static void main(String[] args) {
		Button lb = new Button() {
			@Override
			void onClick() {
				super.onClick();
				System.out.println("로그인 처리 익명 클래스로 레쓰고");
			}
		};
		lb.onClick();
		
		Button jb = new Button() {
			@Override
			void onClick() {
				super.onClick();
				System.out.println("회원가입 처리 익명클래스2로 레쓰고~");
			}
		};
		jb.onClick();
		
		
	}

}
