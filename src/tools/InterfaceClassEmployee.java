package tools;

public class InterfaceClassEmployee implements InterfaceEmployee1 {

	@Override
	public int doWork() {
		System.out.println("Employee is working on a project");
		return avgSal ; 
	}

}


interface InterfaceEmployee1 {
	int avgSal = 25 ; 
	int doWork();
	
}

