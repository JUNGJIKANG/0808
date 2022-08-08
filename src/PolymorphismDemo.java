/*
 * polymorphism의 두 가지 조건
 * 1. 메소드의 오버라이드가 되어야 한다.
 * 2. 형변환
 *  가. 밸류 타입
 *    a. 작은쪽이 큰 쪽으로 형변환 하는 자동 형변환(implict conversion, promotion) / ex)int가 롱이되고 float가 double가 되는 등
 *    b. 강제형변환(explicit conversion, demotion) 큰쪽에서 작은쪽으로 형변환, 캐스팅 연산자를 사용()연산자
 *  나. 오브젝트 타입
 *   a. 자동형변환(implict conversion, promotion, Cast Up) : 자식에서 부모로 형변환은 항상 성공
 *   b. 강제형변환(explicit conversion, demotion, Cast Down) : 부모에서 자식으로 형변환은 될 때고 있고 안될 때도 있다.
 */
public class PolymorphismDemo { // 몸이 다형으로 변한다는 의미, 오버라이드가 되야하고 형변환이 되어야 한다(이것이 두 가지 조건)
	public static void main(String[] args) {
//		Base base = new Base();
//		Derived derived = new Derived();
		Base base=new Derived(); //자식 주소를 부모주소가 받는것은 가능하다.
//		if (derived instanceof Derived) {
//			derived = (Derived) base;
//		} else {
//			System.out.println("형변환 불가능");
//		}
	}
//		base = (Base) derived; //자동 형변환
//		derived=(Derived)base; //강제 형변환
}

class Base { // 부모이다.
}

class Derived extends Base { // derived는 base의 자식이다.
}