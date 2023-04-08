import pac.Person;
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
//		p.age=10; error
		p.setAge(10);// 정보 은닉때문에 이렇게 막아둠 
		// 게터 세터 하고 만들어야 된다
		p.setAge(-10);

	}

}
