package OOP;

/*
 * Object cloning
 * 
 */
class Department implements Cloneable{
	int deptId;
	String name;
	Department(int id,String n){
		deptId = id;
		name = n;
	}
	
	void display(){
		System.out.println("Dept id: " + deptId);
		System.out.println("Dept Name: " + name);
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		 
	}
	
}

class Student implements Cloneable{
	int id;
	String name;
	Department dept;
	Student(int i,String n,Department d){
		id = i;
		name = n;
		dept = d;
	}
	
	void display(){
		System.out.println("Id is: " + id);
		System.out.println("Name is: " + name);
		dept.display();
	}
	
	protected Object clone() throws CloneNotSupportedException {
		Student s = (Student)super.clone();
		s.dept = (Department)s.dept.clone();
		
		return s;
	}
}

public class CloningDemo {
	public static void main(String[] args) throws CloneNotSupportedException  {
		Department dept = new Department(1,"Physics");
		Student s1 = new Student(1,"Hari",dept);
		Student s2 = (Student)s1.clone();
		
		dept.name = "Maths";
		
		s1.display();
		s2.display();
	}
}
