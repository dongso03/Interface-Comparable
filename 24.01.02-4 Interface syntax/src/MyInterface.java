public interface MyInterface {
	//필드가아니라 스태틱이다.
	public int number = 100;
	
	public static void printStatic() {
		System.out.println("정적메소드");
	}
	
	public void someMetod();

}
