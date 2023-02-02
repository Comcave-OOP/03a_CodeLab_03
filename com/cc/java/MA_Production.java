package com.cc.java;

public class MA_Production extends Mitarbeiter {

    public MA_Production(String name, String firstName, int birthYear, String workID, String role) {
        super(name, firstName, birthYear, workID, role);
        super.department = "Produktion";
    }

    public void doYourWork(){
        System.out.println("In der Produktion bin ich für die Überwachung, Steuerung und Bedienung der Maschinen verantwortlich");
    }
    
}
