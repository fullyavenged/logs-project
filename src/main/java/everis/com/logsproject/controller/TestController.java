package everis.com.logsproject.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class TestController {
	
	private final static Logger logger= LoggerFactory.getLogger(TestController.class);

	@GetMapping("/")
	public ResponseEntity<String> saludo(){
		logger.info("Hola");
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
}
