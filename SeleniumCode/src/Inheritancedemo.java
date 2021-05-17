class Parent{
	int a=10;
}

class Child extends Parent{
	int b=20;
	void display() {
		System.out.println(a+b);
	}
	
}

public class Inheritancedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.display();
		System.out.println(obj.a);
		System.out.println(obj.b);
		Parent p=new Parent();
		System.out.println("parent class varaible "+p.a);
	}

}
