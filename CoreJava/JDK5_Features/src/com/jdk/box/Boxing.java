package com.jdk.box;

public class Boxing {

	public static void main(String[] args) {
     
		/*String ageStr = "30";
		
		Integer newAge = new Integer(ageStr);
		
		int myAge = newAge.intValue();
		
		if(myAge>10){
			System.out.println("oi");
		}*/
		
		//JDK 1.4
		/*int weight = 50;
		
		Integer mywe = new Integer(weight);
		String myweSt = mywe.toString();*/
		
		//JDK 1.5
        int weight = 50;
		
		Integer mywe = new Integer(weight);//Boxig
		String myweSt = mywe.toString();
		
		int w = mywe.intValue();//UB
		
		Float fl = new  Float(90f);
		
	}

}
