
package org.javaturk.dp.ch05.flyweight.circles;

/**
 * @author akin
 *
 */
public class CircleThread extends Thread{
	private static int delay;
	private static boolean runnable = true;
	
	private Circle circle;
	
	private CircleFactory factory = CircleFactory.getInstance();
	
	CircleThread(Circle circle){
		this.circle = circle;
	}
	
	@Override
	public void run() {
		while(true){
			updateCircle(circle);
			circle.showUp();
			try {
				sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(!runnable)
				break;
		}
	}
	
	private void updateCircle(Circle c){
		circle.setCenter(factory.producePoint());
		circle.setColor(factory.produceColor());
		circle.setRadius(factory.produceRadius());
	}

	public static void setDelay(int delay) {
		CircleThread.delay = delay;
	}

	public static void setRunnable(boolean runnable) {
		CircleThread.runnable = runnable;
	}
}
