package sparta_Java.f_OOP_2;

class Phone {
	String model;
	String color;
	int price;

	public Phone() {

	}

	public Phone(String model, String color, int price) {
		this.model = model;
		this.color = color;
		this.price = price;
	}
}

public class Main {

	public static void main(String[] args) {
		Phone galaxy = new Phone("galaxy10", "black", 100);

		Phone iphone = new Phone("iPhoneX", "black", 200);

		System.out.println("철수는 이번에 " + galaxy.model + galaxy.color + " + 색상을 " + galaxy.price + "만원에 샀다.");
		System.out.println("영희는 이번에 " + iphone.model + iphone.color + " + 색상을 " + iphone.price + "만원에 샀다.");
	}

}

/*
 * 생성자(Constructor): 인스턴스 생성 시 처음으로 작동. 필드를 초기화 할 때 사용할 수 있음.
 */