/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author dell 
 */

//NO LONGER NEED AGE VARIABLE AS THE PRIORTY QUEUE WILL BE SORTED BY THE PRIORTY
//DEFINGING PATIENT DATA VARIABLES, name, priority, GP & WEATHER THERE FROM A HOSPITAL
//IMPLEMENTS COMPARABLE TO MAKE THE ORDERING PROCESS EASIER FOR THE PATIENT OBJECTS
//NO NEED TO IMPORT IT AS WERE ONLY DOING ONE CHECK
public class Patient implements Comparable<Patient> {
    private String name;
    private String gp;
    private String priority;
    private String fromHospital;

    //CONSTRUCTOR
    public Patient(String name, String gp, String priority, String fromHospital) {
        this.name = name;
        this.gp = gp;
        this.priority = priority;
        this.fromHospital = fromHospital;
    }

    //GETTERS AND SETTERS FOR THE VARIABLES
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getgp() {
        return gp;
    }

    public void setgp(String GP) {
        this.gp = GP;
    }

    public String getFromHospital() {
        return fromHospital;
    }

    public void setFromHospital(String fromHospital) {
        this.fromHospital = fromHospital;
    }
    
    
    //TOSTRING TO PRINT THE DETAILS UNSORTED IF DESIRED
    @Override
    public String toString() {
        return "Name: " +name+
               ", GP: " +gp+
               ", Priority: " +priority+
               ", From Hospital: " +fromHospital;
    }
    
    @Override
    public int compareTo(Patient other) {
        // Priority order: Urgent > Medium > Low
        return Integer.compare(getPriorityLevel(other.priority), getPriorityLevel(this.priority));
    }
    
    private int getPriorityLevel(String priority) {
        switch(priority) {
            case "Urgent":
                return 3;
            case "Medium":
                return 2;
            case "Low":
                return 1;
            default:
                return 0;
        }
    }
    
    
}
