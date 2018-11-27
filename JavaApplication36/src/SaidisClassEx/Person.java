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
public class Person{
    private String first;
    private String last;
    private int birthyear;

    public Person(String first, String last, int birthyear) {
        this.first = first;
        this.last = last;
        this.birthyear = birthyear;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    @Override
    public String toString() {
        return "Person{" + "first=" + first + ", last=" + last + ", birthyear=" + birthyear + '}';
    }

    
    
  
    
 
    
}
