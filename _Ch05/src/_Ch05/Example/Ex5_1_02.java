package _Ch05.Example;

public class Ex5_1_02 {

	public static void main(String[] args) {
		// 인덱스 범위 0~9
		int[] arr = new int[9];				// 길이가 5인 int 배열 arr을 생성
		System.out.println("arr.length=" + arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] = " + arr[i]);
		}
	}

}
