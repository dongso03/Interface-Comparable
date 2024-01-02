
public class Lion extends Animal {
	public Lion(int weight, int age) {
		super(weight, age);
	}
	
	@Override
	public void printSound() {
		System.out.println("어흥");
	}

	public void eatMeat() {
		System.out.println("사자는 육식을 합니다.");
	}
}
