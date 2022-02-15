package com.example.Users.Service;

import com.example.Users.model.Users;
import com.example.Users.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class UserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
}
    public List<Users> getUsers() {
        return userRepository.findAll();
    }

    public Users saveUser(Users users) {
        users.setId(new Random().nextInt());
        return userRepository.save(users);
    }

}
