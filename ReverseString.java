package org.programs;

public class ReverseString {

	public static void main(String[] args) {
	String input = "Manee";
	StringBuilder input1=new StringBuilder();
	input1.append(input);
	// reverse StringBuilder input1
    input1 = input1.reverse();
    // print reversed String
    System.out.println(input1);

	}

}
