package Array;

public class SwitchTest {

	public static void main(String[] args) {
		String value = "Hello+World";
		String[] values = value.split("\\+");
		/*for (String test:values){
			System.out.println(test+"******");
		}*/
		
		for (int i=0; i<values.length;i++){
			System.out.println(values[i]);
			int [] var= login(values[i]);
			for(int j=0;j<var.length;j++){
				System.out.println(var[j]);
			}
		}
			
		}
		public static int []login (String data){
		int[] limitx ={1,2,3,4,5};
		int[] limity ={6,7,8,9,10};
		int[] limit ={0,0,0,0,0};
		
		switch ("hellow"){
		case"hellow":
			limit=limitx;
			//System.out.println(limit[0]);
			break;
		case"World":
			limit=limity;
			//System.out.println(limit[1]);
			break;
		
		}
		return limit;

	}

}
