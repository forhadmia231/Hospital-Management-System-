package Hospital.Management.system;
class Patient extends Person {
    private String ailment;

    public Patient(String name, int age, String gender, String ailment) {
        super(name, age, gender);
        this.ailment = ailment;
    }

    public String getAilment() {
        return ailment;
    }

    @Override
    public void displayDetails() {
        System.out.println("Patient Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Ailment: " + ailment);
    }
}

