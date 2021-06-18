package com.predic8.scooter.model;

import java.time.LocalDateTime;

public class RueckgabeDTO {

    String fahrtId;
    String scooterId;
    String userId;
    LocalDateTime rueckgabe;

    public RueckgabeDTO() {
        this.rueckgabe = LocalDateTime.now();
    }

    public RueckgabeDTO(String scooterId, Rueckgabe rueckgabe){
        this();
        this.fahrtId = rueckgabe.getFahrtId();
        this.userId = rueckgabe.getUserId();
        this.scooterId = scooterId;
    }

    public String getScooterId() {
        return scooterId;
    }

    public void setScooterId(String scooterId) {
        this.scooterId = scooterId;
    }

    public LocalDateTime getRueckgabe() {
        return rueckgabe;
    }

    public void setRueckgabe(LocalDateTime rueckgabe) {
        this.rueckgabe = rueckgabe;
    }

    public String getFahrtId() {
        return fahrtId;
    }

    public void setFahrtId(String fahrtId) {
        this.fahrtId = fahrtId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
