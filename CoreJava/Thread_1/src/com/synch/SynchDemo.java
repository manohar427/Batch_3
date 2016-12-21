package com.synch;

public class SynchDemo {

	public static void main(String[] args) {
		PrintNumbers p = new PrintNumbers();
		
		A ob = new A(p,10);
		
		Thread t1 = new Thread(ob);
		t1.start();
		
		Thread t2 = new Thread(ob);
		t2.start();
	}

}

class PrintNumbers {
	public synchronized void printMyNumber(int number) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i
					* number);
		}
	}
}

class A implements Runnable {
	
	PrintNumbers p;
	int i;
	
	public A(PrintNumbers p,int i) {
		this.p=p;
		this.i=i;
	}
	public void run() {
		p.printMyNumber(i);
	}
}