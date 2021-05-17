
class Employee{
	int eid;
	String ename;
	
	Employee(int id,String name){
		eid=id;
		ename=name;
	}
	
	/*void setData(int id,String name) {
		eid=id;
		ename=name;
	}*/
	
	 void display() {
		System.out.println("EMployee id: "+eid+" empployee name: "+ename);
	}
}


public class EmployeeDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee e=new Employee();
		//e.setData(120, "John");
		
		Employee e=new Employee(120,"john");
		e.display();
		Employee e1=new Employee(120,"john");
	}

}

