
public class Stringsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to java";
		String s1="WELCOME";
		/*System.out.println("literal declaration "+s);
		String s1=new String("hello");
		System.out.println("new keyword declaration "+s1);*/
		
		//charAt
		System.out.println("charAT val "+s.charAt(2));
		//compareTo
		System.out.println("comprateTo res "+s.compareToIgnoreCase(s1));
		
		//equal
		System.out.println("equal res "+s.equals(s1));
		
		//equalIgnorecase
		System.out.println("equalIgnorecase res "+s.equalsIgnoreCase(s1));
		
		//contact
		System.out.println("contact res "+s.concat("Java"));
		
		//contains
		System.out.println("contains res "+s.contains("java"));
		
		//split
		String arr[]=s.split(" ");
		
		/*for(String x:arr) {
			System.out.println(x);
		}*/
		System.out.println(arr[2]);
		
		//substring
		//s.substring(beginIndex, endIndex)
		System.out.println("substring res is"+s.substring(0, 7));
		System.out.println("substring res is"+s.substring(11, 15));
		
		//trim 
		String s5=" hello world   ";
		System.out.println("before trim "+s5.length());
		System.out.println("after trim "+s5.trim());
		System.out.println("after trim "+s5.length());
		if(s5.trim()=="hello world") {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		//length
		System.out.println("length is "+s.length());
		
		//replace
		System.out.println("replace is "+s.replace("e","x"));
		System.out.println("replace is "+s.replace("java","python"));
		
		
		String a="100";
		String b="200";
		System.out.println("before addition is "+(a+b));
		int x=Integer.parseInt(a);
		int y=Integer.parseInt(b);
		System.out.println("addition is "+(x+y));
		
		//value of
		double a2=10.05; 
		double b2=20.09;
		System.out.println("value of a2 res "+String.valueOf(a2));
		System.out.println("value of b2 res "+String.valueOf(b2));
		System.out.println("final res "+(String.valueOf(a2)+String.valueOf(b2)));
		
		//lowercase and uppercase
		System.out.println("lowercase res  "+s1.toLowerCase());
		System.out.println("uppercase res  "+s.toUpperCase());
		
		//empty
		String s4="hello";
		System.out.println("empty res "+s4.isEmpty());
	}

}
