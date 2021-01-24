
package org.javaturk.dp.ch05.composite.fileSystem;

public class Test {

	public static void main(String[] args) {
		Directory user = new Directory("/Users/akin");
		user.list();
		
		Directory devDir = new Directory("Dev", user); // /Users/akin/Dev directory
		File file1 = new File("Readme.txt", devDir);	// /Users/akin/Dev/Readme.txt file
		File file2 = new File("Report.docs", devDir);	// /Users/akin/Dev/Report.docx file
		File file3 = new File("Selam.java", devDir);	// /Users/akin/Dev/Selam.java file
		
		devDir.list();
		user.list();
//		
		Directory reportDir = new Directory("Reports", devDir); // /Users/akin/Reports directory
		File file4 = new File("ImportantReport.docs", reportDir);	// /Users/akin/Dev/Report.docx file
		File file5 = new File("SelamTest.java", reportDir);	// /Users/akin/Dev/Selam.java file
		
		devDir.list();
//		
		reportDir.list();
//		
		file2.move(reportDir);
//		
		System.out.println("\nAfter moving: " + file2 + " to " + reportDir);
		
		devDir.list();
		
		reportDir.list();
//		
//		user.list();
//		
		reportDir.move(user);
//		
//		System.out.println("\nAfter moving: " + reportDir + " to " + user);
//		
		user.list();
//		
//		System.out.println("\nAfter moving: " + reportDir + " to " + user);
//		
//		reportDir.delete();
//		
//		System.out.println("\nAfter delete.");
//		
//		user.list();
	}
}
