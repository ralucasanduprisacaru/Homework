package animals;

import java.util.ArrayList;
import java.util.List;

public class Monkey extends Animal{
	
	public static List<Monkey> monkeyNumber;
	
	public Monkey(String animalName) {
		this.setAnimalName(animalName);
		// let the monkey play 
		this.setPlayAbility(true);
		// set the monkey sound
		this.setSoundMade("UU-AA");
		
		// instantiate the monkey list and add the created monkey to the list
		monkeyNumber = new ArrayList<Monkey>();
		monkeyNumber.add(this);
		
	}


	
	@Override
	public void eatFood(String foodType) {
		this.setEnergyLevel(2);
	}



	
	@Override
	public void makeSound() {
		this.setEnergyLevel(-4);
		super.makeSound();
		
	}


	public void play() {
	
		
		int energyLevel = this.getEnergyLevel();
		
		if (energyLevel > 0) { 
			
			this.setSoundMade("Oooo Oooo Oooo");
			this.setEnergyLevel(-8);
			
		}else {
			
			this.setSoundMade("Monkey is too tired");
			
		}

	}
	
	

}
