/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author dell 
 */
//defining Patient data values, name, age, priority, GP< & WEATHER THERE FROM A HOSPITAL
public class Patient {
    private String name;
    private int age; 
    private String gp;
    private String priority;
    private String fromHospital;

    public Patient(String name, int age, String gp, String priority, String fromHospital) {
        this.name = name;
        this.age = age;
        this.gp = gp;
        this.priority = priority;
        this.fromHospital = fromHospital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
    
    @Override
    public String toString() {
        return "Name: " +name+
               ", Age: " +age+
               ", GP: " +gp+
               ", Priority: " +priority+
               ", From Hospital: " +fromHospital;
    }
    
    
    
}
