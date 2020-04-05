package com.louay.projects.model.constants;

public enum UserGender {
    MALE("male"), FEMALE("female");

    private String gender;

    UserGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
