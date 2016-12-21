package com.exception.userdefned;

public class MyExceptionDemo {

	public static void main(String[] args) {
		int recAmount = 0;
		try {
			recAmount = getFunds(12237,110,99999);
		} catch (NoEnouhfFunds e) {
			e.printStackTrace();
		}
		
		System.out.println("Amount :"+recAmount);
	}

	static int getFunds(int debitAcc,int withamount,int creditAcc)throws NoEnouhfFunds{
		int amount = 100;
		if(withamount>amount){
			System.out.println("No enoughf funds");
			
			throw new NoEnouhfFunds("No money in your Account");
		}else{
			
			System.out.println("1.Check funds ");
			System.out.println("2.debit amount");
			
			System.out.println("3.Credit Amount");
		}
		//SO money things 
		
		return withamount;
	}
}
class NoEnouhfFunds extends ArithmeticException
{
	String message;

	public NoEnouhfFunds(String message) {
		super();
		this.message = message;
	}
	
}