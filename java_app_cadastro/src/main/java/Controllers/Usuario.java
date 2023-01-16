package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Usuario {
	
	@RequestMapping("/login")
	public String index() {
		return "usuario/login";
	}
}
