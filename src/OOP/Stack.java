package OOP;

public class Stack { //default
	 int s[] = new int[10];
	 int tos;
	
	Stack() {
		tos = -1;
	}
	
	 void push(int item) {
		if(tos==s.length)
			System.out.println("Stack is full");
		else
			s[++tos] = item;
	}
	
	 int pop(){
		if(tos>=0)
			return s[tos--];
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
}
