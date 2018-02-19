package com.example.java;

class Employee{
        //declaring 3 variables needed for class (name,number, and shift)
    private String fullname;
    private String phonenumber;
    private int shift;

    //making a constructor method (using build in template)
    public Employee(String fullname, String phonenumber, int shift) {
        this.fullname = fullname;
        this.phonenumber = phonenumber;
        this.shift = shift;
    }
    // making getter statements for each of the three variables:

    public String getFullname() {
        return fullname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public int getShift() {
        return shift;
    }
    // making setter statements for each of the three variables:


    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }
    //defining a method to print the information, formatted into a user friendly template.





    public void printInfo(){
        System.out.print("Name: " + fullname + "\n" + "" + "Number: " + phonenumber + "\n" +
        "" + "Shift: " + shift + "\n\n\n" );
    }
}

public class Main {

    public static void main(String[] args) {

        Employee Alec = new Employee("Alec Diraimondo", "847-554-3743",3);
        Employee George = new Employee("Georgie Romero", "545-221-7890", 2);
        Employee Kurt = new Employee("Kurt Green", "800-243-5678",1);

        Alec.printInfo();
        George.printInfo();
        Kurt.printInfo();
    }
}
