class IClick {
	void click() {}
}

class MyButton {
	IClick iclick ;
	
//	static void method() {
//		System.out.print(123);
//	}
	
	void onClick() {
		System.out.println("꾹 눌림");
		if(iclick!=null) {
			iclick.click();
		}
	}
	
	void addClickListner(IClick iclick) {
		this.iclick=iclick;
	}
}


public class AnonyClassTest3 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		MyButton a = new MyButton();
		MyButton b = new MyButton();
		MyButton c = new MyButton();

		
		MyButton loginBtn = new MyButton();
		loginBtn.addClickListner(new IClick() {
			@Override
			public void click() {
				System.out.println("로그인 처리 익명클래스로 구현해보리기~");
			}
		});
		loginBtn.onClick();
	}
}
