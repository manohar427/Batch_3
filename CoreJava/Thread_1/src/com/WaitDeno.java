package com;

public class WaitDeno {

	public static void main(String[] args) throws InterruptedException {
		LoadPaper lp = new LoadPaper();
		MyTh th = new MyTh(lp);
		th.start();
		
		MyTh2 th2 = new MyTh2(lp);
		th2.start();
		
	}

}

class LoadPaper {
	public void loadpaper() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			Thread.yield();
		}
	}
}

class MyTh extends Thread {
	LoadPaper lp;

	public MyTh(LoadPaper lp) {
		this.lp = lp;
	}

	public void run() {
		lp.loadpaper();
	}
}

class MyTh2 extends Thread {
	LoadPaper lp;

	public MyTh2(LoadPaper lp) {
		this.lp = lp;
	}

	public void run() {
		lp.loadpaper();
	}
}