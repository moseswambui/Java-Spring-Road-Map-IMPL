package OOP.BookOOPExample;

import java.util.Date;

public class User {
    private String username;
    private String password;
    private String email;
    private String phone;

    // Constructor
    public User(String username, String password, String email, String phone) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    // Method Overloading Example

    public void displayUserInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }

    // Overloaded method - Different signature
    public void displayUserInfo(boolean includePassword) {
        displayUserInfo(); // Reusing the code from the previous method
        if (includePassword) {
            System.out.println("Password: " + password);
        }
    }
    // Method that can be overridden
    public void displayUserType() {
        System.out.println("User");
    }


    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    //Method Overloading



}
