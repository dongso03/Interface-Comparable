//가격순대로 처리.
//피자
//기본가격
//int 가격을 반환

//페페로니피자
// 페페로니 개수
// int 가격() >> 기본가격 + 페페러니 개수 * 500

//베이컨피자
//기본가격
//베이컨그램 수 
//int 가격() >> 기본가격 + 베이컨그램수 * 100

//치킨
// 기본가격
// 추가 닭다리 수
//int 가격() >> 기본가격 + 닭다리수 * 1000
public class TestPizza {
	public static void main(String[] args) {
		Pizza pep = new PepperoniPizza(10);
		Pizza ba = new BaconPizza(200);
		
		System.out.println(pep.getPrice());
		System.out.println(ba.getPrice());
	
		System.out.println(pep.compareTo(ba));
	}
}
