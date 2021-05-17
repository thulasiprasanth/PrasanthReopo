abstract class A9{
	abstract void demo();
	void show() {
		System.out.println("this is show");
	}
}

class B9 extends A9{

	void demo() {
		System.out.println("this is implementaion of demo");
	}
}

public class abstractclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B9 b=new B9();
		b.demo();
		b.show();
	}

}
