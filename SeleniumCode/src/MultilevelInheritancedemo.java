class A1{
	void demo() {
		System.out.println("this is demo of A");
	}
}

class B extends A1{
	void display() {
		System.out.println("this is display of B");
	}
}

class C extends B{
	void show() {
		System.out.println("this is show of C");
	}
}

public class MultilevelInheritancedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*C obj=new C();
		obj.demo();
		obj.display();
		obj.show();*/
		
		
		/*B obj1=new B();
		obj1.display();
		obj1.demo();*/
		
		A1 obj=new A1();
		obj.demo();
	}

}
