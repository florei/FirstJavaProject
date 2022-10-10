public class Main {
    public static void main(String[] args) {
   /*     System.out.println("Hello");
        String name="Florentina";
        System.out.println(name);
        int suma = 100+300;
        System.out.println(suma);
        int x = 10;
        float y = 8;
        float impartire = x/y;
        System.out.println(impartire);
        int a = -5+ (8*6);
        System.out.println(a);
        float b = (55+9) % 9;
        System.out.println(b);
        int z = x + 10;
        float w = (-3*5)/y;
        float adunare = z+w;
        System.out.println(adunare);
        float Q = 5+x;
        int S = 3*2;
        float I = Q/S;
        System.out.println(I);
        int modul = 8 % 3;
        System.out.println(modul);
        float d = 5+ I - modul;
        System.out.println(d);
*/
        int x = 3;
        int y = 5;

        int z = multiplication(x,y);
        float b = division(x,y);
        System.out.println(z);
        System.out.println(b);
    }


    public static int multiplication(int first, int second) {
        int result = first * second;
        return result;
    }
    public static float division (float first, float second) {
        float result = first / second;
        return result;
    }
}

