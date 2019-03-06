package org.programs;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<String>();  
		al.add("Manee"); //It is displayed in first Position 
		al.add("Rajan");  //It is displayed in fourth Position
		al.add(1, "Abhinay");  //It is displayed in Second Position
		al.add(2, "Suresh");  //It is displayed in third position
		//System.out.println("Element at 2nd position: "+al.get(2));  
		for(String s:al){  
		System.out.println(s);  
	}

}
	}
