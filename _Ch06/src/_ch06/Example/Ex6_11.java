package _ch06.Example;

class Data_1 {
	int value;
}

class Data_2 {
	int value;
	
	Data_2() {}		// 기본 생성자를 만들어주면 컴파일 에러 사라진다. 
	Data_2(int x) {		// 매개변수가 있는 생성자
		value = x;
	}
}

public class Ex6_11 {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();		// compile error 발생
		// The constructor Data_2() is undefined - Data_2라는 생성자가 정의되지 않았다!!!
	}

}
   