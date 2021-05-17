class Parent1{
	void display() {
		System.out.println("this is disp of parent1");
	}
}

class Son1 extends Parent1{
	void demo() {
		System.out.println("this is demo of son1");
	}
}

class Son2 extends Parent1{
	void show() {
		System.out.println("this is show of son2");
	}
}


public class HeirachicalInheritancedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Son1 s1=new Son1();
		s1.demo();
		s1.display();*/
		
		Son2 s2=new Son2();
		s2.display();
		s2.show();
	}

}
