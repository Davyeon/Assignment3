package week2;

/*Program Allows you to drag your mouse on the screen and make lines*/

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

/*This is how you'll be able to draw lines on the screen*/
public class RubberBanding extends GraphicsProgram {

	
	public void run() {
		addMouseListeners();
	}

		/* Creates a new line when mouse is clicked*/ 
		public void mousePressed(MouseEvent e) {
			double x = e.getX();
			double y = e.getY();
			line = new GLine(x, y, x, y);
			add(line);
	}
	
			/* Creates the endpoint when you drag the mouse for as long as its clicked */ 
				public void mouseDragged(MouseEvent e) {
					double x = e.getX();
					double y = e.getY();
					line.setEndPoint(x, y);
	}
	
						/* declares line as a Gline */
						private GLine line;
	
}