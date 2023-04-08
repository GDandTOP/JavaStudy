import java.util.StringTokenizer;

public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "string";
		String str2 = "string";
		String str3 = new String("string");
		String str4 = new String("string");
		
		Person p1 = new Person(10,"hong");

		Person p2 = new Person(10,"hong");

		Person p3=p1;
		
		System.out.println(p1==p2);

		System.out.println(p1==p3);
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4);
		
		System.out.println(str1.charAt(5));
		String str6 = str1.replace('i','o');
		System.out.println(str6);
		
		String animals = "monkey,dog,cat";
		String[] animalArr = animals.split(",");
		for (String a : animalArr) {
			System.out.println(a);
		}
		
		StringTokenizer stk = new StringTokenizer(animals,",-");
		while(stk.hasMoreElements()) {
			System.out.println(stk.nextToken());
		}
	}
	


}
