package generated;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.util.GregorianCalendar;
import java.util.TimeZone;
public class LibraryRunner {
	GregorianCalendar c = new GregorianCalendar();
	//c.setTimeZone(TimeZone.getTimeZone("GMT"));
    //c.set(2009, GregorianCalendar.JANUARY, 1, 12, 0, 0);
	
	
	//c.setTime(yourDate);
	//XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
	public static void main(String[] args) throws JAXBException, DatatypeConfigurationException, IOException{
		GregorianCalendar c = new GregorianCalendar();
		c.setTimeZone(TimeZone.getTimeZone("GMT"));
		c.set(2009, GregorianCalendar.JANUARY, 1, 12, 0, 0);
		//c.getTime();
		Book[] myBooks = new Book[] { new Book(),  new Book(),  new Book()};
		Author a1 = new Author();
		a1.setFirstName("Biggo");
		a1.setLastName("Nameo");
		Author b1 = new Author();
		b1.setFirstName("Baddo");
		b1.setLastName("Mario");
		Author c1 = new Author();
		c1.setFirstName("Mario");
		c1.setLastName("Mario");
		Book.Authors book1Authors = new Book.Authors();
		book1Authors.author = new ArrayList<Author>();
		book1Authors.author.add(a1);
		book1Authors.author.add(b1);
		book1Authors.author.add(c1);
		myBooks[0].authors = book1Authors;
		myBooks[0].setDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
		myBooks[0].setGenre("Horror");
		myBooks[0].setTitle("Last time to Go");
		
		Book.Authors book2Authors= new Book.Authors();
		book2Authors.author = new ArrayList<Author>();
		book2Authors.author.add(a1);
		book2Authors.author.add(b1);
		c.set(2011, GregorianCalendar.JANUARY, 1, 12, 0, 0);
		myBooks[1].authors = book2Authors;
		myBooks[1].setDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
		myBooks[1].setGenre("Puzzles");
		myBooks[1].setTitle("How to Puzzle Everyone");
		
		
		Book.Authors book3Authors= new Book.Authors();
		//myBooks[0].setAuthors();
		book3Authors.author = new ArrayList<Author>();
		book3Authors.author.add(a1);
		c.set(2012, GregorianCalendar.JANUARY, 1, 12, 0, 0);
		myBooks[2].authors = book3Authors;
		myBooks[2].setDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
		myBooks[2].setGenre("History");
		myBooks[2].setTitle("A few good things");
		
		
		
		Librarian[] myLibrarians = new Librarian[] {new Librarian("bad lady",99,1000),new Librarian("big lady",990,10000),new Librarian("wig lady",22,500)};
		Library myLibrary = new Library("big library","underneath tha wahtah.", myBooks, myLibrarians);
		JAXBContext context = JAXBContext.newInstance(Library.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(myLibrary, System.out);
		marshaller.marshal(myLibrary, new File("Library.xml"));
		LibraryRunner.generateXSD();
		
	}
	private static void generateXSD() throws JAXBException, IOException {
		
		JAXBContext context = JAXBContext.newInstance(Library.class);
		context.generateSchema(new XSDGenerator());
	}
	
	
	
}
