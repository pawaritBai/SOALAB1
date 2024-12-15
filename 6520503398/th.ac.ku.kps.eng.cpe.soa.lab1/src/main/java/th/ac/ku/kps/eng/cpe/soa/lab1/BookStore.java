package th.ac.ku.kps.eng.cpe.soa.lab1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class BookStore {
	private String isbn;
	private String title;
	private List<String> author = new ArrayList<>();
	private List<String> catagory = new ArrayList<>();
	private String language;
	private Integer yaer;
	private Byte edition;
	private Double price;

	public BookStore() {
		
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author.add(author);
	}
	public List<String> getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory.add(catagory);
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Integer getYaer() {
		return yaer;
	}
	public void setYaer(Integer yaer) {
		this.yaer = yaer;
	}
	public Byte getEdition() {
		return edition;
	}
	public void setEdition(Byte edition) {
		this.edition = edition;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}


}
