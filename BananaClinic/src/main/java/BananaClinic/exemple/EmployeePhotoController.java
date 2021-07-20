package BananaClinic.exemple;

import java.io.IOException;

import org.bson.types.Binary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController

public class EmployeePhotoController {
	
	private EmployeePhotoRepository employeePhotoRepository;
	
//CRUD:
	
//GET ALL:

	@GetMapping ("/getAllEmployeePhotos")
	public Iterable<EmployeePhoto> getAllEmployees() {

		return employeePhotoRepository.findAll();}
	
//ADD OR CREATE:
	@PostMapping ("/addEmployeePhoto")
	
	public EmployeePhoto addEmployeePhoto(@RequestParam String name, @RequestParam MultipartFile file)
			throws IOException {

		EmployeePhoto employeePhoto = new EmployeePhoto();
		System.out.println("id of employeePhoto: " +  employeePhoto.getId());
		employeePhoto.setName(name);
		employeePhoto.setPhoto(new Binary(file.getBytes()));
		
		
		
		EmployeePhoto employeePhotoSaved =  employeePhotoRepository.save(employeePhoto);
		System.out.println("id of employeePhoto: " +  employeePhotoSaved.getId());
		
		//employee.setFID_employee(employeePhotoSaved.getId());
		//employeeRepository.save(employee);
		
		
		return employeePhotoSaved;
		

//DELETE:
	//@DeleteMapping("/deleteEmployeePhoto")
	
	
}
	
}