class A3{
	A3(){
		System.out.println("this is parent class const");
	}
}

class B2 extends A3{
	B2(){
		super();
		System.out.println("this is child class constru");
	}
}
public class superconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 b=new B2();
	}

}
