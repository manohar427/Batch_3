package com.jdk.forloop;

public class EnForLoop {

	
	public static void main(String[] args) {
        float all[] = {12,34,56,7,8,8,9,9};
        
        /*for(int i=0;i<all.length;i++){
        	System.out.println(all[i]);
        }*/
        
        //JDK 5
        for (float i : all) {
			System.out.println(i);
		}
	}

}
