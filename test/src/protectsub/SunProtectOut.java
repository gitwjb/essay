package protectsub;

import protect.TestProtect;

public class SunProtectOut extends TestProtect{
	
	private String getNamex() {
		return getName();
	}
	public static void main(String[] args) {
		System.out.println(new SunProtectOut().getName());
	}
}
