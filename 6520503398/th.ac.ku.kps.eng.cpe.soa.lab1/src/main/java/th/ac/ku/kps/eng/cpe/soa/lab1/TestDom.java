package th.ac.ku.kps.eng.cpe.soa.lab1;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.sql.rowset.spi.XmlWriter;

import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;


public class TestDom {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Document doc = DocumentFactory.getInstance().createDocument();
		Element root = doc.addElement("root");
		root.addAttribute("myAttricute", "myValue");
		Element elem = root.addElement("myelem");
		elem.addText("Hello World");
		
		FileOutputStream fos = new FileOutputStream("simple.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(fos, format);
		writer.write(doc);
		writer.flush();
		writer.close();
		fos.close();
	}
}
