class MetgodOverl{
	
	int add(int a ,int b) {
		return a+b;
	}
	
	double add(double a ,double b,double c) {
		return a+b+c;
	}
	
	
	/*int add(int a,int b,int c) {
		return a+b+c;
	}*/
	
	
}


public class Methodoverloadingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetgodOverl m=new MetgodOverl();
		int x=m.add(20, 40);
		System.out.println(x);
		
		double d=m.add(10.05, 20.10, 30.120);
		System.out.println(d);
		
		//int y=m.add(30, 50, 80);
		//System.out.println(y);
	}

}
