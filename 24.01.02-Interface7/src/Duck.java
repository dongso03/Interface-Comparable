
public class Duck extends Bird implements Flyable {
	public Duck(int weight, int age) {
		super(weight, age);
	}
	
	public void quack() {
		System.out.println("꽥꽥");
	}

	@Override
	public void printSound() {
		this.quack();
	}
}
