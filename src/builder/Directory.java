package builder;

public class Directory {
	
	private Builder builder;
	
	public Directory(Builder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.makeTitle("Greeting");
		builder.makeString("朝から昼にかけて");
		builder.makeItems(new String[]{"おはよう","こんにちは"});
		builder.makeString("夜に");
		builder.makeItems(new String[] {"今晩わ","おやすみ"});
		builder.close();
	}
}
