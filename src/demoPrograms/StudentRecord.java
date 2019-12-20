package demoPrograms;
//Initializing through method
public class StudentRecord
{
	int rollno;
	String name;
	
	void InsertRecord(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void displayrecord() {System.out.println(rollno+" "+name);}

}

