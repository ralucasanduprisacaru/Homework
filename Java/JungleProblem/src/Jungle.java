import java.util.ArrayList;
import animals.Animal;
import animals.Monkey;
import animals.Snake;
import animals.Tiger;

public class Jungle {
	
	private ArrayList<Animal> jungleAnimals = new ArrayList<>();
	private String [] animalFoods = {"meat", "fish", "bugs", "grain"};
	


	public void soundOff() {
		
		for (Animal animal : jungleAnimals) {
			animal.makeSound();
			System.out.println(animal.getAnimalName() + "has " + animal.getEnergyLevel() + " energy level");
		}
		
	}
	
	public void populateList(int animalNumber) {
		for (int i=0; i<animalNumber; i++) {
			addTiger();
			addMonkey();
			addSnake();
		}
	}
	
	
	public void addTiger() {
		Tiger tiger = new Tiger("tiger");
		System.out.println("Tiger created");
		this.jungleAnimals.add(tiger);
		System.out.println("Tiger created");
	}
	
	public void addMonkey() {
		this.jungleAnimals.add(new Monkey("monkey"));
	}
	
	public void addSnake() {
		this.jungleAnimals.add(new Snake("snake"));
	}

	public ArrayList<Animal> getJungleAnimals() {
		return jungleAnimals;
	}

	public void setJungleAnimals(ArrayList<Animal> jungleAnimals) {
		this.jungleAnimals = jungleAnimals;
	}

	public String[] getAnimalFoods() {
		return animalFoods;
	}

	public void setAnimalFoods(String[] animalFoods) {
		this.animalFoods = animalFoods;
	}

}
