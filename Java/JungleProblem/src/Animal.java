
import java.util.List;

public abstract class Animal {

		private String animalName;
		private int energyLevel;
		private int soundLevel;
		private int hungerLevel;
		private boolean playAbility = false;
		private String soundMade;
		
		


		public void makeSound() {
			
			System.out.println(soundMade);
			energyLevel -= 3;
			
		}
		
		public void eatFood() {
			
			energyLevel += 5;
		}
		
		public void sleep() {
			
			energyLevel += 10;
			
		}
		
		// getters and setters

		public String getAnimalName() {
			return animalName;
		}

		public void setAnimalName(String animalName) {
			this.animalName = animalName;
		}

		public int getEnergyLevel() {
			return energyLevel;
		}
		

		public void setEnergyLevel(int energyLevel) {
			this.energyLevel = energyLevel;
		}

		public int getSoundLevel() {
			return soundLevel;
		}

		public void setSoundLevel(int soundLevel) {
			this.soundLevel = soundLevel;
		}

		public int getHungerLevel() {
			return hungerLevel;
		}

		public void setHungerLevel(int hungerLevel) {
			this.hungerLevel = hungerLevel;
		}

		public boolean isPlayAbility() {
			return playAbility;
		}

		public void setPlayAbility(boolean playAbility) {
			this.playAbility = playAbility;
		}

		public String getSoundMade() {
			return soundMade;
		}

		public void setSoundMade(String soundMade) {
			this.soundMade = soundMade;
		}
}


