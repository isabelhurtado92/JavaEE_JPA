package BananaClinic.exemple;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestClientEmplPro implements CommandLineRunner {
	
	
	@Autowired
	 EmployeeRepository employeeRepository;
	
	
	@Autowired
	ClientRepository clientRepository;
	
	
	 @Autowired
	 ProcedureRepository procedureRepository;
	 
	

	public void run(String... args) throws Exception {
	
		
		//creating employees:
		Employee isa = new Employee ("Isabel","Hurtado", 0147566, "Dermatology");
		employeeRepository.save(isa);
		
		
		//creating clients:
		
		Client anna = new Client ("Anna", "Hurtado", 47899999, 67888888);
		clientRepository.save(anna);
		System.out.println(anna);
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd"); //to put in restController
		
		//creating procedures
		Procedure AcneRemoval1 = new Procedure ("peeling", formater.parse("2021-15-09"),  formater.parse("2021-15-09"), false);
		procedureRepository.save(AcneRemoval1);
		
		//Assignin:
		
		AcneRemoval1.setEmployee(isa);
		AcneRemoval1.setClient(anna);
		procedureRepository.save(AcneRemoval1);
		
		
	}

}
