package com.example.rent.a.car.Model.request;

public class AdminChangeUserInfoRequestModel {
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String personalNumber;
    private String image;

    public AdminChangeUserInfoRequestModel(String username, String email, String firstName, String lastName,
                                           String phoneNumber, String personalNumber, String image) {
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.personalNumber = personalNumber;
        this.image = image;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public String getImage() {
        return image;
    }
}
