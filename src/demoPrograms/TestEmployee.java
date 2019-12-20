package demoPrograms;
class Employee
{
	int eid;
	String ename;
	float salary;
	
	void insert(int i,String n,float s)
	{
		eid=i;
		ename=n;
		salary=s;
	}
	
	void displayinformation() {System.out.println(eid +" "+ename+" "+salary);}
	
}
public class TestEmployee
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		e1.insert(101, "Sachin", 45000);
		e2.insert(102, "Rahul", 30000);
		e3.insert(103, "Baby", 50000);
		
		e1.displayinformation();
		e2.displayinformation();
		e3.displayinformation();
	}

}
