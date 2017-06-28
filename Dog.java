public class Dog{
	/* Size of the dog in standard dog size unit. */
	public int size;
	public static String binomen = "Canis familiars";

	public Dog(int s){
		size = s;
	}

	public void makeNoise() {
		if (size < 20){
			System.out.println("hideous yapping");
		} else if (size < 50){
			System.out.println("Bark!");

		} else{
			System.out.println("arooooooooooo!");
		}
	}

	public static Dog maxDog(Dog d1, Dog d2){
		if (d1.size > d2.size) {
			return d1;
		}
		return d2;
	}

	public Dog maxDogCompareToMe(Dog otherDog){
		if (size > otherDog.size){
			return this;
		}
		return otherDog;
	}

}