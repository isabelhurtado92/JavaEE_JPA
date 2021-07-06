package EventsCovid.demo;

import java.util.ArrayList;
import java.util.HashMap;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table

//Creating class and attributes:
public class Guest {
	
	@Id
	public int id;
	public String name;
	public String surname;
	public int age;
	public HashMap<String,Integer> phoneNumber;
	

//Relationship type:
	@OneToMany (mappedBy = "guest" , cascade = CascadeType.ALL)
	public ArrayList<Pcr> pcr = new ArrayList<>();
	
	
//Constructor:	
	public Guest(String name, String surname, int age, HashMap<String, Integer> phoneNumber) {
		super();
		//this.id = id; not necessary JPA's annotation "@id" has already created it.
		this.name = name;
		this.name = surname;
		this.age = age;
		this.phoneNumber = phoneNumber;
	
	}
	
	public Guest(String name, String surname, int age) {
		super();
		//this.id = id; not necessary JPA's annotation "@id" has already created it.
		this.name = name;
		this.name = surname;
		this.age = age;
	}
	

	
//Getters and Setters:	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public HashMap<String, Integer> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(HashMap<String, Integer> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public ArrayList<Pcr> getPcr() {
		return pcr;
	}

	public void setPcr(ArrayList<Pcr> pcr) {
		this.pcr = pcr;
	}
	
	//adding method:
	
	public void addPcr(Pcr pcr) {
		this.pcr.add(pcr);
		pcr.setGuest(this);
	}


	//ToString:	
	@Override
	public String toString() {
		return "Guest [id=" + id + ", name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + ", pcr=" + pcr
				+ "]";
	}
	
}

