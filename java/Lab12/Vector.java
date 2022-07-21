public class Vector extends Object {
	private double [] v;
	Vector(int dim) {
		v = new double[dim];
		for(int i = 0; i < dim(); i++) {
			v[i] = 1;
		}
	}
	Vector(double x, double y, double z) {
		this(3);
		v[0] = x;
		v[1] = y;
		v[2] = z;
	}
	public int dim() {
		return v.length;
	}
	public double getElem(int n) {
		return v[n];
	}
	public double product(Vector other) throws Exception {
		if (dim() != other.dim()) {
			throw new DimException();
		}
		double sum = 0;
	// to be implemented
		return sum;
	}
}