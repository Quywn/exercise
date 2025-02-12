package oop.user;

import java.util.List;

public class User {
    private String username;
    private String email;
    private String password;
    //todo: mã hóa mật khẩu
    private List<String> permissions;

    public User(String username, String email, String password, List<String> permissions) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.permissions = permissions;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public boolean hasPermission(String permission) {
        return permissions.contains(permission);
    }


}
