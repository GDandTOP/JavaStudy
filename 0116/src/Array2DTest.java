
public class Array2DTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry1 = new int[] {1,2,3,4};
		int[][] arry2 = new int[][] {
			{10,20,30,40},
			{1,2,3,4},
			{100,200,300,400}
		};
		
		int[][] arry3 = new int[4][];
		arry3[0] = new int[] {10,20,30,40,0};
		arry3[1] = new int[] {1,2,3,4,0};
		arry3[2] = new int[] {100,200,300,400,0};
		arry3[3] = new int[] {111,222,333,444,0};
		
		for (int i=0; i<arry3.length; i++) {
			int tot = 0;
			for (int j=0; j<arry3[i].length; j++) {
				tot+=arry3[i][j];
			}
			arry3[i][arry3[i].length-1]=tot;

		}
		
		for (int i=0; i<arry3.length; i++) {

			for (int j=0; j<arry3[i].length; j++) {
				System.out.print(arry3[i][j]+"\t");
			}
			System.out.println("\n");
		}
		

		
	}

}














//arry3[0] = new int[] {10,20,30,40,50};
//arry3[1] = new int[] {1,2,3,4,10};
//arry3[2] = new int[] {100,200,300,1000};
//arry3[3] = new int[] {111,222,333,444,1110};
//
//
//for (int i=0; i<arry3.length; i++) {
//	for (int j=0; j<arry3[i].length; j++) {
//		System.out.printf("%d행 %d열은 : ",i,j);
//		System.out.println(arry3[i][j]);
//	}
//}

//System.out.println(arry3.length);
//
//System.out.println(arry3[0]);