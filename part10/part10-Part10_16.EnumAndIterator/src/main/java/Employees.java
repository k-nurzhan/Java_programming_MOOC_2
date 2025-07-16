
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Employees {
    private List<Person> persons;
    
    public Employees() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.persons.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();
        
        while (iterator.hasNext()) {
            this.persons.add(iterator.next());
        }
    }
    
    public void print() {
        Iterator<Person> iterator = persons.iterator();
        
        while (iterator.hasNext()) {
            Person next = iterator.next();
            System.out.println(next);
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = persons.iterator();
        
        while (iterator.hasNext()) {
            Person next = iterator.next();
            if (next.getEducation()== education) {
                System.out.println(next);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = persons.iterator();
        
        while (iterator.hasNext()) {
            Person next = iterator.next();
            if (next.getEducation()== education) {
                iterator.remove();
            }
        }
    }
}
