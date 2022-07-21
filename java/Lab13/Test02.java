public class Test02 {
	public static void main(String[] args) {
		int[] ary = new int [] {1,2,3,4};
		try {
			System.out.println(sum(ary,5));
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	static int sum(int [] ary, int nelem) {
		int res = 0;
		for (int i = 0; i < nelem; i++) {
			res += ary[i];
		}
		return res;
	}
}