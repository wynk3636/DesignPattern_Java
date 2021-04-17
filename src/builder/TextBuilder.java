package builder;

public class TextBuilder extends Builder {
	
	private StringBuffer buffer = new StringBuffer();

	@Override
	public void makeTitle(String title) {
		buffer.append("title"+"¥n");
	}

	@Override
	public void makeString(String str) {
		buffer.append(str+"¥n");
	}

	@Override
	public void makeItems(String[] items) {
		for(String item: items) {
			buffer.append(item+"¥n");
		}
	}

	@Override
	public void close() {
		buffer.append("fin"+"¥n");
	}
	
	@Override
	public String getResult() {
		return buffer.toString();
	}

}
