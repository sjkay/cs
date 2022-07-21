public class Test03 {
	public static void main(String[] args) {
		int[] ary = new int [] {1,2,3,4};
		try {
			System.out.println(sum(ary,5));
		}
		catch (Exception ex) {
			System.out.println("\n" + ex.getMessage());
			System.out.println("\n" + ex.toString());
			System.out.println("\nTrace Info");
			StackTraceElement [] tr = ex.getStackTrace();
			for(int i = 0; i < tr.length;i++) {
				System.out.print("method " + tr[i].getMethodName());
				System.out.print("(" + tr[i].getClassName() + ":");
				System.out.println(tr[i].getLineNumber() + ")");
			}
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