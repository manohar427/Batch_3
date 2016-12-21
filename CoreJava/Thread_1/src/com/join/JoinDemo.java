package com.join;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
     
		LoadPaper th = new LoadPaper();
		th.start();
		th.join();
		System.out.println("FInallyy Paper loading done.");
	}

}

class LoadPaper extends Thread
{
	public void run() {
		System.out.println("Start Loading paper..");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Paper Loading Done.");
	}
}