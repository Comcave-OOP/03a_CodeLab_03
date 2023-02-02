package com.cc.java;

public class MA_Accounting extends Mitarbeiter {

    public MA_Accounting(String name, String firstName, int birthYear, String workID, String role) {
        super(name, firstName, birthYear, workID, role);
        super.department = "Buchhaltung";
    }

    public void doYourWork(){
        System.out.println("Als Buchhalter beschäftige ich mich mit den Einnahmen und Ausgaben des Unternehmens");
    }
    
}
