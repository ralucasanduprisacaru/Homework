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
		Tiger tiger = new Tiger("tiger");
		this.jungleAnimals.add(tiger);
		Tiger.tigerNumber.add(tiger);
	}
	
	public void addMonkey() {
		Monkey monkey = new Monkey("monkey");
		this.jungleAnimals.add(new Monkey("monkey"));
		Monkey.monkeyNumber.add(monkey);
	}
	
	public void addSnake() {
		Snake snake = new Snake("snake");
		this.jungleAnimals.add(new Snake("snake"));
		Snake.snakeNumber.add(snake);
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
