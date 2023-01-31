package _Ch03.Example;

public class Ex3_10_11 {

	public static void main(String[] args) {
		
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("============");
		
		double pi = 3.141592;
		System.out.println(pi);
		System.out.println(pi * 1000);
		System.out.println(Math.round(pi*1000));
		System.out.println(Math.round(pi*1000)/1000);	// 3
		System.out.println(Math.round(pi*1000) / 1000.0);	// 3.142
		
		double shortPi = Math.round(pi*1000) / 1000.0;
		System.out.println(shortPi); 
		
		System.out.println("============");
		
		//만약에 3.141을 얻으려면??
		System.out.println(pi * 1000);
		System.out.println((int)(pi * 1000)); 	//일부러 값손실을 발생시킨다
		System.out.println((int)(pi * 1000)/1000.0);
		
	}

}


/*
 * Math.round(pi*1000) /1000.0
 * Math.round(3.141592 * 1000) /1000.0
 * Math.round(3141.592) /1000.0
 * 3142 / 1000.0 => 3.142
 */

// int값 3142 / int값 1000 은 소수점 이하는 다 날아가고  int 3이 저장
// int 3142 / double 1000.0 -> double 3142.0 / double 1000.0 = double 3.142 값이 도출





