package tools;

public class ArrayClass {
	int digitToSearch = 0 ; 
	public int calculateOccurance(int numRange , int digitToSearch){
		
		int [] numberArray = new int [numRange]; 
		this.digitToSearch = digitToSearch ;  
		int counter = 0 ; 
		
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = i+1 ; 
		}
		
		
		
		for (int i = 0; i < numberArray.length; i++) {
			if(Integer.toString(numberArray[i]).contains(Integer.toString(digitToSearch))){
				counter ++ ; 
			}
		}
		
		System.out.println("Number count which have digit " + digitToSearch  + " between 1 and " + numberArray.length +  " in them is : " + counter);
		
		
		return counter ; 
		
		
	}
	
	
}
