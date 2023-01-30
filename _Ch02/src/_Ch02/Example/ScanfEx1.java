package _Ch02.Example;

import java.util.Scanner;		// import문 추가

public class ScanfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. Scanner 클래스의 객체 생성
		Scanner scanner = new Scanner(System.in);

//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		
		String input = scanner.nextLine();		// 한 행단위로 입력받음
		int num = Integer.parseInt(input);
		
		System.out.println(num);
		
		scanner.close();
	}

}
