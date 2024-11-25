package org.example;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class DoctorView extends JFrame {

    public void displayDoctorView(List<Patient> patients) {
        JFrame frame = new JFrame("Doctor View");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(patients.size(), 1));
        frame.setSize(800, 600);

        for (Patient p : patients) {
            frame.add(PatientInfo(p));
        }
    frame.setVisible(true);
    }

    public JLabel getImageIcon(String path) {
        JLabel label = new JLabel();
        URL imageURL = null;
        try {
            imageURL = new URL(path);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon = new ImageIcon(imageURL);
        label.setIcon(thisImageIcon);
        return label;
    }

    public JPanel PatientInfo(Patient patient) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 4));

        // first column
        JLabel label = getImageIcon(patient.getURLPatient());
        panel.add(label);

        // second column
        JLabel textLabel = new JLabel("<html> Name : " + patient.getName() + "<br> Age :" + patient.getAge() + "</html>");
        panel.add(textLabel);

        // third column
        for (MedInvestigate exam : patient.getExams()) {
            if (exam instanceof MRI) {
                MRI mri = (MRI) exam;
                JLabel mriImg = getImageIcon(mri.getURL());
                panel.add(mriImg);
                break;
            }
        }

        // fourth column

        for (MedInvestigate exam : patient.getExams()) {
            if (exam instanceof BP) {
                BP bp = (BP) exam;
                JLabel BpInfo = new JLabel("<html> Blood pressure <br>" + bp.getSystolic() + "over" + bp.getDiastolic());
                panel.add(BpInfo);
            }
        }
        return panel;
    }
}




