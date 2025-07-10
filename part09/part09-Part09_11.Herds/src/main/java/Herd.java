/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coys7
 */

import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable{
    private List<Movable> list;
    
    public Herd() {
        this.list = new ArrayList<>();
    }
    
    public String toString() {
        String answer = "";
        for (Movable m:this.list) {
            answer = answer + m.toString() + "\n";
        }
        return answer;
    }
    
    public void addToHerd(Movable movable) {
        list.add(movable);
    }
    
    public void move(int dx, int dy) {
        for (Movable i:this.list) {
            i.move(dx, dy);
        }
    }
}
