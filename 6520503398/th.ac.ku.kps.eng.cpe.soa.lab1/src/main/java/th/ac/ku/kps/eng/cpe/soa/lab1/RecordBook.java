package th.ac.ku.kps.eng.cpe.soa.lab1;

import java.io.FileOutputStream;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class RecordBook {
	private Element title;
	private Element author;
	private Element catagory;
	private Element language;
	private Element yaer;
	private Element edition;
	private Element price;
	public Element BookStore;
	public Document doc;
	public Element book;


	public RecordBook() {
		 this.doc = DocumentFactory.getInstance().createDocument();
		 this.BookStore = doc.addElement("BookStore");
	}

	public void setIsbn(String isbn) {
		this.book = BookStore.addElement("book");
		book.addAttribute("ISBN", isbn);
	}


	public void setTitle(String titl) {
		this.title = book.addElement("title");
		this.title.addText(titl);
	}

	public void setAuthor(String author) {
		this.author = book.addElement("author");
		this.author.addText(author);
	}

	public void setCatagory(String catagory) {
		this.catagory = book.addElement("catagory");
		this.catagory.addText(catagory);
	}
	
	public void setLanguage(String language) {
		this.language = book.addElement("language");
		this.language.addText(language);
	}

	public void setYaer(int yaer) {
		this.yaer = book.addElement("year");
		this.yaer.addText(String.valueOf(yaer));
	}

	public void setEdition(Byte edition) {
		this.edition = book.addElement("edition");
		this.edition.addText(String.valueOf(edition));
	}

	public void setPrice(Double price) throws IOException {
		this.price = book.addElement("price");
		this.price.addText(String.valueOf(price));
		FileOutputStream fos = new FileOutputStream("simple.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(fos, format);
		writer.write(doc);
		writer.flush();
		writer.close();
		fos.close();
	}
}
