package hw1;

/**
 * This will model the workings of a printer
 */
public class Printer {
	
	
	private int SheetsAvailable;
	private int pagesPrinted;
	private int trayCapacity1;
	private int documentSize;
	private int pagePrinting;
	private int SheetsAvailableTray;
	
	/**
	 * Constructs a new printer with the given maximum tray capacity of the number of paper sheets it
	 * can hold. Initially the tray is empty and the printer has not printed any pages.
	 * @param trayCapacity, capacity of the paper tray, given by user 
	 */
	
	public Printer(int trayCapacity) {
		trayCapacity1 = trayCapacity;
		SheetsAvailable = 0;
		pagesPrinted = 0;
		SheetsAvailableTray = 0;
	}
	
	/**
	 * Starts a new print job to make copies of a document that is a specified page length
     * (documentPages). Updates the next page to print as page 0 (denotes the first page of the
     * document).
     * @param documentPages, length of the document in pages 
	 */
	public void startPrintJob(int documentPages) {
		documentSize = documentPages;
		pagePrinting = 0;
	}
	
	/**
	 * This Method returns the sheets available to printing 
	 */
	public int getSheetsAvailable() {
		return SheetsAvailable;
	}
	
	
	/**
	 * Returns the next page number of the document that will be printed 
	 */
	public int getNextPage() {
		return pagePrinting;
	}
	
	
	/**
	 * Returns the count of all pages printed by the printer since its construction
	 */
	public int getTotalPages() {
		return pagesPrinted;
	}
	
	
	/**
	 * Simulates the printer printing a page. The number pages printed is either one or zero depending
     * on whether there is at least one sheet of paper available to the printer. Increments the total page
     * count of the printer by the number of pages printed. Advances the next page to print by the
     * number of pages printed (possibly wrapping around to page zero). The number of pages
     * available to the printer and in the tray are also updated accordingly.
	 */
	public void printPage() {
		pagePrinting = pagePrinting + Math.min(1, SheetsAvailable);
		pagePrinting = pagePrinting % documentSize;
		pagesPrinted = pagesPrinted + Math.min(1, SheetsAvailable);
		SheetsAvailable = Math.max(SheetsAvailable - 1, 0);
	}
	
	/**
	 * Removes the paper tray from the printer; that is, makes the sheets available to the printer zero.
	 */
	public void removeTray() {
		SheetsAvailableTray = SheetsAvailable;
		SheetsAvailable = 0;
		
	}
	
	
	/**
	 * Replaces the tray in the printer; that is, makes the sheets available to the printer the same as the
     * number of sheets in the tray.
	 */
	public void replaceTray() {
		SheetsAvailable = SheetsAvailableTray;
	}
	
	/**
	 * 
	 * @param sheets, this would take in amount of paper 
	 */
	public void addPaper(int sheets) {
		
		SheetsAvailable = Math.min((SheetsAvailable + sheets), trayCapacity1);
		SheetsAvailableTray =  Math.min((SheetsAvailableTray + sheets), trayCapacity1);
		SheetsAvailable = Math.min(SheetsAvailableTray, trayCapacity1);
		
	}
	
	
	/**
	 * Simulates removing the tray, removing the given number of sheets (but not allowing the sheets to
     * go below zero), and replacing the tray in the printer.
     * @param sheets, number of sheets given by user
	 */
	public void removePaper(int sheets) {
	    SheetsAvailable = Math.max((SheetsAvailable - sheets), 0);
	    SheetsAvailableTray = Math.max((SheetsAvailableTray - sheets), 0);
	    SheetsAvailable = Math.max(SheetsAvailableTray, 0);
	}
	
	
	
	
	
	
	
}
