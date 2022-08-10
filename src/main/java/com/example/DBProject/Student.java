package com.example.DBProject;

public class Student {
    private String FirstName;
    private String Lastname;

    public Student(String firstName, String lastname) {
        FirstName = firstName;
        Lastname = lastname;
    }



    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "FirstName='" + FirstName + '\'' +
                ", Lastname='" + Lastname + '\'' +
                '}';
    }
}
