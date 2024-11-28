package Hospital.Management.system;

class Doctor extends Person {
    final String specialization;

    public Doctor(String name, int age, String gender, String specialization) {
        super(name, age, gender);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void displayDetails() {
        System.out.println("Doctor Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Specialization: " + specialization);
    }
}

