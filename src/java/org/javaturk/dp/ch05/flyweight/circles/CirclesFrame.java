
package org.javaturk.dp.ch05.flyweight.circles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CirclesFrame extends JFrame {

	private CirclesCanvas canvas;
	private JPanel buttonPanel = new JPanel();
	private JButton startButton = new JButton("Start");
	private JButton stopButton = new JButton("Stop");
	private JLabel appearanceLabel1 = new JLabel("# of Appearance: ");
	private JLabel appearanceLabel2 = new JLabel("");
	private int numberOfCircles;

	private int width = 600;
	private int height = 800;
	
	public CirclesFrame(){
		this(1, 1, 800, 1000);
	}

	public CirclesFrame(int numberOfCircles, int delay, int width, int height) {
		this.numberOfCircles = numberOfCircles;
		setSize(width, height);
		setTitle("Circlezzz");
		
		initialize(delay);
	}
	
	public void initialize(int delay){

		Container contentPane = getContentPane();
		canvas = new CirclesCanvas(delay);
		canvas.setBackground(new Color(255, 255, 210));
		contentPane.add(canvas, BorderLayout.CENTER);
		
		startButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				populateCanvas();
			}
		});
		buttonPanel.add(startButton);

		stopButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CircleThread.setRunnable(false);
				appearanceLabel2.setText(Integer.toString(Circle.getNumberOfAppearance()));
				Circle.resetNumberOfAppearance();
			}
		});
		buttonPanel.add(stopButton);
		
		buttonPanel.add(appearanceLabel1);
		buttonPanel.add(appearanceLabel2);
		contentPane.add(buttonPanel, BorderLayout.SOUTH);
	}

	private void populateCanvas() {
		canvas.clear();
//		System.out.println(numberOfCircles + " circles will be created!");
		CircleFactory.setCanvas(canvas);
		CircleFactory factory = CircleFactory.getInstance();
		factory.setWidthAndHeight(width, height);
		for (int i = 0; i < numberOfCircles; i++) {
			canvas.add(factory.create());
		}
	}
}
