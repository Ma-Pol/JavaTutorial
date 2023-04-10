package sparta_Java.e_OOP_1;

class Phone {
	String model;
	String color;
	int price;
}

public class Main {

	public static void main(String[] args) {
		Phone galaxy = new Phone();
		galaxy.model = "Galaxy10";
		galaxy.color = "Black";
		galaxy.price = 100;

		Phone iphone = new Phone();
		iphone.model = "iPhoneX";
		iphone.color = "Black";
		iphone.price = 200;

		System.out.println("철수는 이번에 " + galaxy.model + galaxy.color + " + 색상을 " + galaxy.price + "만원에 샀다.");
		System.out.println("영희는 이번에 " + iphone.model + iphone.color + " + 색상을 " + iphone.price + "만원에 샀다.");
	}

}

/*
 * 클래스(class): 필드와 메서드의 집합
 * 객체(Object): 다른 클래스 내에서 데이터 타입으로서 선언된 클래스
 * 인스턴스(Instance): 객체가 메모리에 할당된 상태 (실제로 사용 중인 상태)
 */