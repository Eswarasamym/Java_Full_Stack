package Demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class helloworldcontroller {
	
	
	//http://localhost:8080/hello-world
	@GetMapping("/hello-world")
	public String helloWorldControl() {
        return "Hello world !";
    }
	
	

}
