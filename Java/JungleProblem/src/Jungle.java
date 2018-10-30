import java.util.ArrayList;
import java.util.Random;
import java.lang.reflect.Method;
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
	
	public Method [] getPublicMethods(Animal a) {
		
		Class<? extends Animal> animalClass = a.getClass();
		Method [] methods = animalClass.getDeclaredMethods();
		return methods;
	}
	
	public Method getRandomMethod(Animal a) {
		
		Method randomMethod = null;
		
		Method [] methods = getPublicMethods(a);
		
		if(methods.length > 0) {
			randomMethod = methods[(int) (Math.random() * methods.length)];
		}
		
		return randomMethod;
	}
	
	
	public void checkMethod(Method randomMethod) {
		
		switch (randomMethod.getName()) {
		
		case "makeSound":
			break;
		case  "sleep" :
			break;
		case "getAnimalName":
			break;
		case "getEnergyLevel":
			break;
		case "getSoundLevel":
			break;
		case "getSoundMade":
			break;
		
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
