class Animal{
	String color1="white";
}

class Dog1 extends Animal{
	String color="balck";
	
	void display() {
		System.out.println("parent class color "+super.color1);
		System.out.println("child class color "+color);
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d=new Dog1();
		d.display();
	}

}
