
package BananaClinic.exemple;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.ArrayList;

@Entity

@Table

public class Employee {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String name;
	private String surname;
	private int registrationNumber;
	private String expertise;

	// Relationship type with procedure:

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private List<Procedure> procedure = new ArrayList<>();

	// Constructor, getters and setters:
	public Employee(String name, String surname, int registrationNumber, String expertise) {
		super();
		this.name = name;
		this.surname = surname;
		this.registrationNumber = registrationNumber;
		this.expertise = expertise;
	}

	public Employee() {
		super();
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

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public List<Procedure> getProcedure() {
		return procedure;
	}

	public void addProcedure(Procedure procedure) {
		this.procedure.add(procedure);
		procedure.setEmployee(this);

	}

	@Override
	public String toString() {
		return "Employee [ name=" + name + ", surname=" + surname + ", registrationNumber=" + registrationNumber
				+ ", expertise=" + expertise + ", procedure=" + procedure + "]";
	}

}
