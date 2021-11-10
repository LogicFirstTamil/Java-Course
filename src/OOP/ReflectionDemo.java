package OOP;
import java.lang.reflect.*;

public class ReflectionDemo {

	public static void main(String[] args) {
		
		Employee e = new Employee("Diya",60000);
		
		Class cls = e.getClass();
		
		System.out.println("Class Name is " + cls.getName());
		
		Method[] methods = cls.getMethods();
		for(Method m:methods) {
			System.out.println(m.getName());
		}
	
		try {
			System.out.println(methods[0].invoke(e,null));
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
