/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coys7
 */

import java.util.ArrayList;

public class Box implements Packable{
    private double maxWeight;
    private ArrayList<Packable> items;
    
    
    public Box(double maximimCapacity) {
        this.maxWeight = maximimCapacity;
        this.items = new ArrayList<>();
    }
    
    public double weight() {
        double weight = 0;
        for (Packable i:items) {
            weight = weight + i.weight();
        }
        return weight;
    }
    
    public void add(Packable item) {
        if (item.weight() + weight() < this.maxWeight) {
            this.items.add(item);
        }
    }
    
    public String toString () {
        return "Box: " + this.items.size() + " items, total weight " + weight() + " kg";
    }
}
