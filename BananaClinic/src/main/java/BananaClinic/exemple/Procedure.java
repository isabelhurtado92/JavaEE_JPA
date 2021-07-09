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




}
