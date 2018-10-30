import java.util.ArrayList;
import java.util.List;

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
		this.jungleAnimals.add(new Tiger("tiger"));
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
