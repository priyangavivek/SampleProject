package polymorphysm;

public class methodOverloading {

	public static void main(String[] args) {
		methodOverloading obj = new methodOverloading();
		obj.add();
		obj.add("priya");
		obj.add("priya",30);

	}
	
	public void add(){
		System.out.println("i am from non parameter method");
	}

	public void add(String name){
		System.out.println("i am from String parameter method"+ name);
	}
	
	public void add(String name, int age){
		System.out.println("i am from String and int parameter method"+ name+"age::::"+age);
	}
}
