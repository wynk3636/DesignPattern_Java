package visitor;

import java.util.Iterator;

public class ListVisitor extends VIsitor {
	
	private String currentDir="";

	@Override
	public void visit(File file) {
		System.out.println(currentDir + "/" + file);
	}

	@Override
	public void visit(Directory dir) {
		
		String saveDir = currentDir;
		
		currentDir = currentDir + "/" + dir.getName();
		Iterator it = dir.iterator();
		
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			entry.accept(this);
		}
		currentDir= saveDir;
	}

}
