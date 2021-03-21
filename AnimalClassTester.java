package hw7;

public class AnimalClassTester {
	
	public boolean testAnimalObject(Animal animal) {
			if (animal.aboutMe().equals(animal.expAboutMe())) {
				if (animal.diet().equals(animal.expDiet())) {
					if (animal.movement().equals(animal.expMovement())) {
						if (animal.produces().equals(animal.expProduces())) {
							if(animal.sound().equals(animal.expSound())) {
								return true;
							}
						}
					}
				}
			}
		
		return false;
	}

}
