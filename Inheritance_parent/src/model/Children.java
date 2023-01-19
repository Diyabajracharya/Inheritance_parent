package model;

import java.util.ArrayList;

public class Children extends Parent{

    public Children(String name, int grade, int age, ArrayList<Hobby> hobbies) {
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(String grades) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobby(ArrayList<Hobby> hobby) {
        this.hobbies = hobbies;
    }

    String name;
    int grade;
    int age;
    ArrayList<Hobby> hobbies;


    public String getFullName() {
        String fullName = "My full name is " + this.name + " "  + this.family_name;
        return fullName;
    }

    public void getHobby() {
        ArrayList<Hobby> hobby = this.hobbies;
        for (Hobby singleHobby: hobbies) {
            System.out.println("My hobby is "+ singleHobby.getName());
        }

        System.out.println("I live in " + this.address);
    }
}
