package BananaClinic.exemple;

import javax.persistence.Id;

import org.bson.types.Binary;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "employeePhotos")

public class EmployeePhoto {
	
	@Id
	private String id;
	private String name;
	private Binary photo;
	
	
	//constructor's not necessary but anyway:
	
	
	public EmployeePhoto(String name, Binary image) {
		super();
		this.name = name;
		this.photo = photo;
	}


	public EmployeePhoto() {
		super();
	}

	
	
	//Getters and setters:
	
	
	public String getName() {
		return name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Binary getPhoto() {
		return photo;
	}


	public void setPhoto(Binary photo) {
		this.photo = photo;
	}


	@Override
	public String toString() {
		return "EmployeePhoto [name=" + name + ", photo=" + photo + "]";
	}
	
	
	
}
