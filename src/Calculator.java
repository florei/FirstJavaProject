public class Calculator {
    public int inmultire(float first, int second) {
        int result = (int) (first * second);
        return result;
    }

    public float modul(float first, float second) {
        float result = first % second;
        return result;
    }

    public float adunare(float first, float second) {
        float result = first + second;
        return result;
    }

    public float scadere(float first, float second) {
        float result = first - second;
        return result;
    }

    public float impartire(float first, float second) {
        float result = first / second;
        return result;
    }

    public int sumaDouaNumere(int primul, int aldoilea) {
        int rez = primul + aldoilea;
        return rez;
    }

    public int diferentaDouaNumere(int primul, int aldoilea) {
        int rez = primul - aldoilea;
        return rez;
    }

    public int inmultireDouaNumere(int primul, int aldoilea) {
        int rez = primul * aldoilea;
        return rez;
    }

    public float impartireDouaNumere(int primul, float aldoilea) {
        float rez = primul * aldoilea;
        return rez;
    }

    public double media(float primul, float aldoilea, float altreilea) {
        double rez = (primul + aldoilea + altreilea) / 3d;
        return rez;
    }

    public double restul(double primul, int aldoilea) {
        double rez = primul % aldoilea;
        return rez;
    }

    public double F_C(double F) {
        double C = (5 / 9d) * (F - 32);
        return C;
    }

    public double InchtoMeter(double Inch) {
        double M = Inch / 39.370;
        return M;
    }

    public float TimpSecunde(float hour, float min, float sec) {
        float Sec = hour * 3600 + min * 60 + sec;
        return Sec;
    }

    public float DistMetri(float distanta) {
        float D = distanta;
        return D;
    }

    public float DistKilometrii(float distanta) {
        float D = distanta / 1000;
        return D;
    }

    public float DistMile(float distanta) {
        float D = (float) (distanta / 1000 * (1 / 1.609));
        return D;
    }

}

