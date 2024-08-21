package com.example.demo;

public class Desktop implements Computer {
  public Desktop() {
    System.out.println("Desktop object created with the id" + this.hashCode());
  }

  @Override
  public void compile() {
    System.out.println("Desktop compiling codes");
  }
}
