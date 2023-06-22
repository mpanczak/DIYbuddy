package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.service.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("login")
    public String processLoginForm(@RequestParam String email, @RequestParam String password) {

        if (loginService.isUserValid(email, password)) {
            return "redirect:/profile";
        } else {
            return "redirect:/login";
        }

    }

}
