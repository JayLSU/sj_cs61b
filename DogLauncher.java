/**The DogLauncher class will test drive the Dog class */
public class DogLauncher{
	public static void main(String[] args) {
		/*Dog smallDog;
		smallDog = new Dog(5);
		Dog hugeDog = new Dog(150);
		smallDog.makeNoise();
		hugeDog.makeNoise();*/

		Dog maya = new Dog(25);
		Dog tiny = new Dog(15);

		Dog larger = maya.maxDogCompareToMe(tiny); 
		//Dog larger = Dog.maxDog(maya,tiny);
		/* This is equivalent to "Dog larger = Dog.maxDog(maya,tiny)"*/
		larger.makeNoise();
		

	}
}