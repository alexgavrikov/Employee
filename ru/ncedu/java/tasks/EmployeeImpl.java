package ru.ncedu.java.tasks;

/**
 * Created by user on 08.07.2015.
 */
public class EmployeeImpl implements Employee {
    private String FirstName;
    private String LastName;
    private Employee Manager;
    private Employee TopManager;
    private int salary;
    public EmployeeImpl(){
        FirstName="";
        LastName="";

        salary=1000;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void increaseSalary(int value) {
        salary+=value;
    }

    @Override
    public String getFirstName() {
        return FirstName;
    }

    @Override
    public String getLastName() {
        return LastName;
    }

    @Override
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        LastName = lastName;
    }


    @Override
    public String getFullName() {
        return FirstName+" "+LastName;
    }

    @Override
    public void setManager(Employee manager) {
        Manager = manager;
    }

    @Override
    public String getManagerName() {
        if (Manager==null) return "No manager";
        else return Manager.getFullName();
    }

    @Override
    public Employee getTopManager() {
        if(Manager==null) return this;
        else return Manager.getTopManager();
    }



}
