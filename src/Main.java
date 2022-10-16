public class Main {
    public static void main(String[] args) {
      System.out.println("Hello");
        String name="Florentina";
        System.out.println(name);


        Calculator operatii = new Calculator();

       //adunare 100+300
        float f1 = 100;
        float s1 = 300;
float adun = operatii.adunare(f1,s1);

        System.out.println(adun);

      // impartire 10/8
        int f2 = 10;
        float s2 = 8;

        float imp = operatii.impartire(f2,s2);
        System.out.println(imp);

        // a = -5+ (8*6)
        float f3=-5;
        int s3=8;
        int t3=6;

        float a = operatii.adunare(f3, operatii.inmultire(s3,t3));

        System.out.println(a);

        // b = (55+9)%9
        float f4 = 55;
        float s4 = 9;
        float t4 = 9;

        float sum = operatii.adunare(f4, s4);
        float b = operatii.modul(sum,t4);





        System.out.println(b);
        int z = f2 + 10;
        float w = (-3*5)/s2;
        float adunare = z+w;
        System.out.println(adunare);
        float Q = 5+f2;
        int S = 3*2;
        float I = Q/S;
        System.out.println(I);
        int modul = 8 % 3;
        System.out.println(modul);
        float d = 5+ I - modul;
        System.out.println(d);

        printMyname();

       /* Calculator operatii = new Calculator();

        int x = 3;
        int y = 5;


        int z = operatii.multiplication(x, y);
        float b = operatii.division(x, y);
        System.out.println(z);
        System.out.println(b);

        */
    }

  public static void printMyname() {
    System.out.println("Hello\nFlorentina");
  }


}

