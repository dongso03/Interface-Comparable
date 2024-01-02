import java.util.Arrays;

public class MeetingRoom {
	private Speakable[] members;

	public MeetingRoom(Speakable[] members) {
		super();
		this.members = members;
	}

	public Speakable[] getMemvers() {
		return members;
	}

	public void pirntIntroduceAll() {
		for (Speakable s : members) {
			s.printHello();
		}
	}

	public boolean isSame(Speakable s) {
		for (Speakable elem: members) {
			if(elem.equals(s)) {
				return true;
			}
		}
		return false;
	}

	public void setMemvers(Speakable[] members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "MeetingRoom []";
	}

}
