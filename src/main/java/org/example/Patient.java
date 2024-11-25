package org.example;
import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String name;
    private String URLPatient;
    private int age;
    private List <MedInvestigate> exams;

    public Patient(String name, String URLPatient, int age) {
        this.name = name;
        this.URLPatient = URLPatient;
        this.age = age;
        this.exams = new ArrayList<MedInvestigate>();
    }

    public String getName() {
        return name;
    }
    public String getURLPatient() {
        return URLPatient;
    }
    public int getAge() {
        return age;
    }
    public void addExam(MedInvestigate exam) {
        exams.add(exam);
    }
    public List<MedInvestigate> getExams() {
        return exams;
    }
}
