package _Ch05.Example;

public class Ex5_1_tmp3 {

	public static void main(String[] args) {
		
		String str = "ABCDE";		// str.length()는 5
		char ch = str.charAt(0);		// charAt()은 문자열 중에서 해당 인덱스 값 하나 출력, char 타입 변수로 받아줘야한다.
		String str2 = str.substring(1, 4);
		String str3 = str.substring(1);		// from, to 에서 to를 생략하면 from부터 끝까지 나온다. (1, str.length())와 같다
		String str4 = str.substring(1, str.length());
		
		System.out.println(ch);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}

}
