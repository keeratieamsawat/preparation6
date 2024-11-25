package org.example;

import java.time.LocalDate;

public class MRI extends MedInvestigate {
    private String URL;
    private LocalDate date;
    private int MagField;

    public MRI(String URL, LocalDate date, int MagField) {
        this.URL = URL;
        this.date = date;
        this.MagField = MagField;
    }
    public String getURL() {
        return URL;
    }
    public String getDate() {
        return date.toString();
    }
    public int getMagField() {
        return MagField;
    }
}
