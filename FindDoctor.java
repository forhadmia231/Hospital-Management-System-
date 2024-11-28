package Hospital.Management.system;

import java.util.ArrayList;
import java.util.List;

class FindDoctor {
    public Doctor findByName(List<Doctor> doctors, String name) {
        for (Doctor doctor : doctors) {
            if (doctor.getName().equalsIgnoreCase(name)) {
                return doctor;
            }
        }
        return null;
    }

    public List<Doctor> findBySpecialization(List<Doctor> doctors, String specialization) {
        List<Doctor> result = new ArrayList<>();
        for (Doctor doctor : doctors) {
            if (doctor.getSpecialization().equalsIgnoreCase(specialization)) {
                result.add(doctor);
            }
        }
        return result;
    }
}