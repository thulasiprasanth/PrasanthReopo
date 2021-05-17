interface Sample{
	void show();
	void show1();
}

class Example implements Sample{

	public void show() {
		System.out.println("this is show implementaion");
	}

	public void show1() {
		// TODO Auto-generated method stub
		
	}
}



public class interfacedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Example e=new Example();
		//e.show();
		Sample s=new Example();
		s.show();
		s.show1();
	}

}
