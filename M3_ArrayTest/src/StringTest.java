
public class StringTest {

	public static void main(String[] args) {
		//String is a class level object
		String txt = "Test";
		System.out.println(System.identityHashCode(txt));
		String text ="Test";
		System.out.println(System.identityHashCode(text));
		//System.out.println(txt==text);
		
		String s= new String("test");
		System.out.println(System.identityHashCode(s));
		String s1= new String("test");
		System.out.println(System.identityHashCode(s1));
		//System.out.println(s==s1);

	}

	
	
	
}
