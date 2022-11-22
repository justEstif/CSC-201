
public class HazardPay extends PayCalculator{
	public HazardPay(double payRate) {
		super(payRate);
	}
	@Override
	public double computePay(int hours) {
		return hours * payRate * 1.5;
	} 
}
