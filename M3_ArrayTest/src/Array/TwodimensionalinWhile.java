package Array;

public class TwodimensionalinWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][]ab = {{"priya","vivek"},
		          {"Nishwanth","Shanthi"}};
		System.out.println(ab.length);
		
		int i=0;
		while (i<2){
			i++;
			
			int j=0;
			while (j<2){
				j++;
				
				System.out.println(ab[i][j]);
		}
			

	}
	
	}
}

