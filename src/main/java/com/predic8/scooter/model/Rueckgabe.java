package com.predic8.scooter.model;

public class Rueckgabe {

    String userId;
    String fahrtId;

    public Rueckgabe() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFahrtId() {
        return fahrtId;
    }

    public void setFahrtId(String fahrtId) {
        this.fahrtId = fahrtId;
    }
}
