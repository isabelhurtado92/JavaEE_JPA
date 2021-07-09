package BananaClinic.exemple;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table

public class Procedure {
	
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int id;	
private String name;
@DateTimeFormat(pattern = "yyyy-MM-dd")
private Date startingDate;
private Date endDate;
private boolean done;


//Relationship type with employee:
	@ManyToOne
	@JoinColumn(name = "ID_EMPLOYEE" )
	private Employee employee;
	
//Relationship type with client:
	@ManyToOne
	@JoinColumn (name = "ID_CLIENT")
	private Client client;


	//Constructor, getters and setters:

public Procedure(String name, Date startingDate, Date endDate, boolean done) {
	super();
	this.name = name;
	this.startingDate = startingDate;
	this.endDate = endDate;
	this.done = done;

}

	public Procedure() {
		super();
	}

	public Procedure(String name, boolean done) {
		super();
		this.name = name;
		this.done = done;
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

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	

	@Override
	public String toString() {
		return "Procedure [id=" + id + ", name=" + name + ", startingDate=" + startingDate + ", endDate=" + endDate
				+ ", done=" + done + ", employee=" + employee + ", client=" + client + "]";
	}


}