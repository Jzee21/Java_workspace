package com.test;

public class ThreadTest {

	/*	Program의 Entry Point
	  	>> 프로그램은 해당 프로그램에서 사용되는 모든 Thread가 종료되는 시점에 프로그램이 종료된다.
	  	
	  	Java에서 Thread는 어떻게 표현되는가?
	  	>> instance	( <- class java.lang.Thread )
	  	
	  	class Thread를 이용한 Thread 생성방법(2가지)
	  		1. 상속
	  			결합도가 높은 방법
	  		2. interface 구현
	  			
	  	
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ThreadTest start");
		
		// 1. 상속 Thread
		// 생성
		MyThread t = new MyThread();
		// 호출
		t.start();		// 내부적으로 run() 실행
						// non blocking method
						// 언제 실행될지 확신할 수 없다.
		
		// 2. interface Thread
		// 생성
		MyRunnable runnable = new MyRunnable();
		// Thread화
		Thread t2 = new Thread(runnable);
		t2.start();
		
		System.out.println("ThreadTest finish");
	}

}

// 1. 상속을 이용한 Thread 생성
class MyThread extends Thread {
	// 독립적인 실행 흐름이 있어야한다.
	// method로 독립적인 실행흐름을 표현	-- run()
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("MyThread - run!");
	}
}

// 2. interface 구현을 이용한 Thread 생성
class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("MyRunnable - run!");
	}
	
}