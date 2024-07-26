package day8.Day_8;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // Create users
        User user1 = userService.createUser("amrit", "amrit@gmail.com");
        User user2 = userService.createUser("ram", "ram@gmail.com");

        // Retrieve all users
        System.out.println("All Users:");
        userService.getAllUsers().forEach((id, user) -> System.out.println(user));

        // Retrieve a user by ID
        System.out.println("User with ID 1: " + userService.getUserById(1L).orElse(null));

        // Delete a user
        userService.deleteUser(1L);
        System.out.println("All Users after deletion:");
        userService.getAllUsers().forEach((id, user) -> System.out.println(user));
    }
}
