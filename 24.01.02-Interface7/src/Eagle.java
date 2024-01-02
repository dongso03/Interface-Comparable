
public class Eagle extends Bird implements Flyable{
	public Eagle(int weight, int age) {
		super(weight, age);
	}
	
	public void hunt() {
		System.out.println("사냥을 함");
	}

	@Override
	public void printSound() {
		System.out.println("빼에엑");
	}
}
