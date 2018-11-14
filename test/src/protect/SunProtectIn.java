package protect;

import protect.TestProtect;

public class SunProtectIn extends TestProtect{
	
	private String getNamex() {
		return getName();
	}
	public static void main(String[] args) {
		System.out.println(new TestProtect().getName());
	}
}
