
package org.javaturk.dp.ch02.factory.solution;

/**
 * @author akin
 *
 */
public class Test {

	Worker w = new Employee(1, "Ali", 4, "Production");
	
//	public static void main(String[] args) {
//		Worker w = new Employee(1, "Ali", 4, "Production");
//		w.work();
//		Employee e = (Employee) w;
//
//		w = new Manager(5, "İsmail", 14, "Production", "Production");
//		w.work();
//		
//		Manager m = (Manager) w;
//		m.manage();
//
//		Boss boss = new Boss();
//
//		if (boss instanceof Worker) {
//			System.out.println("True");
//			Worker w1 = boss;
//			w1.work();
//		}
//	}
}
