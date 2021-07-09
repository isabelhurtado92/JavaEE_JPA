package BananaClinic.exemple;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
//Relationship type with client:
	@ManyToOne




}
