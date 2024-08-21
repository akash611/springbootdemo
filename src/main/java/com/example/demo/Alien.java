package com.example.demo;

public class Alien {
    private int age;
    private Computer com;
 
    public Alien() {
        System.out.println("Object created");
    }

    public Alien(int age, Computer com) {
        this.age = age;
        this.com = com;
        System.out.println("Parameterised constructor created for Alien with Id: "+this.hashCode());
    }

    public void code(){
        System.out.println("Coding");
        com.compile();
    
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }
    
  

}
