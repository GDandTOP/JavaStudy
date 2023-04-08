class Person{
	int age;
	String name;
	double height;
	
	
	String info() {
		return "이름 :" + name + ",나이 : " + age + ",키: "+ height;
	}
}

public class ClassTest1 {
	public static void personInfo(Person p) {
		p.age =40;
		System.out.println(p);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.age = 20;
		p.name = "홍길동";
		p.height = 175.3;
//		System.out.println(p.info());
		Person p2 = p;
		System.out.println(p.info()); // 여기는 안바뀜
		p2.age = 30;
		System.out.println(p.info()); // p의 나이도 30으로 바뀜 주소의 값을 변경하기 때문에
		System.out.println(p2.info()); 
		personInfo(p);
		
		System.out.println(p.info()); 
		System.out.println(p2.info()); // p2의 나이도 40으로 바뀜 주소의 값을 변경하기 때문에 

	}

}
