

import java.util.List;

public class Tiger extends Animal {
	
	public static List<Tiger> tigerNumber;
	
	
	public Tiger(String animalName) {
		this.setAnimalName(animalName);
		this.setSoundMade("GRRR");
	
	}


	@Override
	public void sleep() {

		this.setEnergyLevel(5);
		
	}
	
	public void eatFood(String foodType) {
		
		if (foodType.toLowerCase().equals("grain")){
			System.out.println("Tigers can't eat that!");
			
		}else {
			this.setEnergyLevel(5);
		}
	}
	
	

}
