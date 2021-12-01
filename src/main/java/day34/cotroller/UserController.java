package day34.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import day34.pojo.User;
import day34.service.LoginService;

@RestController
//@RequestMapping("/user")
public class UserController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/signup")
    public String signup(@RequestBody User user){
    	
        return loginService.signup(user);
    }
    @PostMapping("/login")
    public String login(@RequestBody User user){
        return loginService.login(user);
    }
    @GetMapping("/test")
    public String test(){
    	System.out.println("this is conflict example");
        return "this is user testing";
    }
}
