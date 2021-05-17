
class A5{
	final void demo() {
		System.out.println("this is demo");
	}
}

class B5 extends A5{
   /*void demo() {  //we cannot override final methods but we can extends the methods
	   
   }*/
   void show() {
	   System.out.println("this is show");
   }
}

public class Finaldemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 B5 b=new B5();
		 b.demo();//still we can access final methods of parent class 
		 b.show();
	}

}
