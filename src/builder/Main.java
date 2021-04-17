package builder;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	final static Map<String,Builder> maps = new HashMap<String,Builder>() {
		{
			put("html", new HTMLBuilder());
			put("text", new TextBuilder());
		}
	};

	public static void main(String[] args) {
		if(args.length!=1) {
			usage();
			System.exit(0);
		}
		
		Builder builder = maps.get(args[0]);
		Directory directory = new Directory(builder);
		directory.construct();
		String result = builder.getResult();
		
		System.out.println(result+"が作成されました");
	}
	
	public static void usage() {
		System.out.println("文書作成");
	}

}
