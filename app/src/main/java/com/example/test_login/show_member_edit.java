package com.example.test_login;

public class show_member_edit {

    String username, password, email, phone, name ,gender;

    public show_member_edit(String username, String password, String email, String phone, String name, String gender) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.name = name;
        this.gender = gender;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public show_member_edit() {
    }

}
