/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author dell
 */
//defining Patient data values, name, priority, GP< & WEATHER THERE FROM A HOSPITAL
public class Patient {
    private String name;
    private String priority;
    private String GP;
    private String fromHospital;

    public Patient(String name, String priority, String GP, String fromHospital) {
        this.name = name;
        this.priority = priority;
        this.GP = GP;
        this.fromHospital = fromHospital;
    }

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

    public String getGP() {
        return GP;
    }

    public void setGP(String GP) {
        this.GP = GP;
    }

    public String getFromHospital() {
        return fromHospital;
    }

    public void setFromHospital(String fromHospital) {
        this.fromHospital = fromHospital;
    }
    
    
    
}
