class GoodDogLauncher{
	public static void main(String[] args) {
		GoodDog one = new GoodDog();
		one.setSize(70);
		GoodDog two = new GoodDog();
		two.setSize(8);

		System.out.println("Dog one's size : " + one.getSize());
		System.out.println("Dog two's size : " + two.getSize());

		one.bark();
		two.bark();
	}
}