import java.util.Scanner;

public class Calculadora{
    public static void main(String [] args) {

        boolean aux = true;

        do{
            
        }while(aux);
    }

    public static void converteBinario(int n) {
        if (n > 1)
            converteBinario(n / 2);
        
        System.out.print(n % 2);
    }

    public float soma(float n1, float n2) {
        float r = n1 + n2;

        return r;
    }

    public float subtracao(float n1, float n2) {
        float r = n1 - n2;

        return r;
    }

    public float mult(float n1, float n2) {
        float r = n1 * n2;

        return r;
    }

    public float div(float n1, float n2) {
        float r = n1 / n2;

        return r;
    }

    public static String converteBinarioNegativo(int decimal) {
        StringBuilder binary = new StringBuilder();
        
        while (decimal != 0) {
            binary.insert(0, Math.abs(decimal % 2));
            decimal /= -2;
        }
        
        return binary.toString();
    }
}