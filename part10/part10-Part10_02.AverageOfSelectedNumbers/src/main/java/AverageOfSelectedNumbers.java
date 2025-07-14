
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> inputs = new ArrayList<>();
        int check = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(input);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("n")) {
                check = 1;
            }
            break; 
        }
        if(check == 1) {
            long negative = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number<0)
                .count();
            double average = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter (number -> number<0)
                    .average()
                    .getAsDouble();
            System.out.println(average);
        } else {
            long positive = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number<0)
                .count();
            double average = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter (number -> number>0)
                    .average()
                    .getAsDouble();
            System.out.println(average);
        }
        
    }
}
