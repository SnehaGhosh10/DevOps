package org.example.Entity;

public class PojoClass {

    private Employee employee;
    private User user;

    // No-args constructor
    public PojoClass() {
    }

    // All-args constructor
    public PojoClass(Employee employee, User user) {
        this.employee = employee;
        this.user = user;
    }

    // Getter and Setter

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // toString()

    @Override
    public String toString() {
        return "PojoClass [employee=" + employee + ", user=" + user + "]";
    }
}
