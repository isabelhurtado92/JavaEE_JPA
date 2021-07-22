package EventsCovid.demo;


	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;

	@Controller
	@RequestMapping("/pcr")

	public class PcrController {
			
	@Autowired
	PcrRepository pcrRepository;
			
		//CRUD OPS:

		//READ
		@RequestMapping("/allPcr")
			public Iterable<Pcr> getAllPcr() {

				return pcrRepository.findAll();
			}
		
			//  CREATE 
			
			@RequestMapping("/newPcr")
			public String newPcr() {

				return "";
			}
			
			@RequestMapping("/addPcr")
			public String insertPcr(Pcr pcr) {
				
				pcrRepository.save(pcr);
				
				return "";
			}
		
			// READ 
			@RequestMapping("/getPcr/{id}")
			public Pcr findById(@PathVariable int id) {

				Optional<Pcr> pcrFound = pcrRepository.findById(id);

				if (pcrFound.isPresent()) {

					return pcrFound.get();
				}

				return null;
			}
			
		

			/*
			 * // DELETE
			 * 
			 * @RequestMapping("/deletePcr/{id}") public void deletePcr(@PathVariable int
			 * id) {
			 * 
			 * Optional<Pcr> guestFound = pcrRepository.findById(id);
			 * 
			 * if (pcrFound.isPresent()) {
			 * 
			 * pcrRepository.deleteById(id); }
			 * 
			 * }
			 */

			// UPADATE 
			@RequestMapping("/updatePcr/{id}")
			public void updatePcr(Pcr pcr, @PathVariable int id) {

				Optional<Pcr> pcrFound = pcrRepository.findById(id);

				if (pcrFound.isPresent()) {

					if (!pcr.getExtractionDate().equals(pcrFound.get().getExtractionDate()))
						pcrFound.get().setExtractionDate(pcr.getExtractionDate());
					
					/*
					 * if (!pcr.isResult().equals(pcrFound.get().isResult()))
					 * pcrFound.get().setResult(pcr.isResult());
					 */

					if (pcr.getProfessionalValidation() != pcrFound.get().getProfessionalValidation())
						pcrFound.get().setProfessionalValidation(pcr.getProfessionalValidation());


					pcrRepository.save(pcrFound.get());
				}
			}
			
		}
		



