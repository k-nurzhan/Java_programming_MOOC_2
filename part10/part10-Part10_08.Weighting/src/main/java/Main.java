

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        Item carrot = new Item("carrot", 5);
        Item chease = new Item("chease", 5);
        Suitcase check = new Suitcase (100);
        
        check.addItem(carrot);
        check.addItem(chease);
        check.printItems();
    }

}
