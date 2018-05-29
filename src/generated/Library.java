package generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
@XmlRootElement(name="Library")
@XmlAccessorType(XmlAccessType.FIELD)
public class Library {
	@XmlAttribute(name="name")
	private String libraryName;
	@XmlAttribute(name="Address")
	private String libraryAddress;
	@XmlElementWrapper(name="Books")
	@XmlElement(name="Book")
	private Book[] myBooks;
	@XmlElementWrapper(name="Librarians")
	@XmlElement(name="Librarian")
	private Librarian[] myLibrarians;
	public String getLibraryName() {
		return libraryName;
	}
	public Library(){
		
	}
	public Library(String libraryName, String libraryAddress, Book[] myBooks, Librarian[] myLibrarians){
		this.libraryName = libraryName;
		this.libraryAddress = libraryAddress;
		this.myBooks = myBooks;
		this.myLibrarians = myLibrarians;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public String getLibraryAddress() {
		return libraryAddress;
	}
	public void setLibraryAddress(String libraryAddress) {
		this.libraryAddress = libraryAddress;
	}
	public Book[] getMyBooks() {
		return myBooks;
	}
	public void setMyBooks(Book[] myBooks) {
		this.myBooks = myBooks;
	}
	public Librarian[] getMyLibrarians() {
		return myLibrarians;
	}
	public void setMyLibrarians(Librarian[] myLibrarians) {
		this.myLibrarians = myLibrarians;
	}

}
