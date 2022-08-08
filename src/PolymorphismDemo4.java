
public class PolymorphismDemo4 {
	public static void main(String[] args) {
		Mammal[] array = new Mammal[5];
		array[0] = new Lion();
		array[1] = new Cat();
		array[2] = new Dog();
		array[3] = new Korean();
		array[4] = new American();
		for (Mammal m : array)
			m.saySomething();

		Car[] cars = { new Sonata("Black Sonata"), new Carnival("White Carnival"), new Matiz("Gold Matiz") };
		for (Car car : cars) {
			System.out.println(car.getName() + "이(가) 잘 수리되었습니다.");
		}
	}
}
