package tools;
import java.util.Stack;

public class StackClass {

	public  int testStackMethod(Stack<String> s , String shirtToCheck){
		Stack<String> laundryBag = s ; 
		
		//I need to wear a shirtToCheck t-shirt today so I will search it by removing the top most one and checking
		
		
		int laundryBagSize = laundryBag.size(); 
		System.out.println("Total t-shirts added in laundry bag : " + laundryBagSize);
		System.out.println();
		System.out.println("Removing the top most t-shirt and checking");
		
		for (int i = 0; i < laundryBagSize ; i++) {
			
			System.out.println("Top Most t-shirt - " + laundryBag.peek());
			if(laundryBag.peek().equalsIgnoreCase(shirtToCheck)){
				return (5- i)   ;
			}else{
				laundryBag.pop(); 
			}
		}
		return 0 ; 
	}
}
