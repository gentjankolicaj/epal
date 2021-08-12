package org.epal.client_service.service;

import org.epal.client_service.repository.UserRepository;
import org.epal.commons.client.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        List<User> users=userRepository.findAll();
        return users;
    }

    @Override
    public Optional<User> find(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User save(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public void delete(Long id) {
       userRepository.deleteById(id);
    }

    @Override
    public void delete(User user) {
       userRepository.delete(user);
    }

    @Override
    public User update(User updatedUser) {
        return userRepository.saveAndFlush(updatedUser);
    }


}
