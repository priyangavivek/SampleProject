package Array;
//Two dimensional array
public class ArrayTest2 {

	public static void main(String[] args) {
   /*String vN[][] = {{"priya","Vivek"},
                     {"nishwanth","Shanthi"}};
   
   System.out.println(vN.length);*/
		
   /*for(int i=0; i<2; i++){
	   
	   for(int j=0;j<2;j++){
		   System.out.println("arr["+i+"] ["+j+"] = "+vN[i][j]);
	   }
   }*/
		String b[][] = new String [2][3];
		b[0][0] ="Priya";
		b[0][1] ="Vivek";
		b[0][2] ="Nihw";
		b[1][0] ="Nishw";
		b[1][1] ="Nish";
		b[1][2] ="Nis";
		
		for(int i=0; i<2; i++){
	   
	   for(int j=0;j<3;j++){
	   			System.out.println("arr["+i+"]["+j+"}" + b[i][j]);
		}
		
	
		
		
		
		}
		
	}	

}
