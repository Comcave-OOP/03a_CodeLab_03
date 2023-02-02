package com.cc.java;

public class MA_Advertising extends Mitarbeiter {

    public MA_Advertising(String name, String firstName, int birthYear, String workID, String role) {
        super(name, firstName, birthYear, workID, role);
        super.department = "Werbung";
    }

    public void doYourWork(){
        System.out.println("Im Marketing befriedige ich die Bedürfnisse der (möglichen) Kunden");
    }
    
}
