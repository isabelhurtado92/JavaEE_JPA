package BananaClinic.exemple;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table

public class Procedure {
	
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int id;	
private String name;
private Date StartingDate;
private Date EndDate;
private boolean Done;


//Relationship type with employee:
	@ManyToOne
	@JoinColumn(name = "ID_EMPLOYEE" )
	private Employee employee;
	
//Relationship type with client:
	@ManyToOne
	@JoinColumn (name = "ID_CLIENT")
	private Client client;

	//Constructor, getters and setters:
public Procedure(String name, Date startingDate, Date endDate, boolean done, Employee employee, Client client) {
	super();
	this.name = name;
	StartingDate = startingDate;
	EndDate = endDate;
	Done = done;
	this.employee = employee;
	this.client = client;
}

public Procedure() {
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

public Date getStartingDate() {
	return StartingDate;
}

public void setStartingDate(Date startingDate) {
	StartingDate = startingDate;
}

public Date getEndDate() {
	return EndDate;
}

public void setEndDate(Date endDate) {
	EndDate = endDate;
}

public boolean isDone() {
	return Done;
}

public void setDone(boolean done) {
	Done = done;
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
	return "Procedure [id=" + id + ", name=" + name + ", StartingDate=" + StartingDate + ", EndDate=" + EndDate
			+ ", Done=" + Done + ", employee=" + employee + ", client=" + client + "]";
}



}
