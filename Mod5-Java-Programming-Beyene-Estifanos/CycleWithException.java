
public class CycleWithException {
	private double numberOfWheels;
	private double weight;
	public CycleWithException(){
    	this(100, 1000);
	}
	public CycleWithException(double wheelCount, double mass) {
		setNumberOfWheels(wheelCount);
		setWeight(mass);
	}
	public double getNumberOfWheels() {
		return numberOfWheels;
	}
	public double getWeight() {
		return weight;
	}
	public void setNumberOfWheels(double wheelCount) 
		throws IllegalArgumentException {
			if(wheelCount >= 0)
				numberOfWheels = wheelCount;
			else
				throw new IllegalArgumentException(
						"Values cannot be less than or equal to zero");
		}
	public void setWeight(double mass) 
		throws IllegalArgumentException {
			if(mass >= 0)
				weight = mass;
			else
				throw new IllegalArgumentException(
						"Values cannot be less than or equal to zero");
	
		}
	public String toString() {
		return this.numberOfWheels + "  " + this.weight;
	}
	}

