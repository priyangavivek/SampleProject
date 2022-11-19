package Array;

public class ReverseStringArray {
			
		static char rs;
		static String result = "";
		public static void main(String[] args){
			System.out.println(reverseString("Hello World"));
			
		}
		
		public static String reverseString(String data){
			char[] text = data.toCharArray();
			
			for(int i=text.length-1;i>=0;i--){
			rs=text[i];
			result= result.concat(String.valueOf(rs));
				
			}
	return result;
		}
}
	
	