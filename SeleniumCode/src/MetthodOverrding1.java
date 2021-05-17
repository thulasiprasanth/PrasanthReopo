
class RBIBank{
	double getROI() {
		return 7;
	}
}

class SBI extends RBIBank{
	double getROI() {
		return 7.5;
	}
}

class Hdfc extends RBIBank{
	double getROI() {
		return 6.9;
	}
}

class citi extends RBIBank{
	double getROI() {
		return 8;
	}
}

public class MetthodOverrding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI obj=new SBI();
		System.out.println("SBI ROI is "+obj.getROI());
		
		citi obj1=new citi();
		System.out.println("citi ROI is"+obj1.getROI());
		
	}

}
