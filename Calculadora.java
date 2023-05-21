import java.util.Scanner;

public class Calculadora{
    public static void main(String [] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Número decimal:");
        int numero = Integer.parseInt(entrada.nextLine());

        System.out.print("Binário: ");
        converteBinario(numero);

        entrada.close();
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
}