package composit;

public class Main {

	public static void main(String[] args) {
		try {
			Directory root = new Directory("root");
			Directory bin = new Directory("bin");
			Directory tmp = new Directory("tmp");
			Directory usr = new Directory("usr");
			root.add(bin);
			root.add(tmp);
			root.add(usr);
			root.add(new File("vi",1000));
			root.add(new File("latex",2000));
			
			root.printList();
		}
		catch(FileTreatmentException e) {
			e.printStackTrace();
		}
	}

}
