
public class Cycle {
	private double numberOfWheels;
	private double weight;
	public Cycle(double numberOfWheels, double weight) {
		this.numberOfWheels = numberOfWheels;
		this.weight = weight;
	}
  	public Cycle(){
    	this(100, 1000);
  	}

	public String toString() {
		return "Number of wheels is " 
				+ this.numberOfWheels + ". Weight is " + this.weight;
	}
}
