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

public class Abbreviations {
    private HashMap<String, String> abv;
    
    public Abbreviations() {
        this.abv = new HashMap<>();
    }
    
    public void addAbbreviation (String abbreviation, String explanation) {
        abv.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        if (abv.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation) {
        return this.abv.get(abbreviation);
    }
     
}
