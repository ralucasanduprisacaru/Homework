

import java.util.ArrayList;
import java.util.List;

public class Snake extends Animal {
	
	public static List<Snake> snakeNumber;
	
	public Snake(String animalName) {
		this.setAnimalName(animalName);
		// set the sound made
		this.setSoundMade("Shhh");
		
		// instantiate the snake list and add the created snake to the list
		snakeNumber = new ArrayList<Snake>();
		snakeNumber.add(this);
		
	}



}
