class Emp2{
	int eid;
	String ename;
	Emp2(int eid,String ename){
		this.eid=eid;
		this.ename=ename;
	}
	
	void display() {
		System.out.println("Employee id: "+eid+" name is: "+ename);
	}
}
public class Thisdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp2 e=new Emp2(200,"John");
		e.display();
	}

}
