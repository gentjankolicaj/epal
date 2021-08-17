package org.epal.client_service.service;


import org.epal.commons.service.client.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();

    Optional<User> find(Long id);

    User save(User user);

    void delete(Long id);

    void delete(User user);

    User update(User updatedUser);

}
