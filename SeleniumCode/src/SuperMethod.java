class Vechile{
	void disp() {
		System.out.println("this is disp of vechicle class");
	}
}

class Bike extends Vechile{
	void show() {
		super.disp();
		System.out.println("this is show of bike");
	}
}
public class SuperMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike();
		b.show();
	}

}
