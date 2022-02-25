package com.example.rent.a.car.dao;


import com.example.rent.a.car.Model.AdminUpdateUserModel;
import com.example.rent.a.car.Model.RegisterUserModel;
import com.example.rent.a.car.Model.UpdateUserModel;
import com.example.rent.a.car.Model.response.GetUserResponseModel;
import com.example.rent.a.car.db.DatabaseConnection;

import java.sql.Connection;
import java.util.List;
import java.util.UUID;

public interface UserDao {

    Connection conn = DatabaseConnection.getConnection();
    boolean userNameExists (String username);
    boolean emailExists (String email);
    String getPasswordWithIdentification (String identification);
    String getPasswordWithId (UUID id);
    GetUserResponseModel getUser (String id);
    boolean isAdmin (String id);
    List<GetUserResponseModel> getAllUsers();
    void registerUser (RegisterUserModel user);
    void updateUser (UpdateUserModel user, UUID id);
    void adminUpdateUserInfo (AdminUpdateUserModel user, String id);
}