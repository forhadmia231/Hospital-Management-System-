# Hospital Management System

## Overview
The **Hospital Management System** is a Java-based console application designed to streamline the management of hospital operations. It allows efficient handling of doctors, patients, and appointments, ensuring smooth hospital workflow and record-keeping.

This project demonstrates the use of Object-Oriented Programming concepts such as **inheritance**, **abstraction**, and **composition** in Java.

---

## Features

1. **Doctor Management**
   - Add new doctors with details such as name, age, gender, and specialization.
   - View a list of all doctors.
   - Search for doctors by name or specialization.

2. **Patient Management**
   - Add new patients with details including name, age, gender, and ailment.
   - View a list of all patients.

3. **Appointment Scheduling**
   - Schedule appointments between patients and doctors.
   - View all scheduled appointments with complete details.

4. **Interactive Menu**
   - Console-based menu for easy navigation and operations.
   - Continuous menu loop until the user chooses to exit.

---

## Project Structure

- **HospitalManagementSystem.java**
  - Main class containing the menu-driven interface and program flow.

- **Hospital.java**
  - Manages collections of doctors, patients, and appointments.
  - Methods to add, list, and manage hospital entities.

- **Doctor.java**
  - Represents a doctor, inheriting from `Person`.
  - Stores specialization and personal details.

- **Patient.java**
  - Represents a patient, inheriting from `Person`.
  - Stores ailment and personal details.

- **Appointment.java**
  - Represents an appointment linking a doctor, a patient, and the appointment date.

- **Person.java**
  - Abstract class defining common properties for doctors and patients.

- **FindDoctor.java**
  - Utility class to search for doctors by name or specialization.

---

## Technologies Used

- **Programming Language:** Java
- **Development Environment:** Any Java IDE (Eclipse, IntelliJ IDEA, NetBeans)
- **Java Version:** Java 8 or above

---

## How to Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/forhadmia231/Hospital-Management-System.git
   cd Hospital-Management-System
