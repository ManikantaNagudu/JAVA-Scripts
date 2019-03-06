package org.programs;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count[] = {11, 22, 33, 44, 55, 66, 77};
	    Set<Integer> hset = new HashSet<Integer>();
	    try{
	      for(int i = 0; i<7; i++){
	         hset.add(count[i]);
	      }
	      System.out.println(hset);
	 
	      TreeSet<Integer> treeset = new TreeSet<Integer>(hset);
	      System.out.println("The sorted list is:");
	      System.out.println(treeset);
	    }
	    catch(Exception e){
	        e.printStackTrace();
	    }
	}

}
