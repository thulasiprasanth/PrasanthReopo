
interface RBiBank1{
	int getROI();
}

class SBI1 implements RBiBank1{
	public int getROI() {
		return 7;
	}
}

class Hdfc1 implements RBiBank1{
	public int getROI() {
		return 6;
	}
}

class icic implements RBiBank1{
	public int getROI() {
		return 8;
	}
}

public class interfacedemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*RBiBank1 r;
		r=new SBI1();
		System.out.println(r.getROI());
		r=new Hdfc1();
		System.out.println(r.getROI());*/
		RBiBank1 r;
		r=new SBI1();
		System.out.println("SBI implemention ROI is "+r.getROI());
		
		r=new icic();
		System.out.println("ICICI implemention ROI is "+r.getROI());

		r=new Hdfc1();
		System.out.println("HDFC implemention ROI is "+r.getROI());
		/*SBI1 s1=new SBI1();
		s1.getROI();
		icic ic=new icic();
		ic.getROI();
		Hdfc1 h=new Hdfc1();
		h.getROI();*/
		

	}

}
