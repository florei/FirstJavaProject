import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {

        public double getDouble(){
            Scanner scan = new Scanner(System.in);
            double number = 1.5;
            boolean repeat = true;
            while (repeat){
                try {
                    System.out.println("Please enter a number:");
                    number = scan.nextDouble();
                    repeat = false;
                } catch (InputMismatchException e){
                    System.out.println("The value [" + scan.nextLine()+"] is not a numeric value.\n"+
                            "Please try again!");
                }
            } return number;
        }
    }

