package fecade;

import java.io.IOException;
import java.io.Writer;

public class HtmlWritter {
	
	private Writer writer;
	
	public HtmlWritter(Writer writer) {
		this.writer=writer;
	}
	
	public void title(String title) throws IOException{
		writer.write("<h1>hello</h1>");
	}
	
	public void paragraph(String msg) throws IOException{
		writer.write(msg);
	}
	
	public void link(String href, String caption) throws IOException{
		paragraph(href+caption);
	}
	
	public void mailto(String mailaddr, String userName) throws IOException{
		link(mailaddr,userName);
	}
	
	public void close() throws IOException{
		writer.close();
	}

}
