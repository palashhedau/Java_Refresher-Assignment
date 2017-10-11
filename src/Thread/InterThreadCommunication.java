package Thread;

class InterThreadCommunication {

	 public static void main(String args[]){
		q qObj = new q();
		new threadClassCountIncrement(qObj);
		new threadClassCountShow(  qObj);
	 }
	
}

class q{
	public int qVar = 0 ; 
	public boolean isValueSubstituted = false ; 
	
	public synchronized void increment(int i ){
		
		if(isValueSubstituted){
			try {wait();} catch (InterruptedException e) {}
		}
		
		qVar = i  ;
		System.out.println("Put  " + qVar);
		isValueSubstituted = true ; 
		notify();
	}
	
	public synchronized void showQVar(){
		
		if(!isValueSubstituted){
			try {wait();} catch (InterruptedException e) {}
		}
		System.out.println("Show " + qVar);
		isValueSubstituted = false ; 
		notify();
	}
	
}


class threadClassCountIncrement implements Runnable{

	q qObj ;
	
	threadClassCountIncrement(q q) {
		this.qObj = q ; 
		Thread t = new Thread(this, "Incrementing Thread");
		t.start();
	}
	
	
	@Override
	public void run() {
		
		int i = 0 ; 
		while(true){
			qObj.increment(i);
			try {
				Thread.sleep(1000);
				i++ ; 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}


class threadClassCountShow implements Runnable{

	q qObj ;
	
	threadClassCountShow(q q) {
		this.qObj = q ; 
		Thread t = new Thread(this, "DIsplaying Thread");
		t.start();
	}
	
	
	@Override
	public void run() {
		while(true){
		qObj.showQVar();
		try {
			Thread.sleep(1000);
			 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}








