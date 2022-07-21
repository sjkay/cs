public class ex02 {
	int m1(int n) {
		return n + 1;
	}
	static int m2(int n) {
		return n + 1;
	}
	public static void main(String [] args) {
		ex02 obj = new ex02();
		System.out.println(obj.m1(1));
		System.out.println(m2(1));
	}
}