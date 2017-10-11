package tools;



public class InterfaceClass {
	
	public <U> int testCaseInterface(U u){
		
		if(u instanceof InterfaceClassManager){
			return ((InterfaceClassManager) u).doManage();
		}
		
		
		if(u instanceof InterfaceClassEmployee){
			return ((InterfaceClassEmployee) u).doWork();
		}
		
		
		return 0 ;  
	}
	
}
