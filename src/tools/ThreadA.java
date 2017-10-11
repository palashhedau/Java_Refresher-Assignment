package tools;

public class ThreadA {

	 public  boolean startBooking(int availableTickets){
		q qObj = new q();
		BookTicketThread  thread1 = new BookTicketThread(qObj,availableTickets);
		BookedTicketDisplay thread2 = new BookedTicketDisplay(  qObj,availableTickets);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return thread2.checkThreadStatus();
	 }
	
}

class q{
	public int qVar = 0 ; 
	public boolean isTicketBooked = false ; 
	
	public synchronized void increment(int ticketValue ){
		
		if(isTicketBooked){
			try {wait();} catch (InterruptedException e) {}
		}
		
		qVar = ticketValue  ;
		System.out.println(Thread.currentThread().getName() + " Ticket# " + qVar);
		isTicketBooked = true ; 
		notify();
	}
	
	public synchronized void showQVar(){
		
		if(!isTicketBooked){
			try {wait();} catch (InterruptedException e) {}
		}
		System.out.println(Thread.currentThread().getName() + " Ticket# " + qVar + " Status : " + "Done");
		isTicketBooked = false ; 
		notify();
	}
	
}


class BookTicketThread  extends  Thread{

	q qObj ;
	int totalAvailableTickets = 0 ; 
	int ticketNumber = 1 ; 
	
	BookTicketThread(q q , int totalAvailableTickets) {
		this.qObj = q ; 
		this.totalAvailableTickets = totalAvailableTickets ; 
		/*Thread t = new Thread(this, "Incrementing Thread");
		t.start();*/
		
	}
	
	
	@Override
	public void run() {
		
		
		while(true){
			qObj.increment(ticketNumber);
			try {
				Thread.sleep(1000);
				
				if(ticketNumber ==totalAvailableTickets)
					break;
				
				ticketNumber++ ; 
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
	}
}


class BookedTicketDisplay extends  Thread{

	q qObj ;
	int totalAvailableTickets ; 
	int counter = 1 ; 
	Thread t ;
	
	BookedTicketDisplay(q q ,int  totalAvailableTickets) {
		this.qObj = q ; 
		this.totalAvailableTickets = totalAvailableTickets ; 
		/*t = new Thread(this, "DIsplaying Thread");
		t.start();*/
		
	}
	
	public boolean checkThreadStatus(){
		return false;
	}
	
	@Override
	public void run() {
		while(true){
		qObj.showQVar();
		
		
		if(counter == totalAvailableTickets)
			break ; 
		
		counter++ ; 
		try {
			Thread.sleep(1000);
			 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
	
	
}








