package com.thread.sample;

public class ThreadDemo {

	public static void main(String[] args) {
    
		MyThread mt = new MyThread();
		mt.start();
		//mt.setName("XYZ Thread");
		
		System.out.println("MyThread ID:"+mt.getId());
		mt.setPriority(11);
		System.out.println("MyThread  Priority:"+mt.getPriority());
		MyThread_1 mt1 = new MyThread_1();
		mt1.start();
		System.out.println("MyThread_1 ID:"+mt1.getId());
		System.out.println("MyThread_1 pririty:"+mt1.getPriority());
		
		System.out.println("i am from main:"+Thread.currentThread().getName());
		System.out.println("i am from main ID:"+Thread.currentThread().getId());
		System.out.println("i am from main priority:"+Thread.currentThread().getPriority());
	}
}

class MyThread extends Thread
{
	public void run() {
		for(int i =0;i<=9;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}


class MyThread_1 extends Thread
{
	public void run() {
		for(int i =0;i<=9;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}