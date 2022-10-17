package overloading;

/*Assignment 4
==============

      Class: Students
      Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber*/
public class Students {
	
	public void getStudentInfo(int id)
	{
		System.out.println("Student's ID===> "+id);
	}
	public void getStudentInfo(int id,String name)
	{
		
		System.out.println("Student's ID===> "+id);
		System.out.println("Student's Name===> "+name);
		
	}
	public void getStudentInfo(String email,long phoneNumber)
	{
		System.out.println("Student's email===> "+email);
		System.out.println("Student's phoneNumber===> "+phoneNumber);
	}
	public static void main(String[] args) {
		Students student = new Students();
		student.getStudentInfo(4305);
		student.getStudentInfo(4305, "Priyadharshini");
		student.getStudentInfo("priyadharshini@gmail.com", 8879213109l);
	}

}
