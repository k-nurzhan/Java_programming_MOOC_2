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
public class VehicleRegistry {
    private HashMap<LicensePlate, String> hashmap;
    
    public VehicleRegistry() {
        this.hashmap = new HashMap<>();
    }
    
    public boolean add(LicensePlate liPlate, String owner) {
        for (LicensePlate e : hashmap.keySet()) {
            if (e.equals(liPlate)) {
                return false;

            }

        }
        hashmap.put(liPlate, owner);

        return true;
    }
    
    public String get(LicensePlate liPlate) {
        if (this.hashmap.containsKey(liPlate)) {
            return this.hashmap.get(liPlate);
        }
        return null;
    }
    
    public boolean remove(LicensePlate liPlate) {
        if (this.hashmap.containsKey(liPlate)) {
            this.hashmap.remove(liPlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate e : hashmap.keySet()) {
            System.out.println(e);
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String i:hashmap.values()) {
            if (!owners.contains(i)) {
                owners.add(i);
                System.out.println(i);
            }
        }
     }
}

