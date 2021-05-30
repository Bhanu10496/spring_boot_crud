package mypackage.a.b.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Adding @RestController (spring mvc annotation) means that inside this class we can have methods that map to http requests
@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello!";
	}
}
