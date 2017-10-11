package tools;

public class GenericMainClass {

	public <U extends Object> String  CallAnimals(U u) {
		
		
		if(u instanceof Dog){
			PetShop<Dog> pet = new PetShop<Dog>(); 
			Dog d = new  Dog(); 
			pet.category = d ; 
			return pet.getcategory().running();
		}else if(u instanceof Cat){
			PetShop<Cat> pet = new PetShop<>(); 
			Cat c = new  Cat(); 
			pet.category = c ; 
			return  pet.getcategory().running();
		}else if(u instanceof Rabbit){
			PetShop<Rabbit> pet = new PetShop<>(); 
			Rabbit r = new  Rabbit(); 
			pet.category = r ; 
			return  pet.getcategory().running();
		}
		
		
		
		
		
		return null;
	}

}
