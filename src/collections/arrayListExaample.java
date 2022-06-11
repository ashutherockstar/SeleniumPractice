package collections;

import java.util.ArrayList;

public class arrayListExaample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>(); 
		a.add("rahul"); 
		a.add("java"); 
		a.add("java"); 
		System.out.println(a); 
		a.add(0, "student"); 
		System.out.println(a); 
//		a.remove(1); 
//		a.remove("java"); 
//		System.out.println(a);
		System.out.println(a.get(2)); 
//		// testing 
		System.out.println(a.contains("java")); 
		System.out.println(a.indexOf("rahul")); 
		System.out.println(a.isEmpty()); 
		System.out.println(a.size()); 
		arrayListExaample b = new arrayListExaample();
		b.abc();
		} 
	private void abc() { // TODO Auto-generated method stub 
		System.out.println("hello"); 

	}

}
