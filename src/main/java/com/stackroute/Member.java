package com.stackroute;

public class Member {

    Member(String name, int age, float salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    String name;
    int age;
    float salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void displayAll(){

        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Salary: "+this.salary);
    }

}

class MemberVariable{
    public void display(){
        Member member = new Member("Lyanna Stark", 28, 50000);

        member.displayAll();

    }
}
