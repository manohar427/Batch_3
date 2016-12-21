package com.set;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		
	/*Set set = new 	HashSet();
	set.add(12);
	set.add(45445);
	set.add("djkd");
	set.add(445);
	set.add(465);
	set.add(45);
	set.add(45);
	set.add(45);
	set.add("g");
	
	System.out.println("HashSet:"+set);*/
		
		
		/*Set lhset = new 	LinkedHashSet();
		lhset.add(12);
		lhset.add(45445);
		lhset.add("djkd");
		lhset.add(445);
		lhset.add(465);
		lhset.add(45);
		lhset.add(45);
		lhset.add(45);
		lhset.add("g");
		
		System.out.println("Hashlhset:"+lhset);*/
		
		Set tset = new 	TreeSet();
		tset.add(12);
		tset.add(45445);
		tset.add(34);
		tset.add(445);
		tset.add(465);
		tset.add(45);
		tset.add(45);
		tset.add(45);
		tset.add(34);
		
		System.out.println("Hashtset:"+tset);
		
	}
}
//Set -- java.util.Set
//LinkedHashSet
//HashSet
//TreeSet