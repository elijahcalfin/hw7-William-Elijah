package hw7;

public class AnimalClassTester2 {
	
	public boolean testAnimalObject(Object animal) {
		if (animal instanceof Cow) {
			Cow c = (Cow) animal;
			ExpectedCow ex = new ExpectedCow();
			if (c.aboutMe().equals(ex.expectedName())) {
				if (c.diet().equals(ex.expectedFood())) {
					if (c.produces().equals(ex.expectedInfo())) {
						return true;
					}
				}
			}
		} else if (animal instanceof Tyrannosaur) {
			Tyrannosaur t = (Tyrannosaur) animal;
			if (t.aboutMe().equals("Tyrannosaurus Rex")) {
				if (t.roar().equals("Roar!")) {
					if (t.diet().equals("other dinosaurs")) {
						if (t.movement().equals("stomp")){
					}
						return true;
					}
				}
			}
		} else if (animal instanceof Penguin) {
			Penguin p = (Penguin) animal;
			if (p.aboutMe().equals("penguin")) {
				if (p.diet().equals("mostly fish")) {
					if (p.movement().equals("waddle and swim")) {
						return true;
					}
				}
			}
		} else if (animal instanceof TreeClimbingOctopus) {
			TreeClimbingOctopus t = (TreeClimbingOctopus) animal;
			if (t.aboutMe().equals("octopus")) {
				if (t.movement().equals("jet propulsion")) {
					if (t.diet().equals("sap")) {
						return true;

					}
				}
				
			}
		}
		return false;
	}

}
