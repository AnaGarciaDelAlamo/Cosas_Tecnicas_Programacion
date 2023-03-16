import java.util.Scanner;
public class Funciones {
    Scanner sc = new Scanner(System.in);

    public double funcionRecursiva(double x, double y) {
        double resultado = 0;
        if (y == 0) {
            resultado = 1;
        } else {
            resultado = x * funcionRecursiva(x, y - 1);
        }
        return resultado;
    }
}
