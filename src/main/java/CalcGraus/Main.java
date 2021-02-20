package CalcGraus;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("##.00");

        calculaGraus calc = new calculaGraus();

        int op = 99;
        float C = 0;
        double k = 0, F = 0, Re = 0, Ra = 0;

        do {
            System.out.println(" --- Calculadora de Graus --- ");
            System.out.print("Digite os Graus Celsius: ");
            C = input.nextFloat();
            if (C <= 0) {
                System.out.println("\n\nDigite um número válido!\n\n");
            } else {

                System.out.println("1 - Graus Kelvin\n" +
                        "2 - Graus Réaumur\n" +
                        "3 - Graus Rankine\n" +
                        "4 - Graus Fahrenheit\n" +
                        "0 - Finalizar Calculadora\n");

                System.out.print("Qual sua opção? - ");
                System.out.print("\n");
                op = input.nextInt();
            }

            switch (op) {

                case 1:

                    k = calc.kelvin(C, k);
                    System.out.println(C + " graus Celcius equivalem à " + decimal.format(k) + " graus Kelvin\n\n");

                    break;

                case 2:

                    Re = calc.reaumur(C, Re);
                    System.out.println(C + " graus Celcius equivalem à " + decimal.format(Re) + " graus Réaumur\n\n");

                    break;

                case 3:

                    Ra = calc.reaumur(C, Ra);
                    System.out.println(C + " graus Celcius equivalem à " + decimal.format(Ra) + " graus Rankine\n\n");

                    break;

                case 4:

                    F = calc.reaumur(C, F);
                    System.out.println(C + " graus Celcius equivalem à " + decimal.format(F) + " graus Fahrenheit\n\n");

                    break;

                default:
                    System.out.println("Programa Finalizado");
                }
            }while (op != 0);
        }
    }
