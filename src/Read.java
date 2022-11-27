import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {


   //Nu stiu ce gresesc la acest exercitiu. nu ma lasa in clasa Main1 sa l instantiez cu un obiect "read"
  /*    public int getInt(){
        Scanner scan = new Scanner(System.in);
        int number = 0;
        boolean repeat = true;
        while (repeat) {
            try {
                System.out.println("The number is:");
                number=scan.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("The value [" + scan.nextLine() + "] is not a numeric value\n"+
                        "Please try again");

            }
        }
          return number;
    } */




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

