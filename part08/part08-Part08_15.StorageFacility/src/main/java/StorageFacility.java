/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coys7
 */
import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit,new ArrayList<>());
        ArrayList<String> items = this.storage.get(unit);
        items.add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> emptyList = new ArrayList<>();
        return this.storage.getOrDefault(storageUnit, emptyList);
    }
    
    public void remove(String storageUnit, String item) {
        this.storage.get(storageUnit).remove(item);
        if (this.storage.get(storageUnit).isEmpty()) {
            this.storage.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String i:this.storage.keySet()) {
            units.add(i);
        }
        return units;
    }
}
