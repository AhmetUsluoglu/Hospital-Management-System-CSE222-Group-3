package users;

import java.util.ArrayList;

import departments.Department;
import system.Appointment;
import system.HMSystem;
import system.Prescription;
import tests.Test;

public class Patient extends User
{
    private ArrayList<Test> tests = new ArrayList<>();
    private ArrayList<Appointment> appointments = new ArrayList<>();
    private ArrayList<Prescription> prescriptions = new ArrayList<>();
    private boolean discharged = false;

	public Patient(String name, String surname, String id, int age) {
        super(name, surname, id, age);
    }
    /*DISCHARGED*/ 
    public boolean isDischarged() {
        return discharged;
    }

    public void setDischarged(boolean discharged) {
        this.discharged = discharged;
    }

    /* TEST */
	public ArrayList<Test> getTests() {
        return tests;
    }

    public void setTests(ArrayList<Test> tests) {
        this.tests = tests;
    }

    public void addTest(Test test){
        if(test == null)
            throw new NullPointerException();

        tests.add(test);
    }

    /* APPOINTMENT */
	public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    public void addAppointment(Appointment app){
        if(app == null)
            throw new NullPointerException();
        appointments.add(app);
    }

    /* PRESCRIPTION */
    public ArrayList<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(ArrayList<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public void addPrescription(Prescription pres){
        if(pres == null)
            throw new NullPointerException();
        prescriptions.add(pres);
    }

    /* DISPLAYS */
	public String displayRecords(){
		StringBuilder strB = new StringBuilder();
    	for(int i = 0 ; i < appointments.size() ; i++){
            strB.append(appointments.get(i)).append("\n");
        }
        return strB.toString();
	}

	public String displayPrescriptions(){
		StringBuilder strB = new StringBuilder();
    	for(int i = 0 ; i < prescriptions.size() ; i++){
            strB.append(prescriptions.get(i)).append("\n");
        }
        return strB.toString();
	}

    
	public ArrayList<Doctor> displayDoctors(){
		ArrayList<Doctor> list = new ArrayList<>();
    	for(int i = 0 ; i < HMSystem.workers.size() ; i++){
            if(HMSystem.workers.get(i) instanceof Doctor)
                list.add((Doctor)HMSystem.workers.get(i));
        }
        return list;
	}

	@Override
    public int compareTo(User other) {
    	return super.compareTo(other);
    }

	@Override
    public String toString() {
        return super.toString();
    }
}
