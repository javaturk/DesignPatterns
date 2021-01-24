
package org.javaturk.dp.ch05.flyweight.circles;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * @author akin
 *
 */
public class CirclesCanvas extends JPanel {
	private ArrayList<Circle> circles = new ArrayList<>();
	private ArrayList<CircleThread> threads = new ArrayList<>();
	
	public CirclesCanvas(int delay){
		setBorder(new LineBorder(Color.BLACK, 2));
		CircleThread.setDelay(delay);
	}

	public void add(Circle c) {
		circles.add(c);
		CircleThread thread = new CircleThread(c);
		threads.add(thread);
		thread.start();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		for (Circle c : circles) {
			c.draw(g2);
			c.showUp();
		}
	}
	
	public void clear(){
		circles.clear();
		threads.clear();
	}
}
