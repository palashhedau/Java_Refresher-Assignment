package tools;

public class InterfaceClassManager implements InterfaceManager1{
	@Override
	public int doManage() {
		System.out.println("Manager is in a meeting");
		return avgSal ; 
	}
}
interface InterfaceManager1 {
	int  avgSal = 50 ; 
	int doManage() ; 
}