package demoPrograms;
//Initializing through method.
public class TestStudent2
{
	public static void main(String args[])
	{
	StudentRecord s1=new StudentRecord();
	StudentRecord s2=new StudentRecord();
	
	s1.InsertRecord(111,"Sachin");
	s2.InsertRecord(222,"Janvhi");
	
	s1.displayrecord();
	s2.displayrecord();
	}
	

}

/*
class TestStudent2{  
 public static void main(String args[]){  
  StudentRecord s1=new StudentRecord();  
  StudentRecord s2=new StudentRecord();  
  s1.InsertRecord(111,"Karan");  
  s2.InsertRecord(222,"Aryan");  
  s1.displayrecord();  
  s2.displayrecord();  
 }  
}  
*/