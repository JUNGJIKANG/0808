
public class PolymorphismDemo1 {
	public static void main(String[] args) {
//		Mammal 부모 = new Mammal();
//		부모.display();
//		Lion 자식=new Lion();
//		자식.display();		
		Mammal 부모 = new Lion(); //부모가 자식의 메소드에 접근
		부모.display();
	}
}
