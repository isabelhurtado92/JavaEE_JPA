package BananaClinic.exemple;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;

@Entity
@Table

public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surname;
	private int nationalID;
	private int phoneNumber;

	//Relationship type with procedure:
	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
	private List<Procedure> procedure = new ArrayList<>();
	
	//Constructor, getters and setters:
	public Client(String name, String surname, int nationalID, int phoneNumber, List<Procedure> procedure) {
		super();
		this.name = name;
		this.surname = surname;
		this.nationalID = nationalID;
		this.phoneNumber = phoneNumber;
		this.procedure = procedure;
	}

	public Client() {
		super();
	}

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

	public int getNationalID() {
		return nationalID;
	}

	public void setNationalID(int nationalID) {
		this.nationalID = nationalID;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Procedure> getProcedure() {
		return procedure;
	}

	public void setProcedure(List<Procedure> procedure) {
		this.procedure = procedure;
	}
	
	public void addProcedure(Procedure procedure) {
		this.procedure.add(procedure);
		procedure.setClient(this);
		
	}	

}
