package com.jdk;

public class Lambda {

	
	public static void main(String[] args) {
		xImpl xim = new xImpl();
		/*xim.addImpl(add(a, b)--> {
			//sadkasdkjas
			return a+b;
		});
		}*/
		
		for (args-->syso) {
			
		}
	}

}
interface X
{
	public int add(int a,int b);
}

class xImpl
{
	public int addImpl(X x){
		return x.add(12, 32);
	}
}