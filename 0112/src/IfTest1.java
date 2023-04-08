
public class IfTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 95, eng =88, math = 75;
		char grade;
		double avg = (kor + eng + math)/3.0;
				
		if(avg >= 90) {
			grade ='A';
		} else if (avg >= 80) {
			grade ='B';
		} else if (avg >= 70) {
			grade ='C';
		} else if (avg >= 50) {
			grade ='D';
		} else {
			grade = 'F';
		}
		System.out.println("평균 : " + avg +", 학점 : " + grade);
		
		
}
}
