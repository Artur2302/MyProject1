package Inheritance;

public class Person {
    private String name;
    private int age;
    private String gender;

    public void setName(String name){
        this.name = name;
    }

    public Person(){
        System.out.println("In Person Default Constructor");
    }

    public Person(String name){
        System.out.println("In person 2nd constructor. Name is set");
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

}
