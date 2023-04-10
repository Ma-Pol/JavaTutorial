package sparta_Java.i_OOP_5;

//요구사항
//1. 사람은 자식, 부모님, 조부모님이 있다.
//2. 모든 사람은 이름, 나이, 현재 장소정보(x,y좌표)가 있다.
//3. 모든 사람은 걸을 수 있다. 장소(x, y좌표)로 이동한다.
//4. 자식과 부모님은 뛸 수 있다. 장소(x, y좌표)로 이동한다.
//5. 조부모님의 기본속도는 1이다. 부모의 기본속도는 3, 자식의 기본속도는 5이다.
//6. 뛸때는 속도가 기본속도대비 +2 빠르다.
//7. 수영할때는 속도가 기본속도대비 +1 빠르다.
//8. 자식만 수영을 할 수 있다. 장소(x, y좌표)로 이동한다.

//조건
//1. 모든 종류의 사람의 인스턴스는 1개씩 생성한다.
//2. 모든 사람의 처음 위치는 x,y 좌표가 (0,0)이다.
//3. 모든 사람의 이름, 나이, 속도, 현재위치를 확인한다.
//4. 걸을 수 있는 모든 사람이 (1, 1) 위치로 걷는다.
//5. 뛸 수 있는 모든 사람은 (2,2) 위치로 뛰어간다.
//6. 수영할 수 있는 모든 사람은 (3, -1)위치로 수영해서 간다.

class Human {
	String name;
	int age, speed, x = 0, y = 0;

	Human(String name, int age, int speed) {
		this.name = name;
		this.age = age;
		this.speed = speed;
	}

	String getLocation() {
		return "(" + x + ", " + y + ")";
	}

	void printIntroduce() {
		System.out.println("이름: " + name + ", 나이: " + age);
	}
}

interface Walkable {
	void walk(int x, int y);
}

interface Runnable {
	void run(int x, int y);
}

interface Swimmable {
	void swim(int x, int y);
}

class GrandParent extends Human implements Walkable {

	GrandParent(String name, int age) {
		super(name, age, 1);
	}

	@Override
	public void walk(int x, int y) {
		System.out.println("걷기 속도: " + speed);
		System.out.println("걷기 전 위치: " + getLocation());
		this.x = x;
		this.y = y;
		System.out.println("걷기 후 위치: " + getLocation());
	}

}

class Parent extends Human implements Walkable, Runnable {

	Parent(String name, int age) {
		super(name, age, 3);
	}

	@Override
	public void walk(int x, int y) {
		System.out.println("걷기 속도: " + speed);
		System.out.println("걷기 전 위치: " + getLocation());
		this.x = x;
		this.y = y;
		System.out.println("걷기 후 위치: " + getLocation());
	}

	@Override
	public void run(int x, int y) {
		System.out.println("달리기 속도: " + (speed + 2));
		System.out.println("달리기 전 위치: " + getLocation());
		this.x = x;
		this.y = y;
		System.out.println("달리기 후 위치: " + getLocation());
	}
}

class Child extends Human implements Walkable, Runnable, Swimmable {

	Child(String name, int age) {
		super(name, age, 5);
	}

	@Override
	public void walk(int x, int y) {
		System.out.println("걷기 속도: " + speed);
		System.out.println("걷기 전 위치: " + getLocation());
		this.x = x;
		this.y = y;
		System.out.println("걷기 후 위치: " + getLocation());
	}

	@Override
	public void run(int x, int y) {
		System.out.println("달리기 속도: " + (speed + 2));
		System.out.println("달리기 전 위치: " + getLocation());
		this.x = x;
		this.y = y;
		System.out.println("달리기 후 위치: " + getLocation());
	}

	@Override
	public void swim(int x, int y) {
		System.out.println("수영 속도: " + (speed + 1));
		System.out.println("수영 전 위치: " + getLocation());
		this.x = x;
		this.y = y;
		System.out.println("수영 후 위치: " + getLocation());
	}
}

public class Quiz1 {

	public static void main(String[] args) {
		Human grandParent = new GrandParent("조부모", 350);
		Human parent = new Parent("부모", 120);
		Human child = new Child("자식", 62);

		Human[] humans = { grandParent, parent, child };

		for (Human human : humans) {
			System.out.println("이름은 " + human.name + ", 나이는 " + human.age + "(이)고 기본 속도는 " + human.speed + "입니다.");
			System.out.println(human.getLocation() + "에서 시작합니다.\n");

			if (human instanceof Walkable) {
				((Walkable) human).walk(1, 1);
				System.out.println();
			}
			if (human instanceof Runnable) {
				((Runnable) human).run(2, 2);
				System.out.println();
			}
			if (human instanceof Swimmable) {
				((Swimmable) human).swim(3, -1);
				System.out.println();
			}

			System.out.println("사망했습니다.\n\n");
		}
	}

}
