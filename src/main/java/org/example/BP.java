package org.example;

import java.time.LocalDate;

public class BP extends MedInvestigate {

    private int systolic;
    private int diastolic;
    private LocalDate date;
    private String measurement;

    public BP(int systolic, int diastolic, LocalDate date, String measurement) {
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.date = date;
        this.measurement = measurement;
    }

    public int getSystolic() {
        return systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public String getDate() {
        return date.toString();
    }

    public String datetoString() {
        return date.toString();
    }

    public String getMeasurement() {
        return measurement;
    }
}
