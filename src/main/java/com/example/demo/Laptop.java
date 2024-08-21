package com.example.demo;

public class Laptop implements Computer {
 public Laptop(){
    System.out.println("Laptop object created with the id"+this.hashCode() );
 }
 @Override
public void compile(){
    System.out.println("Laptop compiling codes");
 }
}
