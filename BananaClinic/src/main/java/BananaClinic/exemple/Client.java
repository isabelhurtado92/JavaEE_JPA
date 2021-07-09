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
	

}
