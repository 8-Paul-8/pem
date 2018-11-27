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
public class Manager extends Employee{
    private static double bonus;

    public Manager(double bonus, double salary, String first, String last, int birthyear) {
        super(salary, first, last, birthyear);
        this.bonus = Math.abs(setBonus(bonus*salary));
    }

    public double getBonus() {
        return bonus;
    }

    public double setBonus(double bonus) {
        if(bonus<0){
            System.out.println("Wrong input");
        }        
        this.bonus = bonus;
        return this.bonus;
    }

    @Override
    public String toString() {
        return "Manager{" + '}';
    }
    
    
    
}
