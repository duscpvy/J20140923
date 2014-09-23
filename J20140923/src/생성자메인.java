public class 생성자메인 {

	public 생성자메인() {
		생성자메인();
	}

	public void 생성자메인(String str) {
		System.out.println("TEST1");
	}

	public void 생성자메인(String str, int a) {
		System.out.println("TEST2");
	}

	public String 생성자메인() {
		System.out.println("생성자메소드");
		return "TEST2";
	}

	public static void main(String[] args) {

		// 생성자메인 sm = new 생성자메인();
		생성자 con = new 생성자();

	}

}
