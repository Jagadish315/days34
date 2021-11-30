package day34.service;

import day34.pojo.User;

public interface LoginService {

    String signup(User user);

    String login(User user);
}
