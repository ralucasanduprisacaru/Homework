import java.util.ArrayList;


public class JungleProblem {

	public static void main(String[] args) {
	
	
		
		Jungle myJungle = new Jungle();
		
		ArrayList <Animal> myAnimals = myJungle.getJungleAnimals();
		
		myJungle.populateList(10);
		
		
		for (Animal a : myAnimals) {
			System.out.println("I am a " + a.getAnimalName());
			System.out.println(a.getSoundMade());
		}
		
	}

}
