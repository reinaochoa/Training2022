package com.reina.thread;

public class ThreadEx1 extends Thread {
		public void run() {
			System.out.println("Thread is running");

			System.out.println("Thread is finished");
		}
	public static void main(String[] args) {
		ThreadEx1 t1 = new ThreadEx1();//child
		t1.start();
	}
}
