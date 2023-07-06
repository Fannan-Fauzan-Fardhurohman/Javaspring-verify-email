package id.fannan.sendemail.service;

import id.fannan.sendemail.entity.User;

public interface UserService {
    User saveUser(User user);
    Boolean verifyToken(String token);
}
