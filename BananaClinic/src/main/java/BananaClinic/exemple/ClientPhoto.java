package BananaClinic.exemple;
import javax.persistence.Id;
import org.bson.types.Binary;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection= "clientPhotos")

public class ClientPhoto {

	@Id
private String Id;
private String name;
private Binary photo;

//Constructor:

public ClientPhoto(String id, String name, Binary photo) {
	super();
	Id = id;
	this.name = name;
	this.photo = photo;
}


public ClientPhoto() {
	super();
}

//Getters and Setters:

public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public String getName() {
	return name;
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
	return "ClientPhoto [name=" + name + ", photo=" + photo + "]";
}



}
