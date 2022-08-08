/*
 * 메소드의 override조건
 * 1. 메소드의 시그니쳐가 같은가
 *  - 메소드의 필수 3요소(이름, 괄호, 리턴타입)이 같은가
 * 2. 접근제한자(Access Modifier)의 관계
 *  - private(제일 작은) < package < protected < public(제일 큰)
 */
public class OverrideDemo {
	public static void main(String[] args) {
		Jasik jasik=new Jasik();
		jasik.makeMoney();
	}
}
