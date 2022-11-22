
public class BrokenGPS {
	public static void main(String[] args) {
		int x = 0;
	    int y = 0;
	    int GPS;
	    int time = 5;
	    int distance = (60 * 5) / 60;
	    double totalDistance;
	    while(time <= 60){
	        GPS = (int)(Math.random()*4+1);
	        if(GPS == 1 || GPS == 2){
	               y = y + distance;
	               time = time + 5;
	        }
	         else{
	               x = x + distance;
	               time = time + 5;
	         }

	        }
	         totalDistance = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
	         System.out.println("After 1 hour intersections, my location is " + (x + "," + y) + "\nThis is a total of " + totalDistance  + "miles away from the start point");
	        }
	 }   
