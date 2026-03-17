package Exp3;
import java.lang.String;



class Person {
 protected String name;
 protected int age;

 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public void display() {
     System.out.println("Name: " + name + ", Age: " + age);
 }
}


class Employee extends Person {
 protected double baseSalary;

 public Employee(String name, int age, double baseSalary) {
     super(name, age);
     this.baseSalary = baseSalary;
 }

 
 public double calculateSalary() {
     return baseSalary;
 }

 
 public void update(String name) {
     this.name = name;
 }

 public void update(int age) {
     this.age = age;
 }

 public void update(double baseSalary) {
     this.baseSalary = baseSalary;
 }

 public void update(String name, int age, double baseSalary) {
     this.name = name;
     this.age = age;
     this.baseSalary = baseSalary;
 }
}


class Manager extends Employee {
 private double bonus;

 public Manager(String name, int age, double baseSalary, double bonus) {
     super(name, age, baseSalary);
     this.bonus = bonus;
 }

 
 @Override
 public double calculateSalary() {
     return baseSalary + bonus;
 }

 
 public void update(double baseSalary, double bonus) {
     this.baseSalary = baseSalary;
     this.bonus = bonus;
 }
}


public class OverridingOverloading {
 public static void main(String[] args) {
     Employee emp = new Employee("Nujhat", 22, 30000);
     Manager mgr = new Manager("Bob", 40, 50000, 15000);

     emp.display();
     System.out.println("Employee Salary: " + emp.calculateSalary());

     mgr.display();
     System.out.println("Manager Salary: " + mgr.calculateSalary());

     
     emp.update("Nujhat Smith");
     emp.update(26);
     emp.update(32000);

     mgr.update(55000, 20000);

     System.out.println("\nAfter Updates:");
     emp.display();
     System.out.println("Employee Salary: " + emp.calculateSalary());

     mgr.display();
     System.out.println("Manager Salary: " + mgr.calculateSalary());
 }
}