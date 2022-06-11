package JavaOOpsConcepts;

public class ConstructorDemo {
	// Default
	public ConstructorDemo() {
		System.out.println(" I am in the constructor");
		System.out.println(" I am in the constructor lecture 1");
	}

	// Parameterized constructor
	public ConstructorDemo(int a, int b) {
		System.out.println(" I am in the parameterized constructor");
		int c = a + b;
		System.out.println(c);
	}

	public ConstructorDemo(String str) {
		System.out.println(str);
	}

	public void getdata() {
		System.out.println("I am the method");
	} // will not return values //name of constructor should be the class name

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cds = new ConstructorDemo("hello");
		ConstructorDemo c = new ConstructorDemo(4, 5);
		cd.getdata();
		// compiler will call implict constructor if you have not defined constructor
		// block //when ever you create an object constructor is called //block of code
		// when ever an object is created }

//	Constructors in Java
//	A constructor is a special method that is used to initialize an object.Every class has a constructor,if we don't explicitly declare a constructor for any java class the compiler builds a default constructor for that class. A constructor does not have any return type.

//	A constructor has same name as the class in which it resides. Constructor in Java can not be abstract, static, final or synchronized. These modifiers are not allowed for constructor.

	}
}
