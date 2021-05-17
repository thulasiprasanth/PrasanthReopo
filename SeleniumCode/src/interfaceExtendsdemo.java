interface A11{
	void show();
}

interface B11 extends A11{
	void demo();
}

class Multilevel implements B11{

	public void show() {
		System.out.println("show of A11");
		
	}
	public void demo() {
		System.out.println("demo of B11");
	}
}

public class interfaceExtendsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevel m=new Multilevel();
		m.demo();
		m.show();
		
		B11 b=new Multilevel();
		b.demo();
		b.show();
		
		B11 b1;
		b1=new  Multilevel();
		b1.show();
		b1.demo();
	}

}
