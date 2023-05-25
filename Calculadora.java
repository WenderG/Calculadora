import java.util.Scanner;

public class Calculadora{
    public static void main(String [] args) {

        boolean aux = true;

        Scanner entrada = new Scanner(System.in);

        do{
            System.out.print("Número decimal: ");
            int numero = Integer.parseInt(entrada.nextLine());
    
            System.out.print("Binário: ");
            converteBinario(numero);
            System.out.println("\n\n\n");
        }while(aux);

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

    public static String converteBinarioNegativo(int decimal) {
        StringBuilder binary = new StringBuilder();
        
        while (decimal != 0) {
            binary.insert(0, Math.abs(decimal % 2));
            decimal /= -2;
        }
        
        return binary.toString();
    }
}