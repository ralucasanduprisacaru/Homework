
import java.util.List;

public class Monkey extends Animal{
	
	public static List<Monkey> monkeyNumber;
	
	public Monkey(String animalName) {
		this.setAnimalName(animalName);
		this.setPlayAbility(true);
		this.setSoundMade("UU-AA");
		
	}


	
	@Override
	public void eatFood() {
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
