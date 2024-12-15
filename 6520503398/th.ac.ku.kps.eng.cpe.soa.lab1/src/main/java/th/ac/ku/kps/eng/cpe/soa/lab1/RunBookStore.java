package th.ac.ku.kps.eng.cpe.soa.lab1;

import java.io.IOException;
import java.util.List;

public class RunBookStore {

	public static void main(String[] args) throws IOException {
		BookStore b1 = new BookStore() ;
		RecordBook rb = new RecordBook();
		
		b1.setIsbn("0123456001");
		b1.setTitle("Java For Dummies");
		b1.setAuthor("Tan Ah Teck");
		b1.setCatagory("Programming");
		b1.setYaer(2009);
		b1.setEdition((byte)7);
		b1.setPrice(19.99);
		
		rb.setIsbn(b1.getIsbn());
		rb.setTitle(b1.getTitle());
		rb.setAuthor(b1.getAuthor().get(0));
		rb.setCatagory(b1.getCatagory().get(0));
		rb.setYaer(b1.getYaer());
		rb.setEdition((byte)b1.getEdition());
		rb.setPrice(b1.getPrice());
		
		BookStore b2 = new BookStore() ;
		b2.setIsbn("0123456002");
		b2.setTitle("Java For Dummies");
		b2.setAuthor("Tan Ah Teck");
		b2.setCatagory("Programming");
		b2.setYaer(2008);
		b2.setPrice(25.99);
		
		rb.setIsbn(b2.getIsbn());
		rb.setTitle(b2.getTitle());
		rb.setAuthor(b2.getAuthor().get(0));
		rb.setCatagory(b2.getCatagory().get(0));
		rb.setYaer(b2.getYaer());
		rb.setPrice(b2.getPrice());
		
		BookStore b3 = new BookStore() ;
		b3.setIsbn("0123456003");
		b3.setTitle("The complete Guide to Fishing");
		b3.setAuthor("Bill Jones");
		b3.setAuthor("James Cook");
		b3.setCatagory("Fishing");
		b3.setCatagory("Leisure");
		b3.setLanguage("French");
		b3.setYaer(2000);
		b3.setEdition((byte)2);
		b3.setPrice(49.99);
		
		rb.setIsbn(b3.getIsbn());
		rb.setTitle(b3.getTitle());
		rb.setAuthor(b3.getAuthor().get(0));
		rb.setAuthor(b3.getAuthor().get(1));
		rb.setCatagory(b3.getCatagory().get(0));
		rb.setCatagory(b3.getCatagory().get(1));
		rb.setLanguage(b3.getLanguage());
		rb.setYaer(b3.getYaer());
		rb.setEdition((byte)b3.getEdition());
		rb.setPrice(b3.getPrice());
	}

}
