package _Ch05.Example;

public class Ex5_02 {

	public static void main(String[] args) {

		int sum = 0;
		float average = 0f;
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
			
		}
		average = sum / (float)score.length;			// 계산결과를 float타입으로 얻으려 형변환
														// float타입으로 형변환 하지 않으면 int타입이므로 소수점 이하는 값손실이 발생
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + average);
	}

}
