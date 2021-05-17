class A2{
	void demo() {
		System.out.println("this is demo of A1");
	}
}

class B1 extends A2{
	void demo() {
		System.out.println("this is demo of B1");
	}	
}

public class MethodOverddingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    B1 b=new B1();
    	b.demo();
   
	}

}
