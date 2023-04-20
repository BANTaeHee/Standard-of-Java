package pkg2;

import pkg1.MyParent;	// ctrl + shift + o

class MyChild extends MyParent {	// 처음에 접근제어자가 default이므로 다른 패키지에서 사용 불가
	public void printMember() {
//		System.out.println(prv);	// 에러. private은 같은 클래스 안에서만 사용할 수 있음.
//		System.out.println(dft);	// 에러. (default)이므로 같은 패키지 안에서만 사용가능.
		System.out.println(prt);	// OK
		System.out.println(pub);	// OK
	}
}

public class MyParentTest2 {

	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv);	// 에러. private 멤버는 같은 클래스 안에서만 접근 가능하므로 밖에서는 에러
//		System.out.println(p.dft);	// 에러. (default)이고 같은 패키지 안에 있으므로 가능
//		System.out.println(p.prt);	// 에러.
		System.out.println(p.pub);	// OK. 접근제한이 없으므로 가능

	}

}
