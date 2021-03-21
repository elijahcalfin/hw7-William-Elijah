package hw7;

public class Hw7 {
	
	public static void main(String[] args) 
	{
		AnimalClassTester tst1 = new AnimalClassTester();
		Cow cow = new Cow();
		Penguin penguin = new Penguin();
		Tyrannosaur tyr = new Tyrannosaur();
		TreeClimbingOctopus octopus = new TreeClimbingOctopus();
		Animal animalList[] = {cow,penguin,tyr,octopus};
		boolean tf = tst1.testAnimalObject(cow);
		for(Animal animal : animalList)
		{
			tf = tst1.testAnimalObject(animal);
			
			if(tf == true)
			{
				System.out.println();
				System.out.println("The "+animal.aboutMe()+" test came back True");
				System.out.println();
			} 
			else if(tf == false)
			{
				System.out.println();
				System.out.println("The "+animal.aboutMe()+" test came back False");
				System.out.println();
			}
		}
	}

}
