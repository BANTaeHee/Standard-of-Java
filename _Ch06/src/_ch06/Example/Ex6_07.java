package _ch06.Example;

class Data2 {int x;}

public class Ex6_07 {

	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data2 d) {		// 참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}
