class EMP1{
	private int eid;
	private String ename;
	private double sal;
	
	public void  setEid(int eid) {
		this.eid=eid;
	}
	
	public int getEid() {
		return this.eid;
	}
	
	public void setEname(String ename) {
		this.ename=ename;
	}
	
	public String getEname() {
		return this.ename;
	}
	
}

public class Encapulationdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EMP1 e=new EMP1();
		e.setEid(120);
		System.out.println(e.getEid());
		
		e.setEname("Raaju");
		System.out.println(e.getEname());
	
	}

}
