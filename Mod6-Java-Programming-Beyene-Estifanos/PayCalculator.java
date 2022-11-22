
public abstract class PayCalculator {
	protected double payRate; 

	public PayCalculator(double payRate) {
		this.payRate = payRate;
	}
	public double computePay(int hours) {
		return hours * payRate;
	}
}
