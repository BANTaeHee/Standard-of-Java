package _ch06.Example;

class Data3 {int x;}

public class Ex6_08 {

	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x = 10;
		
		Data3 d2 = copy(d);
		System.out.println("d.x =" + d.x);
		System.out.println("d2.x =" + d2.x);
	}
	
	static Data3 copy(Data3 d) {		// 참조형 매개변수
		Data3 tmp = new Data3();	// 새로운 객체 tmp를 생성
		
		tmp.x = d.x;	// d.x의 값을 tmp.x에 복사한다.
		
		return tmp;		// 복사한 객체의 주소를 반환.
	}

}
