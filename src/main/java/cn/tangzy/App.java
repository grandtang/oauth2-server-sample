package cn.tangzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

/**
 * Hello world!
 */
@SpringBootApplication
@Controller
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/users/me")
    @ResponseBody
    public Principal me(Principal principal) {
        return principal;
    }

    @ResponseBody
    @RequestMapping("/request/hello")
    public String test() {
        return "hello";
    }

    @GetMapping("/login")
    public String login() {
        return "redirect:/static/login1.html";
    }
}
