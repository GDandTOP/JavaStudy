import java.util.ArrayList;
import java.util.Iterator;

class Person {
	int age;
	String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Person(int age, String name) {
		this.age=age;
		this.name=name;
	}
	
	public String info() {
		return "나이와 이름은 : "
				+ ""+this.getAge()+" "+this.getName();
	}
	
	@Override
	public String toString() {
		return "나이와 이름은 : "
				+ ""+this.getAge()+" "+this.getName();
	}
}

public class ListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();

		list.add("hong");
		list.add("bong");
		list.add("cong");
		list.add("kong");
		list.add(0,"long");
		for(Object s: list) {
			System.out.println(s);
		}
		
		
		ArrayList<Person> list4 = new ArrayList();
		list4.add(new Person(20,"김영욱"));
		list4.add(new Person(30,"하하"));
		list4.add(new Person(50,"YG"));
		
		for (Person a : list4)
		{
			System.out.println(a.info());
		}
		
//		Iterator<Person> it = list4.iterator();
//		if(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
	}

}
