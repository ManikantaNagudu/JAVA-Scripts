package org.programs;
public class Swappingtwonumbersusingbitwiseoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num1 = 10, num2= 5;
	      
	        //num1 becomes 1111 = 15
	        num1 = num1 * num2;
	        //num2 becomes 1010 = 10
	        num2 = num1 / num2;
	        //num1 becomes 0101 = 5
	        num1 = num1 / num2;
	        
	        System.out.println("The First number after swapping:"+num1);
	        System.out.println("The Second number after swapping:"+num2);
	}

}
