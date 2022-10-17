package org.student;

import org.department.Department;

/*Package   :org.student
Class        :Student
Methods   :studentName(),studentDept(),studentId()

Description:
create above 3 class and call all your class methods into the Student using multilevel inheritance.
*/
public class Student extends Department
{

	public void studentName(String name)
	{
		System.out.println("Student Name==> "+name);
	}
	public void studentDept(String dept)
	{
		System.out.println("Student Department==> "+dept);
	}
	public void studentId(int id)
	{
		System.out.println("Student id==> "+id);
	}
	public static void main(String[] args) {
		
		Student student = new Student();
		student.collegeCode(901);
		student.collegeName("College of Engineering");
		student.collegeRank(4);
		student.deptName("ComputerEngineering");
		student.studentId(4503);
		student.studentName("Priyadharshini");
		student.studentDept("Computer Engineering");
	}
}
