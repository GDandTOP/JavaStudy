interface IMovable {
	void move(int x, int y);
}

interface IFilterble extends IMovable {
	
}

class Fiter implements IMovable {
	
	@Override // 이걸 써줘야하는 이유?
	public void move(int x, int y) { // default가 되기 때문에 에러가 남. interface에선 public 이기 때문에 오류 발생
		
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
