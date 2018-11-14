package protect;

public class TestProtect {
	private String name = "TestProtect";
	
	protected String getName() {//跨包不可访问
		return this.name;
	}
	
	public static void main(String[] args) {
		System.out.println(new TestProtect().getName());
	}
}
