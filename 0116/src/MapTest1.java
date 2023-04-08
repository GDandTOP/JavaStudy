import java.util.HashMap;

class Student extends Person {
	int num;
	String major;
	Student(int age, String name, int num, String major) {
		super(age, name);
		this.num=num;
		this.major=major;
	}
	@Override
	public String toString() {
		return super.toString()+", 학번:"+num+", 전공 : "+major;
	}
}


public class MapTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 		HashMap<Integer, Student> studs = new HashMap<>();
		studs.put(100, new Student(20,"홍길동",100,"산업공학"));
		studs.put(101, new Student(21,"김길동",101,"인지심학"));
		studs.put(102, new Student(22,"하길동",102,"창렬"));
		System.out.println(studs.get(100));

		
		for(Student s : studs.values()) {
			System.out.println(s);
		}
		
		for(Integer n : studs.keySet()) {
			System.out.println(studs.get(n));
		}
		
	}

}
