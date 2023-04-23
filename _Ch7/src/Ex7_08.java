
class Product {
	int price;		// 제품의 가격
	int bonusPoint;	// 제품구매 시 제공하는 보너스 점수
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);		// 보너스점수는 제품가격의 10%
	}
}
class Tv1 extends Product {
	Tv1() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100);		// Tv의 가격을 100만원으로 한다.
	}
	
	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() {return "Tv"; }
}
class Computer extends Product {
	Computer() {super(200); }
	
	public String toString() {return "Computer";}
}
class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {	// new Tv1(), new Computer()가 들어올 수 있다.
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;		// 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint;	// 제품의 보너스 점수를 추가한다.
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}

class Ex7_08 {

	public static void main(String[] args) {
		Buyer b = new Buyer();		// 물건사는 사람을 생성.
		
		b.buy(new Tv1());		// buy(product p)
		b.buy(new Computer());	// buy(product p)
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");

	}

}
