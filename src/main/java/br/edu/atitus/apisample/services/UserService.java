package br.edu.atitus.apisample.services;

import br.edu.atitus.apisample.models.User;
import br.edu.atitus.apisample.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }
}