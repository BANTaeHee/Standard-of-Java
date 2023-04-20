package pkg1;

// private 멤버는 같은 클래스 안에서만 접근 가능
public class MyParent {	// 접근제어자가 public
	private   int prv;	// 같은 클래스
			  int dft;	// 같은 패키지 (default)
	protected int prt;	// 같은 패키지 + 자손(다른 패키지)
	public 	  int pub;	// 접근제한 없음.
	
	public void printMember() {
		System.out.println(prv);	// OK
		System.out.println(dft);	// OK
		System.out.println(prt);	// OK
		System.out.println(pub);	// OK
	}
}	// 여기까지가 private 범위 - 같은 클래스

class MyParentTest {	// 접근제어자가 (default)
	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv);	// 에러. private 멤버는 같은 클래스 안에서만 접근 가능하므로 밖에서는 에러
		System.out.println(p.dft);	// OK. (default)이고 같은 패키지 안에 있으므로 가능
		System.out.println(p.prt);	// OK
		System.out.println(p.pub);	// OK
	}
}	// 여기까지가 (default) 범위 - 같은 패키지
