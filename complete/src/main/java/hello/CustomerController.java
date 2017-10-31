package hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.inject.Inject;

@RestController
public class CustomerController {

    @Inject
    private CustomerRepository customerRepository;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
    public ResponseEntity<String> getCostumerById(@PathVariable Long id){
        String customer = customerRepository.findOne(id).getLastName();
        return new ResponseEntity<String>(customer, HttpStatus.OK);
    }

}