package _Ch05.Example;

import java.util.Arrays;		//ctrl + shift + o 자동으로 import 문을 추가

public class Ex5_1_tmp {

	public static void main(String[] args) {
		// index범위 : 0 ~ 9
		int[] arr = new int[10];	// 길이가 10인 int 배열 arr을 생성
		System.out.println("arr.length="+arr.length);
		
		for(int i = 0; i < arr.length; i++) { 
			System.out.println("arr["+i+"]="+ arr[i]);
		}
		
		int[] iArr = {100, 95, 80, 70, 60} ;		//길이가 5인 int 배열
		for(int i = 0; i < iArr.length; i++) { 
			System.out.println(iArr[i]);
		}
		System.out.println(Arrays.toString(iArr));
	}

}
