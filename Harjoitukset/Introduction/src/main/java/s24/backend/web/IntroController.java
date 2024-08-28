package s24.backend.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class IntroController {

	@RequestMapping("*")
	public String star() {
		return "Welcome!";
	}

	@RequestMapping("/index")
	public String index() {
		return "This is the index page!";
	}

	@RequestMapping("/contact")
	public String contact() {
		return "This is the contact page!";
	}
	
    @RequestMapping("/hello")
    public String hello(@RequestParam(name="location") String location, @RequestParam(name="name") String name) {
        return "Welcome to the " + location + " " + name + "!";
    }
}