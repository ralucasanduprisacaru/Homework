import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import animals.Animal;


public class JungleProblem {

	public static void main(String[] args) {
	
	
		
		Jungle myJungle = new Jungle();
		
		ArrayList <Animal> myAnimals = myJungle.getJungleAnimals();
		
		myJungle.populateList(10);
		
		
		for (Animal a : myAnimals) {
			System.out.print("I am a " + a.getAnimalName() + " !");
			System.out.println(a.getSoundMade());
			
			// return a random method 
			
			Method randomMethod = myJungle.getRandomMethod(a);
			
			// try to execute the method. If it's a method that should have an argument or any other exeption get a different method.
			
			try {
				System.out.println("Execute a random method: ");
				randomMethod.invoke(a);
			} catch (Exception e) {
				randomMethod = myJungle.getRandomMethod(a);
			} 
			
				
		}
		
		
		
	
		
		
	}
}
