
public class switchTest1 {

	public static void main(String[] args) {
		int kor = 95, eng =88, math = 75;
		String grade;
		double avg = (kor + eng + math)/3.0;
		
		
		
		switch((int)avg/10) {
		case 10:
		case 9: grade ="A";break;
		case 8: grade ="B";break;
		case 7: grade ="C";break;
		case 6: grade ="D";break;
		default: grade ="F";
		
		}
		System.out.println("평균 : " + avg +", 학점 : " + grade);
		
		
	

}}
