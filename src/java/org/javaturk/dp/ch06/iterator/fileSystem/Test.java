
package org.javaturk.dp.ch06.iterator.fileSystem;

import org.javaturk.dp.ch06.iterator.fileSystem.iterator.DirectoryIterator;

public class Test {

	public static void main(String[] args) {
		Directory userDir = new Directory("/Users/akin");
		userDir.list();
		
		Directory devDir = new Directory("Dev", userDir); // /Users/akin/Dev directory
		File file1 = new File("Readme.txt", devDir);	// /Users/akin/Dev/Readme.txt file
		File file2 = new File("Report.docs", devDir);	// /Users/akin/Dev/Report.docx file
		File file3 = new File("Selam.java", devDir);	// /Users/akin/Dev/Selam.java file
//		
//		devDir.list();
//		
//		userDir.list();
		
		Directory reportDir = new Directory("Reports", devDir); // /Users/akin/Reports directory
		File file4 = new File("ImportantReport.docs", reportDir);	// /Users/akin/Dev/Report.docx file
		File file5 = new File("SelamTest.java", reportDir);	// /Users/akin/Dev/Selam.java file
		
//		devDir.list();
		
		System.out.println("\nIterating");
		DirectoryIterator iterator = devDir.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		System.out.println("\nIterating");
		iterator = reportDir.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
}
