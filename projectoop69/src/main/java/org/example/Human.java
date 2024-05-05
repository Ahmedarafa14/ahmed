package org.example;

import java.util.Scanner;

public class Human extends User {


    private static String lastName;
    protected String   gender , address , Nationality , religion ;
        protected int age;
        protected double phone;

        public Human(int id,String Name, String lastName, String gender, String address, String Nationality ,String religion, int age, double phone) {
            super(id,Name);
            this.lastName = lastName;
            this.gender = gender;
            this.address = address;
            this.Nationality = Nationality;
            this.religion = religion;
            this.age = age;
            this.phone = phone;
        }

    public Human() {
        super();
    }


    public static String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getNationality() {
            return Nationality;
        }

        public void setNationality(String Nationality) {
            this.Nationality = Nationality;
        }

        public String getReligion() {
            return religion;
        }

        public void setReligion(String religion) {
            this.religion = religion;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getPhone() {
            return phone;
        }

        public void setPhone(double phone) {
            this.phone = phone;
        }


    /**
     * @return
     */
    @Override
    public String toString() {
        return "Human{" +
                "gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", nationality='" + Nationality + '\'' +
                ", religion='" + religion + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", id=" + id +
                '}';
    }
}






