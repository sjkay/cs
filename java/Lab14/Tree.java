import java.io.PrintStream;
public abstract class Tree {
	protected Tree left, right;
	public Tree() {
		left = null;
		right = null;
	}
	public Tree getLeft() { return left; }
	public Tree getRighth() { return right; }
	public abstract Tree add(Tree node);
	public abstract void print(PrintStream s);
}