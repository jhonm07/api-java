package cl.ionix.test.greetingapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GreetingController {

	@Value("${env.name}")
	private String name;

	@GetMapping("/hello")
	public String sayHello(){
		return "Hola "+name+" desde la API!";
	}
}
