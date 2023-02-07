package _Ch04.Example;

import java.util.Scanner;		//Scanner클래스를 사용하기 위해 추가

public class Ex4_03 {
		
	public static void main(String[] args) {
		
		System.out.print("숫자를 하나 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();		//화면을 통해 입력받은 숫자를 input에 저장
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else {											// input이 0이 아닌 경우
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
		 
		scanner.close();
	}	//main 메소드의 끝

}
