interface MenuNumbers {
	final int COLA = 1;
	final int CIDAR = 2;
	final int SOLNUN = 3;
}

public class CanMenu {
	public static void main(String[] args) {
		int userInput = 3;

		switch (userInput) {
		case MenuNumbers.COLA:
			System.out.println("콜라");
			break;
		case MenuNumbers.CIDAR:
			System.out.println("사이다");
			break;
		case MenuNumbers.SOLNUN:
			System.out.println("솔의눈");
			break;
		default:
			System.out.println("메뉴없음");
			break;
		}
	}
}
