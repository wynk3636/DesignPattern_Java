package proxy;

public class Printer implements Printable {
	
	private String name;
	
	public Printer() {
		heabyJob("作成中");
	}
	
	private void heabyJob(String msg) {
		
		System.out.println(msg);
		
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public Printer(String name) {
		this.name=name;
	}

	@Override
	public void setPrinterName(String name) {
		
		this.name=name;

	}

	@Override
	public String getPrinterName() {
		
		return name;
	}

	@Override
	public void print(String string) {
		System.out.println(name + string);
	}

}
