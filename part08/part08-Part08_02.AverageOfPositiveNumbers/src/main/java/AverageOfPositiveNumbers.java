
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input==0) {
                break;
            }
            
            if (input>0) {
                sum = sum + input;
                count ++;
            }
        }
        double avg =(double)sum/count;
        if (count==0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(avg); 
        }
        
    }
}
