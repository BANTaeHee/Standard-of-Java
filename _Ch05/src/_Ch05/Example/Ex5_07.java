package _Ch05.Example;

// 커맨드라인에서 입력하기, Run -> Run Configuration 클릭 -> Argument 탭에 값을 입력
public class Ex5_07 {

	public static void main(String[] args) {
		System.out.println("매개변수의 개수:"+args.length);
		for (int i=0; i < args.length; i++) {
			System.out.println("args[" + i + "] = \""+ args[i] + "\"");
		}
		
	}

}
