class Vehicle{
	 void run() {
		 System.out.println("vehicle is running");
	 }
}

class Bike1 extends Vehicle{
	void run() {
		 System.out.println("bike1 is running");
	}
}

public class RuntimePolydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle b=new Bike1();
		b.run();
	}

}
