
public class GracityCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=(double)2/3;
	System.out.println(a);
	
double gravity = -9.81;
double initialVelocity = 0.0;
double fallingTime = 10.0;
double initialPosition = 0.0;
double finalPosition= .5*gravity*fallingTime*fallingTime;
finalPosition = finalPosition + initialVelocity*fallingTime;
finalPosition = finalPosition + initialPosition;
System.out.println("An object's position after  " + fallingTime + " seconds is " + finalPosition + " netres.");
	}

}
