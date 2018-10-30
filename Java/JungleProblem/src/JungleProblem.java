import java.util.ArrayList;


public class JungleProblem {

	public static void main(String[] args) {
	
		Jungle myJungle = new Jungle();
		
		myJungle.populateList(10);
		
		ArrayList <Animal> myAnimals = (ArrayList<Animal>) myJungle.getJungleAnimals();
		
		for (Animal a : myAnimals) {
			System.out.println("I am a " + a.getAnimalName());
			System.out.println(a.getSoundMade());
		}
		
		

	}

}
