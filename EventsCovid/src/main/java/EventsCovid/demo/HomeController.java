package EventsCovid.demo;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Controller; import
  org.springframework.web.bind.annotation.RequestMapping;
  
  @Controller public class HomeController {

  @Autowired private GuestRepository guestRepository;
  
  @Autowired private PcrRepository pcrRepository;
  
  // ------------------------------home ---------------------------
  
  @RequestMapping({ "/home", "/" }) public String home() {
  
  return "home"; }
  
  
  
  }
 