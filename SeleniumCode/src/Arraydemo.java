
public class Arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,6,7,1,10};
		
		for(int x:a) {
			System.out.print(" "+x);
		}
		//System.out.println(a[1]);
		
		//System.out.println(a.length);
		
		/*for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}*/
		
		
		String s[]=new String[3];
		s[0]="hello";
		s[1]="hai";
		s[2]="how are u";
		
		/*for(int i=0;i<s.length;i++) {
			System.out.print(" "+s[i]);
		}*/
		
		//for-each loop
		for(String s1:s) {
			System.out.println(" "+s1);
		}
		
	}

}
