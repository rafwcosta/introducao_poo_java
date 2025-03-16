import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Entre com os valores de X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Entre com os valores de Y: ");
        yA = sc.nextDouble();
        yB = sc.nextInt();
        yC = sc.nextInt();

        

        sc.close();
    }
}