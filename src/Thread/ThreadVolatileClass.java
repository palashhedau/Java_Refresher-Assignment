package Thread;

public class ThreadVolatileClass extends Thread {

	volatile boolean  isRunning = true ;// only one thread knows about the variable
		//volatile make the variable known to all the threads
		// and will stop all the threads simultaneously
	public void run(){
		
		while(isRunning){
			
			try{
				System.out.println("Hello");
				Thread.sleep(500);	
			}catch(Exception e ){
				
			}
			
		}
		
		
	}
	
	public void stopThread(){
		isRunning = false ;
	}
	
	
	
}
