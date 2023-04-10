package sparta_Java.g_OOP_3;

class Animal2 {
	String name;
	String color;

	public Animal2(String name) {
		this.name = name;
	}

	public void cry() {
		System.out.println(name + " is crying.");
	}

}

class Dog2 extends Animal2 {

	public Dog2(String name) {
		super(name);
	}

	@Override
	public void cry() {
		System.out.println(name + " is barking.");
	}

}

// 오버라이딩(overriding)
public class Main3 {

	public static void main(String[] args) {
		Animal2 dog = new Dog2("흰둥이");
		dog.cry();
	}

}
