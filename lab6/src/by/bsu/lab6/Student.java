package by.bsu.lab6;

import java.util.Scanner;

abstract class Student implements Abit {

    private String name;
    private String surname;
    private String faculty;

    public Student(String name, String surname, String faculty) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
    }
    public Student () {}

    public void setName(){
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
    }

    public void setSurname(){
        Scanner sc = new Scanner(System.in);
        surname = sc.nextLine();
    }

    public void setFaculty(){
        Scanner sc = new Scanner(System.in);
        faculty = sc.nextLine();
    }

    @Override
    public String getName(){
        System.out.print(name);
        return name;
    }

    @Override
    public String getSurname(){
        System.out.println(surname);
        return surname;
    }

    @Override
    public String getFaculty() {
        System.out.println(faculty);
        return faculty;
    }

    public boolean Eextramural(){
        return false;
    }
}
