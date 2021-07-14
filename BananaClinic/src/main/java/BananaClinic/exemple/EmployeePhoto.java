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
		this.image = image;
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


	public Binary getImage() {
		return image;
	}


	public void setImage(Binary image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "EmployeePhoto [name=" + name + ", image=" + image + "]";
	}
	
	
	
}
