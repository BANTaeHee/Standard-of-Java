package _Ch02.Example;

public class PrintfEx1 {
	public static void main(String[] args) {
		 
		System.out.println(10/3);		// 정수/정수 이므로 출력값 3이 나옴.
		System.out.println(10.0/3);		// 실수/정수
		
		System.out.printf("%d%n", 15);
		System.out.printf("%o%n", 15);
		System.out.printf("%#o%n", 15);
		System.out.printf("%x%n", 15);
		System.out.printf("%#x%n", 15);
		System.out.printf("%s%n", Integer.toBinaryString(15));
		
		float f = 123.4567890f;
		System.out.printf("%f%n", f);
		System.out.printf("%e%n", f);
		System.out.printf("%g%n", f);
		double d = 123.4567890;
		System.out.printf("%f%n", d);
		
		System.out.printf("[%5d]%n", 1234567);
		System.out.printf("[%-5d]%n", 10);
		System.out.printf("[%05d]%n", 10);
		
		double a = 1.23456789;
		System.out.printf("%14.10f%n", a);
		System.out.printf("%14.6f%n", a);
		System.out.printf("%.6f%n", a);

		System.out.printf("[%s]%n", "www.codechobo.com");
		System.out.printf("[%20s]%n", "www.codechobo.com");
		System.out.printf("[%-20s]%n", "www.codechobo.com");
		System.out.printf("[%.10s]%n", "www.codechobo.com");
	}
}
