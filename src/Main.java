import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 12;
        int b = 45;
        System.out.println(a + b + " wynik");
        System.out.println("wynik " + a + b);
        System.out.println((double) b / a);

        Scanner scan = new Scanner(System.in);
        System.out.println("Poaj pierwszą liczbę");
        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();
        double result = number1 * number2;
        System.out.println("Wynik mnożenia to: " + result);
        System.out.printf("Wynik mnożenia liczby %f i liczby %f to: %.2f\n",number1, number2, result);
        System.out.println("Wynik mnożenia liczby " + number1 + " i liczby " + number2 +" to: "+ result);
    }
}
