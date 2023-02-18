package _Ch05.Example;

import java.util.Arrays;		//ctrl + shift + o 자동으로 import 문을 추가

public class Ex5_1_tmp2 {

	public static void main(String[] args) {
		// index : 0~2
		String[] strArr = { "가위", "바위", "보"};
		System.out.println(Arrays.toString(strArr));
	
		for(int i=0; i<10; i++) {
			int tmp = (int)(Math.random()*3);
		System.out.println(strArr[tmp]);	// 0~2
		}
	}

}
