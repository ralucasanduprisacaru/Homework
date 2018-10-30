package animals;


import java.util.ArrayList;
import java.util.List;

public class Tiger extends Animal {
	
	public static List<Tiger> tigerNumber;
	
	
	public Tiger(String animalName) {
		this.setAnimalName(animalName);
		this.setSoundMade("GRRR");
		
		// instantiate the tiger list and add the new tiger to the list
		tigerNumber = new ArrayList<Tiger>();
		tigerNumber.add(this);
	
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
