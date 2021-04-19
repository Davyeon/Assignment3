package week2;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.*;

public class RandomCircles extends GraphicsProgram {
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	/*Tells the program how many circles to create */
	private static final int numberCircles = 10;
		
		/* Sets the size of the circles between 5 and 50 */
		private static final int MIN_RADIUS = 5;
		private static final int MAX_RADIUS = 50;
	
			public void run() {
		
//	For some reason, this code didn't work on my computer but did for others, weird but new code shown below.
//	for (int i = 0; i < numberCircles; i++); {
//			double r = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
//			double x = rgen.nextDouble(0, getWidth() - 2 * r);
//			double y = rgen.nextDouble(0, getHeight() - 2 * r);
//			GOval newCircle = new GOval(x, y, 2 * r, 2 * r);
//			
//			newCircle.setFilled(true);
//			newCircle.setColor(rgen.nextColor());
//			add (newCircle);
//			
//		}
				
				/* Basically says while counter is 1-10 make a circle, making 10 circles*/
				int counter = 1;
				while(counter < 11) {
					
					/* Gives the circles random sizes */
					double r = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
					double x = rgen.nextDouble(0, getWidth() - 2 * r);
					double y = rgen.nextDouble(0, getHeight() - 2 * r);
					GOval newCircle = new GOval(x, y, 2 * r, 2 * r);
			
					/* Gives the circles multiple different variables of random colors*/
					newCircle.setFilled(true);
					newCircle.setColor(rgen.nextColor());
					add (newCircle);
					counter++;
			
		}
	}
}