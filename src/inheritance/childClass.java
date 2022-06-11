package inheritance;

public class childClass extends parentClass {

	String name ="QAClickAcademy";


	public childClass()
	{
	super();// this should be always be at first line
	System.out.println("child class construtor");

	}
	public void getStringdata()
	{
	System.out.println(name);
	System.out.println(super.name);
	}
	public void audioSystem() // if we comment this method and try to access this then this will print parentclass audio system
	{
	System.out.println("new audioSystem");
	}

	public void getData()
	{
	super.getData();
	System.out.println("I am in child class");
	}
	
	public void getData(int a)
	{
	System.out.println(a);
	}
	public void getData(String a)
	{
	System.out.println(a);
	}
	public void getData(int a,int b)
	{
	System.out.println(a + " " + b);
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub



	childClass cd = new childClass();

	cd.getStringdata();
	cd.getData();
	cd.getData(5);
	cd.getData("Ashu");
	cd.getData(6,9); // Example of Function Overloading
	cd.audioSystem(); //Example of Function Overriding
	
	}

}
