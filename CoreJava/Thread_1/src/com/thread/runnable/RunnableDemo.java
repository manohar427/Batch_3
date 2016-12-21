package com.thread.runnable;

public class RunnableDemo {

	public static void main(String[] args) {
		A ob = new A();

		Thread t1 = new Thread(ob);
		t1.start();
		
		
		Thread t2 = new Thread(ob);
		t2.start();
	}
}

class A implements Runnable {
	public void run() {
		for (int i = 0; i <= 9; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}