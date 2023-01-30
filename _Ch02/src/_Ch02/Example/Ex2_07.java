package _Ch02.Example;

public class Ex2_07 {

	public static void main(String[] args) {
		
		String name = "Ja" + "va";
		String str = name + 11.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + ""); // 7 + 7 + "" -> 14 + "" -> "14" + "" -> "14"
		System.out.println("" + 7 + 7);	// "" + 7 + 7 -> "7" + 7 -> "7"+"7" -> "77" 숫자를 문자열로 바꾸는 방법
	}

}
