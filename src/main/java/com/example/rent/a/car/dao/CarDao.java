package com.example.rent.a.car.dao;


import com.example.rent.a.car.Model.CarModel;
import com.example.rent.a.car.Model.SearchCarModel;
import com.example.rent.a.car.Model.request.ChangeCarInfoRequestModel;
import com.example.rent.a.car.Model.response.GetCarResponseModel;
import com.example.rent.a.car.db.DatabaseConnection;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

public interface CarDao {

    Connection conn = DatabaseConnection.getConnection();
    List<GetCarResponseModel> getAllCars();
    List<GetCarResponseModel> searchCars(SearchCarModel searchCarModel, List<GetCarResponseModel> cars);
    List<GetCarResponseModel> getAvailableCars(LocalDate startDate, LocalDate endDate);
    boolean isCarAvailable(LocalDate startDate, LocalDate endDate, String carId);
    GetCarResponseModel getCar(String id);
    void updateCarInfo(String id, ChangeCarInfoRequestModel carInfo);
    void delete(String id);
    void addCar(CarModel car);
    double getPrice(String id);
}

