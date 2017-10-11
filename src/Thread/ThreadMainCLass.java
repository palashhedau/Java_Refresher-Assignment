package Thread;

import java.util.Scanner;

public class ThreadMainCLass {

	public int count = 0 ; 
	public static void main(String[] args) throws Exception{
		// extends Thread
		/*ThreadClass t1 = new ThreadClass();
		ThreadClass t2 = new ThreadClass();
		ThreadClass t3 = new ThreadClass();
		ThreadClass t4 = new ThreadClass();
		ThreadClass t5 = new ThreadClass();
		ThreadClass t6 = new ThreadClass();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();*/
		
		//Implement Runnable
		/*Thread t11 = new Thread(new RunnerInterface()); 
		Thread t12 = new Thread(new RunnerInterface()); 
		Thread t13 = new Thread(new RunnerInterface()); 
		Thread t14 = new Thread(new RunnerInterface()); 
		Thread t15 = new Thread(new RunnerInterface()); 
		t11.start();
		t12.start();
		t13.start();
		t14.start();
		t15.start();
		*/
		
		///////////////////////////////////////////////////////////////
		/*
		Thread tt = new Thread(new RunnerInterface(){
			public void run() {
				try{
					for (int i = 10; i < 20; i++) {
						System.out.println("Hi");
						Thread.sleep(500);
					}
				}catch(Exception e){
					System.out.println(e);
				}
			}
		});
		
		
		Thread tt2 = new Thread(new RunnerInterface2(){
			public void run() {
				try{
					for (int i = 10; i < 20; i++) {
						System.out.println("Hello");
						Thread.sleep(500);
					}
				}catch(Exception e){
					System.out.println(e);
				}
			}
		});
		
		try {
			tt.start();
			Thread.sleep(500);
			tt2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		
		
		
		
		
	/*	
		System.out.println("-----------------------------------------------------------------");
		ThreadVolatileClass t21 = new  ThreadVolatileClass();
		t21.start();
		
		Scanner scanner = new  Scanner(System.in); 
		scanner.nextLine(); 
		t21.stopThread();
		
		*/
		
		
		/*
		////Anonymous Class for thread
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				try{
					for (int i = 10; i < 20; i++) {
						System.out.println("Hello");
						Thread.sleep(500);
					}
				}catch(Exception e){
					System.out.println(e);
				}
				
			}
		};
		
		Runnable run2 = new Runnable() {
			
			@Override
			public void run() {
				try{
					for (int i = 10; i < 20; i++) {
						System.out.println("Hi");
						Thread.sleep(500);
					}
				}catch(Exception e){
					System.out.println(e);
				}
			}
		};
		
		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run2);
		
		t1.start();
		t2.start();*/
		
		
		
		
		
		//Lambda Expression
		
		ThreadMainCLass t = new ThreadMainCLass();
		
		Runnable run = () ->
				{
				try{
					for (int i = 0; i < 1000; i++) {
						t.incrementCount();
					}
				}catch(Exception e){
					System.out.println(e);
				}
				
				};
		
		Runnable run2 = () ->
			{
				try{
					for (int i = 0; i < 1000; i++) {
						t.incrementCount();
					}
				}catch(Exception e){
					System.out.println(e);
				}
			};
		
		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run2);
		
		
		
		System.out.println("T1 priority : " + t1.getPriority());
		System.out.println("T2 priority : " + t2.getPriority()); 
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		

		t1.join(); //Main thread will execute when and only when
		t2.join(); // these 2 thread are completed
		
		
		System.out.println("Total count : " + t.count);
		System.out.println("End of the file"); // Running on main thread
		
	}	
	
	public synchronized void incrementCount(){
		count++ ; 
	}

}




