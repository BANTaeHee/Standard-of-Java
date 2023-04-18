class Tv {		// 부모 클래스
	boolean power;		// 전원상태(on/off)
	int channel;		// 채널
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class SmartTv extends Tv {		// SmartTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
	boolean caption;			// 캡션상태 (on/off)
	void displayCaption(String text) {
		if(caption) {			// 캡션 상태가 on(true)일 때만 text를 보여준다.
			System.out.println(text);
		}
	}
}

class Ex7_01 {  // main메서드가 있는 클래스명(Ex6_1)과 소스파일명(Ex6-1.java)와 일치해야한다. 
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;				// 조상 클래스로부터 상속받은 멤버
		stv.channelUp();				// 조상 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true;
		stv.displayCaption("Hello, World");
		
	}
}	
