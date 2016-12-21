package com.str1;

public class StringDemo {

	public static void main(String[] args) {

		/*String name = "abcde";
		
		System.out.println("lenght:"+name.length());
		
		for(int i=0;i<name.length();i++){
			System.out.println(name.charAt(i));
		}
		
		name = name.toUpperCase();
		System.out.println("UpperCase Value :"+name);
		name = name.toLowerCase();
		System.out.println("Lower Value :"+name);*/
		
		/*String abc = "jhsjfdhsdjhasjd";
		//abc = abc.replace('h', 'P');
		
		abc = abc.replaceFirst("jh", "PPP");
		System.out.println(abc);*/
		
		//String mysubString = abc.substring(2,7);
		
		//System.out.println("SUB Str:"+mysubString);
		
		
		/*String a = "abc";
		//String b = new String("abc");
		String b = "abc";
		
		System.out.println(a == b);
		
		//System.out.println(a.equals(b));
*/		
	/*	String x =  new String("pqr");
		String y =  new String("pqr");
		System.out.println(x==y);*/
		
		
		
		String a = "abc";
		a = a+"dc";
		a = a +"po";
		System.out.println("String:"+a);
		
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.append("dc");
		sb.append("po");
		System.out.println("SB:"+sb.length());
		
		
		StringBuilder sbl = new StringBuilder();
		
		sbl.append("sd");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
