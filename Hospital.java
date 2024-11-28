package Hospital.Management.system;


import java.util.ArrayList;
import java.util.List;

class Hospital {
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void listDoctors() {
        System.out.println("\n--- List of Doctors ---");
        for (Doctor doctor : doctors) {
            doctor.displayDetails();
            System.out.println("--------------------");
        }
    }

    public void listPatients() {
        System.out.println("\n--- List of Patients ---");
        for (Patient patient : patients) {
            patient.displayDetails();
            System.out.println("--------------------");
        }
    }

    public void listAppointments() {
        System.out.println("\n--- List of Appointments ---");
        for (Appointment appointment : appointments) {
            appointment.displayAppointment();
            System.out.println("--------------------");
        }
    }
}
