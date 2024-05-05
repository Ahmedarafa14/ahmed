package org.example;

import java.util.Scanner;

class employee1 extends Human {
    // Additional attributes
    protected double salary;
    protected double startDate;
    protected String position;
    protected String education;



   /* @Override
    public String toString() {
        return "employee1{" +
                "salary=" + salary +
                ", startDate=" + startDate +
                ", position='" + position + '\'' +
                ", education='" + education + '\'' +
                '}';
    }*/
   /* public void display() {
        System.out.println( "employee1{" +
                "salary=" + salary +
                ", startDate=" + startDate +
                ", position='" + position + '\'' +
                ", education='" + education + '\'' +
                '}');
    }
*/

    public employee1() {
        super();
        // Empty constructor
    }

    // Setter methods
    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public void setStartDate(double startDate) {

        this.startDate = startDate;
    }

    public void setPosition(String position) {

        this.position = position;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    // Getter methods
    public double getSalary() {

        return salary;
    }

    public double getStartDate()
    {
        return startDate;
    }

    public String getPosition()
    {
        return position;
    }

    public String getEducation()
    {
        return education;
    }
    public void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        employee1 Employee = new employee1();

        System.out.println("enter the frist name ");
        Employee.setName(scanner.next());

        System.out.println("enter the last name ");
        Employee.setLastName(scanner.next());

        System.out.println("enter the age ");
        Employee.setAge(scanner.nextInt());
        System.out.println("enter the gander");

        Employee.setGender(scanner.next());

        System.out.println("enter the phone number");

        Employee.setPhone(scanner.nextInt());

        System.out.println("enter the address");
        Employee.setAddress(scanner.next());

        System.out.println("enter your Nationality");
        System.out.println();
        Employee.setNationality(scanner.nextLine());
        Employee.setNationality(scanner.nextLine());

        System.out.println("enter the Region");

        Employee.setReligion(scanner.nextLine());
         System.out.println("enter the Position");
          Employee.setPosition(scanner.nextLine());
        System.out.println("enter the Education");
        Employee.setEducation(scanner.nextLine());
        Employee.setSalary(20000);
        System.out.println("if you want to print data enter 1");
        System.out.println("if you want to get out the program 2");


        }


    @Override
    public String toString() {
        return "employee1{" +
                "salary=" + salary +
                ", startDate=" + startDate +
                ", position='" + position + '\'' +
                ", education='" + education + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", Nationality='" + Nationality + '\'' +
                ", religion='" + religion + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


/////////////////////////////////




