package Array;

public class ArrayTeat1 {

	public static void main(String[] args) {
		
		int a[] = {5,6,7};
		System.out.println(a[0]);
		for(int i=0; i<a.length; i++){
		System.out.println("Print value of array"+i);
		}
		
		int b[] = new int[5];
		b[0] =100;
		b[1] =98;
		b[4] =23;
		b[2] =45;
		b[3] =67;
		
		//System.out.println(b[3]);
		
		for (int i : b) {
			System.out.println(i);
		}
		
	}

}
