import java.util.ArrayList;

import animals.Animal;


public class JungleProblem {

	public static void main(String[] args) {
	
	
		
		Jungle myJungle = new Jungle();
		
		ArrayList <Animal> myAnimals = myJungle.getJungleAnimals();
		
		myJungle.populateList(10);
		
		
		for (Animal a : myAnimals) {
			System.out.print("I am a " + a.getAnimalName() + " !");
			System.out.print(a.getSoundMade());
		}
		
	}

}
