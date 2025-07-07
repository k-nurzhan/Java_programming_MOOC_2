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

public class OneItemBox extends Box{
    
    private ArrayList<Item> items;
    
    public OneItemBox() {
        super();
        this.items = new ArrayList<>();
    }
    
        @Override
    public void add(Item item) {
        if (items.isEmpty()) {
            items.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
    
}
