package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.service.RegisterService;

@Controller
@RequestMapping("/register")
public class RegisterController {

    public RegisterService registerService;

    public RegisterController(RegisterService registerService){
        this.registerService = registerService;
    }

    @GetMapping
    public String showLoginForm() {
        return "register";
    }

    @PostMapping
    public String processLoginForm(@RequestParam String email, @RequestParam String login,
                                   @RequestParam String password, @RequestParam String repeatedPassword) {

        registerService.registerNewUser(email, login, password, repeatedPassword);

        return "redirect:/login";
    }

}
