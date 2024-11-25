package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Daphne Von Oram", "https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg",62);

        BP bp1 = new BP(130,70, LocalDate.of(2023,9,14),"ST");
        MRI mri1 = new MRI("https://martinh.netfirms.com/BIOE60010/mri1.jpg", LocalDate.of(2023,9,14), 2);

        patient1.addExam(mri1);
        patient1.addExam(bp1);

        AdminView adminView = new AdminView();
        adminView.displayAdminView(patient1);

        List<Patient> patients = new ArrayList<>();
        patients.add(patient1);
        DoctorView doctorView = new DoctorView();
        doctorView.displayDoctorView(patients);


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.}
    }
}