package day8.Day_8;

import java.util.Map;
import java.util.Optional;

public class UserService {
    private final UserRepository userRepository = new UserRepository();

    public User createUser(String name, String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        return userRepository.save(user);
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public Map<Long, User> getAllUsers() {
        return userRepository.findAll();
    }
}
