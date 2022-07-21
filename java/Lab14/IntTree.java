import java.io.PrintStream;
public class IntTree extends Tree implements Comparable<IntTree> {
	private int n;
	public int getInt() { return n; }
	public IntTree(int n) {
		this.n = n;
	}
	@Override
	public int compareTo(IntTree other) {
		return this.getInt() - other.getInt();
	}
	@Override
	public Tree add(Tree node) {
		if (this.compareTo((IntTree)node) < 0) {
			if (left != null)
				left.add(node);
			else
				left = node;
		}
		else {
			if (right != null)
				right.add(node);
			else
				right = node;
		}
		return this;
	}
	private void printTree(PrintStream s, int n) {
		if (left != null)
			((IntTree)left).printTree(s,n+1);
		for(int i = 0; i < n; i++)
			System.out.print(".");
		System.out.println(getInt());
		if (right != null)
			((IntTree)right).printTree(s,n+1);
	}
	@Override
	public void print(PrintStream s) {
		printTree(s, 0);
	}
}