package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Usuario {
	
	@RequestMapping("/login")
	public String login() {
		return "usuario/login";
	}
	@RequestMapping("/cadastro")
	public String CadastroUsuario(){
		return "usuario/cadastro";
	}
	
	@RequestMapping("/esquecisenha")
	public String esqueciSenha() {
		return "usuario/esquecisenha";
	}
}
