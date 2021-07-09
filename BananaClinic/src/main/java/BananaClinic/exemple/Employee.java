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
private int id;
private String name;
private String surname;
private int registrationNumber;
private String expertise;

//Relationship type with procedure:
@OneToMany (mappedBy = "employee", cascade = CascadeType.ALL)
private List<Procedure> procedure = new ArrayList<>();



}
