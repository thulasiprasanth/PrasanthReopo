interface A10{
	void show();
}

interface B10{
	void demo();
}

class MultipleInterface implements A10,B10{

	public void demo() {
		System.out.println("this is demo of A10");
		
	}
	public void show() {
		System.out.println("this is show of A10");
	}
	
}
public class Multipleinterfacedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 /*A10 a=new MultipleInterface();
	 a.show();
	 
	 B10 b=new MultipleInterface();
	 b.demo();*/
		MultipleInterface m=new MultipleInterface();
		m.demo();
		m.show();
		
		
	}

}
