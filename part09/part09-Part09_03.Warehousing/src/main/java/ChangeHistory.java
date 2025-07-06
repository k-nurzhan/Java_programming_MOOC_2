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

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }
    
    public String toString() {
        return this.history.toString();
    }
    
    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double max = 0;
        for (double i:this.history)
            if(i>max) {
                max = i;
            }
        return max;
    }
    
    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double min = this.history.get(0);
        for (double i:this.history)
            if(i<min) {
                min = i;
            }
        return min;
    }
    
    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double sum = 0.0;
        double count = 0.0;
        for (double i:this.history) {
            sum = sum + i;
            count = count + 1.0;
        } 
        return sum/count;
    }
}
