package com.group;


public class ThredGroupDemo {

	public static void main(String[] args) throws InterruptedException {
      
		
		ThreadGroup thg = new ThreadGroup("My Thread Group");
		A ob  = new A();
		Thread th1 = new Thread(thg,ob);
		th1.start();
		
		Thread th2 = new Thread(thg,ob);
		th2.start();
		
		System.out.println("My Th Grop Active:"+thg.activeCount());
		
		Thread.sleep(9000);
		
		System.out.println("My Th Grop Active:"+thg.activeCount());
				
	}

}

class A implements Runnable {

	public void run() {
		for (int i = 0; i <10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
