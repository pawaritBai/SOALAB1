package th.ac.ku.kps.eng.cpe.soa.lab1;

import java.io.IOException;

public class RunBookStore {

	public static void main(String[] args) throws IOException {
		BookStore b = new BookStore() ;
		b.setIsbn("0123456001");
		b.setTitle("Java For Dummies");
		b.setAuthor("Tan Ah Teck");
		b.setCatagory("Programming");
		b.setYaer(2009);
		b.setEdition((byte)7);
		b.setPrice(19.99);

	}

}
