class MyPoint2 extends Object {	// 부모 클래스가 없으므로 자동으로 추가된다. 
	int x;
	int y;
}

//class Circle extends MyPoint {		// 상속
//	int r;
//}

class Circle2 extends Object {		// 포함관계
	MyPoint2 p; // = new MyPoint2();
	int r;
	
	Circle2() {
		p = new MyPoint2();
	}
}

public class InheritanceTest2 {

	public static void main(String[] args) {
		Circle2 c = new Circle2();
		System.out.println(c.toString());		// Object 클래스가 toString을 가지고 있으므로
		Circle2 c2 = new Circle2();
		System.out.println(c2.toString());
//		c.x = 1;			// 상속
//		c.y = 2;
//		c.r = 3;
//		System.out.println("c.x=" + c.x);
//		System.out.println("c.y=" + c.y);
//		System.out.println("c.r=" + c.r);
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		System.out.println("c.p.x=" + c.p.x);
		System.out.println("c.p.y=" + c.p.y);
		System.out.println("c.r=" + c.r);
	}

}