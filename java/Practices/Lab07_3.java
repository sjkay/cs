public class Lab07_3 {
	public static void main(String[] args) {
		double e1 = 0;
		double e2 = 0;
		double [] f = new double[100000];
		f[0] = 1;
		for(int i = 1; i < 100000; i++) {
			f[i] = f[i-1] * 1.0/(i + 1);
		}
		for(int i = 200-1; i >= 0; i--) {
			e1 += f[i];
		}
		for(int i = 100000-1; i >= 0; i--) {
			e2 += f[i];
		}
		e1 += 1;
		e2 += 1;

		System.out.println(e1);
		System.out.println(e2);
	}
}