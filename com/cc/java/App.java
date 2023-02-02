package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        MA_Accounting ma1 = new MA_Accounting("Mütze", "Max", 1990, "1234", "Rechnungen der Kunden");
        MA_Advertising ma2 = new MA_Advertising("Müller", "Jens", 2000, "3242", "Marktanalyse");
        MA_Production ma3 = new MA_Production("Mustermann", "Max", 1995, "6666", "Verpackung");
     
        ausgabe(ma1);
        ma1.doYourWork();

        output("-------------");

        ausgabe(ma2);
        ma2.doYourWork();
        
        output("-------------");

        ausgabe(ma3);
        ma3.doYourWork();
    }

    private static void ausgabe(Mitarbeiter ma){
        output("Ich bin " + ma.getFirstName() + " " + ma.getName() + ", ID: " + ma.workID);
        output("Meine Aufgaben: " + ma.role);
        ma.startsWork();
        ma.hasLunch();
    }


    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

