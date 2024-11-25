package org.example;

public class AdminView {
    public void displayAdminView(Patient patient){
        System.out.println("Patient: " + patient.getName() + ": ");
        for (MedInvestigate exam: patient.getExams()) {
            if (exam instanceof MRI){
                MRI mri = (MRI) exam;
                System.out.println(" MRI: " + mri.getMagField() + " Tesla" + "," + mri.getDate() + ":");
            }
            else if (exam instanceof BP){
                BP bp = (BP) exam;
                System.out.println(" BP: " + bp.getMeasurement() + "," + bp.getDate());
            }
        }

    }
}
