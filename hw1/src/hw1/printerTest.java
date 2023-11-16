package hw1;

public class printerTest {
	
	public static void main(String[] args) {
		// create a printer
		Printer p = new Printer(100);
		System.out.println(p.getSheetsAvailable());
		System.out.println("Expected 0");
		p.addPaper(1);
		System.out.println(p.getSheetsAvailable());
		System.out.println("Expected 1");
		p.addPaper(2);
	    System.out.println(p.getSheetsAvailable());
		System.out.println("Expected 3");		
	
		
		Printer d = new Printer(100);
		d.startPrintJob(5);
		System.out.println(d.getNextPage());
		System.out.println("Expected 0");
		/**
		 * 
		 */
		Printer c = new Printer(100);
		c.addPaper(10);
		c.startPrintJob(5);
		c.printPage();
		System.out.println(c.getNextPage());
		System.out.println("Expected 1");
		c.printPage();
		System.out.println(c.getNextPage());
		System.out.println("Expected 2");
		c.printPage();
		System.out.println(c.getNextPage());
		System.out.println("Expected 3");
		c.printPage();
		System.out.println(c.getNextPage());
		System.out.println("Expected 4");
		c.printPage();
		System.out.println(c.getNextPage());
		System.out.println("Expected 0");
		c.printPage();
		System.out.println(c.getNextPage());
		System.out.println("Expected 1");
		c.printPage();
		System.out.println(c.getNextPage());
		System.out.println("Expected 2");
		
		Printer e = new Printer(50);
		e.addPaper (1);
		e.startPrintJob(5);
		e.printPage();
		// try to print a page with no paper available
		e.printPage();
		System.out.println(e.getTotalPages());
		System.out.println("Expected 1");
		// add paper and try to print again
		e.addPaper(100);
		System.out.println(e.getSheetsAvailable());
		System.out.println("Expected 50");
		e.printPage();
		System.out.println(e.getTotalPages());
		System.out.println("Expected 2");
		System.out.println(e.getNextPage());
		System.out.println("Expected 2");
		 e.printPage();
			System.out.println(e.getTotalPages());
			System.out.println("Expected 3");
			System.out.println(e.getNextPage());
			System.out.println("Expected 3");
	}
	
}
