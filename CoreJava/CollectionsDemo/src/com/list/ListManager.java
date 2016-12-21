package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListManager {

	public static void main(String[] args) {
		// List -i
		// Al -c
		// LL - c

		List aList = new ArrayList();

		aList.add(12);//0
		aList.add(102);//1
		aList.add(120);//2
		aList.add("Abc");
		aList.add("Abc");
		aList.add("Abc");
		aList.add("Abc");
		
		//System.out.println("A List:"+aList);
		
		List llist = new LinkedList();
		llist.add(12);
		llist.add(102);
		llist.add(120);
		llist.add("Abc");
		llist.add("Abc");
		llist.add("Abc");
		llist.add("Abc");
		
		//System.out.println("L List:"+llist);
		
		Vector v = new Vector();
		v.add(12);
		v.add("asdsa");
		//System.out.println(v);
		
		/*for(int i=0;i<aList.size();i++){
			System.out.println(aList.get(i));
		}*/
		
		Iterator it = aList.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}

}
//16+16+16 