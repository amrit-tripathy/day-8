package day8.Day_8;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserRepository {
    private Map<Long, User> userMap = new HashMap<>();
    private static Long idCounter = 1L;

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(idCounter++);
        }
        userMap.put(user.getId(), user);
        return user;
    }

    public Optional<User> findById(Long id) {
        return Optional.ofNullable(userMap.get(id));
    }

    public void deleteById(Long id) {
        userMap.remove(id);
    }

    public Map<Long, User> findAll() {
        return userMap;
    }
}
