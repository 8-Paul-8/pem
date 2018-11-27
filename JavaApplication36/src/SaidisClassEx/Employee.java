/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SaidisClassEx;

/**
 *
 * @author PAVLOS # FINOFFICER
 */
public class Employee extends Person{
    private double salary;

    public Employee(double salary, String first, String last, int birthyear) {
        super(first, last, birthyear);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "salary=" + salary + '}';
    }
   
    
    
    
}
