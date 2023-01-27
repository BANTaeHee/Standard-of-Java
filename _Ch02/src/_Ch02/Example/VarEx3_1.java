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
		
		char ch = 'A';
		int i = 'A';
		
		String str = "";	// 빈 문자열(empty string)
		String str2 = "ABCD"; // 2개이상의 문자는 ''은 사용할 수 없다.
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println(i);
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
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
