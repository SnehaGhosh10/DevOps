package org.example.Entity;

public class User {

    private int id;
    private String name;
    private String email;
    private Employee employee;

    // No-args constructor
    public User() {
    }

    // All-args constructor
    public User(int id, String name, String email, Employee employee) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.employee = employee;
    }

    // Getter and Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    // toString()

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + ", employee=" + employee + "]";
    }
}
