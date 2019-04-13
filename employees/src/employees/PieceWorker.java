package employees;

public class PieceWorker extends Employee {
	private double wage;
	private int pieces;

	public PieceWorker(String fn, String ln, String ssn, int p, double w, Date bd) {
		super(fn, ln, ssn, bd);

		setPieces(p);
		setWage(w);
	}

	private void setWage(double w) {
		if (w < 0.0)// validate base salary per week
			throw new IllegalArgumentException("wage must be >= 0.0");
		wage = w;
	}

	private void setPieces(int p) {
		if (p < 0)// validate base salary per week
			throw new IllegalArgumentException("pieces must be >= 0");
		pieces = p;
	}

	public String toString() {
		return String.format("%s: %s%n%s: $%,.2f", "piece-worker", super.toString(), "wage", getWage());
	}

	double getWage() {
		return wage;
	}

	int getPieces() {
		return pieces;
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return wage * pieces;
	}

}
