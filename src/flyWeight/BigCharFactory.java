package flyWeight;

import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

public class BigCharFactory {

	private HashMap pool = new HashMap();
	
	private static BigCharFactory singleton = new BigCharFactory();
	
	public static BigCharFactory getInstance() {
		return singleton;
	}
	
	public synchronized BigChar getBigChar(char charname) {
		BigChar bc = (BigChar)pool.get("" + charname);
		
		if(bc==null) {
			bc= new BigChar(charname);
			pool.put("" + charname, bc);
		}
		
		return bc;
	}
	
}
