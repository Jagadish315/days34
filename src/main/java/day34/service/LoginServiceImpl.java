package day34.service;

import day34.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{

    @Override


    public String signup(User user) {
        if (user.getName() == null ||
                user.getName().equals("") ||
                user.getPassword()== null ||
                user.getPassword().equals("") ||
                user.getEmail()== null ||
                user.getEmail().equals(""))
        {

            return "Input is blank";
        }else{
            return "Signup successfull!";
        }
    }
    @Override
    public String login(User user) {
        if((user.getName()=="admin")&&(user.getPassword()=="admin")){
            return "Login Successful";
        }
        return "Login Failed";
    }
}
