package com.example.rent.a.car.Model.request;

public class ContractApprovalRequestModel {
    private boolean approved;
    public ContractApprovalRequestModel(boolean approved) {
        this.approved = approved;
    }
    public boolean isApproved() {
        return approved;
    }
}