package _Ch03.Example;

public class Ex3_02 {

	public static void main(String[] args) {
		int i=5, j=0;
		
		j = i++;			// 후위형
		System.out.println("j=i++; 실행 후, i=" + i +", j=" + j);
		
		i=5;		// 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		j=0;
		
		j = ++i;			// 전위형
		System.out.println("j=++i; 실행 후, i=" + i +", j=" + j);
	}

}
