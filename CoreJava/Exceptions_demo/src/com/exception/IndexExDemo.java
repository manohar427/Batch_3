package com.exception;

public class IndexExDemo {

	public static void main(String[] args) {

		int indexValu = getNumByIndec(5);
		System.out.println("Index Val :"+indexValu);
	}

	static int getNumByIndec(int index) {
		
		
		int all[] = { 12, 34, 56, 7 };// 0,1,2,3
		int inxVal = 0;
		try
		{
			inxVal = all[index];
			//100 lines 
			return inxVal;//4
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please dont pass index morethan 3");
			try
			{
				inxVal = all[index-1];
			}catch(ArrayIndexOutOfBoundsException ex){
				System.out.println(ex.getMessage());
			}
			return inxVal;
		}
		catch (ArithmeticException e) {
			System.out.println("Dont divide by 0");
			return inxVal;
		}
		catch(Exception ex){
			System.out.println("Some unknow issue occured please try later");
			return inxVal;
		}
		//return inxVal;
		
	}
}
