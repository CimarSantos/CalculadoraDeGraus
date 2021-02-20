package CalcGraus;

public class calculaGraus {

    public double kelvin(float C ,double k){

        k = C + 273.15;

        return k;

    }

    public double reaumur(float C, double Re){

        Re = C * 0.8;

        return Re;
    }

    public double rankine(float C, double Ra){

        Ra = C * (1.8 + 32 + 459.67);

        return Ra;
    }

    public double fahrenheit(float C, double F){

        F = C * (1.8 + 32);

        return F;
    }


}
