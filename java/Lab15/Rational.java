public class Rational extends Number implements Comparable<Rational> {
	private long numerator = 0;
	private long denominator = 1;
	public Rational() {
		this(0,1);
	}
	public Rational(long numerator, long denominator) {
		long gcd = gcd(numerator, denominator);
		this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		this.denominator = Math.abs(denominator) / gcd;
	}
	private static long gcd(long n, long d) {
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;
		for (int k = 1; k <= n1 && k <= n2; k++) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
			}
		}
		return gcd;
	}
	public long getNumerator() {
		return numerator;
	}
	public long getDenominator() {
		return denominator;
	}
	public Rational add(Rational other) {
		long n = numerator * other.getDenominator() + denominator * other.getNumerator();
		long d = denominator * other.getDenominator();
		return new Rational(n, d);
	}
	public Rational subtract(Rational other) {
		long n = numerator * other.getDenominator() - denominator * other.getNumerator();
		long d = denominator * other.getDenominator();
		return new Rational(n, d);
	}
	public Rational multiply(Rational other) {
		long n = numerator * other.getNumerator();
		long d = denominator * other.getDenominator();
		return new Rational(n, d);
	}
	public Rational divide(Rational other) {
		long n = numerator * other.getDenominator();
		long d = denominator * other.numerator;
		return new Rational(n, d);
	}
	@Override
	public String toString() {
		if (denominator == 1)
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}
	@Override
	public boolean equals(Object other) {
		if ((this.subtract((Rational)(other))).getNumerator() == 0)
			return true;
		else
			return false;
	}
	@Override
	public int intValue() {
		return (int)doubleValue();
	}
	@Override
	public float floatValue() {
		return (float)doubleValue();
	}
	@Override
	public long longValue() {
		return (long)doubleValue();
	}
	@Override
	public double doubleValue() {
		return numerator * 1.0 / denominator;
	}
	@Override
	public int compareTo(Rational other) {
		if (this.subtract(other).getNumerator() > 0)
			return 1;
		else if (this.subtract(other).getNumerator() < 0)
			return -1;
		else
			return 0;
	}
}