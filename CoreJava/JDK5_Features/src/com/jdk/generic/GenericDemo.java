package com.jdk.generic;

import java.util.*;
public class GenericDemo {

	public static void main(String[] args) {
		
		int salry = 76767;
		
		 System.out.println(salry);
       List<A> list = new ArrayList<A>();
       
      // list.add("Abc");
       
       A ob = new A();
       list.add(ob);
       
       for(int i=0;i<list.size();i++){
    	   A obje = list.get(i);
       }
	}

}

class A
{
   	
}

