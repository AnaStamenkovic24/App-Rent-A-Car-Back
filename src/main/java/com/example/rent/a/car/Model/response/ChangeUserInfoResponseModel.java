package com.example.rent.a.car.Model.response;


public class ChangeUserInfoResponseModel {
    private boolean successful;
    private String info;

    public ChangeUserInfoResponseModel(boolean successful, String info) {
        this.successful = successful;
        this.info = info;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public String getInfo() {
        return info;
    }
}
