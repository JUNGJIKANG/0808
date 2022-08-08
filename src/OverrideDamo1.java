
public class OverrideDamo1 {
	public static void main(String[] args) {
		Point original = new Point(30, 50);
		Point another = new Point(30, 50);
		if (original.equals(another))
			System.out.println("같다."); // ==연산자는 비교대상의 주소가 같냐고 물어보는 것(값 아님)
		else
			System.out.println("다르다.");
	}
}

class Point extends Object {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		Point child = (Point) obj;
		if (this.x == child.x && this.y == child.y)
			return true;
		else
			return false;
	}
}
