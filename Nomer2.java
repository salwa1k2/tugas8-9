/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nomer2;

/**
 *
 * @author Acer
 */
public class Nomer2 {

     public static void main(String[] args) {
     Person person = new Person("Faris Fadjar", "Cimahi", "087654289653", "farisfadjar@gmail.com");

        Student student = new Student("Salwa", "Komplek CPI", "089693405566", 
                                     "salwakhairunnisa125@gmail.com", Student.JUNIOR);

        Employee employee = new Employee("Farandika", "Depok", "08783304678", 
                                        "ffarandd@gmail.com", "Room 101", 50000, 
                                        new MyDate(2020, 5, 15));

        Faculty faculty = new Faculty("Dewa Dayana", "Jl. Setiabudi no 19", "089693406622", 
                                     "Dewadayana17@gmail.com", "Gedung A, Ruang 23", 
                                     250000, new MyDate(2018, 8, 10), 
                                     "senin s.d kamis 8-4 WIB", "Dosen");

        Staff staff = new Staff("Fatih", "Lembang", "08653277912", 
                               "fatihunruww@gmai;.com", "admin, ruang 15", 
                               45000, new MyDate(2021, 3, 22), "IT Support Specialist");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

        Person[] people = new Person[5];
        people[0] = person;
        people[1] = student;
        people[2] = employee;
        people[3] = faculty;
        people[4] = staff;
        
        System.out.println("\npolymorphism dengan referensi person: ");
        for (Person p : people) {
            System.out.println(p.toString());
        }
    }
}