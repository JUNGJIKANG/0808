
public class CarCenter {
	public static void main(String[] args) {
		Sonata sonata = new Sonata("Black Sonata");
		repair(sonata);

		Carnival carnival = new Carnival("White Carnival");
		repair(carnival);
		Matiz matiz = new Matiz("Gold Matiz");
		repair(matiz);
	}

	static void repair(Car car) {
		if (car instanceof Sonata) {
			System.out.println("소나타가 잘 수리 되었습니다.");
		} else if (car instanceof Carnival) {
			System.out.println("카니발이 잘 수리 되었습니다.");
		} else if (car instanceof Matiz) {
			System.out.println("마티즈가 잘 수리 되었습니다.");
		}
		System.out.println(car.getName() + "이(가) 잘 수리되었습니다.");
	}
}