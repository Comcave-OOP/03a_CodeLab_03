package com.cc.java;

public class Mitarbeiter {
    private String name;
    private String firstName;
    private int birthYear;
    public String workID;
    public String department;
    public String role;

    
    public Mitarbeiter(String name, String firstName, int birthYear, String workID, String role) {
        this.name = name;
        this.firstName = firstName;
        this.birthYear = birthYear;
        this.workID = workID;
        this.role = role;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public int getBirthYear() {
        return birthYear;
    }


    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void hasLunch(){
        System.out.println("Mittagspause ist von 12-13 Uhr!");
    }

    public void startsWork(){
        System.out.println("Die Arbeit beginnt um 8 Uhr");
    }
    
}
