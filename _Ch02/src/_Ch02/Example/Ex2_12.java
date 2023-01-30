package _Ch02.Example;

public class Ex2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "3";		// 문자열 3
		
		System.out.println(str.charAt(0) - '0');		// 문자 3 - 문자 0 = 숫자 3
		System.out.println('3' - '0' + 1);				// 문자 3 - 문자 0 + 숫자 1 = 숫자 4
		System.out.println(Integer.parseInt("3")+1);	// 숫자 3 - 숫자 1 = 숫자 4 
		System.out.println("3" + 1);			// 문자열 3 + 문자열 1 = 문자열 3 1
		System.out.println((char)(3 + '0'));		// '0'은 숫자로 48
	}

}
