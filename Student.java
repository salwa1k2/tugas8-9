/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nomer2;

/**
 *
 * @author Acer
 */
public class Student extends Person {
    public static final int FRESHMAN = 1;
    public static final int JUNIOR = 2;
    public static final int SENIOR = 3;
    
    private int status;
    
    public Student(String name, String address, String phoneNumber, String email, int status) {
        super(name, address, phoneNumber, email); 
        this.status = status;
    }
    @Override
    public String toString() {
        return "Student: " + super.name; 
    }
}
