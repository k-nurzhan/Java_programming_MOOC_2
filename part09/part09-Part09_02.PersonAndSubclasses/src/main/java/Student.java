/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coys7
 */
public class Student extends Person{
    private Integer credits;
    
    public Student(String name, String address) {
        super(name, address);
        this.credits=0;
    }
    
    public int credits() {
        return this.credits;
    }
    
    public void study() {
        this.credits++;
    }
    
    public String toString() {
        return super.toString() + "\n  Study credits " + credits();
    }
}
