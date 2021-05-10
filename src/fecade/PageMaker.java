package fecade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import javax.swing.text.html.HTMLWriter;

public class PageMaker {

	private PageMaker() {
		
	}
	
	public static void makeWelcomePage(String mailaddr,String fileName) {
		try {
			Properties mailprop = Database.getProperties("mailaddr");
			String userName = mailprop.getProperty(mailaddr);
			HtmlWritter writer = new HtmlWritter(new FileWriter(fileName));
			writer.title("welcome " + userName);
			writer.paragraph(userName+" page");
			writer.mailto(mailaddr, userName);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
