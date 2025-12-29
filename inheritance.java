package practice;

class animal {
	void eat() {
		System.out.println("is eating")	;
	}
	
}

class dog extends animal{
	void bark() {
		System.out.println("is barking");	
	}
	
}

public class inheritance {
	
	public static void main(String[]args) {

		dog d = new dog();
		
		d.bark();
		d.eat();
	}
}
