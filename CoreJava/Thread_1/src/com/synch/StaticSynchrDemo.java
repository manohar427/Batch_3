package com.synch;

public class StaticSynchrDemo {

	public static void main(String[] args) {
		
		
		B ob = new B(1);
		Thread t1 = new Thread(ob);
		t1.start();
		
		Thread t2 = new Thread(ob);
		t2.start();
	}

}


class PrintMyNumbers {
	public static synchronized void printMyNumber(int number) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i
					* number);
		}
	}
}


class B implements Runnable {
	
	int i;
	
	public B(int i) {
		this.i=i;
	}
	public void run() {
		PrintMyNumbers.printMyNumber(i);
	}
}