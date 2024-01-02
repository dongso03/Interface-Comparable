// 스마트 기기
// 제조사
// 가격
class SmartDevice {
	private String production;
	private int pirce;

	public SmartDevice(String production, int pirce) {
		super();
		this.production = production;
		this.pirce = pirce;
	}

	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public int getPirce() {
		return pirce;
	}

	public void setPirce(int pirce) {
		this.pirce = pirce;
	}

	@Override
	public String toString() {
		return "SmartDevice [production=" + production + ", pirce=" + pirce + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pirce;
		result = prime * result + ((production == null) ? 0 : production.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof SmartDevice))
			return false;
		SmartDevice other = (SmartDevice) obj;
		if (pirce != other.pirce)
			return false;
		if (production == null) {
			if (other.production != null)
				return false;
		} else if (!production.equals(other.production))
			return false;
		return true;
	}

}

// 통화기능 - 인터페이스
interface PhoneCallable {
	public abstract void call();

}

//아이폰 - 통화가능
class IPhone extends SmartDevice implements PhoneCallable {

	public IPhone(String production, int pirce) {
		super(production, pirce);
	}

	@Override
	public void call() {
		System.out.println("아이폰은 통화 기능이 있다");
	}

}

//아이패드
class IPad extends SmartDevice {

	public IPad(String production, int pirce) {
		super(production, pirce);
	}

}

//유심있는 아이 패드 - 통화가능
class UsimIPad extends IPad implements PhoneCallable {
	public UsimIPad(String production, int pirce) {
		super(production, pirce);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void call() {
		System.out.println("유심있는 아이패드는 통화 기능이 있다.");
	}

}

class DialPhone implements PhoneCallable {

	@Override
	public void call() {
		System.out.println("다이얼 전화기는 통화 기능이 있습니다.");
	}

}

public class Main {
	public static void main(String[] args) {

		IPhone iphone = new IPhone("애플", 100);
		IPad ipad = new IPad("애플", 150);
		UsimIPad usim = new UsimIPad("애플", 170);
		

		iphone.call();
		usim.call();

		PhoneCallable call = iphone;
		call.call();
		System.out.println("------------------");
		
		PhoneCallable[] arr = {iphone , usim , new DialPhone()};
		for (PhoneCallable elem : arr) {
			elem.call();
		
		}
	}
}
