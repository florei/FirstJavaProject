public class Main {
    public static void main(String[] args) {

        printMyname();

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

        System.out.println("Rezultatul adunarii este:" + sumaDouaNumere(5,6));
        System.out.println("Rezultatul scaderii este:" + diferentaDouaNumere(6,10));
        System.out.println("Rezultatul inmultirii este:" + inmultireDouaNumere(6,20));
        System.out.println("Rezultatul impartirii este:" + impartireDouaNumere(305, 105f));

        System.out.println("Exercitiul 3"); //nu stiu sa aliniez desenul ca in imagine

               System.out.println  ( "J     a  v      v   a\n" +
                                     "J    a a  v    v   a a\n" +
                              "J   J   aaaaa   v v   aaaaa\n" +
                                     "JJ   a      a   v  a      a");
        System.out.println("Exercitiul 4");
        System.out.println("Media este:" + media (5,8,10));

        System.out.println("Exercitiul 6");
        System.out.println("Restul impartirii a doua numere:" + restul(25.0, 12));
        System.out.println("Exercitiul 7");
        System.out.println("Temperatura in Celsius este:" + F_C(212));
        System.out.println("Exercitiul 8");
        System.out.println("Distanta din Inch in Metrii este:" + InchtoMeter (300));
        System.out.println("Exercitiul 9");
        System.out.println("Viteza in m/s este:" + DistMetri(25000) / TimpSecunde(2, 45, 6));
        System.out.println("Viteza in km/h este:" + DistKilometrii(25000) / (TimpSecunde(2, 45, 6)/3600));
        System.out.println("Viteza in mila/h este:" + DistMile(25000) / (TimpSecunde(2, 45, 6)/3600));

    }

  public static void printMyname() {
    System.out.println("Hello\nFlorentina");
  }


    public static int sumaDouaNumere (int primul, int aldoilea ){
        int rez = primul +aldoilea;
        return rez;
    }
    public static int diferentaDouaNumere (int primul, int aldoilea ){
        int rez = primul - aldoilea;
        return rez;
    }
    public static int inmultireDouaNumere (int primul, int aldoilea ){
        int rez = primul * aldoilea;
        return rez;
    }
    public static float impartireDouaNumere (int primul, float aldoilea ){
        float rez = primul * aldoilea;
        return rez;
    }
    public static double media (float primul, float aldoilea, float altreilea ){
        double rez = (primul+aldoilea+altreilea)/3d;
        return rez;
    }
    public static double restul (double primul, int aldoilea){
        double rez = primul % aldoilea;
        return rez;
    }
    static double F_C (double F){
        double C = (5/9d) * (F - 32);
        return C;
    }
    static double InchtoMeter (double Inch){
        double M = Inch / 39.370;
        return M;
    }

    static float TimpSecunde (float hour, float min, float sec){
        float Sec = hour * 3600 + min * 60 + sec  ;
        return Sec;
    }
    static float DistMetri (float distanta ){
        float D = distanta;
        return D;
    }

    static float DistKilometrii (float distanta ) {
        float D = distanta / 1000;
        return D;
    }
    static float DistMile (float distanta ) {
        float D = (float) (distanta / 1000 * (1/1.609));
        return D;
    }


}

