package Hospital.Management.system;

public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private String date;

    public Appointment(Doctor doctor, Patient patient, String date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    public void displayAppointment() {
        System.out.println("\n--- Appointment Details ---");
        System.out.println("Date: " + date);
        System.out.println("Doctor: " + doctor.getName() + " (Specialization: " + doctor.getSpecialization() + ")");
        System.out.println("Patient: " + patient.getName() + " (Ailment: " + patient.getAilment() + ")");
    }
}