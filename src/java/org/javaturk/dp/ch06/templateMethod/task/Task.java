package org.javaturk.dp.ch06.templateMethod.task;

public abstract class Task {
	protected String name;
	protected int interval;
	protected int repetation;
	
	public Task(String name, int interval, int repetation) {
		this.name = name;
		this.interval = interval;
		this.repetation = repetation;
	}

	public void prepare() {
		System.out.println("*** in prepare() ***");
	}
	
	public void clean() {
		System.out.println("*** in clean() ***");
	}
	
	public void before() {
		System.out.println("\n- in before() -");
	}

	public void after() {
		System.out.println("- in after() -\n");
	}

	public abstract void doTask();

	public final void run() {
		prepare();
		int repetationCount = 0;
		while (repetationCount < repetation) {
			before();
			doTask();
			after();
			repetationCount++;
			try {
				Thread.sleep(interval * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		 clean() ;
	}
}
