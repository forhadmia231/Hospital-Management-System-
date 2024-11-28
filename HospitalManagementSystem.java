package Hospital.Management.system;


import java.util.List;
import java.util.Scanner;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();
        FindDoctor findDoctor = new FindDoctor();

        while (true) {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1. Add Doctor");
            System.out.println("2. Add Patient");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. List Doctors");
            System.out.println("5. Find Doctor by Name");
            System.out.println("6. Find Doctors by Specialization");
            System.out.println("7. List Patients");
            System.out.println("8. List Appointments");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Doctor Name: ");
                    String doctorName = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int doctorAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Gender: ");
                    String doctorGender = scanner.nextLine();
                    System.out.print("Enter Specialization: ");
                    String specialization = scanner.nextLine();
                    Doctor doctor = new Doctor(doctorName, doctorAge, doctorGender, specialization);
                    hospital.addDoctor(doctor);
                    System.out.println("Doctor added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Patient Name: ");
                    String patientName = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int patientAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Gender: ");
                    String patientGender = scanner.nextLine();
                    System.out.print("Enter Ailment: ");
                    String ailment = scanner.nextLine();
                    Patient patient = new Patient(patientName, patientAge, patientGender, ailment);
                    hospital.addPatient(patient);
                    System.out.println("Patient added successfully!");
                    break;

                case 3:
                    System.out.print("Enter Doctors Name: ");
                    String doctorForAppointment = scanner.nextLine();
                    Doctor foundDoctor = findDoctor.findByName(hospital.getDoctors(), doctorForAppointment);
                    if (foundDoctor == null) {
                        System.out.println("Doctor not found!");
                        break;
                    }
                    System.out.print("Enter Patient Name: ");
                    String patientForAppointment = scanner.nextLine();
                    Patient foundPatient = null;
                    for (Patient p : hospital.getPatients()) {
                        if (p.getName().equalsIgnoreCase(patientForAppointment)) {
                            foundPatient = p;
                            break;
                        }
                    }
                    if (foundPatient == null) {
                        System.out.println("Patient not found!");
                        break;
                    }
                    System.out.print("Enter Appointment Date ( 2024-11-28): ");
                    String date = scanner.nextLine();
                    Appointment appointment = new Appointment(foundDoctor, foundPatient, date);
                    hospital.scheduleAppointment(appointment);
                    System.out.println("Appointment scheduled successfully!");
                    break;

                case 4:
                    hospital.listDoctors();
                    break;

                case 5:
                    System.out.print("Enter Doctor Name: ");
                    String name = scanner.nextLine();
                    Doctor doctorByName = findDoctor.findByName(hospital.getDoctors(), name);
                    if (doctorByName == null) {
                        System.out.println("Doctor not found!");
                    } else {
                        doctorByName.displayDetails();
                    }
                    break;

                case 6:
                    System.out.print("Enter Specialization: ");
                    String specializationToFind = scanner.nextLine();
                    List<Doctor> doctorsBySpecialization = findDoctor.findBySpecialization(hospital.getDoctors(), specializationToFind);
                    if (doctorsBySpecialization.isEmpty()) {
                        System.out.println("No doctors found with specialization: " + specializationToFind);
                    } else {
                        for (Doctor doc : doctorsBySpecialization) {
                            doc.displayDetails();
                            System.out.println("--------------------");
                        }
                    }
                    break;

                case 7:
                    hospital.listPatients();
                    break;

                case 8:
                    hospital.listAppointments();
                    break;

                case 9:
                    System.out.println("Exiting Hospital Management System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
