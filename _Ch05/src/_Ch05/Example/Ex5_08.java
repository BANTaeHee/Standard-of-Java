package _Ch05.Example;

// 커맨드라인에서 입력하기, Run -> Run Configuration 클릭 -> Argument 탭에 값을 입력
public class Ex5_08 {

	public static void main(String[] args) {
		
		int[][] score = {				// 2차원 배열 선언
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40}
		};
		int sum = 0;		// 2차원 배열의 모든 값들을 더한 값
		
		// 2차원 배열의 경우 이중반복문을 사용한다.
		for (int i = 0; i < score.length; i++) {	// score.length의 값은 4
			for (int j = 0; j < score[i].length; j++) {		
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
				
				sum += score[i][j];
			}
		}
		
		System.out.println("sum=" + sum);
	}

}
