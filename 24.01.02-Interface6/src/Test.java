interface MyInterface {
	// 디폴트 메소드는 재정의 하지않으면  기본 동작으로 구현된다.
	public default void someMethod() {
		System.out.println("완성된 메소드");
	}
}

class MyImpl implements MyInterface {

}

class YourImpl implements MyInterface {
	
}
class TheirImpl implements MyInterface {
	@Override
	public void someMethod() {
		System.out.println("재정의된 메소드");
	}

}
public class Test {
	public static void main(String[] args) {

	}
}
