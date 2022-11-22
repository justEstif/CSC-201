/*has 2 constructors
 * one that displays based on the input i main and one that displays by the default
 * */
public class Cycle {
	private int numberOfWheels;
	private int weight;
	public Cycle(int numberOfWheels, int weight) {
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
