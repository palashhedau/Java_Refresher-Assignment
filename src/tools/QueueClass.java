package tools;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
	public boolean queueTestproblem(Queue<String> queue){
		
		Queue<String> q = queue; 
		
		System.out.println("Adding ATM to the queues in order to fill in the cash");
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			
			q.add("ATM" + (i+1) ) ; 
			
			if(i ==0){
				System.out.println( "ATM" + (i+1)   +" added to the queue" );
			}else
			{
				System.out.println( "ATM" + (i+1)   +" added to the queue behind " + "ATM" + (i) );
			}
			
			System.out.println("ATM Queue : " + q);
			
		}
		
		System.out.println();
		System.out.println("Now need to refill cash in ATM according to the queue");
		System.out.println();
		
		while(!q.isEmpty()){
			System.out.println("Depositing cash in " + q.peek() + " and removing from queue");
			q.remove() ; 
			System.out.println("Remaining ATM from the queue : " + q);
		}
		
		System.out.println();
		System.out.println("Cash refilled in all ATMS");
	
		return q.isEmpty() ; 	
		
		
	}
	
	
}
