package BananaClinic.exemple;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webapi")

public class EmployeeRestController {
	
@Autowired
EmployeeRepository employeeRepository;

	
//CRUD OPS:

//---------------------- crud: READ -------------------------------------------
	// -----------------------------------------------------------------------------
	@GetMapping("/allEmployees")
	public Iterable<Employee> getAllEmployees() {

		return employeeRepository.findAll();
	}

	// ---------------------- crud: READ (by Id) ---------------------------------
	// ---------------------------------------------------------------------------
	@GetMapping("/getEmployee/{id}")
	public Employee findById(@PathVariable int id) {

		Optional<Employee> employeeFound = employeeRepository.findById(id);

		if (employeeFound.isPresent()) {

			return employeeFound.get();
		}

		return null;
	}

	// ---------------------- crud: DELETE (by Id) -------------------------------
	// ----------------------------------------------------------------------------
	@DeleteMapping("/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable int id) {

		Optional<Employee> employeeFound = employeeRepository.findById(id);

		if (employeeFound.isPresent()) {

			employeeRepository.deleteById(id);
		}

	}

	// ---------------------- crud: CREATE (by Id) -------------------------------
	// ---------------------------------------------------------------------------
	@PostMapping(path = "/addEmployee", consumes = "application/json")
	public void insertEmployee(@RequestBody Employee employee) {

		
		employeeRepository.save(employee);
	}

	// ---------------------- crud: UPADATE (by Id) -------------------------------
	// ----------------------------------------------------------------------------
	@PutMapping("/updateEmployee/{id}")
	public void upadateEmployee(@RequestBody Employee employee, @PathVariable int id) {

		Optional<Employee> employeeFound = employeeRepository.findById(id);

		if (employeeFound.isPresent()) {

			if (!employee.getName().equals(employeeFound.get().getName()))
				employeeFound.get().setName(employee.getName());

			if (!employee.getSurname().equals(employeeFound.get().getSurname()))
				employeeFound.get().setSurname(employee.getSurname());  

			if (employee.getRegistrationNumber() != employeeFound.get().getRegistrationNumber())
				employeeFound.get().setRegistrationNumber(employee.getRegistrationNumber());

			if (!employee.getExpertise().equals(employeeFound.get().getExpertise()))
				employeeFound.get().setExpertise(employee.getExpertise());

			employeeRepository.save(employeeFound.get());
		}
	}
	
}

	


