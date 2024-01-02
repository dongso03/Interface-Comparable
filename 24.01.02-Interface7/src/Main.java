//동물
//사자 코끼리 새 (오리 독수리)
//
//닭 타조 펭귄
//
//날수있는 비행기, 날수있는 바퀴벌레
interface Flyable {
	public default void fly() {
		System.out.println("날수있다.");
	}
}

class penguin extends Bird {

	public penguin(int weight, int age) {
		super(weight, age);
	}

	@Override
	public void printSound() {
		System.out.println("꾸에에에엥ㄱ");
	}
}

class Airplane implements Flyable {
	
}

public class Main {

}
