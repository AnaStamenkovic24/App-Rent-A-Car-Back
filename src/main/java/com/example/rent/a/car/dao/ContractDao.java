package com.example.rent.a.car.dao;


import com.example.rent.a.car.Model.request.SignedContractRequestModel;
import com.example.rent.a.car.Model.response.ContractResponseModel;
import com.example.rent.a.car.db.DatabaseConnection;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;


public interface ContractDao {

    Connection conn = DatabaseConnection.getConnection();
    List<LocalDate> getCarOccupiedDates(String carId);
    List<ContractResponseModel> getAllContracts();
    List<ContractResponseModel> getAllPendingContracts();
    List<ContractResponseModel> getContractHistory (String userId);
    void deleteContract (String contractId);
    void updateContractApproval (String contractId, boolean approval);
    boolean userHasPendingContract (String userId);
    void addContractToDatabase(SignedContractRequestModel contract);

}
