import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       /* printMyname();

        System.out.println("Exercitii Laborator 9");

        Calculator operatii = new Calculator();

       //adunare 100+300
        float f1 = 100;
        float s1 = 300;
float adun = operatii.adunare(f1,s1);
        System.out.println("Exercitiu 2:");
        System.out.println(adun);

      // impartire 10/8
        float f2 = 10;
        float s2 = 8;

        float imp = operatii.impartire(f2,s2);
        System.out.println("Exercitiu 3:");
        System.out.println(imp);

        // a = -5+ (8*6)
        float f3=-5;
        float s3=8;
        int t3=6;

        float a = operatii.adunare(f3, operatii.inmultire(s3,t3));
        System.out.println("Exercitiu a:");
        System.out.println(a);

        // b = (55+9)%9
        float f4 = 55;
        float s4 = 9;
        float t4 = 9;

        float sum = operatii.adunare(f4, s4);
        float b = operatii.modul(sum,t4);
        System.out.println("Exercitiu b:");
        System.out.println(b);

        // c= 20+ (-3*5)/8

        float c = operatii.adunare(20, operatii.impartire(operatii.inmultire(-3,5),8 ));
        System.out.println ("Exercitiu c:");
        System.out.println(c);

        // d = 5 + 15 / 3 * 2 - 8 % 3

        float adunare = operatii.adunare(5, operatii.inmultire(operatii.impartire(15,3),2 ));
        float d = operatii.scadere(adunare, operatii.modul(8,3));
        System.out.println("Exercitiu d:");
        System.out.println(d);



        System.out.println("Exercitii Laborator 10");

        System.out.println("Exercitiul 2");

        System.out.println("Rezultatul adunarii este:" + operatii.sumaDouaNumere(5,6));
        System.out.println("Rezultatul scaderii este:" + operatii.diferentaDouaNumere(6,10));
        System.out.println("Rezultatul inmultirii este:" + operatii.inmultireDouaNumere(6,20));
        System.out.println("Rezultatul impartirii este:" + operatii.impartireDouaNumere(305, 105f));

        System.out.println("Exercitiul 3"); //nu stiu sa aliniez desenul ca in imagine

               System.out.println  ( "J     a  v      v   a\n" +
                                     "J    a a  v    v   a a\n" +
                                 "J   J   aaaaa   v v   aaaaa\n" +
                                  "JJ   a      a   v  a      a");
        System.out.println("Exercitiul 4");
        System.out.println("Media este:" + operatii.media (5,8,10));

        System.out.println("Exercitiul 6");
        System.out.println("Restul impartirii a doua numere:" + operatii.restul(25.0, 12));
        System.out.println("Exercitiul 7");
        System.out.println("Temperatura in Celsius este:" + operatii.F_C(212));
        System.out.println("Exercitiul 8");
        System.out.println("Distanta din Inch in Metrii este:" + operatii.InchtoMeter (300));
        System.out.println("Exercitiul 9");
        System.out.println("Viteza in m/s este:" + operatii.DistMetri(25000) / operatii.TimpSecunde(2, 45, 6));
        System.out.println("Viteza in km/h este:" + operatii.DistKilometrii(25000) / (operatii.TimpSecunde(2, 45, 6)/3600));
        System.out.println("Viteza in mila/h este:" + operatii.DistMile(25000) / (operatii.TimpSecunde(2, 45, 6)/3600));

    }

  public static void printMyname() {
    System.out.println("Hello\nFlorentina");
  }*/
       /* // Laborator 11 exercitiu 3
        LogicalOp op = new LogicalOp();
        int biggest = op.checkBiggerNumber(6, 10);
        System.out.println("The bigger number is:" + biggest);

        // Laborator 11 exercitiu 4
        String first = "FastTrackIT";
        String second = "FastTrackIT";
        System.out.println(op.comparison(first));

        // Laborator 11 exercitiu 5
        String textInput = "FastTrackIT";
        int numberInput = 3;
        System.out.println(op.comparison1(textInput, numberInput));

        // Laborator 11 exercitiu 6

        int snownumber = 6;
        System.out.println(op.snowFallAnalysisI(snownumber));
        System.out.println(op.snowFallAnalysisII(snownumber));

        // Laborator 11 exercitiu 7
        float num = 2;
        System.out.println(op.number(num));

        // Laborator 11 exercitiu 8

        int anynumber = 4;
        switch (anynumber) {
            case 1:
                System.out.println("The number is: 1 !");
                break;
            case 60:
                System.out.println("The number is: 60!");
                break;
            case 85:
                System.out.println("The number is: 85!");
                break;
            case 4:
                System.out.println("The number is: 4!");
                break;
            case 15:
                System.out.println("The number is: 15!");
                break;
            case 6:
                System.out.println("The number is: 6!");
                break;
            case 22:
                System.out.println("The number is: 22!");
            default:
                System.out.println("Not in 1, 60, 85, 4, 15, 6, 22");
        }

        // Laborator 11 exercitiu 9
        int number2 = 15;
        System.out.println(op.isNumberEven(number2));

        // Laborator 11 exercitiu 10
        int varsta = 20;
        System.out.println("Persoana are drept la vot:" + op.isEligibleToVote(varsta));

        // Laborator 11 exercitiu 11
        int xI= 20;
        int yI=800;
        int zI=40;

        System.out.println("Cel mai mare numar:" + op.biggestOfThree(xI,yI, zI));

        System.out.println("Exercitii Tema Laborator 12");

        op.printFrom1to100(1);
        op.printFrom1tominus100(-50);*/

        System.out.println("Tema 14.2- Exercitiul 1");

        List<String> myList = new ArrayList<String>();
        myList.add("First element");
        myList.add("Second element");
        myList.add("Third element");
        myList.add("Fourth element");


        //System.out.println(myList);

        LogicalOp operations = new LogicalOp();
        operations.displaymyList(myList);

        System.out.println("Tema 14.2- Exercitiul 2");

        List<Integer> numberList = new ArrayList<Integer>();
        numberList.add(11);
        numberList.add(23);
        numberList.add(22);
        numberList.add(10);
        numberList.add(20);

        operations.endParameterList(numberList, 6);
        System.out.println(numberList);

        System.out.println("Tema 14.2- Exercitiul 5");
        operations.threeParameters(myList, 2, "New parameter added to the second position" );
        System.out.println(myList);

        System.out.println("Tema 14.2- Exercitiul 3");
        operations.allListParameters(numberList, 3);

        System.out.println("Tema 14.2- Exercitiul 6");
        operations.swapParameter(myList, "element");

        System.out.println("Tema 14.2- Exercitiul 8");
        operations.theBiggestNumber(numberList);

    }

}


