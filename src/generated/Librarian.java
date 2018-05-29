package generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
@XmlRootElement(name="Librarian")
@XmlAccessorType(XmlAccessType.FIELD)
public class Librarian {
	public Librarian() {
		
	}
	public Librarian(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@XmlAttribute(name="Name")
	private String name;
	@XmlAttribute(name="Age")
	private int age;
	@XmlAttribute(name="Salary")
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
