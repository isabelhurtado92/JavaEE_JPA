package BananaClinic.exemple;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table

public class Employee {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String surname;
private int registrationNumber;
private String expertise;

//Relationship type with procedure:
@OneToMany (mappedBy = "employee", cascade = CascadeType.All)
private List<Procedure> procedure = new ArrayList<>();



}
