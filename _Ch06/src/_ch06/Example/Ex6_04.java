package _ch06.Example;

public class Ex6_04 {

	public static void main(String[] args) {
		
		MyMath mm = new MyMath();	// MyMath 객체 생성
		// MyMath 객체 사용(객체의 메서드 호출)
		long result = mm.max(5, 3);		// 둘 중에 큰 값을 반환하는 메서드
		long result1 = mm.add(5L, 3L);		// add 메서드 호출
		long result2 = mm.subtract(5L, 3L);	// subtract 메서드 호출
		long result3 = mm.multiply(5L, 3L);	// multiply 메서드 호출
		double result4 = mm.divide(5L, 3L);	// divide 메서드 호출
		
		System.out.println("max(5, 3) = " + result);
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
}
// MyMath 클래스 작성(메서드 작성) -> 메서드는 클래스 영역에만 정의가 가능하다
class MyMath {
	long add(long a, long b) {
		long result = a + b; 
		return result; 			// return  a + b; 	이렇게 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	// 두 값을 받아서 둘 중에 큰 값을 반환하는 메서드를 작성.
	long max(long a, long b) {
		long result = 0;
		if (a > b) {
			result = a;
		} else {
			result = b;
		}
		return result;
	}
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) { return a / b; }
}
