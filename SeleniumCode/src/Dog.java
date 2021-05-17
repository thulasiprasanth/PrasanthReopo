
public class Dog {
	
	//states
	String name="puppy";
	String color="black";
	int age=5;
	
	//behaviours
	public void eating() {
		System.out.println("eating");
	}
	
	public void sleeping() {
		System.out.println("sleeping");
	}
	
	public void barking() {
		System.out.println("barking");
	}
	
	public void showdoginfo() {
		System.out.println("My dog name "+name);
		System.out.println("My dog color "+color);
		System.out.println("My dog age is"+age);
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d=new Dog();
		d.eating();
		d.sleeping();
		d.barking();
		d.showdoginfo();
		
		System.out.println("dog1 object creaion ");
		Dog d1=new Dog();
		d1.eating();
		d1.sleeping();
		d1.barking();
		d1.showdoginfo();
		
	}
}
	
	

