class Bottle {
	private int amount;

	public Bottle(int amount) {
		super();
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "bottle [amount=" + amount + "]";
	}

}

class Person {

}
interface DanceAbale {
	public abstract void dance();
}
class PersonDanceable extends Person  implements DanceAbale	{
	@Override
	public void dance () {
		System.out.println("사람은 춤을 출수 있다.");
	}
}
class PersonCanTwice extends Person implements DanceAbale,CanDrink{

	@Override
	public void drink(Bottle bottle) {
		System.out.println("술 마신다");
	}

	@Override
	public void dance() {
		System.out.println("춤 춘다");
	}
	
	
}

interface CanDrink {
	public abstract void drink(Bottle bottle);
}

class PersonCanDrink extends Person implements CanDrink {

	@Override
	public void drink(Bottle bottle) {
		bottle.setAmount(bottle.getAmount() - 10);
	}

}

public class Main {
	public static void main(String[] args) {

		Person p = new Person();
		if ( p instanceof CanDrink) {
			CanDrink d = (CanDrink) p;
		}
	//	Person cp = new PersonCanDrink();
//		PersonCanDrink able = new PersonCanDrink();
	//	CanDrink canDrink = new PersonCanDrink();
		
//		Bottle bottle = new Bottle(100);
		
	//	able.drink(bottle);
	//	canDrink.drink(bottle);
	//	p.drink(bottle);
	//	cp.drink(bottle);
//		PersonCanTwice pt = new PersonCanTwice();
//		pt.dance();
//		pt.drink(bottle);
//		
//		CanDrink cast = pt;
//		cast.drink(bottle);
//		DanceAbale cast2 = pt;
//		cast2.dance();
			
			
	}
}
