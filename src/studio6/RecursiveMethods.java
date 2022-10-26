package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			// FIXME compute the geometric sum for the first n terms recursively
		if (n == 0) {
			return 0;
		}
		else {
			return geometricSum(n-1) + 1/Math.pow(2, n);
		}
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
	if (q == 0) {
		return p;
	}
	else {
		int temp = q;
		q = p % q;
		p = temp;
		return gcd(p, q);
	}
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int[] reversed = new int[array.length];
		return helper(0, array, reversed);
			// FIXME create a helper method that can recursively reverse the given array
		
		
	}
	public static int[] helper(int index, int[] array, int[] reversed) {
		
		if (index == array.length) {
			return reversed;
		} else {
			reversed[index] = array[array.length - index-1];
			return helper(++index, array, reversed);
			
			

		}
	}
	

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter            (           y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
			if (radius <= radiusMinimumDrawingThreshold) {
				return;
			}else {
				StdDraw.circle(xCenter, yCenter, radius);
				circlesUponCircles(xCenter + radius, yCenter, radius/3.0, radiusMinimumDrawingThreshold );
				circlesUponCircles(xCenter - radius, yCenter, radius/3.0, radiusMinimumDrawingThreshold );
				circlesUponCircles(xCenter, yCenter + radius, radius/3.0, radiusMinimumDrawingThreshold );
				circlesUponCircles(xCenter, yCenter - radius, radius/3.0, radiusMinimumDrawingThreshold );
			}
		// FIXME
	}

}
