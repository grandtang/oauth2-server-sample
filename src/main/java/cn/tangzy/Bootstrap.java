package cn.tangzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

/**
 * Hello world!
 */
@SpringBootApplication
@Controller
public class Bootstrap {
    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class, args);
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String test() {
        return "hello";
    }

    @ResponseBody
    @RequestMapping("/api/hello")
    public String testApi() {
        return "/api/hello";
    }

    @ResponseBody
    @RequestMapping("/user")
    public Principal getUser(Principal principal) {
        return principal;
    }
}
