package proxy;

public class Main {

	public static void main(String[] args) {
		
		Printable p = new PrinterProxy("alice");
		System.out.println(p.getPrinterName());
		
		p.setPrinterName("bob");
		System.out.println(p.getPrinterName());
		
		p.print("hello");
	}

}
