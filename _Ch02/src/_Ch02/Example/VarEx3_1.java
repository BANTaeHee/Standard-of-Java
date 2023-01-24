package _Ch02.Example;

public class VarEx3_1 {

	public static void main(String[] args) {
		final int score = 100;
		
		boolean power = true;
		System.out.println(power);
		// byte b = 128; // byte 범위가 -128 ~ 127이므로 에러
		byte b = 127;
		
		int oct = 010;	// 8진수, 10진수로 8
		int hex = 0x10;	// 16진수, 10진수로 16
		
		long l = 10000000000L;
		float f = 3.14f;
		double d = 3.14;
		System.out.println(oct);
		System.out.println(hex);
		System.out.println(f);
		System.out.println(d);
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
	}

}
