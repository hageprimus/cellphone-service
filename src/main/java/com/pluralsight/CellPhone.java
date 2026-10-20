package com.pluralsight;

public class CellPhone {
    private long serialNumber;
    private String modelType;
    private String serviceCarrier;
    private String phoneNumber;
    private String ownerName;

    public CellPhone() {
        serialNumber = 100000000L;
        modelType = "";
        serviceCarrier = "";
        phoneNumber = "";
        ownerName = "";
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getServiceCarrier() {
        return serviceCarrier;
    }

    public void setServiceCarrier(String serviceCarrier) {
        this.serviceCarrier = serviceCarrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
