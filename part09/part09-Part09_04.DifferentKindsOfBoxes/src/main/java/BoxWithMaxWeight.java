
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coys7
 */
public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        super();
        this.capacity = capacity;
        this.items = new ArrayList<>();
        
    }
    
    @Override
    public void add(Item item) {
        int weight = 0;
        for (Item i:items) {
            weight = i.getWeight() + weight;
        }
        if (weight + item.getWeight()<=this.capacity) {
            weight = weight + item.getWeight();
            items.add(item);
        }
        
    }
    
    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
